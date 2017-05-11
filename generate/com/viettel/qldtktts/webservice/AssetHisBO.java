
package com.viettel.qldtktts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for assetHisBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assetHisBO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.qldtktts.viettel.com/}basicBO">
 *       &lt;sequence>
 *         &lt;element name="actionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isDummy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="merEntityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="objectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assetHisBO", propOrder = {
    "actionDescription",
    "actionTime",
    "id",
    "isDummy",
    "merEntityId",
    "objectCode",
    "objectId",
    "objectType"
})
public class AssetHisBO
    extends BasicBO
{

    protected String actionDescription;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actionTime;
    protected Long id;
    protected Long isDummy;
    protected Long merEntityId;
    protected String objectCode;
    protected Long objectId;
    protected Long objectType;

    /**
     * Gets the value of the actionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionDescription() {
        return actionDescription;
    }

    /**
     * Sets the value of the actionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionDescription(String value) {
        this.actionDescription = value;
    }

    /**
     * Gets the value of the actionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActionTime() {
        return actionTime;
    }

    /**
     * Sets the value of the actionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActionTime(XMLGregorianCalendar value) {
        this.actionTime = value;
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
     * Gets the value of the isDummy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsDummy() {
        return isDummy;
    }

    /**
     * Sets the value of the isDummy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsDummy(Long value) {
        this.isDummy = value;
    }

    /**
     * Gets the value of the merEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMerEntityId() {
        return merEntityId;
    }

    /**
     * Sets the value of the merEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMerEntityId(Long value) {
        this.merEntityId = value;
    }

    /**
     * Gets the value of the objectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectCode() {
        return objectCode;
    }

    /**
     * Sets the value of the objectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectCode(String value) {
        this.objectCode = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setObjectId(Long value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setObjectType(Long value) {
        this.objectType = value;
    }

}
