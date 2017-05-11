
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
 * <p>Java class for catMerConfigBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="catMerConfigBO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.qldtktts.viettel.com/}basicBO">
 *       &lt;sequence>
 *         &lt;element name="acceptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="acceptNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acceptorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="assembleQty" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cntChangeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cntConfigId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="configType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="configTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="deviceType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="eraser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="listConfig" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="merConfigCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchandiseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="merchandiseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentDeviceType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="proposalNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rejectNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unitPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catMerConfigBO", propOrder = {
    "acceptDate",
    "acceptNote",
    "acceptorId",
    "assembleQty",
    "cntChangeId",
    "cntConfigId",
    "companyId",
    "companyName",
    "configType",
    "configTypeName",
    "contractCode",
    "contractId",
    "createdDate",
    "creatorId",
    "deviceType",
    "eraser",
    "id",
    "isActive",
    "listConfig",
    "merConfigCode",
    "merchandiseId",
    "merchandiseName",
    "name",
    "parentDeviceType",
    "proposalNote",
    "quantity",
    "rejectNote",
    "signedDate",
    "status",
    "totalPrice",
    "unitId",
    "unitPrice"
})
public class CatMerConfigBO
    extends BasicBO
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acceptDate;
    protected String acceptNote;
    protected Long acceptorId;
    protected Long assembleQty;
    protected Long cntChangeId;
    protected Long cntConfigId;
    protected Long companyId;
    protected String companyName;
    protected Long configType;
    protected String configTypeName;
    protected String contractCode;
    protected Long contractId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected Long creatorId;
    protected Long deviceType;
    protected boolean eraser;
    protected Long id;
    protected Long isActive;
    @XmlElement(nillable = true)
    protected List<Object> listConfig;
    protected String merConfigCode;
    protected Long merchandiseId;
    protected String merchandiseName;
    protected String name;
    protected Long parentDeviceType;
    protected String proposalNote;
    protected Long quantity;
    protected String rejectNote;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signedDate;
    protected Long status;
    protected Double totalPrice;
    protected Long unitId;
    protected Double unitPrice;

    /**
     * Gets the value of the acceptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptDate() {
        return acceptDate;
    }

    /**
     * Sets the value of the acceptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcceptDate(XMLGregorianCalendar value) {
        this.acceptDate = value;
    }

    /**
     * Gets the value of the acceptNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptNote() {
        return acceptNote;
    }

    /**
     * Sets the value of the acceptNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptNote(String value) {
        this.acceptNote = value;
    }

    /**
     * Gets the value of the acceptorId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAcceptorId() {
        return acceptorId;
    }

    /**
     * Sets the value of the acceptorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAcceptorId(Long value) {
        this.acceptorId = value;
    }

    /**
     * Gets the value of the assembleQty property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssembleQty() {
        return assembleQty;
    }

    /**
     * Sets the value of the assembleQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssembleQty(Long value) {
        this.assembleQty = value;
    }

    /**
     * Gets the value of the cntChangeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCntChangeId() {
        return cntChangeId;
    }

    /**
     * Sets the value of the cntChangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCntChangeId(Long value) {
        this.cntChangeId = value;
    }

    /**
     * Gets the value of the cntConfigId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCntConfigId() {
        return cntConfigId;
    }

    /**
     * Sets the value of the cntConfigId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCntConfigId(Long value) {
        this.cntConfigId = value;
    }

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompanyId(Long value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the configType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConfigType() {
        return configType;
    }

    /**
     * Sets the value of the configType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConfigType(Long value) {
        this.configType = value;
    }

    /**
     * Gets the value of the configTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigTypeName() {
        return configTypeName;
    }

    /**
     * Sets the value of the configTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigTypeName(String value) {
        this.configTypeName = value;
    }

    /**
     * Gets the value of the contractCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * Sets the value of the contractCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractCode(String value) {
        this.contractCode = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractId(Long value) {
        this.contractId = value;
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
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeviceType(Long value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the eraser property.
     * 
     */
    public boolean isEraser() {
        return eraser;
    }

    /**
     * Sets the value of the eraser property.
     * 
     */
    public void setEraser(boolean value) {
        this.eraser = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
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
     * Gets the value of the listConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getListConfig() {
        if (listConfig == null) {
            listConfig = new ArrayList<Object>();
        }
        return this.listConfig;
    }

    /**
     * Gets the value of the merConfigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerConfigCode() {
        return merConfigCode;
    }

    /**
     * Sets the value of the merConfigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerConfigCode(String value) {
        this.merConfigCode = value;
    }

    /**
     * Gets the value of the merchandiseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMerchandiseId() {
        return merchandiseId;
    }

    /**
     * Sets the value of the merchandiseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMerchandiseId(Long value) {
        this.merchandiseId = value;
    }

    /**
     * Gets the value of the merchandiseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchandiseName() {
        return merchandiseName;
    }

    /**
     * Sets the value of the merchandiseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchandiseName(String value) {
        this.merchandiseName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the parentDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentDeviceType() {
        return parentDeviceType;
    }

    /**
     * Sets the value of the parentDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentDeviceType(Long value) {
        this.parentDeviceType = value;
    }

    /**
     * Gets the value of the proposalNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProposalNote() {
        return proposalNote;
    }

    /**
     * Sets the value of the proposalNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProposalNote(String value) {
        this.proposalNote = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuantity(Long value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the rejectNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectNote() {
        return rejectNote;
    }

    /**
     * Sets the value of the rejectNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectNote(String value) {
        this.rejectNote = value;
    }

    /**
     * Gets the value of the signedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignedDate() {
        return signedDate;
    }

    /**
     * Sets the value of the signedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignedDate(XMLGregorianCalendar value) {
        this.signedDate = value;
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
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalPrice(Double value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the unitId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnitId() {
        return unitId;
    }

    /**
     * Sets the value of the unitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnitId(Long value) {
        this.unitId = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitPrice(Double value) {
        this.unitPrice = value;
    }

}
