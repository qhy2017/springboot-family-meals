
package com.hx.kp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>resAudit complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="resAudit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EV_MTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EV_RESERVE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EV_RESERVE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IT_HEAD" type="{http://api.ws.common.adminWeb.bmp.seg/}itHead" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IT_TIEM" type="{http://api.ws.common.adminWeb.bmp.seg/}itTiem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resAudit", propOrder = {
    "evmtype",
    "evreserve1",
    "evreserve2",
    "ithead",
    "ittiem"
})
public class ResAudit {

    @XmlElement(name = "EV_MTYPE")
    protected String evmtype;
    @XmlElement(name = "EV_RESERVE1")
    protected String evreserve1;
    @XmlElement(name = "EV_RESERVE2")
    protected String evreserve2;
    @XmlElement(name = "IT_HEAD", nillable = true)
    protected List<ItHead> ithead;
    @XmlElement(name = "IT_TIEM", nillable = true)
    protected List<ItTiem> ittiem;

    /**
     * 获取evmtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVMTYPE() {
        return evmtype;
    }

    /**
     * 设置evmtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVMTYPE(String value) {
        this.evmtype = value;
    }

    /**
     * 获取evreserve1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVRESERVE1() {
        return evreserve1;
    }

    /**
     * 设置evreserve1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVRESERVE1(String value) {
        this.evreserve1 = value;
    }

    /**
     * 获取evreserve2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVRESERVE2() {
        return evreserve2;
    }

    /**
     * 设置evreserve2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVRESERVE2(String value) {
        this.evreserve2 = value;
    }

    /**
     * Gets the value of the ithead property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ithead property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getITHEAD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItHead }
     * 
     * 
     */
    public List<ItHead> getITHEAD() {
        if (ithead == null) {
            ithead = new ArrayList<ItHead>();
        }
        return this.ithead;
    }

    /**
     * Gets the value of the ittiem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ittiem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getITTIEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItTiem }
     * 
     * 
     */
    public List<ItTiem> getITTIEM() {
        if (ittiem == null) {
            ittiem = new ArrayList<ItTiem>();
        }
        return this.ittiem;
    }

}
