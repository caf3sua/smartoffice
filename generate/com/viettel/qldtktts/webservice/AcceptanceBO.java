
package com.viettel.qldtktts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acceptanceBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acceptanceBO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.qldtktts.viettel.com/}basicBO">
 *       &lt;sequence>
 *         &lt;element name="acceptanceGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acceptanceGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actualExpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryNoteCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryNoteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="warehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warehouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acceptanceBO", propOrder = {
    "acceptanceGroupCode",
    "acceptanceGroupName",
    "actualExpDate",
    "deliveryNoteCode",
    "deliveryNoteId",
    "warehouseCode",
    "warehouseName"
})
public class AcceptanceBO
    extends BasicBO
{

    protected String acceptanceGroupCode;
    protected String acceptanceGroupName;
    protected String actualExpDate;
    protected String deliveryNoteCode;
    protected Long deliveryNoteId;
    protected String warehouseCode;
    protected String warehouseName;

    /**
     * Gets the value of the acceptanceGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptanceGroupCode() {
        return acceptanceGroupCode;
    }

    /**
     * Sets the value of the acceptanceGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptanceGroupCode(String value) {
        this.acceptanceGroupCode = value;
    }

    /**
     * Gets the value of the acceptanceGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptanceGroupName() {
        return acceptanceGroupName;
    }

    /**
     * Sets the value of the acceptanceGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptanceGroupName(String value) {
        this.acceptanceGroupName = value;
    }

    /**
     * Gets the value of the actualExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualExpDate() {
        return actualExpDate;
    }

    /**
     * Sets the value of the actualExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualExpDate(String value) {
        this.actualExpDate = value;
    }

    /**
     * Gets the value of the deliveryNoteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryNoteCode() {
        return deliveryNoteCode;
    }

    /**
     * Sets the value of the deliveryNoteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryNoteCode(String value) {
        this.deliveryNoteCode = value;
    }

    /**
     * Gets the value of the deliveryNoteId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeliveryNoteId() {
        return deliveryNoteId;
    }

    /**
     * Sets the value of the deliveryNoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeliveryNoteId(Long value) {
        this.deliveryNoteId = value;
    }

    /**
     * Gets the value of the warehouseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseCode() {
        return warehouseCode;
    }

    /**
     * Sets the value of the warehouseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseCode(String value) {
        this.warehouseCode = value;
    }

    /**
     * Gets the value of the warehouseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseName() {
        return warehouseName;
    }

    /**
     * Sets the value of the warehouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseName(String value) {
        this.warehouseName = value;
    }

}
