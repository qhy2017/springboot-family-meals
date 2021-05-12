
package com.hx.kp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>receiveAuditFeedbackInfoResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="receiveAuditFeedbackInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auditFeedbackMsg" type="{http://api.ws.common.adminWeb.bmp.seg/}resAuditFeedback" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveAuditFeedbackInfoResponse", propOrder = {
    "auditFeedbackMsg"
})
public class ReceiveAuditFeedbackInfoResponse {

    protected ResAuditFeedback auditFeedbackMsg;

    /**
     * 获取auditFeedbackMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResAuditFeedback }
     *     
     */
    public ResAuditFeedback getAuditFeedbackMsg() {
        return auditFeedbackMsg;
    }

    /**
     * 设置auditFeedbackMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResAuditFeedback }
     *     
     */
    public void setAuditFeedbackMsg(ResAuditFeedback value) {
        this.auditFeedbackMsg = value;
    }

}
