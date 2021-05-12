
package com.hx.kp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>receiveProjectInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="receiveProjectInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ET_PROJ" type="{http://api.ws.common.adminWeb.bmp.seg/}etProj" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ES_MSG_HEAD" type="{http://api.ws.common.adminWeb.bmp.seg/}esMsgHead" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveProjectInfo", propOrder = {
    "etproj",
    "esmsghead"
})
public class ReceiveProjectInfo {

    @XmlElement(name = "ET_PROJ")
    protected List<EtProj> etproj;
    @XmlElement(name = "ES_MSG_HEAD")
    protected EsMsgHead esmsghead;

    /**
     * Gets the value of the etproj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etproj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getETPROJ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EtProj }
     * 
     * 
     */
    public List<EtProj> getETPROJ() {
        if (etproj == null) {
            etproj = new ArrayList<EtProj>();
        }
        return this.etproj;
    }

    /**
     * 获取esmsghead属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EsMsgHead }
     *     
     */
    public EsMsgHead getESMSGHEAD() {
        return esmsghead;
    }

    /**
     * 设置esmsghead属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EsMsgHead }
     *     
     */
    public void setESMSGHEAD(EsMsgHead value) {
        this.esmsghead = value;
    }

}
