
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
 * <p>Java class for assetMoveCmdBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assetMoveCmdBO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.qldtktts.viettel.com/}basicBO">
 *       &lt;sequence>
 *         &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificateRegistrationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commentCa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="creatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destStationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="documentCaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="downgradeStationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lstMerEntity" type="{http://webservice.qldtktts.viettel.com/}merEntityBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="moveCmdId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="moveReqCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moveReqId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="moveType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="recvGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recvGroupConfirmBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="recvGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="recvGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reqEmployeeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reqGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reqGroupConfirmBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reqGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reqGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="statusCa" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="upgradeStationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assetMoveCmdBO", propOrder = {
    "base",
    "certificateRegistrationId",
    "code",
    "commentCa",
    "createdDate",
    "creatorId",
    "creatorName",
    "destStationId",
    "documentCaId",
    "downgradeStationCode",
    "endDate",
    "lstMerEntity",
    "moveCmdId",
    "moveReqCode",
    "moveReqId",
    "moveType",
    "recvGroupCode",
    "recvGroupConfirmBy",
    "recvGroupId",
    "recvGroupName",
    "reqEmployeeId",
    "reqGroupCode",
    "reqGroupConfirmBy",
    "reqGroupId",
    "reqGroupName",
    "startDate",
    "status",
    "statusCa",
    "type",
    "upgradeStationCode"
})
public class AssetMoveCmdBO
    extends BasicBO
{

    protected String base;
    protected Long certificateRegistrationId;
    protected String code;
    protected String commentCa;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected Long creatorId;
    protected String creatorName;
    protected Long destStationId;
    protected Long documentCaId;
    protected String downgradeStationCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(nillable = true)
    protected List<MerEntityBO> lstMerEntity;
    protected Long moveCmdId;
    protected String moveReqCode;
    protected Long moveReqId;
    protected Long moveType;
    protected String recvGroupCode;
    protected Long recvGroupConfirmBy;
    protected Long recvGroupId;
    protected String recvGroupName;
    protected Long reqEmployeeId;
    protected String reqGroupCode;
    protected Long reqGroupConfirmBy;
    protected Long reqGroupId;
    protected String reqGroupName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected Long status;
    protected Long statusCa;
    protected Long type;
    protected String upgradeStationCode;

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the certificateRegistrationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCertificateRegistrationId() {
        return certificateRegistrationId;
    }

    /**
     * Sets the value of the certificateRegistrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCertificateRegistrationId(Long value) {
        this.certificateRegistrationId = value;
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
     * Gets the value of the commentCa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentCa() {
        return commentCa;
    }

    /**
     * Sets the value of the commentCa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentCa(String value) {
        this.commentCa = value;
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
     * Gets the value of the destStationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestStationId() {
        return destStationId;
    }

    /**
     * Sets the value of the destStationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestStationId(Long value) {
        this.destStationId = value;
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
     * Gets the value of the downgradeStationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDowngradeStationCode() {
        return downgradeStationCode;
    }

    /**
     * Sets the value of the downgradeStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDowngradeStationCode(String value) {
        this.downgradeStationCode = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the lstMerEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstMerEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstMerEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MerEntityBO }
     * 
     * 
     */
    public List<MerEntityBO> getLstMerEntity() {
        if (lstMerEntity == null) {
            lstMerEntity = new ArrayList<MerEntityBO>();
        }
        return this.lstMerEntity;
    }

    /**
     * Gets the value of the moveCmdId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMoveCmdId() {
        return moveCmdId;
    }

    /**
     * Sets the value of the moveCmdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMoveCmdId(Long value) {
        this.moveCmdId = value;
    }

    /**
     * Gets the value of the moveReqCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoveReqCode() {
        return moveReqCode;
    }

    /**
     * Sets the value of the moveReqCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoveReqCode(String value) {
        this.moveReqCode = value;
    }

    /**
     * Gets the value of the moveReqId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMoveReqId() {
        return moveReqId;
    }

    /**
     * Sets the value of the moveReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMoveReqId(Long value) {
        this.moveReqId = value;
    }

    /**
     * Gets the value of the moveType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMoveType() {
        return moveType;
    }

    /**
     * Sets the value of the moveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMoveType(Long value) {
        this.moveType = value;
    }

    /**
     * Gets the value of the recvGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecvGroupCode() {
        return recvGroupCode;
    }

    /**
     * Sets the value of the recvGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecvGroupCode(String value) {
        this.recvGroupCode = value;
    }

    /**
     * Gets the value of the recvGroupConfirmBy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecvGroupConfirmBy() {
        return recvGroupConfirmBy;
    }

    /**
     * Sets the value of the recvGroupConfirmBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecvGroupConfirmBy(Long value) {
        this.recvGroupConfirmBy = value;
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
     * Gets the value of the reqEmployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReqEmployeeId() {
        return reqEmployeeId;
    }

    /**
     * Sets the value of the reqEmployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReqEmployeeId(Long value) {
        this.reqEmployeeId = value;
    }

    /**
     * Gets the value of the reqGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqGroupCode() {
        return reqGroupCode;
    }

    /**
     * Sets the value of the reqGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqGroupCode(String value) {
        this.reqGroupCode = value;
    }

    /**
     * Gets the value of the reqGroupConfirmBy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReqGroupConfirmBy() {
        return reqGroupConfirmBy;
    }

    /**
     * Sets the value of the reqGroupConfirmBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReqGroupConfirmBy(Long value) {
        this.reqGroupConfirmBy = value;
    }

    /**
     * Gets the value of the reqGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReqGroupId() {
        return reqGroupId;
    }

    /**
     * Sets the value of the reqGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReqGroupId(Long value) {
        this.reqGroupId = value;
    }

    /**
     * Gets the value of the reqGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqGroupName() {
        return reqGroupName;
    }

    /**
     * Sets the value of the reqGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqGroupName(String value) {
        this.reqGroupName = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
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
     * Gets the value of the statusCa property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStatusCa() {
        return statusCa;
    }

    /**
     * Sets the value of the statusCa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStatusCa(Long value) {
        this.statusCa = value;
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

    /**
     * Gets the value of the upgradeStationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeStationCode() {
        return upgradeStationCode;
    }

    /**
     * Sets the value of the upgradeStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeStationCode(String value) {
        this.upgradeStationCode = value;
    }

}
