
package com.viettel.qldtktts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for catMerchandiseBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="catMerchandiseBO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.qldtktts.viettel.com/}basicBO">
 *       &lt;sequence>
 *         &lt;element name="abbreviate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amortMode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bkCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calibrationPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="catGroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catUnit" type="{http://webservice.qldtktts.viettel.com/}catUnitBO" minOccurs="0"/>
 *         &lt;element name="cdcMerchandiseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cdcktMerchandiseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="changeSerialRequire" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="character" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="creditAccId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="curId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cycleBd" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cycleKdhc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="defaultPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deptAccId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiredDate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="function" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goodsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goodsId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="goodsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goodsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goodsUnitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="goodsUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="increaseAssetAccId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isAccepted" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isAccounting" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isDevice" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isInFdmanager" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isSpending" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isStripSerial" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isVisible" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lifeTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maintainCost" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maintainPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mark" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxDeprePeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="merExpType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="merType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="merchandiseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="minDeprePeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="modifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="oldType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="originalPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="originalSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalWeight" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="palletQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="partNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnumberRequired" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proposalNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proposalPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proposalStatus" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="quantityPack" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="refMerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="serialRequired" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="testingPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="theLevel" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="typeKdhc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updaterId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="volumePack" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="warningContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weighPack" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catMerchandiseBO", propOrder = {
    "abbreviate",
    "amortMode",
    "bkCode",
    "calibrationPeriod",
    "catGroupType",
    "catUnit",
    "cdcMerchandiseId",
    "cdcktMerchandiseId",
    "changeSerialRequire",
    "character",
    "code",
    "contractId",
    "creatorId",
    "creditAccId",
    "curId",
    "cycleBd",
    "cycleKdhc",
    "defaultPrice",
    "deptAccId",
    "description",
    "enName",
    "entityType",
    "expiredDate",
    "fullName",
    "function",
    "goodsCode",
    "goodsId",
    "goodsName",
    "goodsType",
    "goodsUnitId",
    "goodsUnitName",
    "groupType",
    "increaseAssetAccId",
    "isAccepted",
    "isAccounting",
    "isActive",
    "isDevice",
    "isGroup",
    "isInFdmanager",
    "isSpending",
    "isStripSerial",
    "isVisible",
    "lifeTime",
    "maintainCost",
    "maintainPeriod",
    "mark",
    "maxDeprePeriod",
    "merExpType",
    "merType",
    "merchandiseId",
    "minDeprePeriod",
    "modifiedTime",
    "name",
    "oldCode",
    "oldId",
    "oldType",
    "originalPrice",
    "originalSize",
    "originalWeight",
    "palletQuantity",
    "parentId",
    "partNumber",
    "partnumberRequired",
    "path",
    "proposalNote",
    "proposalPath",
    "proposalStatus",
    "quantityPack",
    "refMerId",
    "serialRequired",
    "status",
    "testingPeriod",
    "theLevel",
    "type",
    "typeKdhc",
    "unitId",
    "unitName",
    "updatedDate",
    "updaterId",
    "volumePack",
    "warningContent",
    "weighPack"
})
public class CatMerchandiseBO
    extends BasicBO
{

    protected String abbreviate;
    protected Long amortMode;
    protected String bkCode;
    protected Long calibrationPeriod;
    protected String catGroupType;
    protected CatUnitBO catUnit;
    protected Long cdcMerchandiseId;
    protected Long cdcktMerchandiseId;
    protected Long changeSerialRequire;
    protected String character;
    protected String code;
    protected Long contractId;
    protected Long creatorId;
    protected Long creditAccId;
    protected Long curId;
    protected Long cycleBd;
    protected Long cycleKdhc;
    protected Double defaultPrice;
    protected Long deptAccId;
    protected String description;
    protected String enName;
    protected String entityType;
    protected Double expiredDate;
    protected String fullName;
    protected String function;
    protected String goodsCode;
    protected Long goodsId;
    protected String goodsName;
    protected String goodsType;
    protected Long goodsUnitId;
    protected String goodsUnitName;
    protected Long groupType;
    protected Long increaseAssetAccId;
    protected Long isAccepted;
    protected Long isAccounting;
    protected Long isActive;
    protected Long isDevice;
    protected Long isGroup;
    protected Long isInFdmanager;
    protected Long isSpending;
    protected Long isStripSerial;
    protected Long isVisible;
    protected Double lifeTime;
    protected Long maintainCost;
    protected Long maintainPeriod;
    protected Long mark;
    protected Long maxDeprePeriod;
    protected Long merExpType;
    protected Long merType;
    protected Long merchandiseId;
    protected Long minDeprePeriod;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedTime;
    protected String name;
    protected String oldCode;
    protected Long oldId;
    protected Long oldType;
    protected Double originalPrice;
    protected String originalSize;
    protected Long originalWeight;
    protected Long palletQuantity;
    protected Long parentId;
    protected String partNumber;
    protected Long partnumberRequired;
    protected String path;
    protected String proposalNote;
    protected String proposalPath;
    protected Long proposalStatus;
    protected Long quantityPack;
    protected Long refMerId;
    protected Long serialRequired;
    protected Long status;
    protected Long testingPeriod;
    protected Long theLevel;
    protected Long type;
    protected Long typeKdhc;
    protected Long unitId;
    protected String unitName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;
    protected Long updaterId;
    protected Long volumePack;
    protected String warningContent;
    protected Long weighPack;

    /**
     * Gets the value of the abbreviate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviate() {
        return abbreviate;
    }

    /**
     * Sets the value of the abbreviate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviate(String value) {
        this.abbreviate = value;
    }

    /**
     * Gets the value of the amortMode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmortMode() {
        return amortMode;
    }

    /**
     * Sets the value of the amortMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmortMode(Long value) {
        this.amortMode = value;
    }

    /**
     * Gets the value of the bkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkCode() {
        return bkCode;
    }

    /**
     * Sets the value of the bkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBkCode(String value) {
        this.bkCode = value;
    }

    /**
     * Gets the value of the calibrationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCalibrationPeriod() {
        return calibrationPeriod;
    }

    /**
     * Sets the value of the calibrationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCalibrationPeriod(Long value) {
        this.calibrationPeriod = value;
    }

    /**
     * Gets the value of the catGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatGroupType() {
        return catGroupType;
    }

    /**
     * Sets the value of the catGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatGroupType(String value) {
        this.catGroupType = value;
    }

    /**
     * Gets the value of the catUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CatUnitBO }
     *     
     */
    public CatUnitBO getCatUnit() {
        return catUnit;
    }

    /**
     * Sets the value of the catUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatUnitBO }
     *     
     */
    public void setCatUnit(CatUnitBO value) {
        this.catUnit = value;
    }

    /**
     * Gets the value of the cdcMerchandiseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdcMerchandiseId() {
        return cdcMerchandiseId;
    }

    /**
     * Sets the value of the cdcMerchandiseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdcMerchandiseId(Long value) {
        this.cdcMerchandiseId = value;
    }

    /**
     * Gets the value of the cdcktMerchandiseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdcktMerchandiseId() {
        return cdcktMerchandiseId;
    }

    /**
     * Sets the value of the cdcktMerchandiseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdcktMerchandiseId(Long value) {
        this.cdcktMerchandiseId = value;
    }

    /**
     * Gets the value of the changeSerialRequire property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChangeSerialRequire() {
        return changeSerialRequire;
    }

    /**
     * Sets the value of the changeSerialRequire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChangeSerialRequire(Long value) {
        this.changeSerialRequire = value;
    }

    /**
     * Gets the value of the character property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter() {
        return character;
    }

    /**
     * Sets the value of the character property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter(String value) {
        this.character = value;
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
     * Gets the value of the creditAccId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreditAccId() {
        return creditAccId;
    }

    /**
     * Sets the value of the creditAccId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreditAccId(Long value) {
        this.creditAccId = value;
    }

    /**
     * Gets the value of the curId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurId() {
        return curId;
    }

    /**
     * Sets the value of the curId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurId(Long value) {
        this.curId = value;
    }

    /**
     * Gets the value of the cycleBd property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCycleBd() {
        return cycleBd;
    }

    /**
     * Sets the value of the cycleBd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCycleBd(Long value) {
        this.cycleBd = value;
    }

    /**
     * Gets the value of the cycleKdhc property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCycleKdhc() {
        return cycleKdhc;
    }

    /**
     * Sets the value of the cycleKdhc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCycleKdhc(Long value) {
        this.cycleKdhc = value;
    }

    /**
     * Gets the value of the defaultPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDefaultPrice() {
        return defaultPrice;
    }

    /**
     * Sets the value of the defaultPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefaultPrice(Double value) {
        this.defaultPrice = value;
    }

    /**
     * Gets the value of the deptAccId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeptAccId() {
        return deptAccId;
    }

    /**
     * Sets the value of the deptAccId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeptAccId(Long value) {
        this.deptAccId = value;
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
     * Gets the value of the enName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnName() {
        return enName;
    }

    /**
     * Sets the value of the enName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnName(String value) {
        this.enName = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityType(String value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the expiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpiredDate() {
        return expiredDate;
    }

    /**
     * Sets the value of the expiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpiredDate(Double value) {
        this.expiredDate = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Gets the value of the goodsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsCode() {
        return goodsCode;
    }

    /**
     * Sets the value of the goodsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsCode(String value) {
        this.goodsCode = value;
    }

    /**
     * Gets the value of the goodsId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * Sets the value of the goodsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGoodsId(Long value) {
        this.goodsId = value;
    }

    /**
     * Gets the value of the goodsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * Sets the value of the goodsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsName(String value) {
        this.goodsName = value;
    }

    /**
     * Gets the value of the goodsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsType() {
        return goodsType;
    }

    /**
     * Sets the value of the goodsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsType(String value) {
        this.goodsType = value;
    }

    /**
     * Gets the value of the goodsUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGoodsUnitId() {
        return goodsUnitId;
    }

    /**
     * Sets the value of the goodsUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGoodsUnitId(Long value) {
        this.goodsUnitId = value;
    }

    /**
     * Gets the value of the goodsUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsUnitName() {
        return goodsUnitName;
    }

    /**
     * Sets the value of the goodsUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsUnitName(String value) {
        this.goodsUnitName = value;
    }

    /**
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupType(Long value) {
        this.groupType = value;
    }

    /**
     * Gets the value of the increaseAssetAccId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIncreaseAssetAccId() {
        return increaseAssetAccId;
    }

    /**
     * Sets the value of the increaseAssetAccId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIncreaseAssetAccId(Long value) {
        this.increaseAssetAccId = value;
    }

    /**
     * Gets the value of the isAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsAccepted() {
        return isAccepted;
    }

    /**
     * Sets the value of the isAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsAccepted(Long value) {
        this.isAccepted = value;
    }

    /**
     * Gets the value of the isAccounting property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsAccounting() {
        return isAccounting;
    }

    /**
     * Sets the value of the isAccounting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsAccounting(Long value) {
        this.isAccounting = value;
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
     * Gets the value of the isDevice property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsDevice() {
        return isDevice;
    }

    /**
     * Sets the value of the isDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsDevice(Long value) {
        this.isDevice = value;
    }

    /**
     * Gets the value of the isGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsGroup() {
        return isGroup;
    }

    /**
     * Sets the value of the isGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsGroup(Long value) {
        this.isGroup = value;
    }

    /**
     * Gets the value of the isInFdmanager property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsInFdmanager() {
        return isInFdmanager;
    }

    /**
     * Sets the value of the isInFdmanager property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsInFdmanager(Long value) {
        this.isInFdmanager = value;
    }

    /**
     * Gets the value of the isSpending property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsSpending() {
        return isSpending;
    }

    /**
     * Sets the value of the isSpending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsSpending(Long value) {
        this.isSpending = value;
    }

    /**
     * Gets the value of the isStripSerial property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsStripSerial() {
        return isStripSerial;
    }

    /**
     * Sets the value of the isStripSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsStripSerial(Long value) {
        this.isStripSerial = value;
    }

    /**
     * Gets the value of the isVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsVisible() {
        return isVisible;
    }

    /**
     * Sets the value of the isVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsVisible(Long value) {
        this.isVisible = value;
    }

    /**
     * Gets the value of the lifeTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLifeTime() {
        return lifeTime;
    }

    /**
     * Sets the value of the lifeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLifeTime(Double value) {
        this.lifeTime = value;
    }

    /**
     * Gets the value of the maintainCost property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaintainCost() {
        return maintainCost;
    }

    /**
     * Sets the value of the maintainCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaintainCost(Long value) {
        this.maintainCost = value;
    }

    /**
     * Gets the value of the maintainPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaintainPeriod() {
        return maintainPeriod;
    }

    /**
     * Sets the value of the maintainPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaintainPeriod(Long value) {
        this.maintainPeriod = value;
    }

    /**
     * Gets the value of the mark property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMark() {
        return mark;
    }

    /**
     * Sets the value of the mark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMark(Long value) {
        this.mark = value;
    }

    /**
     * Gets the value of the maxDeprePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxDeprePeriod() {
        return maxDeprePeriod;
    }

    /**
     * Sets the value of the maxDeprePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxDeprePeriod(Long value) {
        this.maxDeprePeriod = value;
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
     * Gets the value of the merType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMerType() {
        return merType;
    }

    /**
     * Sets the value of the merType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMerType(Long value) {
        this.merType = value;
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
     * Gets the value of the minDeprePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinDeprePeriod() {
        return minDeprePeriod;
    }

    /**
     * Sets the value of the minDeprePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinDeprePeriod(Long value) {
        this.minDeprePeriod = value;
    }

    /**
     * Gets the value of the modifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedTime() {
        return modifiedTime;
    }

    /**
     * Sets the value of the modifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedTime(XMLGregorianCalendar value) {
        this.modifiedTime = value;
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
     * Gets the value of the oldCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldCode() {
        return oldCode;
    }

    /**
     * Sets the value of the oldCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldCode(String value) {
        this.oldCode = value;
    }

    /**
     * Gets the value of the oldId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOldId() {
        return oldId;
    }

    /**
     * Sets the value of the oldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOldId(Long value) {
        this.oldId = value;
    }

    /**
     * Gets the value of the oldType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOldType() {
        return oldType;
    }

    /**
     * Sets the value of the oldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOldType(Long value) {
        this.oldType = value;
    }

    /**
     * Gets the value of the originalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOriginalPrice() {
        return originalPrice;
    }

    /**
     * Sets the value of the originalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOriginalPrice(Double value) {
        this.originalPrice = value;
    }

    /**
     * Gets the value of the originalSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalSize() {
        return originalSize;
    }

    /**
     * Sets the value of the originalSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalSize(String value) {
        this.originalSize = value;
    }

    /**
     * Gets the value of the originalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginalWeight() {
        return originalWeight;
    }

    /**
     * Sets the value of the originalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginalWeight(Long value) {
        this.originalWeight = value;
    }

    /**
     * Gets the value of the palletQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPalletQuantity() {
        return palletQuantity;
    }

    /**
     * Sets the value of the palletQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPalletQuantity(Long value) {
        this.palletQuantity = value;
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
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the partnumberRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartnumberRequired() {
        return partnumberRequired;
    }

    /**
     * Sets the value of the partnumberRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartnumberRequired(Long value) {
        this.partnumberRequired = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
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
     * Gets the value of the proposalPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProposalPath() {
        return proposalPath;
    }

    /**
     * Sets the value of the proposalPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProposalPath(String value) {
        this.proposalPath = value;
    }

    /**
     * Gets the value of the proposalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProposalStatus() {
        return proposalStatus;
    }

    /**
     * Sets the value of the proposalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProposalStatus(Long value) {
        this.proposalStatus = value;
    }

    /**
     * Gets the value of the quantityPack property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuantityPack() {
        return quantityPack;
    }

    /**
     * Sets the value of the quantityPack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuantityPack(Long value) {
        this.quantityPack = value;
    }

    /**
     * Gets the value of the refMerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRefMerId() {
        return refMerId;
    }

    /**
     * Sets the value of the refMerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRefMerId(Long value) {
        this.refMerId = value;
    }

    /**
     * Gets the value of the serialRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSerialRequired() {
        return serialRequired;
    }

    /**
     * Sets the value of the serialRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSerialRequired(Long value) {
        this.serialRequired = value;
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
     * Gets the value of the testingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTestingPeriod() {
        return testingPeriod;
    }

    /**
     * Sets the value of the testingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTestingPeriod(Long value) {
        this.testingPeriod = value;
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
     * Gets the value of the typeKdhc property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeKdhc() {
        return typeKdhc;
    }

    /**
     * Sets the value of the typeKdhc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeKdhc(Long value) {
        this.typeKdhc = value;
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
     * Gets the value of the unitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * Sets the value of the unitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitName(String value) {
        this.unitName = value;
    }

    /**
     * Gets the value of the updatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedDate(XMLGregorianCalendar value) {
        this.updatedDate = value;
    }

    /**
     * Gets the value of the updaterId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpdaterId() {
        return updaterId;
    }

    /**
     * Sets the value of the updaterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpdaterId(Long value) {
        this.updaterId = value;
    }

    /**
     * Gets the value of the volumePack property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVolumePack() {
        return volumePack;
    }

    /**
     * Sets the value of the volumePack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVolumePack(Long value) {
        this.volumePack = value;
    }

    /**
     * Gets the value of the warningContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarningContent() {
        return warningContent;
    }

    /**
     * Sets the value of the warningContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarningContent(String value) {
        this.warningContent = value;
    }

    /**
     * Gets the value of the weighPack property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWeighPack() {
        return weighPack;
    }

    /**
     * Sets the value of the weighPack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWeighPack(Long value) {
        this.weighPack = value;
    }

}
