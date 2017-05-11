
package com.viettel.qldtktts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for catWarehouseBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="catWarehouseBO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.qldtktts.viettel.com/}basicBO">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catWarehouse" type="{http://webservice.qldtktts.viettel.com/}catWarehouseBO" minOccurs="0"/>
 *         &lt;element name="catWarehousePhysicId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="catWarehousePhysicName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catWarehouseTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="col" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="companyType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="logStockId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="modifieldDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="parentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proviceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provinceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="row" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="stockCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stockId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="stockName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sysGroup" type="{http://webservice.qldtktts.viettel.com/}sysGroupBO" minOccurs="0"/>
 *         &lt;element name="theLevel" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="virtualType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="warehouseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="whType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catWarehouseBO", propOrder = {
    "address",
    "catWarehouse",
    "catWarehousePhysicId",
    "catWarehousePhysicName",
    "catWarehouseTypeId",
    "code",
    "col",
    "companyType",
    "createdDate",
    "description",
    "errData",
    "groupId",
    "groupName",
    "isActive",
    "logStockId",
    "modifieldDate",
    "name",
    "ownGroupId",
    "parentId",
    "parentName",
    "proviceCode",
    "provinceId",
    "quantity",
    "row",
    "status",
    "stockCode",
    "stockId",
    "stockName",
    "sysGroup",
    "theLevel",
    "title",
    "virtualType",
    "warehouseId",
    "whType"
})
public class CatWarehouseBO
    extends BasicBO
{

    protected String address;
    protected CatWarehouseBO catWarehouse;
    protected Long catWarehousePhysicId;
    protected String catWarehousePhysicName;
    protected Long catWarehouseTypeId;
    protected String code;
    protected int col;
    protected Long companyType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected String description;
    protected String errData;
    protected Long groupId;
    protected String groupName;
    protected Long isActive;
    protected Long logStockId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifieldDate;
    protected String name;
    protected Long ownGroupId;
    protected Long parentId;
    protected String parentName;
    protected String proviceCode;
    protected Long provinceId;
    protected Long quantity;
    protected int row;
    protected Long status;
    protected String stockCode;
    protected Long stockId;
    protected String stockName;
    protected SysGroupBO sysGroup;
    protected Long theLevel;
    protected String title;
    protected Long virtualType;
    protected Long warehouseId;
    protected Long whType;

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
     * Gets the value of the catWarehouse property.
     * 
     * @return
     *     possible object is
     *     {@link CatWarehouseBO }
     *     
     */
    public CatWarehouseBO getCatWarehouse() {
        return catWarehouse;
    }

    /**
     * Sets the value of the catWarehouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatWarehouseBO }
     *     
     */
    public void setCatWarehouse(CatWarehouseBO value) {
        this.catWarehouse = value;
    }

    /**
     * Gets the value of the catWarehousePhysicId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCatWarehousePhysicId() {
        return catWarehousePhysicId;
    }

    /**
     * Sets the value of the catWarehousePhysicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCatWarehousePhysicId(Long value) {
        this.catWarehousePhysicId = value;
    }

    /**
     * Gets the value of the catWarehousePhysicName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatWarehousePhysicName() {
        return catWarehousePhysicName;
    }

    /**
     * Sets the value of the catWarehousePhysicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatWarehousePhysicName(String value) {
        this.catWarehousePhysicName = value;
    }

    /**
     * Gets the value of the catWarehouseTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCatWarehouseTypeId() {
        return catWarehouseTypeId;
    }

    /**
     * Sets the value of the catWarehouseTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCatWarehouseTypeId(Long value) {
        this.catWarehouseTypeId = value;
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
     * Gets the value of the companyType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompanyType() {
        return companyType;
    }

    /**
     * Sets the value of the companyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompanyType(Long value) {
        this.companyType = value;
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
     * Gets the value of the logStockId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLogStockId() {
        return logStockId;
    }

    /**
     * Sets the value of the logStockId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLogStockId(Long value) {
        this.logStockId = value;
    }

    /**
     * Gets the value of the modifieldDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifieldDate() {
        return modifieldDate;
    }

    /**
     * Sets the value of the modifieldDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifieldDate(XMLGregorianCalendar value) {
        this.modifieldDate = value;
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
     * Gets the value of the ownGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOwnGroupId() {
        return ownGroupId;
    }

    /**
     * Sets the value of the ownGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOwnGroupId(Long value) {
        this.ownGroupId = value;
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
     * Gets the value of the parentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * Sets the value of the parentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentName(String value) {
        this.parentName = value;
    }

    /**
     * Gets the value of the proviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviceCode() {
        return proviceCode;
    }

    /**
     * Sets the value of the proviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviceCode(String value) {
        this.proviceCode = value;
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
     * Gets the value of the stockCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockCode() {
        return stockCode;
    }

    /**
     * Sets the value of the stockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockCode(String value) {
        this.stockCode = value;
    }

    /**
     * Gets the value of the stockId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStockId() {
        return stockId;
    }

    /**
     * Sets the value of the stockId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStockId(Long value) {
        this.stockId = value;
    }

    /**
     * Gets the value of the stockName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockName() {
        return stockName;
    }

    /**
     * Sets the value of the stockName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockName(String value) {
        this.stockName = value;
    }

    /**
     * Gets the value of the sysGroup property.
     * 
     * @return
     *     possible object is
     *     {@link SysGroupBO }
     *     
     */
    public SysGroupBO getSysGroup() {
        return sysGroup;
    }

    /**
     * Sets the value of the sysGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link SysGroupBO }
     *     
     */
    public void setSysGroup(SysGroupBO value) {
        this.sysGroup = value;
    }

    /**
     * Gets the value of the theLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTheLevel() {
        return theLevel;
    }

    /**
     * Sets the value of the theLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTheLevel(Long value) {
        this.theLevel = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the virtualType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVirtualType() {
        return virtualType;
    }

    /**
     * Sets the value of the virtualType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVirtualType(Long value) {
        this.virtualType = value;
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
     * Gets the value of the whType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWhType() {
        return whType;
    }

    /**
     * Sets the value of the whType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWhType(Long value) {
        this.whType = value;
    }

}
