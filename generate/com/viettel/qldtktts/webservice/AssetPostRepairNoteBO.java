
package com.viettel.qldtktts.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for assetPostRepairNoteBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assetPostRepairNoteBO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.qldtktts.viettel.com/}basicBO">
 *       &lt;sequence>
 *         &lt;element name="assetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assetTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="deliveryPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="group" type="{http://webservice.qldtktts.viettel.com/}sysGroupBO" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="handOverDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="handOverPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="handOverReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listMerEntity" type="{http://webservice.qldtktts.viettel.com/}merEntityBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partnerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="partnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postRepairNoteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="recvPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recvPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assetPostRepairNoteBO", propOrder = {
    "assetType",
    "assetTypeName",
    "code",
    "createName",
    "createdDate",
    "creatorId",
    "deliveryPerson",
    "deliveryPosition",
    "group",
    "groupId",
    "groupName",
    "handOverDate",
    "handOverPlace",
    "handOverReason",
    "listMerEntity",
    "partnerId",
    "partnerName",
    "postRepairNoteId",
    "recvPerson",
    "recvPosition",
    "status",
    "type"
})
public class AssetPostRepairNoteBO
    extends BasicBO
{

    protected String assetType;
    protected String assetTypeName;
    protected String code;
    protected String createName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected Long creatorId;
    protected String deliveryPerson;
    protected String deliveryPosition;
    protected SysGroupBO group;
    protected Long groupId;
    protected String groupName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar handOverDate;
    protected String handOverPlace;
    protected String handOverReason;
    @XmlElement(nillable = true)
    protected List<MerEntityBO> listMerEntity;
    protected Long partnerId;
    protected String partnerName;
    protected Long postRepairNoteId;
    protected String recvPerson;
    protected String recvPosition;
    protected Long status;
    protected Long type;

    /**
     * Gets the value of the assetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetType() {
        return assetType;
    }

    /**
     * Sets the value of the assetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetType(String value) {
        this.assetType = value;
    }

    /**
     * Gets the value of the assetTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetTypeName() {
        return assetTypeName;
    }

    /**
     * Sets the value of the assetTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetTypeName(String value) {
        this.assetTypeName = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the createName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * Sets the value of the createName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateName(String value) {
        this.createName = value;
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
     * Gets the value of the deliveryPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPerson() {
        return deliveryPerson;
    }

    /**
     * Sets the value of the deliveryPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPerson(String value) {
        this.deliveryPerson = value;
    }

    /**
     * Gets the value of the deliveryPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPosition() {
        return deliveryPosition;
    }

    /**
     * Sets the value of the deliveryPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPosition(String value) {
        this.deliveryPosition = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link SysGroupBO }
     *     
     */
    public SysGroupBO getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link SysGroupBO }
     *     
     */
    public void setGroup(SysGroupBO value) {
        this.group = value;
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
     * Gets the value of the handOverDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHandOverDate() {
        return handOverDate;
    }

    /**
     * Sets the value of the handOverDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHandOverDate(XMLGregorianCalendar value) {
        this.handOverDate = value;
    }

    /**
     * Gets the value of the handOverPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandOverPlace() {
        return handOverPlace;
    }

    /**
     * Sets the value of the handOverPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandOverPlace(String value) {
        this.handOverPlace = value;
    }

    /**
     * Gets the value of the handOverReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandOverReason() {
        return handOverReason;
    }

    /**
     * Sets the value of the handOverReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandOverReason(String value) {
        this.handOverReason = value;
    }

    /**
     * Gets the value of the listMerEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listMerEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListMerEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MerEntityBO }
     * 
     * 
     */
    public List<MerEntityBO> getListMerEntity() {
        if (listMerEntity == null) {
            listMerEntity = new ArrayList<MerEntityBO>();
        }
        return this.listMerEntity;
    }

    /**
     * Gets the value of the partnerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartnerId() {
        return partnerId;
    }

    /**
     * Sets the value of the partnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartnerId(Long value) {
        this.partnerId = value;
    }

    /**
     * Gets the value of the partnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * Sets the value of the partnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerName(String value) {
        this.partnerName = value;
    }

    /**
     * Gets the value of the postRepairNoteId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPostRepairNoteId() {
        return postRepairNoteId;
    }

    /**
     * Sets the value of the postRepairNoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPostRepairNoteId(Long value) {
        this.postRepairNoteId = value;
    }

    /**
     * Gets the value of the recvPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecvPerson() {
        return recvPerson;
    }

    /**
     * Sets the value of the recvPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecvPerson(String value) {
        this.recvPerson = value;
    }

    /**
     * Gets the value of the recvPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecvPosition() {
        return recvPosition;
    }

    /**
     * Sets the value of the recvPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecvPosition(String value) {
        this.recvPosition = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setType(Long value) {
        this.type = value;
    }

}
