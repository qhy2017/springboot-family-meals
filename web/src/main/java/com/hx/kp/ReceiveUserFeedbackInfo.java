
package com.hx.kp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>receiveUserFeedbackInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="receiveUserFeedbackInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IS_MSG_HEAD" type="{http://api.ws.common.adminWeb.bmp.seg/}isMsgHead" minOccurs="0"/&gt;
 *         &lt;element name="IS_RESP" type="{http://api.ws.common.adminWeb.bmp.seg/}isResp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveUserFeedbackInfo", propOrder = {
    "ismsghead",
    "isresp"
})
public class ReceiveUserFeedbackInfo {

    @XmlElement(name = "IS_MSG_HEAD")
    protected IsMsgHead ismsghead;
    @XmlElement(name = "IS_RESP")
    protected List<IsResp> isresp;

    /**
     * 获取ismsghead属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IsMsgHead }
     *     
     */
    public IsMsgHead getISMSGHEAD() {
        return ismsghead;
    }

    /**
     * 设置ismsghead属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IsMsgHead }
     *     
     */
    public void setISMSGHEAD(IsMsgHead value) {
        this.ismsghead = value;
    }

    /**
     * Gets the value of the isresp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isresp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getISRESP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsResp }
     * 
     * 
     */
    public List<IsResp> getISRESP() {
        if (isresp == null) {
            isresp = new ArrayList<IsResp>();
        }
        return this.isresp;
    }

}
