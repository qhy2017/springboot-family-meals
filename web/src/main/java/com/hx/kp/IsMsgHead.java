
package com.hx.kp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>isMsgHead complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="isMsgHead"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INTERFACE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MANDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OPERATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROXY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RECIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SENDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SENDTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SPRAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SYSTEM_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isMsgHead", propOrder = {
    "guid",
    "interfaceid",
    "mandt",
    "operator",
    "proxyid",
    "reciver",
    "sender",
    "sendtime",
    "spras",
    "systemid"
})
public class IsMsgHead {

    @XmlElement(name = "GUID")
    protected String guid;
    @XmlElement(name = "INTERFACE_ID")
    protected String interfaceid;
    @XmlElement(name = "MANDT")
    protected String mandt;
    @XmlElement(name = "OPERATOR")
    protected String operator;
    @XmlElement(name = "PROXY_ID")
    protected String proxyid;
    @XmlElement(name = "RECIVER")
    protected String reciver;
    @XmlElement(name = "SENDER")
    protected String sender;
    @XmlElement(name = "SENDTIME")
    protected String sendtime;
    @XmlElement(name = "SPRAS")
    protected String spras;
    @XmlElement(name = "SYSTEM_ID")
    protected String systemid;

    /**
     * 获取guid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * 设置guid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * 获取interfaceid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTERFACEID() {
        return interfaceid;
    }

    /**
     * 设置interfaceid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTERFACEID(String value) {
        this.interfaceid = value;
    }

    /**
     * 获取mandt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANDT() {
        return mandt;
    }

    /**
     * 设置mandt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANDT(String value) {
        this.mandt = value;
    }

    /**
     * 获取operator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERATOR() {
        return operator;
    }

    /**
     * 设置operator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERATOR(String value) {
        this.operator = value;
    }

    /**
     * 获取proxyid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROXYID() {
        return proxyid;
    }

    /**
     * 设置proxyid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROXYID(String value) {
        this.proxyid = value;
    }

    /**
     * 获取reciver属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECIVER() {
        return reciver;
    }

    /**
     * 设置reciver属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECIVER(String value) {
        this.reciver = value;
    }

    /**
     * 获取sender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDER() {
        return sender;
    }

    /**
     * 设置sender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDER(String value) {
        this.sender = value;
    }

    /**
     * 获取sendtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDTIME() {
        return sendtime;
    }

    /**
     * 设置sendtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDTIME(String value) {
        this.sendtime = value;
    }

    /**
     * 获取spras属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRAS() {
        return spras;
    }

    /**
     * 设置spras属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRAS(String value) {
        this.spras = value;
    }

    /**
     * 获取systemid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSYSTEMID() {
        return systemid;
    }

    /**
     * 设置systemid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSYSTEMID(String value) {
        this.systemid = value;
    }

}
