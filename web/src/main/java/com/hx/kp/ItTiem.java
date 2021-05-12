
package com.hx.kp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>itTiem complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="itTiem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CZDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CZNAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CZZET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KALSM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REMRK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STUNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "itTiem", propOrder = {
    "czdat",
    "cznam",
    "czzet",
    "kalsm",
    "remrk",
    "stunr",
    "zspver"
})
public class ItTiem {

    @XmlElement(name = "CZDAT")
    protected String czdat;
    @XmlElement(name = "CZNAM")
    protected String cznam;
    @XmlElement(name = "CZZET")
    protected String czzet;
    @XmlElement(name = "KALSM")
    protected String kalsm;
    @XmlElement(name = "REMRK")
    protected String remrk;
    @XmlElement(name = "STUNR")
    protected String stunr;
    @XmlElement(name = "ZSPVER")
    protected String zspver;

    /**
     * 获取czdat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCZDAT() {
        return czdat;
    }

    /**
     * 设置czdat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCZDAT(String value) {
        this.czdat = value;
    }

    /**
     * 获取cznam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCZNAM() {
        return cznam;
    }

    /**
     * 设置cznam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCZNAM(String value) {
        this.cznam = value;
    }

    /**
     * 获取czzet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCZZET() {
        return czzet;
    }

    /**
     * 设置czzet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCZZET(String value) {
        this.czzet = value;
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
     * 获取remrk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMRK() {
        return remrk;
    }

    /**
     * 设置remrk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMRK(String value) {
        this.remrk = value;
    }

    /**
     * 获取stunr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTUNR() {
        return stunr;
    }

    /**
     * 设置stunr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTUNR(String value) {
        this.stunr = value;
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
