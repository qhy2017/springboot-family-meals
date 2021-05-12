
package com.hx.kp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>resAuditFeedback complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="resAuditFeedback"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ET_RETURN" type="{http://api.ws.common.adminWeb.bmp.seg/}etReturn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EV_RESERVE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EV_RESERVE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EV_XML_SIZE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resAuditFeedback", propOrder = {
    "etreturn",
    "evreserve1",
    "evreserve2",
    "evxmlsize"
})
public class ResAuditFeedback {

    @XmlElement(name = "ET_RETURN", nillable = true)
    protected List<EtReturn> etreturn;
    @XmlElement(name = "EV_RESERVE1")
    protected String evreserve1;
    @XmlElement(name = "EV_RESERVE2")
    protected String evreserve2;
    @XmlElement(name = "EV_XML_SIZE")
    protected String evxmlsize;

    /**
     * Gets the value of the etreturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etreturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getETRETURN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EtReturn }
     * 
     * 
     */
    public List<EtReturn> getETRETURN() {
        if (etreturn == null) {
            etreturn = new ArrayList<EtReturn>();
        }
        return this.etreturn;
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
     * 获取evxmlsize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVXMLSIZE() {
        return evxmlsize;
    }

    /**
     * 设置evxmlsize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVXMLSIZE(String value) {
        this.evxmlsize = value;
    }

}
