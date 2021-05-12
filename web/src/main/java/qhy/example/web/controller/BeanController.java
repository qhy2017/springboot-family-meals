package qhy.example.web.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import qhy.example.bean.student.Student;
import qhy.example.web.util.ObsUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@ResponseBody
@RequestMapping(value = "/api")
public class BeanController {

    @RequestMapping(value = "getBean",produces = MediaType.APPLICATION_JSON_VALUE)
    public Object getBean(HttpServletRequest request,@RequestParam Map<String,Object> params) throws Exception{

        System.out.println("getBean ----------------- " + request.getParameter("name"));
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,Object> map = new HashMap<>();
        map.put("name","我的");
        map.put("id", UUID.randomUUID().toString());
        map.put("date","2018-09-12 12:12:01");
//        String s = objectMapper.writeValueAsString(map);
//        Student bean = objectMapper.readValue(s,Student.class);
        return map;
    }

    @RequestMapping(value = "getBean1",produces = MediaType.APPLICATION_JSON_VALUE)
    public Object getBean1(@RequestBody Student student,HttpServletRequest request) throws Exception{

        System.out.println("getBean ----------------- " + request.getParameter("name"));
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,Object> map = new HashMap<>();
        map.put("name","我的");
        map.put("id", UUID.randomUUID().toString());
        map.put("date","2018-09-12 12:12:01");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("aa","bb");
        return jsonObject.toJSONString();
    }
    static String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?><DATA><Row><Apnum>20073007364491541</Apnum><Header><MANDT>800</MANDT><DOCNO>0000002480</DOCNO><VERSN>001</VERSN><SYWTY>GA01</SYWTY><BUKRS>8590</BUKRS><GJAHR>0000</GJAHR><VERIS>000</VERIS><STUNR>000</STUNR><APNUM>20073007364491541</APNUM><CZDAT>0000-00-00</CZDAT><CZZET>00:00:00</CZZET><TJNAM>PLZHANG</TJNAM><TJDAT>2020-07-30</TJDAT><TJZET>15:35:50</TJZET><APDAY>0</APDAY><NAMETEXT>张丽</NAMETEXT><ZQKDH>0000002480</ZQKDH><PSPID>UCGF160012</PSPID><POST1>12万吨/年醋酸甲酯加氢制乙醇成套技术开发</POST1><ZCMISNO>NGCF190001</ZCMISNO><ZCMISOD>1900090009</ZCMISOD><ZCRTNAME>南京投入法测试项目1</ZCRTNAME><KUNNR>0031750000</KUNNR><NAME1>茂名分公司</NAME1><ZRELATIVE>0031750000</ZRELATIVE><ZRELATIVENAME>茂名分公司</ZRELATIVENAME><ZSD05>2020-07-29</ZSD05><ZNAME>中国石油化工股份有限公司茂名分公司</ZNAME><ZTAX>4.41E+14</ZTAX><ZADD>茂名市双山四路9号大院1号楼</ZADD><STATS>A</STATS></Header><Item><MANDT>800</MANDT><VERSN>000</VERSN><GJAHR>0000</GJAHR><POSNR>000000</POSNR><CZDAT>0000-00-00</CZDAT><CZZET>00:00:00</CZZET><TBFLG>1</TBFLG><TBNAM>承包方</TBNAM><ZQKDH>0000002480</ZQKDH><ZSDXH>000010</ZSDXH><ZSD07>设计费（设计人工成本）</ZSD07><ZSD08>100.00</ZSD08><ZSD09>0.00</ZSD09><ZSD10>100.00</ZSD10><ZSD11>100.00</ZSD11><ZSD12>0.00</ZSD12><ZSD13>0.00</ZSD13><ZSD14>0.00</ZSD14><ZSD15>0.00</ZSD15><ZSD16>0.00</ZSD16><ZSD17>0.00</ZSD17><ZSD19>0.00</ZSD19><ZSD20>0.00</ZSD20><ZSD21>0.00</ZSD21><ZSD22>0.00</ZSD22><ZNETVALUE>0.00</ZNETVALUE><ZTAXM>0.00</ZTAXM><AMOUNT>0.000</AMOUNT><PRICE>0.00</PRICE><MONEY>0.00</MONEY><KONTS>2171010500</KONTS><TXT20>应交税费-应交增值税-销项税额-国内-内</TXT20></Item><Item><MANDT>800</MANDT><VERSN>000</VERSN><GJAHR>0000</GJAHR><POSNR>000000</POSNR><CZDAT>0000-00-00</CZDAT><CZZET>00:00:00</CZZET><TBFLG>2</TBFLG><TBNAM>发包方</TBNAM><ZQKDH>0000002480</ZQKDH><ZSDXH>000010</ZSDXH><ZSDLY>X</ZSDLY><ZSD07>设计费（设计人工成本）</ZSD07><ZSD08>100.00</ZSD08><ZSD09>0.00</ZSD09><ZSD10>100.00</ZSD10><ZSD11>100.00</ZSD11><ZSD12>0.00</ZSD12><ZSD13>0.00</ZSD13><ZSD15>0.00</ZSD15><ZSD16>0.00</ZSD16><ZSD17>0.00</ZSD17><ZSD19>0.00</ZSD19><ZSD20>0.00</ZSD20><ZSD21>0.00</ZSD21><ZSD22>0.00</ZSD22><ZNETVALUE>0.00</ZNETVALUE><ZTAXM>0.00</ZTAXM><AMOUNT>0.000</AMOUNT><PRICE>0.00</PRICE><MONEY>0.00</MONEY><KONTS>2171010500</KONTS><TXT20>应交税费-应交增值税-销项税额-国内-内</TXT20></Item><Item><MANDT>800</MANDT><VERSN>000</VERSN><GJAHR>0000</GJAHR><POSNR>000000</POSNR><CZDAT>0000-00-00</CZDAT><CZZET>00:00:00</CZZET><TBFLG>1</TBFLG><TBNAM>承包方</TBNAM><ZQKDH>0000002480</ZQKDH><ZSDXH>000020</ZSDXH><ZSD07>设备材料费</ZSD07><ZSD08>100.00</ZSD08><ZSD09>0.00</ZSD09><ZSD10>100.00</ZSD10><ZSD11>100.00</ZSD11><ZSD12>0.00</ZSD12><ZSD13>0.00</ZSD13><ZSD14>0.00</ZSD14><ZSD15>0.00</ZSD15><ZSD16>0.00</ZSD16><ZSD17>0.00</ZSD17><ZSD19>0.00</ZSD19><ZSD20>0.00</ZSD20><ZSD21>0.00</ZSD21><ZSD22>0.00</ZSD22><ZNETVALUE>0.00</ZNETVALUE><ZTAXM>0.00</ZTAXM><AMOUNT>0.000</AMOUNT><PRICE>0.00</PRICE><MONEY>0.00</MONEY><KONTS>2171010500</KONTS><TXT20>应交税费-应交增值税-销项税额-国内-内</TXT20></Item><Item><MANDT>800</MANDT><VERSN>000</VERSN><GJAHR>0000</GJAHR><POSNR>000000</POSNR><CZDAT>0000-00-00</CZDAT><CZZET>00:00:00</CZZET><TBFLG>2</TBFLG><TBNAM>发包方</TBNAM><ZQKDH>0000002480</ZQKDH><ZSDXH>000020</ZSDXH><ZSDLY>X</ZSDLY><ZSD07>设备材料费</ZSD07><ZSD08>100.00</ZSD08><ZSD09>0.00</ZSD09><ZSD10>100.00</ZSD10><ZSD11>100.00</ZSD11><ZSD12>0.00</ZSD12><ZSD13>0.00</ZSD13><ZSD15>0.00</ZSD15><ZSD16>0.00</ZSD16><ZSD17>0.00</ZSD17><ZSD19>0.00</ZSD19><ZSD20>0.00</ZSD20><ZSD21>0.00</ZSD21><ZSD22>0.00</ZSD22><ZNETVALUE>0.00</ZNETVALUE><ZTAXM>0.00</ZTAXM><AMOUNT>0.000</AMOUNT><PRICE>0.00</PRICE><MONEY>0.00</MONEY><KONTS>2171010500</KONTS><TXT20>应交税费-应交增值税-销项税额-国内-内</TXT20></Item><Item><MANDT>800</MANDT><VERSN>000</VERSN><GJAHR>0000</GJAHR><POSNR>000000</POSNR><CZDAT>0000-00-00</CZDAT><CZZET>00:00:00</CZZET><TBFLG>1</TBFLG><TBNAM>承包方</TBNAM><ZQKDH>0000002480</ZQKDH><ZSDXH>000030</ZSDXH><ZSD07>施工费</ZSD07><ZSD08>100.00</ZSD08><ZSD09>0.00</ZSD09><ZSD10>100.00</ZSD10><ZSD11>100.00</ZSD11><ZSD12>0.00</ZSD12><ZSD13>0.00</ZSD13><ZSD14>0.00</ZSD14><ZSD15>0.00</ZSD15><ZSD16>0.00</ZSD16><ZSD17>0.00</ZSD17><ZSD19>0.00</ZSD19><ZSD20>0.00</ZSD20><ZSD21>0.00</ZSD21><ZSD22>0.00</ZSD22><ZNETVALUE>0.00</ZNETVALUE><ZTAXM>0.00</ZTAXM><AMOUNT>0.000</AMOUNT><PRICE>0.00</PRICE><MONEY>0.00</MONEY><KONTS>2171010500</KONTS><TXT20>应交税费-应交增值税-销项税额-国内-内</TXT20></Item><Item><MANDT>800</MANDT><VERSN>000</VERSN><GJAHR>0000</GJAHR><POSNR>000000</POSNR><CZDAT>0000-00-00</CZDAT><CZZET>00:00:00</CZZET><TBFLG>2</TBFLG><TBNAM>发包方</TBNAM><ZQKDH>0000002480</ZQKDH><ZSDXH>000030</ZSDXH><ZSDLY>X</ZSDLY><ZSD07>施工费</ZSD07><ZSD08>100.00</ZSD08><ZSD09>0.00</ZSD09><ZSD10>100.00</ZSD10><ZSD11>100.00</ZSD11><ZSD12>0.00</ZSD12><ZSD13>0.00</ZSD13><ZSD15>0.00</ZSD15><ZSD16>0.00</ZSD16><ZSD17>0.00</ZSD17><ZSD19>0.00</ZSD19><ZSD20>0.00</ZSD20><ZSD21>0.00</ZSD21><ZSD22>0.00</ZSD22><ZNETVALUE>0.00</ZNETVALUE><ZTAXM>0.00</ZTAXM><AMOUNT>0.000</AMOUNT><PRICE>0.00</PRICE><MONEY>0.00</MONEY><KONTS>2171010500</KONTS><TXT20>应交税费-应交增值税-销项税额-国内-内</TXT20></Item></Row></DATA>";

    @RequestMapping(value={"/test/hex"})
    public Object getString(){
//        String str16 = "7B2261223A22C7FEBAECD4AA222C2262223A22D6D0B9FA227D";
        String str16 = "7B2261223A22E6B8A0E7BAA2E58583222C2262223A22E4B8ADE59BBD227D";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("a","渠红元");
        jsonObject.put("b","中国");
        String s = ObsUtils.str2HexStr(jsonObject.toJSONString());
        System.out.println(s);
        System.out.println(new String(str16.getBytes(StandardCharsets.UTF_8)));
        System.out.println(ObsUtils.hexStr2Str(new String(str16.getBytes(StandardCharsets.UTF_8))));
        System.out.println(ObsUtils.hexStr2Str(new String(str16.getBytes(StandardCharsets.ISO_8859_1))));
        System.out.println(ObsUtils.hexStr2Str(str16));
        System.out.println(ObsUtils.hexStringToString(s));
        System.out.println("--------------------------------------------------------------------------");

        String str = null;
        str = new String(xml.getBytes(StandardCharsets.UTF_8),StandardCharsets.UTF_8);
        String s1 = ObsUtils.str2HexStr(str);
        System.out.println(s1);
        System.out.println(ObsUtils.hexStr2Str(s1));
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(ObsUtils.hexStr2Str(new String(s1.getBytes(StandardCharsets.UTF_8),StandardCharsets.UTF_8)));
        System.out.println("file.encoding : "+System.getProperty("file.encoding"));
        System.out.println("sun.jnu.encoding : "+System.getProperty("sun.jnu.encoding"));
        return null;
    }

    public static void main(String[] args) {
//        String str16 = "7B2261223A22C7FEBAECD4AA222C2262223A22D6D0B9FA227D";
//        String str16 = "7B2261223A22E6B8A0E7BAA2E58583222C2262223A22E4B8ADE59BBD227D";
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("a","渠红元");
//        jsonObject.put("b","中国");
//        String s = ObsUtils.str2HexStr(jsonObject.toJSONString());
//        System.out.println(s);
//        System.out.println(new String(str16.getBytes(StandardCharsets.UTF_8)));
//        System.out.println(ObsUtils.hexStr2Str(new String(str16.getBytes(StandardCharsets.UTF_8))));
//        System.out.println(ObsUtils.hexStr2Str(new String(str16.getBytes(StandardCharsets.ISO_8859_1))));
//        System.out.println(ObsUtils.hexStr2Str(str16));
//        System.out.println(ObsUtils.hexStringToString(s));
//        System.out.println("--------------------------------------------------------------------------");
//        String s1 = ObsUtils.str2HexStr(new String(xml.getBytes(StandardCharsets.UTF_8),StandardCharsets.UTF_8));
//        System.out.println(s1);
//        System.out.println(ObsUtils.hexStr2Str(s1));
//        System.out.println(ObsUtils.hexStr2Str(new String(s1.getBytes(StandardCharsets.UTF_8))));

//        Date date1 = new Date();
//        String date = new SimpleDateFormat("yyyyMMdd").format(date1);
//        String time = new SimpleDateFormat("HHmmss").format(date1);
//        System.out.println(date);
//        System.out.println(time);



    }
}

