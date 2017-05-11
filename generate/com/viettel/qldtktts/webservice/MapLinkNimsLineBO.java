
package com.viettel.qldtktts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for mapLinkNimsLineBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mapLinkNimsLineBO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.qldtktts.viettel.com/}basicBO">
 *       &lt;sequence>
 *         &lt;element name="catEmployeeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="linkCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stafCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mapLinkNimsLineBO", propOrder = {
    "catEmployeeId",
    "createdDate",
    "isActive",
    "lastUpdate",
    "lastUser",
    "lineCode",
    "lineId",
    "linkCode",
    "linkId",
    "note",
    "stafCode"
})
public class MapLinkNimsLineBO
    extends BasicBO
{

    protected Long catEmployeeId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected Long isActive;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdate;
    protected String lastUser;
    protected String lineCode;
    protected Long lineId;
    protected String linkCode;
    protected Long linkId;
    protected String note;
    protected String stafCode;

    /**
     * Gets the value of the catEmployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCatEmployeeId() {
        return catEmployeeId;
    }

    /**
     * Sets the value of the catEmployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCatEmployeeId(Long value) {
        this.catEmployeeId = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsActive(Long value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdate(XMLGregorianCalendar value) {
        this.lastUpdate = value;
    }

    /**
     * Gets the value of the lastUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUser() {
        return lastUser;
    }

    /**
     * Sets the value of the lastUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUser(String value) {
        this.lastUser = value;
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
     * Gets the value of the linkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkCode() {
        return linkCode;
    }

    /**
     * Sets the value of the linkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkCode(String value) {
        this.linkCode = value;
    }

    /**
     * Gets the value of the linkId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLinkId() {
        return linkId;
    }

    /**
     * Sets the value of the linkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLinkId(Long value) {
        this.linkId = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the stafCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStafCode() {
        return stafCode;
    }

    /**
     * Sets the value of the stafCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStafCode(String value) {
        this.stafCode = value;
    }

}
