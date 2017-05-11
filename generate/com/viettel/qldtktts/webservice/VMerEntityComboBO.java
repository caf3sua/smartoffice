
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
 * <p>Java class for vMerEntityComboBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vMerEntityComboBO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.qldtktts.viettel.com/}basicBO">
 *       &lt;sequence>
 *         &lt;element name="comboCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comboId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="comboType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createdUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="listMerEntity" type="{http://webservice.qldtktts.viettel.com/}merEntityBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="merConfigCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merConfigName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="stationHouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stationHouseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "vMerEntityComboBO", propOrder = {
    "comboCode",
    "comboId",
    "comboType",
    "createdDate",
    "createdUserId",
    "description",
    "isActive",
    "listMerEntity",
    "merConfigCode",
    "merConfigName",
    "modifiedDate",
    "stationHouseCode",
    "stationHouseId",
    "userFullName",
    "userLoginName"
})
public class VMerEntityComboBO
    extends BasicBO
{

    protected String comboCode;
    protected Long comboId;
    protected Long comboType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected Long createdUserId;
    protected String description;
    protected Long isActive;
    @XmlElement(nillable = true)
    protected List<MerEntityBO> listMerEntity;
    protected String merConfigCode;
    protected String merConfigName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDate;
    protected String stationHouseCode;
    protected Long stationHouseId;
    protected String userFullName;
    protected String userLoginName;

    /**
     * Gets the value of the comboCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComboCode() {
        return comboCode;
    }

    /**
     * Sets the value of the comboCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComboCode(String value) {
        this.comboCode = value;
    }

    /**
     * Gets the value of the comboId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getComboId() {
        return comboId;
    }

    /**
     * Sets the value of the comboId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setComboId(Long value) {
        this.comboId = value;
    }

    /**
     * Gets the value of the comboType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getComboType() {
        return comboType;
    }

    /**
     * Sets the value of the comboType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setComboType(Long value) {
        this.comboType = value;
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
     * Gets the value of the createdUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreatedUserId() {
        return createdUserId;
    }

    /**
     * Sets the value of the createdUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreatedUserId(Long value) {
        this.createdUserId = value;
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
     * Gets the value of the merConfigName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerConfigName() {
        return merConfigName;
    }

    /**
     * Sets the value of the merConfigName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerConfigName(String value) {
        this.merConfigName = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDate(XMLGregorianCalendar value) {
        this.modifiedDate = value;
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
     * Gets the value of the stationHouseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStationHouseId() {
        return stationHouseId;
    }

    /**
     * Sets the value of the stationHouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStationHouseId(Long value) {
        this.stationHouseId = value;
    }

    /**
     * Gets the value of the userFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFullName() {
        return userFullName;
    }

    /**
     * Sets the value of the userFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFullName(String value) {
        this.userFullName = value;
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
