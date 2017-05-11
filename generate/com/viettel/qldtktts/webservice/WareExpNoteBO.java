
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
 * <p>Java class for wareExpNoteBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wareExpNoteBO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.qldtktts.viettel.com/}basicBO">
 *       &lt;sequence>
 *         &lt;element name="actualExpBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actualExpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actualExpDateString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appActualDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmStatus" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="constructExpType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="constructionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="delConfirmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deletable" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="deliveryGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="deliveryNoteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="destType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="destWhId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="documentCaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="expCmdId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="expNoteType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="handOverBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="handOverInfoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isCa" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isHandOverAll" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isRetrieved" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isSyncInventory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isUpdateStationAll" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lstMerEntityBO" type="{http://webservice.qldtktts.viettel.com/}merEntityBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="merExpType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="partnerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="realReceiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="receiveConfirm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="receiveConfirmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="receiveConfirmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recvGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="recvGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recvPersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="regularStatus" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="smsStatus" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sourceWhId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="statusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userIdDel" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="warehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warehouseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="warehouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wareExpNoteBO", propOrder = {
    "actualExpBy",
    "actualExpDate",
    "actualExpDateString",
    "appActualDate",
    "code",
    "confirmStatus",
    "constructExpType",
    "constructionId",
    "createdDate",
    "creatorId",
    "delConfirmDate",
    "deletable",
    "deliveryGroupId",
    "deliveryNoteId",
    "destType",
    "destWhId",
    "documentCaId",
    "expCmdId",
    "expNoteType",
    "handOverBy",
    "handOverInfoId",
    "isCa",
    "isHandOverAll",
    "isRetrieved",
    "isSyncInventory",
    "isUpdateStationAll",
    "lstMerEntityBO",
    "merExpType",
    "partnerId",
    "realReceiveDate",
    "receiveConfirm",
    "receiveConfirmDate",
    "receiveConfirmName",
    "receiverCode",
    "receiverName",
    "recvGroupId",
    "recvGroupName",
    "recvPersonId",
    "regularStatus",
    "smsStatus",
    "sourceWhId",
    "status",
    "statusName",
    "userIdDel",
    "warehouseCode",
    "warehouseId",
    "warehouseName",
    "workItemId"
})
public class WareExpNoteBO
    extends BasicBO
{

    protected Long actualExpBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualExpDate;
    protected String actualExpDateString;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar appActualDate;
    protected String code;
    protected Long confirmStatus;
    protected Long constructExpType;
    protected Long constructionId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected Long creatorId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar delConfirmDate;
    protected Long deletable;
    protected Long deliveryGroupId;
    protected Long deliveryNoteId;
    protected Long destType;
    protected Long destWhId;
    protected Long documentCaId;
    protected Long expCmdId;
    protected Long expNoteType;
    protected Long handOverBy;
    protected Long handOverInfoId;
    protected Long isCa;
    protected Long isHandOverAll;
    protected Long isRetrieved;
    protected Long isSyncInventory;
    protected Long isUpdateStationAll;
    @XmlElement(nillable = true)
    protected List<MerEntityBO> lstMerEntityBO;
    protected Long merExpType;
    protected Long partnerId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar realReceiveDate;
    protected Long receiveConfirm;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiveConfirmDate;
    protected String receiveConfirmName;
    protected String receiverCode;
    protected String receiverName;
    protected Long recvGroupId;
    protected String recvGroupName;
    protected Long recvPersonId;
    protected Long regularStatus;
    protected Long smsStatus;
    protected Long sourceWhId;
    protected Long status;
    protected String statusName;
    protected Long userIdDel;
    protected String warehouseCode;
    protected Long warehouseId;
    protected String warehouseName;
    protected Long workItemId;

    /**
     * Gets the value of the actualExpBy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActualExpBy() {
        return actualExpBy;
    }

    /**
     * Sets the value of the actualExpBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActualExpBy(Long value) {
        this.actualExpBy = value;
    }

    /**
     * Gets the value of the actualExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualExpDate() {
        return actualExpDate;
    }

    /**
     * Sets the value of the actualExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualExpDate(XMLGregorianCalendar value) {
        this.actualExpDate = value;
    }

    /**
     * Gets the value of the actualExpDateString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualExpDateString() {
        return actualExpDateString;
    }

    /**
     * Sets the value of the actualExpDateString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualExpDateString(String value) {
        this.actualExpDateString = value;
    }

    /**
     * Gets the value of the appActualDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppActualDate() {
        return appActualDate;
    }

    /**
     * Sets the value of the appActualDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppActualDate(XMLGregorianCalendar value) {
        this.appActualDate = value;
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
     * Gets the value of the confirmStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConfirmStatus() {
        return confirmStatus;
    }

    /**
     * Sets the value of the confirmStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConfirmStatus(Long value) {
        this.confirmStatus = value;
    }

    /**
     * Gets the value of the constructExpType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConstructExpType() {
        return constructExpType;
    }

    /**
     * Sets the value of the constructExpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConstructExpType(Long value) {
        this.constructExpType = value;
    }

    /**
     * Gets the value of the constructionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConstructionId() {
        return constructionId;
    }

    /**
     * Sets the value of the constructionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConstructionId(Long value) {
        this.constructionId = value;
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
     * Gets the value of the delConfirmDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDelConfirmDate() {
        return delConfirmDate;
    }

    /**
     * Sets the value of the delConfirmDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDelConfirmDate(XMLGregorianCalendar value) {
        this.delConfirmDate = value;
    }

    /**
     * Gets the value of the deletable property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeletable() {
        return deletable;
    }

    /**
     * Sets the value of the deletable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeletable(Long value) {
        this.deletable = value;
    }

    /**
     * Gets the value of the deliveryGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeliveryGroupId() {
        return deliveryGroupId;
    }

    /**
     * Sets the value of the deliveryGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeliveryGroupId(Long value) {
        this.deliveryGroupId = value;
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
     * Gets the value of the destType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestType() {
        return destType;
    }

    /**
     * Sets the value of the destType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestType(Long value) {
        this.destType = value;
    }

    /**
     * Gets the value of the destWhId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestWhId() {
        return destWhId;
    }

    /**
     * Sets the value of the destWhId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestWhId(Long value) {
        this.destWhId = value;
    }

    /**
     * Gets the value of the documentCaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocumentCaId() {
        return documentCaId;
    }

    /**
     * Sets the value of the documentCaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocumentCaId(Long value) {
        this.documentCaId = value;
    }

    /**
     * Gets the value of the expCmdId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpCmdId() {
        return expCmdId;
    }

    /**
     * Sets the value of the expCmdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpCmdId(Long value) {
        this.expCmdId = value;
    }

    /**
     * Gets the value of the expNoteType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpNoteType() {
        return expNoteType;
    }

    /**
     * Sets the value of the expNoteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpNoteType(Long value) {
        this.expNoteType = value;
    }

    /**
     * Gets the value of the handOverBy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHandOverBy() {
        return handOverBy;
    }

    /**
     * Sets the value of the handOverBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHandOverBy(Long value) {
        this.handOverBy = value;
    }

    /**
     * Gets the value of the handOverInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHandOverInfoId() {
        return handOverInfoId;
    }

    /**
     * Sets the value of the handOverInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHandOverInfoId(Long value) {
        this.handOverInfoId = value;
    }

    /**
     * Gets the value of the isCa property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsCa() {
        return isCa;
    }

    /**
     * Sets the value of the isCa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsCa(Long value) {
        this.isCa = value;
    }

    /**
     * Gets the value of the isHandOverAll property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsHandOverAll() {
        return isHandOverAll;
    }

    /**
     * Sets the value of the isHandOverAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsHandOverAll(Long value) {
        this.isHandOverAll = value;
    }

    /**
     * Gets the value of the isRetrieved property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsRetrieved() {
        return isRetrieved;
    }

    /**
     * Sets the value of the isRetrieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsRetrieved(Long value) {
        this.isRetrieved = value;
    }

    /**
     * Gets the value of the isSyncInventory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsSyncInventory() {
        return isSyncInventory;
    }

    /**
     * Sets the value of the isSyncInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsSyncInventory(Long value) {
        this.isSyncInventory = value;
    }

    /**
     * Gets the value of the isUpdateStationAll property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsUpdateStationAll() {
        return isUpdateStationAll;
    }

    /**
     * Sets the value of the isUpdateStationAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsUpdateStationAll(Long value) {
        this.isUpdateStationAll = value;
    }

    /**
     * Gets the value of the lstMerEntityBO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstMerEntityBO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstMerEntityBO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MerEntityBO }
     * 
     * 
     */
    public List<MerEntityBO> getLstMerEntityBO() {
        if (lstMerEntityBO == null) {
            lstMerEntityBO = new ArrayList<MerEntityBO>();
        }
        return this.lstMerEntityBO;
    }

    /**
     * Gets the value of the merExpType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMerExpType() {
        return merExpType;
    }

    /**
     * Sets the value of the merExpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMerExpType(Long value) {
        this.merExpType = value;
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
     * Gets the value of the realReceiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRealReceiveDate() {
        return realReceiveDate;
    }

    /**
     * Sets the value of the realReceiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRealReceiveDate(XMLGregorianCalendar value) {
        this.realReceiveDate = value;
    }

    /**
     * Gets the value of the receiveConfirm property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReceiveConfirm() {
        return receiveConfirm;
    }

    /**
     * Sets the value of the receiveConfirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReceiveConfirm(Long value) {
        this.receiveConfirm = value;
    }

    /**
     * Gets the value of the receiveConfirmDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiveConfirmDate() {
        return receiveConfirmDate;
    }

    /**
     * Sets the value of the receiveConfirmDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiveConfirmDate(XMLGregorianCalendar value) {
        this.receiveConfirmDate = value;
    }

    /**
     * Gets the value of the receiveConfirmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveConfirmName() {
        return receiveConfirmName;
    }

    /**
     * Sets the value of the receiveConfirmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveConfirmName(String value) {
        this.receiveConfirmName = value;
    }

    /**
     * Gets the value of the receiverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverCode() {
        return receiverCode;
    }

    /**
     * Sets the value of the receiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverCode(String value) {
        this.receiverCode = value;
    }

    /**
     * Gets the value of the receiverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * Sets the value of the receiverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverName(String value) {
        this.receiverName = value;
    }

    /**
     * Gets the value of the recvGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecvGroupId() {
        return recvGroupId;
    }

    /**
     * Sets the value of the recvGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecvGroupId(Long value) {
        this.recvGroupId = value;
    }

    /**
     * Gets the value of the recvGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecvGroupName() {
        return recvGroupName;
    }

    /**
     * Sets the value of the recvGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecvGroupName(String value) {
        this.recvGroupName = value;
    }

    /**
     * Gets the value of the recvPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecvPersonId() {
        return recvPersonId;
    }

    /**
     * Sets the value of the recvPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecvPersonId(Long value) {
        this.recvPersonId = value;
    }

    /**
     * Gets the value of the regularStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegularStatus() {
        return regularStatus;
    }

    /**
     * Sets the value of the regularStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegularStatus(Long value) {
        this.regularStatus = value;
    }

    /**
     * Gets the value of the smsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSmsStatus() {
        return smsStatus;
    }

    /**
     * Sets the value of the smsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSmsStatus(Long value) {
        this.smsStatus = value;
    }

    /**
     * Gets the value of the sourceWhId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceWhId() {
        return sourceWhId;
    }

    /**
     * Sets the value of the sourceWhId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceWhId(Long value) {
        this.sourceWhId = value;
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
     * Gets the value of the userIdDel property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserIdDel() {
        return userIdDel;
    }

    /**
     * Sets the value of the userIdDel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserIdDel(Long value) {
        this.userIdDel = value;
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
     * Gets the value of the warehouseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWarehouseId() {
        return warehouseId;
    }

    /**
     * Sets the value of the warehouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWarehouseId(Long value) {
        this.warehouseId = value;
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

    /**
     * Gets the value of the workItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkItemId() {
        return workItemId;
    }

    /**
     * Sets the value of the workItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkItemId(Long value) {
        this.workItemId = value;
    }

}
