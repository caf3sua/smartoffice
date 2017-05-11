
package com.viettel.qldtktts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lineBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lineBO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.qldtktts.viettel.com/}basicBO">
 *       &lt;sequence>
 *         &lt;element name="endLineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="startLineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lineBO", propOrder = {
    "endLineCode",
    "lineCode",
    "lineId",
    "startLineCode",
    "status"
})
public class LineBO
    extends BasicBO
{

    protected String endLineCode;
    protected String lineCode;
    protected Long lineId;
    protected String startLineCode;
    protected Long status;

    /**
     * Gets the value of the endLineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndLineCode() {
        return endLineCode;
    }

    /**
     * Sets the value of the endLineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndLineCode(String value) {
        this.endLineCode = value;
    }

    /**
     * Gets the value of the lineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineCode() {
        return lineCode;
    }

    /**
     * Sets the value of the lineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineCode(String value) {
        this.lineCode = value;
    }

    /**
     * Gets the value of the lineId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineId() {
        return lineId;
    }

    /**
     * Sets the value of the lineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineId(Long value) {
        this.lineId = value;
    }

    /**
     * Gets the value of the startLineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartLineCode() {
        return startLineCode;
    }

    /**
     * Sets the value of the startLineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartLineCode(String value) {
        this.startLineCode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStatus(Long value) {
        this.status = value;
    }

}
