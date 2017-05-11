
package com.viettel.qldtktts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for minuteHandOverBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="minuteHandOverBO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.qldtktts.viettel.com/}basicBO">
 *       &lt;sequence>
 *         &lt;element name="acceptDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countAsset" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="creatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeMinuteHandOVerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeMinuteHandOverCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeMinuteReceiverCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeMinuteReceiverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeSignCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeSignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="minuteHandOverCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minuteHandOverDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="minuteHandOverGiverId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="minuteHandOverId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="minuteHandOverReceiverId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="minuteHandOverSignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="statusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "minuteHandOverBO", propOrder = {
    "acceptDescription",
    "countAsset",
    "createdDate",
    "creatorId",
    "creatorName",
    "description",
    "employeeMinuteHandOVerName",
    "employeeMinuteHandOverCode",
    "employeeMinuteReceiverCode",
    "employeeMinuteReceiverName",
    "employeeSignCode",
    "employeeSignName",
    "groupId",
    "groupName",
    "isActive",
    "minuteHandOverCode",
    "minuteHandOverDate",
    "minuteHandOverGiverId",
    "minuteHandOverId",
    "minuteHandOverReceiverId",
    "minuteHandOverSignId",
    "status",
    "statusName",
    "type"
})
public class MinuteHandOverBO
    extends BasicBO
{

    protected String acceptDescription;
    protected Long countAsset;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected Long creatorId;
    protected String creatorName;
    protected String description;
    protected String employeeMinuteHandOVerName;
    protected String employeeMinuteHandOverCode;
    protected String employeeMinuteReceiverCode;
    protected String employeeMinuteReceiverName;
    protected String employeeSignCode;
    protected String employeeSignName;
    protected Long groupId;
    protected String groupName;
    protected Long isActive;
    protected String minuteHandOverCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minuteHandOverDate;
    protected Long minuteHandOverGiverId;
    protected Long minuteHandOverId;
    protected Long minuteHandOverReceiverId;
    protected Long minuteHandOverSignId;
    protected Long status;
    protected String statusName;
    protected String type;

    /**
     * Gets the value of the acceptDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptDescription() {
        return acceptDescription;
    }

    /**
     * Sets the value of the acceptDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptDescription(String value) {
        this.acceptDescription = value;
    }

    /**
     * Gets the value of the countAsset property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCountAsset() {
        return countAsset;
    }

    /**
     * Sets the value of the countAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCountAsset(Long value) {
        this.countAsset = value;
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
     * Gets the value of the creatorId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * Sets the value of the creatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreatorId(Long value) {
        this.creatorId = value;
    }

    /**
     * Gets the value of the creatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * Sets the value of the creatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorName(String value) {
        this.creatorName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the employeeMinuteHandOVerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeMinuteHandOVerName() {
        return employeeMinuteHandOVerName;
    }

    /**
     * Sets the value of the employeeMinuteHandOVerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeMinuteHandOVerName(String value) {
        this.employeeMinuteHandOVerName = value;
    }

    /**
     * Gets the value of the employeeMinuteHandOverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeMinuteHandOverCode() {
        return employeeMinuteHandOverCode;
    }

    /**
     * Sets the value of the employeeMinuteHandOverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeMinuteHandOverCode(String value) {
        this.employeeMinuteHandOverCode = value;
    }

    /**
     * Gets the value of the employeeMinuteReceiverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeMinuteReceiverCode() {
        return employeeMinuteReceiverCode;
    }

    /**
     * Sets the value of the employeeMinuteReceiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeMinuteReceiverCode(String value) {
        this.employeeMinuteReceiverCode = value;
    }

    /**
     * Gets the value of the employeeMinuteReceiverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeMinuteReceiverName() {
        return employeeMinuteReceiverName;
    }

    /**
     * Sets the value of the employeeMinuteReceiverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeMinuteReceiverName(String value) {
        this.employeeMinuteReceiverName = value;
    }

    /**
     * Gets the value of the employeeSignCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeSignCode() {
        return employeeSignCode;
    }

    /**
     * Sets the value of the employeeSignCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeSignCode(String value) {
        this.employeeSignCode = value;
    }

    /**
     * Gets the value of the employeeSignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeSignName() {
        return employeeSignName;
    }

    /**
     * Sets the value of the employeeSignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeSignName(String value) {
        this.employeeSignName = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupId(Long value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
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
     * Gets the value of the minuteHandOverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinuteHandOverCode() {
        return minuteHandOverCode;
    }

    /**
     * Sets the value of the minuteHandOverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinuteHandOverCode(String value) {
        this.minuteHandOverCode = value;
    }

    /**
     * Gets the value of the minuteHandOverDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinuteHandOverDate() {
        return minuteHandOverDate;
    }

    /**
     * Sets the value of the minuteHandOverDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinuteHandOverDate(XMLGregorianCalendar value) {
        this.minuteHandOverDate = value;
    }

    /**
     * Gets the value of the minuteHandOverGiverId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinuteHandOverGiverId() {
        return minuteHandOverGiverId;
    }

    /**
     * Sets the value of the minuteHandOverGiverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinuteHandOverGiverId(Long value) {
        this.minuteHandOverGiverId = value;
    }

    /**
     * Gets the value of the minuteHandOverId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinuteHandOverId() {
        return minuteHandOverId;
    }

    /**
     * Sets the value of the minuteHandOverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinuteHandOverId(Long value) {
        this.minuteHandOverId = value;
    }

    /**
     * Gets the value of the minuteHandOverReceiverId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinuteHandOverReceiverId() {
        return minuteHandOverReceiverId;
    }

    /**
     * Sets the value of the minuteHandOverReceiverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinuteHandOverReceiverId(Long value) {
        this.minuteHandOverReceiverId = value;
    }

    /**
     * Gets the value of the minuteHandOverSignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinuteHandOverSignId() {
        return minuteHandOverSignId;
    }

    /**
     * Sets the value of the minuteHandOverSignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinuteHandOverSignId(Long value) {
        this.minuteHandOverSignId = value;
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

    /**
     * Gets the value of the statusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * Sets the value of the statusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusName(String value) {
        this.statusName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
