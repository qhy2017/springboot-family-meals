
package com.hx.kp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>itDept complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="itDept"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DEPTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FULNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NODE_KEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itDept", propOrder = {
    "deptno",
    "fulname",
    "nodekey",
    "rcomp"
})
public class ItDept {

    @XmlElement(name = "DEPTNO")
    protected String deptno;
    @XmlElement(name = "FULNAME")
    protected String fulname;
    @XmlElement(name = "NODE_KEY")
    protected String nodekey;
    @XmlElement(name = "RCOMP")
    protected String rcomp;

    /**
     * 获取deptno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPTNO() {
        return deptno;
    }

    /**
     * 设置deptno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPTNO(String value) {
        this.deptno = value;
    }

    /**
     * 获取fulname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFULNAME() {
        return fulname;
    }

    /**
     * 设置fulname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFULNAME(String value) {
        this.fulname = value;
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

}
