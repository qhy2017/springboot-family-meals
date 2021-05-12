package qhy.example.web.xmlToBean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.util.ArrayList;
import java.util.List;

public class XmlToBeanUtil {
//  static String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?><DATA><Row><Apnum>20072906390308613</Apnum><Header><MANDT>800</MANDT><DOCNO>0000002478</DOCNO><VERSN>001</VERSN><SYWTY>GA01</SYWTY><BUKRS>8590</BUKRS><GJAHR>0000</GJAHR><VERIS>000</VERIS><STUNR>000</STUNR><APNUM>20072906390308613</APNUM><CZDAT>0000-00-00</CZDAT><CZZET>00:00:00</CZZET><TJNAM>LIUXD292</TJNAM><TJDAT>2020-07-29</TJDAT><TJZET>14:39:03</TJZET><APDAY>0</APDAY><NAMETEXT>刘晓东</NAMETEXT><ZQKDH>0000002478</ZQKDH><PSPID>NGCF110099</PSPID><POST1>项目进度检测填报年月校验问题</POST1><ZCMISNO>13300000-10-FW0203-0001</ZCMISNO><ZCMISOD>9120000011</ZCMISOD><KUNNR>0045303970</KUNNR><NAME1>北京嘉岳能源科技开发有限公司</NAME1><ZRELATIVE>0045303970</ZRELATIVE><ZRELATIVENAME>北京嘉岳能源科技开发有限公司</ZRELATIVENAME><ZSD05>2020-07-29</ZSD05><ZNAME>北京嘉岳能源科技开发有限公司</ZNAME><ZTAX>11010230632741X</ZTAX><ZADD>西城区新街口外大街8号5幢009房（德胜园区）</ZADD><STATS>A</STATS></Header><Item><MANDT>800</MANDT><VERSN>000</VERSN><GJAHR>0000</GJAHR><POSNR>000000</POSNR><CZDAT>0000-00-00</CZDAT><CZZET>00:00:00</CZZET><TBFLG>1</TBFLG><TBNAM>承包方</TBNAM><ZQKDH>0000002478</ZQKDH><ZSDXH>000010</ZSDXH><ZSD07>施工费</ZSD07><ZSD08>100.00</ZSD08><ZSD09>0.00</ZSD09><ZSD10>100.00</ZSD10><ZSD11>100.00</ZSD11><ZSD12>100.00</ZSD12><ZSD13>0.00</ZSD13><ZSD14>0.00</ZSD14><ZSD15>0.00</ZSD15><ZSD16>100.00</ZSD16><ZSD17>100.</ZSD17><ZSD19>0.00</ZSD19><ZSD20>0.00</ZSD20><ZSD21>0.00</ZSD21><ZSD22>0.00</ZSD22><ZNETVALUE>0.00</ZNETVALUE><ZTAXM>0.00</ZTAXM><AMOUNT>0.000</AMOUNT><PRICE>0.00</PRICE><MONEY>0.00</MONEY><KONTS>2171010500</KONTS><TXT20>应交税费-应交增值税-销项税额-国内-内</TXT20></Item><Item><MANDT>800</MANDT><VERSN>000</VERSN><GJAHR>0000</GJAHR><POSNR>000000</POSNR><CZDAT>0000-00-00</CZDAT><CZZET>00:00:00</CZZET><TBFLG>2</TBFLG><TBNAM>发包方</TBNAM><ZQKDH>0000002478</ZQKDH><ZSDXH>000010</ZSDXH><ZSDLY>X</ZSDLY><ZSD07>施工费</ZSD07><ZSD08>100.00</ZSD08><ZSD09>0.00</ZSD09><ZSD10>100.00</ZSD10><ZSD11>100.00</ZSD11><ZSD12>100.00</ZSD12><ZSD13>0.00</ZSD13><ZSD15>0.00</ZSD15><ZSD16>100.00</ZSD16><ZSD17>0.00</ZSD17><ZSD19>0.00</ZSD19><ZSD20>0.00</ZSD20><ZSD21>0.00</ZSD21><ZSD22>0.00</ZSD22><ZNETVALUE>0.00</ZNETVALUE><ZTAXM>0.00</ZTAXM><AMOUNT>0.000</AMOUNT><PRICE>0.00</PRICE><MONEY>0.00</MONEY><KONTS>2171010500</KONTS><TXT20>应交税费-应交增值税-销项税额-国内-内</TXT20></Item></Row></DATA>";
  static String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?><DATA><Row><Apnum>20073007364491541</Apnum><Header><MANDT>800</MANDT><DOCNO>0000002480</DOCNO><VERSN>001</VERSN><SYWTY>GA01</SYWTY><BUKRS>8590</BUKRS><GJAHR>0000</GJAHR><VERIS>000</VERIS><STUNR>000</STUNR><APNUM>20073007364491541</APNUM><CZDAT>0000-00-00</CZDAT><CZZET>00:00:00</CZZET><TJNAM>PLZHANG</TJNAM><TJDAT>2020-07-30</TJDAT><TJZET>15:35:50</TJZET><APDAY>0</APDAY><NAMETEXT>张丽</NAMETEXT><ZQKDH>0000002480</ZQKDH><PSPID>GNBF140035</PSPID><POST1>12万吨/年醋酸甲酯加氢制乙醇成套技术开发</POST1><ZCMISNO>NGCF190001</ZCMISNO><ZCMISOD>1900090009</ZCMISOD><ZCRTNAME>南京投入法测试项目1</ZCRTNAME><KUNNR>0031750000</KUNNR><NAME1>茂名分公司</NAME1><ZRELATIVE>0031750000</ZRELATIVE><ZRELATIVENAME>茂名分公司</ZRELATIVENAME><ZSD05>2020-07-29</ZSD05><ZNAME>中国石油化工股份有限公司茂名分公司</ZNAME><ZTAX>4.41E+14</ZTAX><ZADD>茂名市双山四路9号大院1号楼</ZADD><STATS>A</STATS></Header><Item><MANDT>800</MANDT><VERSN>000</VERSN><GJAHR>0000</GJAHR><POSNR>000000</POSNR><CZDAT>0000-00-00</CZDAT><CZZET>00:00:00</CZZET><TBFLG>1</TBFLG><TBNAM>承包方</TBNAM><ZQKDH>0000002480</ZQKDH><ZSDXH>000010</ZSDXH><ZSD07>设计费（设计人工成本）</ZSD07><ZSD08>100.00</ZSD08><ZSD09>0.00</ZSD09><ZSD10>100.00</ZSD10><ZSD11>100.00</ZSD11><ZSD12>0.00</ZSD12><ZSD13>0.00</ZSD13><ZSD14>0.00</ZSD14><ZSD15>0.00</ZSD15><ZSD16>0.00</ZSD16><ZSD17>0.00</ZSD17><ZSD19>0.00</ZSD19><ZSD20>0.00</ZSD20><ZSD21>0.00</ZSD21><ZSD22>0.00</ZSD22><ZNETVALUE>0.00</ZNETVALUE><ZTAXM>0.00</ZTAXM><AMOUNT>0.000</AMOUNT><PRICE>0.00</PRICE><MONEY>0.00</MONEY><KONTS>2171010500</KONTS><TXT20>应交税费-应交增值税-销项税额-国内-内</TXT20></Item><Item><MANDT>800</MANDT><VERSN>000</VERSN><GJAHR>0000</GJAHR><POSNR>000000</POSNR><CZDAT>0000-00-00</CZDAT><CZZET>00:00:00</CZZET><TBFLG>2</TBFLG><TBNAM>发包方</TBNAM><ZQKDH>0000002480</ZQKDH><ZSDXH>000010</ZSDXH><ZSDLY>X</ZSDLY><ZSD07>设计费（设计人工成本）</ZSD07><ZSD08>100.00</ZSD08><ZSD09>0.00</ZSD09><ZSD10>100.00</ZSD10><ZSD11>100.00</ZSD11><ZSD12>0.00</ZSD12><ZSD13>0.00</ZSD13><ZSD15>0.00</ZSD15><ZSD16>0.00</ZSD16><ZSD17>0.00</ZSD17><ZSD19>0.00</ZSD19><ZSD20>0.00</ZSD20><ZSD21>0.00</ZSD21><ZSD22>0.00</ZSD22><ZNETVALUE>0.00</ZNETVALUE><ZTAXM>0.00</ZTAXM><AMOUNT>0.000</AMOUNT><PRICE>0.00</PRICE><MONEY>0.00</MONEY><KONTS>2171010500</KONTS><TXT20>应交税费-应交增值税-销项税额-国内-内</TXT20></Item><Item><MANDT>800</MANDT><VERSN>000</VERSN><GJAHR>0000</GJAHR><POSNR>000000</POSNR><CZDAT>0000-00-00</CZDAT><CZZET>00:00:00</CZZET><TBFLG>1</TBFLG><TBNAM>承包方</TBNAM><ZQKDH>0000002480</ZQKDH><ZSDXH>000020</ZSDXH><ZSD07>设备材料费</ZSD07><ZSD08>100.00</ZSD08><ZSD09>0.00</ZSD09><ZSD10>100.00</ZSD10><ZSD11>100.00</ZSD11><ZSD12>0.00</ZSD12><ZSD13>0.00</ZSD13><ZSD14>0.00</ZSD14><ZSD15>0.00</ZSD15><ZSD16>0.00</ZSD16><ZSD17>0.00</ZSD17><ZSD19>0.00</ZSD19><ZSD20>0.00</ZSD20><ZSD21>0.00</ZSD21><ZSD22>0.00</ZSD22><ZNETVALUE>0.00</ZNETVALUE><ZTAXM>0.00</ZTAXM><AMOUNT>0.000</AMOUNT><PRICE>0.00</PRICE><MONEY>0.00</MONEY><KONTS>2171010500</KONTS><TXT20>应交税费-应交增值税-销项税额-国内-内</TXT20></Item><Item><MANDT>800</MANDT><VERSN>000</VERSN><GJAHR>0000</GJAHR><POSNR>000000</POSNR><CZDAT>0000-00-00</CZDAT><CZZET>00:00:00</CZZET><TBFLG>2</TBFLG><TBNAM>发包方</TBNAM><ZQKDH>0000002480</ZQKDH><ZSDXH>000020</ZSDXH><ZSDLY>X</ZSDLY><ZSD07>设备材料费</ZSD07><ZSD08>100.00</ZSD08><ZSD09>0.00</ZSD09><ZSD10>100.00</ZSD10><ZSD11>100.00</ZSD11><ZSD12>0.00</ZSD12><ZSD13>0.00</ZSD13><ZSD15>0.00</ZSD15><ZSD16>0.00</ZSD16><ZSD17>0.00</ZSD17><ZSD19>0.00</ZSD19><ZSD20>0.00</ZSD20><ZSD21>0.00</ZSD21><ZSD22>0.00</ZSD22><ZNETVALUE>0.00</ZNETVALUE><ZTAXM>0.00</ZTAXM><AMOUNT>0.000</AMOUNT><PRICE>0.00</PRICE><MONEY>0.00</MONEY><KONTS>2171010500</KONTS><TXT20>应交税费-应交增值税-销项税额-国内-内</TXT20></Item><Item><MANDT>800</MANDT><VERSN>000</VERSN><GJAHR>0000</GJAHR><POSNR>000000</POSNR><CZDAT>0000-00-00</CZDAT><CZZET>00:00:00</CZZET><TBFLG>1</TBFLG><TBNAM>承包方</TBNAM><ZQKDH>0000002480</ZQKDH><ZSDXH>000030</ZSDXH><ZSD07>施工费</ZSD07><ZSD08>100.00</ZSD08><ZSD09>0.00</ZSD09><ZSD10>100.00</ZSD10><ZSD11>100.00</ZSD11><ZSD12>0.00</ZSD12><ZSD13>0.00</ZSD13><ZSD14>0.00</ZSD14><ZSD15>0.00</ZSD15><ZSD16>0.00</ZSD16><ZSD17>0.00</ZSD17><ZSD19>0.00</ZSD19><ZSD20>0.00</ZSD20><ZSD21>0.00</ZSD21><ZSD22>0.00</ZSD22><ZNETVALUE>0.00</ZNETVALUE><ZTAXM>0.00</ZTAXM><AMOUNT>0.000</AMOUNT><PRICE>0.00</PRICE><MONEY>0.00</MONEY><KONTS>2171010500</KONTS><TXT20>应交税费-应交增值税-销项税额-国内-内</TXT20></Item><Item><MANDT>800</MANDT><VERSN>000</VERSN><GJAHR>0000</GJAHR><POSNR>000000</POSNR><CZDAT>0000-00-00</CZDAT><CZZET>00:00:00</CZZET><TBFLG>2</TBFLG><TBNAM>发包方</TBNAM><ZQKDH>0000002480</ZQKDH><ZSDXH>000030</ZSDXH><ZSDLY>X</ZSDLY><ZSD07>施工费</ZSD07><ZSD08>100.00</ZSD08><ZSD09>0.00</ZSD09><ZSD10>100.00</ZSD10><ZSD11>100.00</ZSD11><ZSD12>0.00</ZSD12><ZSD13>0.00</ZSD13><ZSD15>0.00</ZSD15><ZSD16>0.00</ZSD16><ZSD17>0.00</ZSD17><ZSD19>0.00</ZSD19><ZSD20>0.00</ZSD20><ZSD21>0.00</ZSD21><ZSD22>0.00</ZSD22><ZNETVALUE>0.00</ZNETVALUE><ZTAXM>0.00</ZTAXM><AMOUNT>0.000</AMOUNT><PRICE>0.00</PRICE><MONEY>0.00</MONEY><KONTS>2171010500</KONTS><TXT20>应交税费-应交增值税-销项税额-国内-内</TXT20></Item></Row></DATA>";
    public XStream setXStream(){
        XStream xstream = new XStream(new DomDriver());
        XStream.setupDefaultSecurity(xstream);
        xstream.allowTypes(new Class[]{BeanXml.class});

        return null;
    }

    public static void test(Object o) {

//        Object o = ObsUtils.xmlToBean(des, DataXml.class);
            DataXml data = (DataXml)o;
            JSONObject jsonObject = new JSONObject();
            QkRow row = data.getRow();
            QkHeader header = row.getHeader();
            List<QkItem> items = row.getItems();
            String remarks = "ERP数据";
            if(row != null && header != null){
                // MANDT
                jsonObject.put("tt1",header.getMandt());
                //ZQKDH
                jsonObject.put("tt2",header.getZqkdh());
                //BUKRS
                jsonObject.put("tt3",header.getBukrs());
                //GJAHR
                jsonObject.put("tt4",header.getGjahr());
                //PSPID
                jsonObject.put("tt5",header.getPspid());
                //POST1
                jsonObject.put("tt6",header.getPost1());
                //ZCMISNO
                jsonObject.put("tt7",header.getZcmisno());
                //ZCMISOD
                jsonObject.put("tt8",header.getZcmisod());
                //ZCMISOD
                jsonObject.put("tt8",header.getZcmisod());
                //ZCRTNAME
                jsonObject.put("tt9",header.getZcrtname());
                //KUNNR
                jsonObject.put("tt10",header.getKunnr());
                //ZSD04
                jsonObject.put("tt11",header.getZsd04());
                //ZSD05
                jsonObject.put("tt12",header.getZsd05());
                //ZNAME
                jsonObject.put("tt13",header.getZname());
                //ZTAX
                jsonObject.put("tt14",header.getZtax());
                //ZBANK
                jsonObject.put("tt15",header.getZbank());
                //ZADD
                jsonObject.put("tt16",header.getZadd());
                //STATS
                jsonObject.put("tt17",header.getStats());
                //VBELN
                jsonObject.put("tt18",header.getVbeln());
                //UNAME
                jsonObject.put("tt19",header.getUname());
                //KUNNR_S
                jsonObject.put("tt20",header.getKunnrS());
                //NAME2
                jsonObject.put("tt21",header.getName2());
                //ZSDCX
                jsonObject.put("zsdcx",header.getZsdcx());
                //remarks
                jsonObject.put("remarks",remarks);
                jsonObject.put("createPerson","admin");
                jsonObject.put("dataStatus","1");

                List<JSONObject> list = new ArrayList<>();

                if(!items.isEmpty()){
                    for(QkItem item : items){
                        JSONObject qkhxm = new JSONObject();
                        qkhxm.put("hxm1",item.getMandt());
                        //ZQKDH
                        qkhxm.put("hxm2",item.getZqkdh());
                        //ZSDXH
                        qkhxm.put("hxm3",item.getZsdxh());
                        //ZSDLY
                        qkhxm.put("hxm4",item.getZsdly());
                        //ZSD07
                        qkhxm.put("hxm5",item.getZsd07());
                        //ZSD08
                        qkhxm.put("hxm6",item.getZsd08());
                        //ZSD09
                        qkhxm.put("hxm7",item.getZsd09());
                        //ZSD10
                        qkhxm.put("hxm8",item.getZsd10());
                        //ZSD11
                        qkhxm.put("hxm9",item.getZsd11());
                        //ZSD12
                        qkhxm.put("hxm10",item.getZsd12());
                        //ZSD13
                        qkhxm.put("hxm11",item.getZsd13());
                        //ZSD14
                        qkhxm.put("hxm12",item.getZsd14());
                        //ZSD15
                        qkhxm.put("hxm13",item.getZsd15());
                        //ZSD16
                        qkhxm.put("hxm14",item.getZsd16());
                        //ZSD17
                        qkhxm.put("hxm15",item.getZsd17());
                        //ZSD18
                        qkhxm.put("hxm16",item.getZsd18());
                        //ZSD19
                        qkhxm.put("hxm17",item.getZsd19());
                        //ZSD20
                        qkhxm.put("hxm18",item.getZsd20());
                        //ZSD21
                        qkhxm.put("hxm19",item.getZsd21());
                        //ZSD22
                        qkhxm.put("hxm20",item.getZsd22());
                        //ZNETVALUE
                        qkhxm.put("hxm21",item.getZnetvalue());
                        //ZTAXM
                        qkhxm.put("hxm22",item.getZtaxm());
                        qkhxm.put("remarks",remarks);
                        qkhxm.put("createPerson","admin");
                        qkhxm.put("dataStatus","1");
                        list.add(qkhxm);
                    }
                    jsonObject.put("list",list);
                }
//                JSONArray apiResult = this.getApiResult(obsPath + "sap/sapqktt/save", null, jsonObject.toJSONString());
            }

            System.out.println(jsonObject.toJSONString());

    }

    public static void main(String[] args) {
        String header = "</Header>";
        String rows = "</Row>";
        String s = xml.replaceFirst(header, header.concat("<Items>")).replaceFirst(rows, "</Items>".concat(rows));
        StringBuffer str = new StringBuffer();
//        System.out.println(s);





//        BeanXml beanXml = new BeanXml();
//        beanXml.setName("quhongyuan");
//        List<Option> list = new ArrayList<>();
//        list.add(new Option("option 测试"));
//        list.add(new Option("option 测试"));
//        beanXml.setOptions(list);
        XStream xstream = new XStream(new DomDriver());
        xstream.ignoreUnknownElements();
        xstream.processAnnotations(DataXml.class);
//        String s = xstream.toXML(xml);
//        System.out.println(s);
          Object o = xstream.fromXML(s);

        test(o);
//        if(o instanceof BeanXml){
//            BeanXml beanXml1 = (BeanXml) o;
//            System.out.println(o);
//            System.out.println(beanXml1.getName());
//            System.out.println(beanXml1.getOptions().get(0).getName());
//        }
         System.out.println(o);
         System.out.println(JSON.toJSONString(o));
    }



    public static Object xmlToBean (String xml,Class ...cla){

        return null;
    }

}
