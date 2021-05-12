
package com.hx.kp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>itHead complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="itHead"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="APNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BUKRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KALSM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SYWTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VERSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VTEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZSPVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itHead", propOrder = {
    "apnum",
    "bukrs",
    "docno",
    "kalsm",
    "message",
    "sywty",
    "versn",
    "vtext",
    "zspver"
})
public class ItHead {

    @XmlElement(name = "APNUM")
    protected String apnum;
    @XmlElement(name = "BUKRS")
    protected String bukrs;
    @XmlElement(name = "DOCNO")
    protected String docno;
    @XmlElement(name = "KALSM")
    protected String kalsm;
    @XmlElement(name = "MESSAGE")
    protected String message;
    @XmlElement(name = "SYWTY")
    protected String sywty;
    @XmlElement(name = "VERSN")
    protected String versn;
    @XmlElement(name = "VTEXT")
    protected String vtext;
    @XmlElement(name = "ZSPVER")
    protected String zspver;

    /**
     * 获取apnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPNUM() {
        return apnum;
    }

    /**
     * 设置apnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPNUM(String value) {
        this.apnum = value;
    }

    /**
     * 获取bukrs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUKRS() {
        return bukrs;
    }

    /**
     * 设置bukrs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUKRS(String value) {
        this.bukrs = value;
    }

    /**
     * 获取docno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCNO() {
        return docno;
    }

    /**
     * 设置docno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCNO(String value) {
        this.docno = value;
    }

    /**
     * 获取kalsm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKALSM() {
        return kalsm;
    }

    /**
     * 设置kalsm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKALSM(String value) {
        this.kalsm = value;
    }

    /**
     * 获取message属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESSAGE() {
        return message;
    }

    /**
     * 设置message属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESSAGE(String value) {
        this.message = value;
    }

    /**
     * 获取sywty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSYWTY() {
        return sywty;
    }

    /**
     * 设置sywty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSYWTY(String value) {
        this.sywty = value;
    }

    /**
     * 获取versn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERSN() {
        return versn;
    }

    /**
     * 设置versn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERSN(String value) {
        this.versn = value;
    }

    /**
     * 获取vtext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTEXT() {
        return vtext;
    }

    /**
     * 设置vtext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTEXT(String value) {
        this.vtext = value;
    }

    /**
     * 获取zspver属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZSPVER() {
        return zspver;
    }

    /**
     * 设置zspver属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZSPVER(String value) {
        this.zspver = value;
    }

}
