package qhy.example.web.controller;

import com.alibaba.fastjson.JSON;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.impl.JWTParser;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.RSAKeyProvider;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.bouncycastle.jcajce.provider.asymmetric.RSA;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import sun.security.util.DerInputStream;
import sun.security.util.DerValue;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipController {


    public static void main(String[] args) throws Exception {
        String string = new ObjectMapper().writeValueAsString(new HashMap<String, String>() {{
            put("abc", "cdf");
        }});
        String string1 = JSON.toJSONString(new HashMap<String, String>() {{
            put("abc", "cdf");
        }});
        System.out.println(string);
        System.out.println(string1);
        Algorithm secret = Algorithm.HMAC512("secretssssssssssssss");
        RSAPublicKey publicKey = null;
        RSAPrivateKey privateKey = null;
//      Rsa001 rsa=new Rsa001();
        KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
        KeyPair keyPair = instance.generateKeyPair();
        Provider provider = instance.getProvider();
        publicKey = (RSAPublicKey)keyPair.getPublic();
        privateKey = (RSAPrivateKey)keyPair.getPrivate();
        Algorithm algorithm = Algorithm.RSA256(publicKey, privateKey);
        String sign = JWT.create().withIssuer("quHongYuan")
                .withAudience("hello","world")
                .withClaim("project","project")
                .withSubject("加油！！！")
                .withClaim("currentDate",new Date())
                .withIssuedAt(new Date(System.currentTimeMillis() + 1000*24*60*60))
                .sign(secret);
        System.out.println(sign);
//        DecodedJWT decode = JWT.decode(sign);
//        String signature = decode.getSignature();
//        System.out.println(decode.getClaim("project"));
    }


    /**
     * 获取PrivateKey对象
     *
     * @return
     */
    private static PrivateKey getRSAPrivateKey() {
        try {
            InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("crt/rsa_private.pem");
            String privateKeyBase64 = IOUtils.toString(inputStream, "UTF-8");
            String privateKeyPEM = privateKeyBase64.replaceAll("\\-*BEGIN.*KEY\\-*", "")
                    .replaceAll("\\-*END.*KEY\\-*", "")
                    .replaceAll("\r", "")
                    .replaceAll("\n", "");
            byte[] encoded = Base64.getDecoder().decode(privateKeyPEM);
            DerInputStream derReader = new DerInputStream(encoded);
            DerValue[] seq = derReader.getSequence(0);
            if (seq.length < 9) {
                throw new GeneralSecurityException("Could not read private key");
            }
            // skip version seq[0];
            BigInteger modulus = seq[1].getBigInteger();
            BigInteger publicExp = seq[2].getBigInteger();
            BigInteger privateExp = seq[3].getBigInteger();
            BigInteger primeP = seq[4].getBigInteger();
            BigInteger primeQ = seq[5].getBigInteger();
            BigInteger expP = seq[6].getBigInteger();
            BigInteger expQ = seq[7].getBigInteger();
            BigInteger crtCoeff = seq[8].getBigInteger();
            RSAPrivateCrtKeySpec keySpec = new RSAPrivateCrtKeySpec(modulus, publicExp, privateExp, primeP, primeQ, expP, expQ, crtCoeff);
            KeyFactory factory = KeyFactory.getInstance("RSA");
            PrivateKey privateKey = factory.generatePrivate(keySpec);
            return factory.generatePrivate(keySpec);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取PublicKey对象
     *
     * @return
     */
    private static PublicKey getRSAPublicKey() {
        try {
            InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("crt/rsa_public.pem");
            String publicKeyBase64 = IOUtils.toString(inputStream, "UTF-8");
            String publicKeyPEM = publicKeyBase64.replaceAll("\\-*BEGIN.*KEY\\-*", "")
                    .replaceAll("\\-*END.*KEY\\-*", "")
                    .replaceAll("\r", "")
                    .replaceAll("\n", "");
            Security.addProvider(new BouncyCastleProvider());
            X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(Base64.getDecoder().decode(publicKeyPEM));
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PublicKey publicKey = keyFactory.generatePublic(pubKeySpec);
            return publicKey;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 获取PrivateKey对象
     *
     * @return
     */
    private static PrivateKey getECPrivateKey() {
        try {
            Security.addProvider(new BouncyCastleProvider());
            KeyFactory keyFactory = KeyFactory.getInstance("ECDH", "BC");
            InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("crt/ec_private_pkcs8");
            byte[] devicePriKeybytes = IOUtils.toByteArray(inputStream);
            PKCS8EncodedKeySpec devicePriKeySpec = new PKCS8EncodedKeySpec(devicePriKeybytes);
            return keyFactory.generatePrivate(devicePriKeySpec);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 获取PublicKey对象
     *
     * @return
     */
    private static PublicKey getECPublicKey() {
        try {
            Security.addProvider(new BouncyCastleProvider());
            KeyFactory keyFactory = KeyFactory.getInstance("ECDH", "BC");

            InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("crt/ec_public.pem");
            String publicKeyBase64 = IOUtils.toString(inputStream, "UTF-8");

            publicKeyBase64 = publicKeyBase64.replaceAll("\\-*BEGIN.*KEY\\-*", "")
                    .replaceAll("\\-*END.*KEY\\-*", "")
                    .replaceAll("\r", "")
                    .replaceAll("\n", "");
            byte[] publicKeyBytes = Base64.getDecoder().decode(publicKeyBase64);

            X509EncodedKeySpec pubX509 = new X509EncodedKeySpec(publicKeyBytes);
            return keyFactory.generatePublic(pubX509);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void zipTest() {
        try {
            ZipInputStream zis = new ZipInputStream(new FileInputStream(new File("D:\\excel\\SAP-HR员工照片.zip")), Charset.forName("GBK"));
            ZipOutputStream zos = new ZipOutputStream(null);
            ZipEntry zipEntry = null;
            while ((zipEntry = zis.getNextEntry()) != null) {
                String name = zipEntry.getName();
                System.out.println(name);
            }
            System.out.println(System.getProperties().get("sun.jnu.encoding"));
            System.getProperties().get("file.encoding");
            System.out.println(System.getProperties().get("file.encoding"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
