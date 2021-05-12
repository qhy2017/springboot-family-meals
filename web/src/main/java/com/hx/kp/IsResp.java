
package com.hx.kp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>isResp complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="isResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NODE_KEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRCTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PSPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PSTON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESULT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isResp", propOrder = {
    "bname",
    "nodekey",
    "prctr",
    "pspid",
    "pston",
    "rcomp",
    "result",
    "text",
    "vernr"
})
public class IsResp {

    @XmlElement(name = "BNAME")
    protected String bname;
    @XmlElement(name = "NODE_KEY")
    protected String nodekey;
    @XmlElement(name = "PRCTR")
    protected String prctr;
    @XmlElement(name = "PSPID")
    protected String pspid;
    @XmlElement(name = "PSTON")
    protected String pston;
    @XmlElement(name = "RCOMP")
    protected String rcomp;
    @XmlElement(name = "RESULT")
    protected String result;
    @XmlElement(name = "TEXT")
    protected String text;
    @XmlElement(name = "VERNR")
    protected String vernr;

    /**
     * 获取bname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBNAME() {
        return bname;
    }

    /**
     * 设置bname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBNAME(String value) {
        this.bname = value;
    }

    /**
     * 获取nodekey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNODEKEY() {
        return nodekey;
    }

    /**
     * 设置nodekey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNODEKEY(String value) {
        this.nodekey = value;
    }

    /**
     * 获取prctr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRCTR() {
        return prctr;
    }

    /**
     * 设置prctr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRCTR(String value) {
        this.prctr = value;
    }

    /**
     * 获取pspid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSPID() {
        return pspid;
    }

    /**
     * 设置pspid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSPID(String value) {
        this.pspid = value;
    }

    /**
     * 获取pston属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSTON() {
        return pston;
    }

    /**
     * 设置pston属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSTON(String value) {
        this.pston = value;
    }

    /**
     * 获取rcomp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCOMP() {
        return rcomp;
    }

    /**
     * 设置rcomp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCOMP(String value) {
        this.rcomp = value;
    }

    /**
     * 获取result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESULT() {
        return result;
    }

    /**
     * 设置result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESULT(String value) {
        this.result = value;
    }

    /**
     * 获取text属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEXT() {
        return text;
    }

    /**
     * 设置text属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEXT(String value) {
        this.text = value;
    }

    /**
     * 获取vernr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERNR() {
        return vernr;
    }

    /**
     * 设置vernr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERNR(String value) {
        this.vernr = value;
    }

}
