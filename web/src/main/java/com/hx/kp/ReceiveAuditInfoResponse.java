
package com.hx.kp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>receiveAuditInfoResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="receiveAuditInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auditMsg" type="{http://api.ws.common.adminWeb.bmp.seg/}resAudit" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveAuditInfoResponse", propOrder = {
    "auditMsg"
})
public class ReceiveAuditInfoResponse {

    protected ResAudit auditMsg;

    /**
     * 获取auditMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResAudit }
     *     
     */
    public ResAudit getAuditMsg() {
        return auditMsg;
    }

    /**
     * 设置auditMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResAudit }
     *     
     */
    public void setAuditMsg(ResAudit value) {
        this.auditMsg = value;
    }

}
