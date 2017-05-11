
package com.viettel.qldtktts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for linkNimsBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="linkNimsBO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.qldtktts.viettel.com/}basicBO">
 *       &lt;sequence>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDeptCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDeptId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="endStationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lastDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="linkCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="linkStatusAuto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDeptCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDeptId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="startStationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "linkNimsBO", propOrder = {
    "createdDate",
    "creatorId",
    "endDeptCode",
    "endDeptId",
    "endStationCode",
    "isActive",
    "lastDate",
    "linkCode",
    "linkId",
    "linkStatusAuto",
    "note",
    "startDeptCode",
    "startDeptId",
    "startStationCode",
    "status"
})
public class LinkNimsBO
    extends BasicBO
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected String creatorId;
    protected String endDeptCode;
    protected Long endDeptId;
    protected String endStationCode;
    protected Long isActive;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastDate;
    protected String linkCode;
    protected Long linkId;
    protected String linkStatusAuto;
    protected String note;
    protected String startDeptCode;
    protected Long startDeptId;
    protected String startStationCode;
    protected Long status;

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
     * Gets the value of the creatorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * Sets the value of the creatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorId(String value) {
        this.creatorId = value;
    }

    /**
     * Gets the value of the endDeptCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDeptCode() {
        return endDeptCode;
    }

    /**
     * Sets the value of the endDeptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDeptCode(String value) {
        this.endDeptCode = value;
    }

    /**
     * Gets the value of the endDeptId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEndDeptId() {
        return endDeptId;
    }

    /**
     * Sets the value of the endDeptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEndDeptId(Long value) {
        this.endDeptId = value;
    }

    /**
     * Gets the value of the endStationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndStationCode() {
        return endStationCode;
    }

    /**
     * Sets the value of the endStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndStationCode(String value) {
        this.endStationCode = value;
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
     * Gets the value of the lastDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDate() {
        return lastDate;
    }

    /**
     * Sets the value of the lastDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDate(XMLGregorianCalendar value) {
        this.lastDate = value;
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
     * Gets the value of the linkStatusAuto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkStatusAuto() {
        return linkStatusAuto;
    }

    /**
     * Sets the value of the linkStatusAuto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkStatusAuto(String value) {
        this.linkStatusAuto = value;
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
     * Gets the value of the startDeptCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDeptCode() {
        return startDeptCode;
    }

    /**
     * Sets the value of the startDeptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDeptCode(String value) {
        this.startDeptCode = value;
    }

    /**
     * Gets the value of the startDeptId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStartDeptId() {
        return startDeptId;
    }

    /**
     * Sets the value of the startDeptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStartDeptId(Long value) {
        this.startDeptId = value;
    }

    /**
     * Gets the value of the startStationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartStationCode() {
        return startStationCode;
    }

    /**
     * Sets the value of the startStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartStationCode(String value) {
        this.startStationCode = value;
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
