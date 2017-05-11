
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
 * <p>Java class for catStationBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="catStationBO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.qldtktts.viettel.com/}basicBO">
 *       &lt;sequence>
 *         &lt;element name="addTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="canDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="catStationHouseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="catStationTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catStationTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="catStationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="col" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="constrtCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constrtName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constructId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="countDeviceForStation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="countMerAtStation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="countMerentityForStation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="descriptDel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="employeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endPointId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ereaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isBase" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isDelete" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isInventory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isOff" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lineTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lstConstructions" type="{http://webservice.qldtktts.viettel.com/}constrConstructionsBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="preParentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="provinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provinceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="provinceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="row" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="startPointId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="stationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stationHouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stationStatus" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="stationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusHandOver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="typeColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeStation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="userLoginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catStationBO", propOrder = {
    "addTime",
    "address",
    "areaLocation",
    "canDelete",
    "catStationHouseId",
    "catStationTypeCode",
    "catStationTypeId",
    "catStationTypeName",
    "col",
    "constrtCode",
    "constrtName",
    "constructId",
    "countDeviceForStation",
    "countMerAtStation",
    "countMerentityForStation",
    "creatorId",
    "descriptDel",
    "description",
    "emissionDate",
    "employeeCode",
    "employeeEmail",
    "employeeName",
    "employeePhoneNumber",
    "endPointId",
    "ereaCode",
    "errData",
    "groupCode",
    "groupId",
    "groupName",
    "highColumn",
    "id",
    "isActive",
    "isBase",
    "isDelete",
    "isInventory",
    "isOff",
    "latitude",
    "lineTypeId",
    "longitude",
    "lstConstructions",
    "parentCode",
    "parentId",
    "preParentId",
    "provinceCode",
    "provinceId",
    "provinceName",
    "quantity",
    "reason",
    "row",
    "scope",
    "startPointId",
    "stationCode",
    "stationHouseCode",
    "stationStatus",
    "stationType",
    "statusHandOver",
    "statusName",
    "totalPrice",
    "typeColumn",
    "typeStation",
    "usedDate",
    "userLoginName"
})
public class CatStationBO
    extends BasicBO
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar addTime;
    protected String address;
    protected String areaLocation;
    protected Boolean canDelete;
    protected Long catStationHouseId;
    protected String catStationTypeCode;
    protected Long catStationTypeId;
    protected String catStationTypeName;
    protected int col;
    protected String constrtCode;
    protected String constrtName;
    protected Long constructId;
    protected Double countDeviceForStation;
    protected Double countMerAtStation;
    protected Double countMerentityForStation;
    protected Long creatorId;
    protected String descriptDel;
    protected String description;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar emissionDate;
    protected String employeeCode;
    protected String employeeEmail;
    protected String employeeName;
    protected String employeePhoneNumber;
    protected Long endPointId;
    protected String ereaCode;
    protected String errData;
    protected String groupCode;
    protected Long groupId;
    protected String groupName;
    protected String highColumn;
    protected Long id;
    protected Long isActive;
    protected Long isBase;
    protected Long isDelete;
    protected Long isInventory;
    protected Long isOff;
    protected Long latitude;
    protected Long lineTypeId;
    protected Long longitude;
    @XmlElement(nillable = true)
    protected List<ConstrConstructionsBO> lstConstructions;
    protected String parentCode;
    protected Long parentId;
    protected Long preParentId;
    protected String provinceCode;
    protected Long provinceId;
    protected String provinceName;
    protected Long quantity;
    protected String reason;
    protected int row;
    protected Long scope;
    protected Long startPointId;
    protected String stationCode;
    protected String stationHouseCode;
    protected Long stationStatus;
    protected String stationType;
    protected String statusHandOver;
    protected String statusName;
    protected Double totalPrice;
    protected String typeColumn;
    protected String typeStation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar usedDate;
    protected String userLoginName;

    /**
     * Gets the value of the addTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAddTime() {
        return addTime;
    }

    /**
     * Sets the value of the addTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAddTime(XMLGregorianCalendar value) {
        this.addTime = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the areaLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaLocation() {
        return areaLocation;
    }

    /**
     * Sets the value of the areaLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaLocation(String value) {
        this.areaLocation = value;
    }

    /**
     * Gets the value of the canDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanDelete() {
        return canDelete;
    }

    /**
     * Sets the value of the canDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanDelete(Boolean value) {
        this.canDelete = value;
    }

    /**
     * Gets the value of the catStationHouseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCatStationHouseId() {
        return catStationHouseId;
    }

    /**
     * Sets the value of the catStationHouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCatStationHouseId(Long value) {
        this.catStationHouseId = value;
    }

    /**
     * Gets the value of the catStationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatStationTypeCode() {
        return catStationTypeCode;
    }

    /**
     * Sets the value of the catStationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatStationTypeCode(String value) {
        this.catStationTypeCode = value;
    }

    /**
     * Gets the value of the catStationTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCatStationTypeId() {
        return catStationTypeId;
    }

    /**
     * Sets the value of the catStationTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCatStationTypeId(Long value) {
        this.catStationTypeId = value;
    }

    /**
     * Gets the value of the catStationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatStationTypeName() {
        return catStationTypeName;
    }

    /**
     * Sets the value of the catStationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatStationTypeName(String value) {
        this.catStationTypeName = value;
    }

    /**
     * Gets the value of the col property.
     * 
     */
    public int getCol() {
        return col;
    }

    /**
     * Sets the value of the col property.
     * 
     */
    public void setCol(int value) {
        this.col = value;
    }

    /**
     * Gets the value of the constrtCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstrtCode() {
        return constrtCode;
    }

    /**
     * Sets the value of the constrtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstrtCode(String value) {
        this.constrtCode = value;
    }

    /**
     * Gets the value of the constrtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstrtName() {
        return constrtName;
    }

    /**
     * Sets the value of the constrtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstrtName(String value) {
        this.constrtName = value;
    }

    /**
     * Gets the value of the constructId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConstructId() {
        return constructId;
    }

    /**
     * Sets the value of the constructId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConstructId(Long value) {
        this.constructId = value;
    }

    /**
     * Gets the value of the countDeviceForStation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCountDeviceForStation() {
        return countDeviceForStation;
    }

    /**
     * Sets the value of the countDeviceForStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCountDeviceForStation(Double value) {
        this.countDeviceForStation = value;
    }

    /**
     * Gets the value of the countMerAtStation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCountMerAtStation() {
        return countMerAtStation;
    }

    /**
     * Sets the value of the countMerAtStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCountMerAtStation(Double value) {
        this.countMerAtStation = value;
    }

    /**
     * Gets the value of the countMerentityForStation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCountMerentityForStation() {
        return countMerentityForStation;
    }

    /**
     * Sets the value of the countMerentityForStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCountMerentityForStation(Double value) {
        this.countMerentityForStation = value;
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
     * Gets the value of the descriptDel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptDel() {
        return descriptDel;
    }

    /**
     * Sets the value of the descriptDel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptDel(String value) {
        this.descriptDel = value;
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
     * Gets the value of the emissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmissionDate() {
        return emissionDate;
    }

    /**
     * Sets the value of the emissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmissionDate(XMLGregorianCalendar value) {
        this.emissionDate = value;
    }

    /**
     * Gets the value of the employeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeCode() {
        return employeeCode;
    }

    /**
     * Sets the value of the employeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeCode(String value) {
        this.employeeCode = value;
    }

    /**
     * Gets the value of the employeeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeEmail() {
        return employeeEmail;
    }

    /**
     * Sets the value of the employeeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeEmail(String value) {
        this.employeeEmail = value;
    }

    /**
     * Gets the value of the employeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * Sets the value of the employeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeName(String value) {
        this.employeeName = value;
    }

    /**
     * Gets the value of the employeePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    /**
     * Sets the value of the employeePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeePhoneNumber(String value) {
        this.employeePhoneNumber = value;
    }

    /**
     * Gets the value of the endPointId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEndPointId() {
        return endPointId;
    }

    /**
     * Sets the value of the endPointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEndPointId(Long value) {
        this.endPointId = value;
    }

    /**
     * Gets the value of the ereaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEreaCode() {
        return ereaCode;
    }

    /**
     * Sets the value of the ereaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEreaCode(String value) {
        this.ereaCode = value;
    }

    /**
     * Gets the value of the errData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrData() {
        return errData;
    }

    /**
     * Sets the value of the errData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrData(String value) {
        this.errData = value;
    }

    /**
     * Gets the value of the groupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * Sets the value of the groupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCode(String value) {
        this.groupCode = value;
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
     * Gets the value of the highColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighColumn() {
        return highColumn;
    }

    /**
     * Sets the value of the highColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighColumn(String value) {
        this.highColumn = value;
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
     * Gets the value of the isBase property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsBase() {
        return isBase;
    }

    /**
     * Sets the value of the isBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsBase(Long value) {
        this.isBase = value;
    }

    /**
     * Gets the value of the isDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsDelete() {
        return isDelete;
    }

    /**
     * Sets the value of the isDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsDelete(Long value) {
        this.isDelete = value;
    }

    /**
     * Gets the value of the isInventory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsInventory() {
        return isInventory;
    }

    /**
     * Sets the value of the isInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsInventory(Long value) {
        this.isInventory = value;
    }

    /**
     * Gets the value of the isOff property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsOff() {
        return isOff;
    }

    /**
     * Sets the value of the isOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsOff(Long value) {
        this.isOff = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLatitude(Long value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the lineTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineTypeId() {
        return lineTypeId;
    }

    /**
     * Sets the value of the lineTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineTypeId(Long value) {
        this.lineTypeId = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLongitude(Long value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the lstConstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstConstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstConstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstrConstructionsBO }
     * 
     * 
     */
    public List<ConstrConstructionsBO> getLstConstructions() {
        if (lstConstructions == null) {
            lstConstructions = new ArrayList<ConstrConstructionsBO>();
        }
        return this.lstConstructions;
    }

    /**
     * Gets the value of the parentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * Sets the value of the parentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCode(String value) {
        this.parentCode = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentId(Long value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the preParentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreParentId() {
        return preParentId;
    }

    /**
     * Sets the value of the preParentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreParentId(Long value) {
        this.preParentId = value;
    }

    /**
     * Gets the value of the provinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * Sets the value of the provinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceCode(String value) {
        this.provinceCode = value;
    }

    /**
     * Gets the value of the provinceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProvinceId() {
        return provinceId;
    }

    /**
     * Sets the value of the provinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProvinceId(Long value) {
        this.provinceId = value;
    }

    /**
     * Gets the value of the provinceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * Sets the value of the provinceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceName(String value) {
        this.provinceName = value;
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
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the row property.
     * 
     */
    public int getRow() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     */
    public void setRow(int value) {
        this.row = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScope(Long value) {
        this.scope = value;
    }

    /**
     * Gets the value of the startPointId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStartPointId() {
        return startPointId;
    }

    /**
     * Sets the value of the startPointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStartPointId(Long value) {
        this.startPointId = value;
    }

    /**
     * Gets the value of the stationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationCode() {
        return stationCode;
    }

    /**
     * Sets the value of the stationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationCode(String value) {
        this.stationCode = value;
    }

    /**
     * Gets the value of the stationHouseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationHouseCode() {
        return stationHouseCode;
    }

    /**
     * Sets the value of the stationHouseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationHouseCode(String value) {
        this.stationHouseCode = value;
    }

    /**
     * Gets the value of the stationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStationStatus() {
        return stationStatus;
    }

    /**
     * Sets the value of the stationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStationStatus(Long value) {
        this.stationStatus = value;
    }

    /**
     * Gets the value of the stationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationType() {
        return stationType;
    }

    /**
     * Sets the value of the stationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationType(String value) {
        this.stationType = value;
    }

    /**
     * Gets the value of the statusHandOver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusHandOver() {
        return statusHandOver;
    }

    /**
     * Sets the value of the statusHandOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusHandOver(String value) {
        this.statusHandOver = value;
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
     * Gets the value of the typeColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeColumn() {
        return typeColumn;
    }

    /**
     * Sets the value of the typeColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeColumn(String value) {
        this.typeColumn = value;
    }

    /**
     * Gets the value of the typeStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeStation() {
        return typeStation;
    }

    /**
     * Sets the value of the typeStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeStation(String value) {
        this.typeStation = value;
    }

    /**
     * Gets the value of the usedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUsedDate() {
        return usedDate;
    }

    /**
     * Sets the value of the usedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUsedDate(XMLGregorianCalendar value) {
        this.usedDate = value;
    }

    /**
     * Gets the value of the userLoginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLoginName() {
        return userLoginName;
    }

    /**
     * Sets the value of the userLoginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLoginName(String value) {
        this.userLoginName = value;
    }

}
