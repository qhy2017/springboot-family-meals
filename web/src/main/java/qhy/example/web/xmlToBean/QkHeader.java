package qhy.example.web.xmlToBean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("Header")
public class QkHeader {


    @XStreamAlias("MANDT")
    private String mandt;

    @XStreamAlias("DOCNO")
    private String docno;


    @XStreamAlias("VERSN")
    private String versn;

    @XStreamAlias("SYWTY")
    private String sywty;

    @XStreamAlias("BUKRS")
    private String bukrs;

    @XStreamAlias("GJAHR")
    private String gjahr;

    @XStreamAlias("VERIS")
    private String veris;


    @XStreamAlias("STUNR")
    private String stunr;


    @XStreamAlias("APNUM")
    private String apnum;

    @XStreamAlias("CZDAT")
    private String czdat;

    @XStreamAlias("CZZET")
    private String czzet;

    @XStreamAlias("TJNAM")
    private String tjnam;

    @XStreamAlias("TJDAT")
    private String tjdat;

    @XStreamAlias("TJZET")
    private String tjzet;

    @XStreamAlias("APDAY")
    private String apday;

    @XStreamAlias("NAMETEXT")
    private String nametext;

    @XStreamAlias("ZQKDH")
    private String zqkdh;

    @XStreamAlias("PSPID")
    private String pspid;

    @XStreamAlias("POST1")
    private String post1;

    @XStreamAlias("ZCMISNO")
    private String zcmisno;

    @XStreamAlias("ZCMISOD")
    private String zcmisod;

    @XStreamAlias("KUNNR")
    private String kunnr;

    @XStreamAlias("NAME1")
    private String name1;

    @XStreamAlias("ZRELATIVE")
    private String zrelative;

    @XStreamAlias("ZRELATIVENAME")
    private String zrelativename;

    @XStreamAlias("ZSD05")
    private String zsd05;

    @XStreamAlias("ZNAME")
    private String zname;

    @XStreamAlias("ZTAX")
    private String ztax;

    @XStreamAlias("ZADD")
    private String zadd;

    @XStreamAlias("STATS")
    private String stats;

    @XStreamAlias("ZCRTNAME")
    private String zcrtname;

    @XStreamAlias("ZSD04")
    private String zsd04;

    @XStreamAlias("ZBANK")
    private String zbank;

    @XStreamAlias("VBELN")
    private String vbeln;

    @XStreamAlias("UNAME")
    private String uname;

    @XStreamAlias("KUNNR_S")
    private String kunnrS;

    @XStreamAlias("NAME2")
    private String name2;

    @XStreamAlias("ZSDCX")
    private String zsdcx;





}
