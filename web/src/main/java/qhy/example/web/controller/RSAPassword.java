package qhy.example.web.controller;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

public class RSAPassword {
    public final static String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDMOl4oqZcGywNqnnnI6Ng0njC" +
            "cNU0ncjUZyZtylsM/th2Jh3DsFy3HTm6J5/X8EuU04TVODRTHbQp2M/TXhalaO9F" +
            "X2TxSp+jZm4ZIL99p+aN8LU8mAFwggityu3JZJ3QtAgXjlSgIeC69BWYKIpw9IIO" +
            "8sfjuzffW3pU3Q1tGwIDAQAB";

    public final static String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAMMw6XiiplwbLA2q" +
            "eecjo2DSeMJw1TSdyNRnJm3KWwz+2HYmHcOwXLcdObonn9fwS5TThNU4NFMdtCnY" +
            "z9NeFqVo70VfZPFKn6Nmbhkgv32n5o3wtTyYAXCCCK3K7clkndC0CBeOVKAh4Lr0" +
            "FZgoinD0gg7yx+O7N99belTdDW0bAgMBAAECgYEAosx33jMit+2914QZeoxB5y6E" +
            "pABCA0mayHVkGuxM9tDTr+9ood/F5MCOdlI4Qn3cPDwTLVdcZPqAWurHpA50qXj3" +
            "AC6D6f/P7z8UzFvAz89oGI5rJ2jp1qkdmL260G1xwPlRFj0peSy1KZwk2lGKC4Z5" +
            "Gt0wJZxuI2Ersq8YGakCQQD2Inmd9PrjRog7evZ/sKwQDO1e8+HhrCj+WY3PjJL1" +
            "G2rfDAQ5FR+zm0bRs7GsTwlX5xIV8t6YugPaAXe+juUtAkEAywO3tUwo/F/jLqPb" +
            "ak7ZArsPC0D0aE+dSpLG40uHF5PT1evLGrAhqTqs9h4JGAdbkEaWHdZ7cvaT9eMo" +
            "vj8YZwJAG0YKr+QbgN+p7N1dPxz2k/i6vNDNcNJA4J5PxnXPOvXEy95rAWBD2QUV" +
            "vdrpjyxa3rCuIlx9KfNCxf9vo1/2KQJAQ31h5jCCc5wA73FjsQyzUhgToT8fwUmu" +
            "VatD2S4zo9/uDXDM3XtuRU8PTuafSVCw3N7KavLxqT9V4ul4kv5wwwJAGWhC6gl5" +
            "s1BldddskJ4dX67Cmod6cB8rD6Rd+sy8ArH+ct/r7YTFeLZ5MAbkZhnFJy2ew2Ad" +
            "NeyOQ+72M1ymLQ==";



    private static Map<Integer, String> keyMap = new HashMap<Integer, String>();  //用于封装随机产生的公钥与私钥
    public static void main(String[] args) throws Exception {
        //生成公钥和私钥
        genKeyPair();
        //加密字符串
        String message = "df723820";
        System.out.println("随机生成的公钥为:" + keyMap.get(0));
        System.out.println("随机生成的私钥为:" + keyMap.get(1));
        String messageEn = encrypt(message,keyMap.get(0));
        System.out.println(message + "\t加密后的字符串为:" + messageEn);
        String messageDe = decrypt(messageEn,keyMap.get(1));
        System.out.println("还原后的字符串为:" + messageDe);
    }

    /**
     * 随机生成密钥对
     * @throws NoSuchAlgorithmException
     */
    public static void genKeyPair() throws NoSuchAlgorithmException {
        // KeyPairGenerator类用于生成公钥和私钥对，基于RSA算法生成对象
//        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
//        // 初始化密钥对生成器，密钥大小为96-1024位
//        keyPairGen.initialize(1024,new SecureRandom());
//        // 生成一个密钥对，保存在keyPair中
//        KeyPair keyPair = keyPairGen.generateKeyPair();
//        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();   // 得到私钥
//        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();  // 得到公钥
//        String publicKeyString = new String(Base64.encodeBase64(publicKey.getEncoded()));
        String publicKeyString = new String(publicKey.getBytes());
        // 得到私钥字符串
//        String privateKeyString = new String(Base64.encodeBase64((privateKey.getEncoded())));
        String privateKeyString = new String(privateKey.getBytes());
        // 将公钥和私钥保存到Map
        keyMap.put(0,publicKeyString);  //0表示公钥
        keyMap.put(1,privateKeyString);  //1表示私钥
//        加密后的字符串为:mxKA4AVBReMCnXO/kwMCTfj2OqOrLqtQ7/X0WwCc9w1qjCKQmfuIij7C4SN3IZ8jwGURxi76hGsXPbF8MgU4NeiBp81u+FmliEuAwq0EPy1/ffGEFin4rWlDCCrwV3+W+SU9KbTJ0+qF0K62F/9pv+o3mQkxZ4I4+pR5xuKn4nw=
    }
    /**
     * RSA公钥加密
     *
     * @param str
     *            加密字符串
     * @param publicKey
     *            公钥
     * @return 密文
     * @throws Exception
     *             加密过程中的异常信息
     */
    public static String encrypt( String str, String publicKey ) throws Exception{
        //base64编码的公钥
        byte[] decoded = Base64.decodeBase64(publicKey);
        RSAPublicKey pubKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decoded));
        //RSA加密
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, pubKey);
        String outStr = Base64.encodeBase64String(cipher.doFinal(str.getBytes("UTF-8")));
        return outStr;
    }

    /**
     * RSA私钥解密
     *
     * @param str
     *            加密字符串
     * @param privateKey
     *            私钥
     * @return 铭文
     * @throws Exception
     *             解密过程中的异常信息
     */
    public static String decrypt(String str, String privateKey) throws Exception{
        //64位解码加密后的字符串
        byte[] inputByte = Base64.decodeBase64(str.getBytes("UTF-8"));
        //base64编码的私钥
        byte[] decoded = Base64.decodeBase64(privateKey);
        RSAPrivateKey priKey = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(decoded));
        //RSA解密
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, priKey);
        String outStr = new String(cipher.doFinal(inputByte));
        return outStr;
    }

}

