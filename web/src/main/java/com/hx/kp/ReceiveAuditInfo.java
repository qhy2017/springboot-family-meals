
package com.hx.kp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>receiveAuditInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="receiveAuditInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IV_SIZE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IV_LOGSYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IV_RESERVE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IV_RESERVE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IV_RESERVE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IT_XML" type="{http://api.ws.common.adminWeb.bmp.seg/}itXml" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IT_APNUM" type="{http://api.ws.common.adminWeb.bmp.seg/}itApnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SYWTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveAuditInfo", propOrder = {
    "ivsize",
    "ivlogsys",
    "ivreserve1",
    "ivreserve2",
    "ivreserve3",
    "itxml",
    "itapnum",
    "sywty"
})
public class ReceiveAuditInfo {

    @XmlElement(name = "IV_SIZE")
    protected String ivsize;
    @XmlElement(name = "IV_LOGSYS")
    protected String ivlogsys;
    @XmlElement(name = "IV_RESERVE1")
    protected String ivreserve1;
    @XmlElement(name = "IV_RESERVE2")
    protected String ivreserve2;
    @XmlElement(name = "IV_RESERVE3")
    protected String ivreserve3;
    @XmlElement(name = "IT_XML")
    protected List<ItXml> itxml;
    @XmlElement(name = "IT_APNUM")
    protected List<ItApnum> itapnum;
    @XmlElement(name = "SYWTY")
    protected String sywty;

    /**
     * 获取ivsize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVSIZE() {
        return ivsize;
    }

    /**
     * 设置ivsize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVSIZE(String value) {
        this.ivsize = value;
    }

    /**
     * 获取ivlogsys属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVLOGSYS() {
        return ivlogsys;
    }

    /**
     * 设置ivlogsys属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVLOGSYS(String value) {
        this.ivlogsys = value;
    }

    /**
     * 获取ivreserve1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVRESERVE1() {
        return ivreserve1;
    }

    /**
     * 设置ivreserve1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVRESERVE1(String value) {
        this.ivreserve1 = value;
    }

    /**
     * 获取ivreserve2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVRESERVE2() {
        return ivreserve2;
    }

    /**
     * 设置ivreserve2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVRESERVE2(String value) {
        this.ivreserve2 = value;
    }

    /**
     * 获取ivreserve3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVRESERVE3() {
        return ivreserve3;
    }

    /**
     * 设置ivreserve3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVRESERVE3(String value) {
        this.ivreserve3 = value;
    }

    /**
     * Gets the value of the itxml property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itxml property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getITXML().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItXml }
     * 
     * 
     */
    public List<ItXml> getITXML() {
        if (itxml == null) {
            itxml = new ArrayList<ItXml>();
        }
        return this.itxml;
    }

    /**
     * Gets the value of the itapnum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itapnum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getITAPNUM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItApnum }
     * 
     * 
     */
    public List<ItApnum> getITAPNUM() {
        if (itapnum == null) {
            itapnum = new ArrayList<ItApnum>();
        }
        return this.itapnum;
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

}
