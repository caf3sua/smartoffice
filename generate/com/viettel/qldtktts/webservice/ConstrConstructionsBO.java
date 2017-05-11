
package com.viettel.qldtktts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for constrConstructionsBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="constrConstructionsBO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.qldtktts.viettel.com/}basicBO">
 *       &lt;sequence>
 *         &lt;element name="acceptFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="acceptStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="acceptStatusLost" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="adslNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="apConstrTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="balanceCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="balanceCreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="balancingId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cableMerPercent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cableProgressPercent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cableTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="catAPProjectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="catConstrTypesId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="catCurrencyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="catCurrencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catProjectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cmPer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="completeComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="completeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="constrLineType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="constrTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="constrTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constrtAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constrtCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constrtForm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="constrtName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constructId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="constructorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="constructorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constructorPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constructorPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="countContruction" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="districtId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="emissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="executeGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="executePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="executer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expectedCompleteDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="finishTest" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="handoverComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="handoverDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="handoverMaterials" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="integratedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="investProjectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isAccepted" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isAcceptedContract" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isApLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isHcqt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isInventory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isObstructed" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="landTransferedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastUpdateProgress" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lineLength" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="lineMode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lineType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="merStatus" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="migrateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="partnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="percentFinish" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pillarMerPercent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pillarProgressPercent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="planId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pmPer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preStartingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="preparedPremises" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="procedure" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="procedureComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="procedureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="progressCommitment" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="progressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="progressStatus" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="projectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectInvestComponentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="projectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="provinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provinceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pstnNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="serviceProvideDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="slowCause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="stationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="statusId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="subApConstrTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="suggestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="suggestorGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="suggestorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="suggestorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="superForm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="supervisionProgress" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="supervisorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="supervisorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supervisorPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supervisorPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sysCreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sysGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sysUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="timePercent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalValueStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueAppCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vibaFirst" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constrConstructionsBO", propOrder = {
    "acceptFinishDate",
    "acceptStartDate",
    "acceptStatusLost",
    "adslNum",
    "apConstrTypeId",
    "balanceCost",
    "balanceCreatedDate",
    "balancingId",
    "cableMerPercent",
    "cableProgressPercent",
    "cableTypeId",
    "catAPProjectId",
    "catConstrTypesId",
    "catCurrencyId",
    "catCurrencyName",
    "catProjectId",
    "cmPer",
    "completeComment",
    "completeDate",
    "constrLineType",
    "constrTypeId",
    "constrTypeName",
    "constrtAddress",
    "constrtCode",
    "constrtForm",
    "constrtName",
    "constructId",
    "constructorId",
    "constructorName",
    "constructorPerson",
    "constructorPhone",
    "content",
    "contractCode",
    "contractId",
    "countContruction",
    "description",
    "districtId",
    "emissionDate",
    "executeGroup",
    "executePhone",
    "executer",
    "expectedCompleteDate",
    "finishTest",
    "handoverComment",
    "handoverDate",
    "handoverMaterials",
    "integratedDate",
    "investProjectId",
    "isAccepted",
    "isAcceptedContract",
    "isActive",
    "isApLine",
    "isHcqt",
    "isInventory",
    "isObstructed",
    "landTransferedDate",
    "lastUpdateProgress",
    "lineLength",
    "lineMode",
    "lineType",
    "merStatus",
    "migrateDate",
    "partnerName",
    "percentFinish",
    "pillarMerPercent",
    "pillarProgressPercent",
    "planId",
    "pmPer",
    "preStartingDate",
    "preparedPremises",
    "procedure",
    "procedureComment",
    "procedureDate",
    "progressCommitment",
    "progressName",
    "progressStatus",
    "projectCode",
    "projectInvestComponentId",
    "projectName",
    "projectType",
    "provinceCode",
    "provinceId",
    "pstnNum",
    "scope",
    "serviceProvideDate",
    "slowCause",
    "startComment",
    "startingDate",
    "stationId",
    "status",
    "statusId",
    "subApConstrTypeId",
    "suggestDate",
    "suggestorGroupId",
    "suggestorId",
    "suggestorName",
    "superForm",
    "supervisionProgress",
    "supervisorId",
    "supervisorName",
    "supervisorPerson",
    "supervisorPhone",
    "sysCreatedDate",
    "sysGroupId",
    "sysUserId",
    "timePercent",
    "totalValue",
    "totalValueStr",
    "valueAppCost",
    "vibaFirst"
})
public class ConstrConstructionsBO
    extends BasicBO
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acceptFinishDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acceptStartDate;
    protected Long acceptStatusLost;
    protected Long adslNum;
    protected Long apConstrTypeId;
    protected Double balanceCost;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar balanceCreatedDate;
    protected Long balancingId;
    protected Long cableMerPercent;
    protected Long cableProgressPercent;
    protected Long cableTypeId;
    protected Long catAPProjectId;
    protected Long catConstrTypesId;
    protected Long catCurrencyId;
    protected String catCurrencyName;
    protected Long catProjectId;
    protected String cmPer;
    protected String completeComment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completeDate;
    protected Long constrLineType;
    protected Long constrTypeId;
    protected String constrTypeName;
    protected String constrtAddress;
    protected String constrtCode;
    protected Long constrtForm;
    protected String constrtName;
    protected Long constructId;
    protected Long constructorId;
    protected String constructorName;
    protected String constructorPerson;
    protected String constructorPhone;
    protected String content;
    protected String contractCode;
    protected Long contractId;
    protected Long countContruction;
    protected String description;
    protected Long districtId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar emissionDate;
    protected Long executeGroup;
    protected String executePhone;
    protected String executer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedCompleteDate;
    protected Long finishTest;
    protected String handoverComment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar handoverDate;
    protected Long handoverMaterials;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar integratedDate;
    protected Long investProjectId;
    protected Long isAccepted;
    protected Long isAcceptedContract;
    protected Long isActive;
    protected Long isApLine;
    protected Long isHcqt;
    protected Long isInventory;
    protected Long isObstructed;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar landTransferedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateProgress;
    protected Double lineLength;
    protected Long lineMode;
    protected Long lineType;
    protected Long merStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar migrateDate;
    protected String partnerName;
    protected Long percentFinish;
    protected Long pillarMerPercent;
    protected Long pillarProgressPercent;
    protected Long planId;
    protected String pmPer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar preStartingDate;
    protected Long preparedPremises;
    protected Long procedure;
    protected String procedureComment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar procedureDate;
    protected Long progressCommitment;
    protected String progressName;
    protected Long progressStatus;
    protected String projectCode;
    protected Long projectInvestComponentId;
    protected String projectName;
    protected Long projectType;
    protected String provinceCode;
    protected Long provinceId;
    protected Long pstnNum;
    protected Long scope;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceProvideDate;
    protected String slowCause;
    protected String startComment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startingDate;
    protected Long stationId;
    protected Long status;
    protected Long statusId;
    protected Long subApConstrTypeId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar suggestDate;
    protected Long suggestorGroupId;
    protected Long suggestorId;
    protected String suggestorName;
    protected Long superForm;
    protected Long supervisionProgress;
    protected Long supervisorId;
    protected String supervisorName;
    protected String supervisorPerson;
    protected String supervisorPhone;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sysCreatedDate;
    protected Long sysGroupId;
    protected Long sysUserId;
    protected Long timePercent;
    protected Double totalValue;
    protected String totalValueStr;
    protected Double valueAppCost;
    protected Long vibaFirst;

    /**
     * Gets the value of the acceptFinishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptFinishDate() {
        return acceptFinishDate;
    }

    /**
     * Sets the value of the acceptFinishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcceptFinishDate(XMLGregorianCalendar value) {
        this.acceptFinishDate = value;
    }

    /**
     * Gets the value of the acceptStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptStartDate() {
        return acceptStartDate;
    }

    /**
     * Sets the value of the acceptStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcceptStartDate(XMLGregorianCalendar value) {
        this.acceptStartDate = value;
    }

    /**
     * Gets the value of the acceptStatusLost property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAcceptStatusLost() {
        return acceptStatusLost;
    }

    /**
     * Sets the value of the acceptStatusLost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAcceptStatusLost(Long value) {
        this.acceptStatusLost = value;
    }

    /**
     * Gets the value of the adslNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdslNum() {
        return adslNum;
    }

    /**
     * Sets the value of the adslNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdslNum(Long value) {
        this.adslNum = value;
    }

    /**
     * Gets the value of the apConstrTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApConstrTypeId() {
        return apConstrTypeId;
    }

    /**
     * Sets the value of the apConstrTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApConstrTypeId(Long value) {
        this.apConstrTypeId = value;
    }

    /**
     * Gets the value of the balanceCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalanceCost() {
        return balanceCost;
    }

    /**
     * Sets the value of the balanceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalanceCost(Double value) {
        this.balanceCost = value;
    }

    /**
     * Gets the value of the balanceCreatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBalanceCreatedDate() {
        return balanceCreatedDate;
    }

    /**
     * Sets the value of the balanceCreatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBalanceCreatedDate(XMLGregorianCalendar value) {
        this.balanceCreatedDate = value;
    }

    /**
     * Gets the value of the balancingId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBalancingId() {
        return balancingId;
    }

    /**
     * Sets the value of the balancingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBalancingId(Long value) {
        this.balancingId = value;
    }

    /**
     * Gets the value of the cableMerPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCableMerPercent() {
        return cableMerPercent;
    }

    /**
     * Sets the value of the cableMerPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCableMerPercent(Long value) {
        this.cableMerPercent = value;
    }

    /**
     * Gets the value of the cableProgressPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCableProgressPercent() {
        return cableProgressPercent;
    }

    /**
     * Sets the value of the cableProgressPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCableProgressPercent(Long value) {
        this.cableProgressPercent = value;
    }

    /**
     * Gets the value of the cableTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCableTypeId() {
        return cableTypeId;
    }

    /**
     * Sets the value of the cableTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCableTypeId(Long value) {
        this.cableTypeId = value;
    }

    /**
     * Gets the value of the catAPProjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCatAPProjectId() {
        return catAPProjectId;
    }

    /**
     * Sets the value of the catAPProjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCatAPProjectId(Long value) {
        this.catAPProjectId = value;
    }

    /**
     * Gets the value of the catConstrTypesId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCatConstrTypesId() {
        return catConstrTypesId;
    }

    /**
     * Sets the value of the catConstrTypesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCatConstrTypesId(Long value) {
        this.catConstrTypesId = value;
    }

    /**
     * Gets the value of the catCurrencyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCatCurrencyId() {
        return catCurrencyId;
    }

    /**
     * Sets the value of the catCurrencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCatCurrencyId(Long value) {
        this.catCurrencyId = value;
    }

    /**
     * Gets the value of the catCurrencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatCurrencyName() {
        return catCurrencyName;
    }

    /**
     * Sets the value of the catCurrencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatCurrencyName(String value) {
        this.catCurrencyName = value;
    }

    /**
     * Gets the value of the catProjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCatProjectId() {
        return catProjectId;
    }

    /**
     * Sets the value of the catProjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCatProjectId(Long value) {
        this.catProjectId = value;
    }

    /**
     * Gets the value of the cmPer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmPer() {
        return cmPer;
    }

    /**
     * Sets the value of the cmPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmPer(String value) {
        this.cmPer = value;
    }

    /**
     * Gets the value of the completeComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompleteComment() {
        return completeComment;
    }

    /**
     * Sets the value of the completeComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompleteComment(String value) {
        this.completeComment = value;
    }

    /**
     * Gets the value of the completeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompleteDate() {
        return completeDate;
    }

    /**
     * Sets the value of the completeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompleteDate(XMLGregorianCalendar value) {
        this.completeDate = value;
    }

    /**
     * Gets the value of the constrLineType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConstrLineType() {
        return constrLineType;
    }

    /**
     * Sets the value of the constrLineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConstrLineType(Long value) {
        this.constrLineType = value;
    }

    /**
     * Gets the value of the constrTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConstrTypeId() {
        return constrTypeId;
    }

    /**
     * Sets the value of the constrTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConstrTypeId(Long value) {
        this.constrTypeId = value;
    }

    /**
     * Gets the value of the constrTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstrTypeName() {
        return constrTypeName;
    }

    /**
     * Sets the value of the constrTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstrTypeName(String value) {
        this.constrTypeName = value;
    }

    /**
     * Gets the value of the constrtAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstrtAddress() {
        return constrtAddress;
    }

    /**
     * Sets the value of the constrtAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstrtAddress(String value) {
        this.constrtAddress = value;
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
     * Gets the value of the constrtForm property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConstrtForm() {
        return constrtForm;
    }

    /**
     * Sets the value of the constrtForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConstrtForm(Long value) {
        this.constrtForm = value;
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
     * Gets the value of the constructorId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConstructorId() {
        return constructorId;
    }

    /**
     * Sets the value of the constructorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConstructorId(Long value) {
        this.constructorId = value;
    }

    /**
     * Gets the value of the constructorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstructorName() {
        return constructorName;
    }

    /**
     * Sets the value of the constructorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructorName(String value) {
        this.constructorName = value;
    }

    /**
     * Gets the value of the constructorPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstructorPerson() {
        return constructorPerson;
    }

    /**
     * Sets the value of the constructorPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructorPerson(String value) {
        this.constructorPerson = value;
    }

    /**
     * Gets the value of the constructorPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstructorPhone() {
        return constructorPhone;
    }

    /**
     * Sets the value of the constructorPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructorPhone(String value) {
        this.constructorPhone = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
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
     * Gets the value of the countContruction property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCountContruction() {
        return countContruction;
    }

    /**
     * Sets the value of the countContruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCountContruction(Long value) {
        this.countContruction = value;
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
     * Gets the value of the districtId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDistrictId() {
        return districtId;
    }

    /**
     * Sets the value of the districtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDistrictId(Long value) {
        this.districtId = value;
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
     * Gets the value of the executeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExecuteGroup() {
        return executeGroup;
    }

    /**
     * Sets the value of the executeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExecuteGroup(Long value) {
        this.executeGroup = value;
    }

    /**
     * Gets the value of the executePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutePhone() {
        return executePhone;
    }

    /**
     * Sets the value of the executePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutePhone(String value) {
        this.executePhone = value;
    }

    /**
     * Gets the value of the executer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecuter() {
        return executer;
    }

    /**
     * Sets the value of the executer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecuter(String value) {
        this.executer = value;
    }

    /**
     * Gets the value of the expectedCompleteDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedCompleteDate() {
        return expectedCompleteDate;
    }

    /**
     * Sets the value of the expectedCompleteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedCompleteDate(XMLGregorianCalendar value) {
        this.expectedCompleteDate = value;
    }

    /**
     * Gets the value of the finishTest property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinishTest() {
        return finishTest;
    }

    /**
     * Sets the value of the finishTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinishTest(Long value) {
        this.finishTest = value;
    }

    /**
     * Gets the value of the handoverComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandoverComment() {
        return handoverComment;
    }

    /**
     * Sets the value of the handoverComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandoverComment(String value) {
        this.handoverComment = value;
    }

    /**
     * Gets the value of the handoverDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHandoverDate() {
        return handoverDate;
    }

    /**
     * Sets the value of the handoverDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHandoverDate(XMLGregorianCalendar value) {
        this.handoverDate = value;
    }

    /**
     * Gets the value of the handoverMaterials property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHandoverMaterials() {
        return handoverMaterials;
    }

    /**
     * Sets the value of the handoverMaterials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHandoverMaterials(Long value) {
        this.handoverMaterials = value;
    }

    /**
     * Gets the value of the integratedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntegratedDate() {
        return integratedDate;
    }

    /**
     * Sets the value of the integratedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntegratedDate(XMLGregorianCalendar value) {
        this.integratedDate = value;
    }

    /**
     * Gets the value of the investProjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvestProjectId() {
        return investProjectId;
    }

    /**
     * Sets the value of the investProjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvestProjectId(Long value) {
        this.investProjectId = value;
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
     * Gets the value of the isAcceptedContract property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsAcceptedContract() {
        return isAcceptedContract;
    }

    /**
     * Sets the value of the isAcceptedContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsAcceptedContract(Long value) {
        this.isAcceptedContract = value;
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
     * Gets the value of the isApLine property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsApLine() {
        return isApLine;
    }

    /**
     * Sets the value of the isApLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsApLine(Long value) {
        this.isApLine = value;
    }

    /**
     * Gets the value of the isHcqt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsHcqt() {
        return isHcqt;
    }

    /**
     * Sets the value of the isHcqt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsHcqt(Long value) {
        this.isHcqt = value;
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
     * Gets the value of the isObstructed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsObstructed() {
        return isObstructed;
    }

    /**
     * Sets the value of the isObstructed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsObstructed(Long value) {
        this.isObstructed = value;
    }

    /**
     * Gets the value of the landTransferedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLandTransferedDate() {
        return landTransferedDate;
    }

    /**
     * Sets the value of the landTransferedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLandTransferedDate(XMLGregorianCalendar value) {
        this.landTransferedDate = value;
    }

    /**
     * Gets the value of the lastUpdateProgress property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateProgress() {
        return lastUpdateProgress;
    }

    /**
     * Sets the value of the lastUpdateProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateProgress(XMLGregorianCalendar value) {
        this.lastUpdateProgress = value;
    }

    /**
     * Gets the value of the lineLength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLineLength() {
        return lineLength;
    }

    /**
     * Sets the value of the lineLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLineLength(Double value) {
        this.lineLength = value;
    }

    /**
     * Gets the value of the lineMode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineMode() {
        return lineMode;
    }

    /**
     * Sets the value of the lineMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineMode(Long value) {
        this.lineMode = value;
    }

    /**
     * Gets the value of the lineType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineType() {
        return lineType;
    }

    /**
     * Sets the value of the lineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineType(Long value) {
        this.lineType = value;
    }

    /**
     * Gets the value of the merStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMerStatus() {
        return merStatus;
    }

    /**
     * Sets the value of the merStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMerStatus(Long value) {
        this.merStatus = value;
    }

    /**
     * Gets the value of the migrateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMigrateDate() {
        return migrateDate;
    }

    /**
     * Sets the value of the migrateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMigrateDate(XMLGregorianCalendar value) {
        this.migrateDate = value;
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
     * Gets the value of the percentFinish property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPercentFinish() {
        return percentFinish;
    }

    /**
     * Sets the value of the percentFinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPercentFinish(Long value) {
        this.percentFinish = value;
    }

    /**
     * Gets the value of the pillarMerPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPillarMerPercent() {
        return pillarMerPercent;
    }

    /**
     * Sets the value of the pillarMerPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPillarMerPercent(Long value) {
        this.pillarMerPercent = value;
    }

    /**
     * Gets the value of the pillarProgressPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPillarProgressPercent() {
        return pillarProgressPercent;
    }

    /**
     * Sets the value of the pillarProgressPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPillarProgressPercent(Long value) {
        this.pillarProgressPercent = value;
    }

    /**
     * Gets the value of the planId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlanId() {
        return planId;
    }

    /**
     * Sets the value of the planId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlanId(Long value) {
        this.planId = value;
    }

    /**
     * Gets the value of the pmPer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmPer() {
        return pmPer;
    }

    /**
     * Sets the value of the pmPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmPer(String value) {
        this.pmPer = value;
    }

    /**
     * Gets the value of the preStartingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreStartingDate() {
        return preStartingDate;
    }

    /**
     * Sets the value of the preStartingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreStartingDate(XMLGregorianCalendar value) {
        this.preStartingDate = value;
    }

    /**
     * Gets the value of the preparedPremises property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreparedPremises() {
        return preparedPremises;
    }

    /**
     * Sets the value of the preparedPremises property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreparedPremises(Long value) {
        this.preparedPremises = value;
    }

    /**
     * Gets the value of the procedure property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProcedure() {
        return procedure;
    }

    /**
     * Sets the value of the procedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProcedure(Long value) {
        this.procedure = value;
    }

    /**
     * Gets the value of the procedureComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcedureComment() {
        return procedureComment;
    }

    /**
     * Sets the value of the procedureComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcedureComment(String value) {
        this.procedureComment = value;
    }

    /**
     * Gets the value of the procedureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcedureDate() {
        return procedureDate;
    }

    /**
     * Sets the value of the procedureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcedureDate(XMLGregorianCalendar value) {
        this.procedureDate = value;
    }

    /**
     * Gets the value of the progressCommitment property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProgressCommitment() {
        return progressCommitment;
    }

    /**
     * Sets the value of the progressCommitment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProgressCommitment(Long value) {
        this.progressCommitment = value;
    }

    /**
     * Gets the value of the progressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgressName() {
        return progressName;
    }

    /**
     * Sets the value of the progressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgressName(String value) {
        this.progressName = value;
    }

    /**
     * Gets the value of the progressStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProgressStatus() {
        return progressStatus;
    }

    /**
     * Sets the value of the progressStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProgressStatus(Long value) {
        this.progressStatus = value;
    }

    /**
     * Gets the value of the projectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * Sets the value of the projectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectCode(String value) {
        this.projectCode = value;
    }

    /**
     * Gets the value of the projectInvestComponentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProjectInvestComponentId() {
        return projectInvestComponentId;
    }

    /**
     * Sets the value of the projectInvestComponentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProjectInvestComponentId(Long value) {
        this.projectInvestComponentId = value;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the projectType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProjectType() {
        return projectType;
    }

    /**
     * Sets the value of the projectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProjectType(Long value) {
        this.projectType = value;
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
     * Gets the value of the pstnNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPstnNum() {
        return pstnNum;
    }

    /**
     * Sets the value of the pstnNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPstnNum(Long value) {
        this.pstnNum = value;
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
     * Gets the value of the serviceProvideDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceProvideDate() {
        return serviceProvideDate;
    }

    /**
     * Sets the value of the serviceProvideDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceProvideDate(XMLGregorianCalendar value) {
        this.serviceProvideDate = value;
    }

    /**
     * Gets the value of the slowCause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlowCause() {
        return slowCause;
    }

    /**
     * Sets the value of the slowCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlowCause(String value) {
        this.slowCause = value;
    }

    /**
     * Gets the value of the startComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartComment() {
        return startComment;
    }

    /**
     * Sets the value of the startComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartComment(String value) {
        this.startComment = value;
    }

    /**
     * Gets the value of the startingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartingDate() {
        return startingDate;
    }

    /**
     * Sets the value of the startingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartingDate(XMLGregorianCalendar value) {
        this.startingDate = value;
    }

    /**
     * Gets the value of the stationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStationId() {
        return stationId;
    }

    /**
     * Sets the value of the stationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStationId(Long value) {
        this.stationId = value;
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
     * Gets the value of the statusId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStatusId() {
        return statusId;
    }

    /**
     * Sets the value of the statusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStatusId(Long value) {
        this.statusId = value;
    }

    /**
     * Gets the value of the subApConstrTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubApConstrTypeId() {
        return subApConstrTypeId;
    }

    /**
     * Sets the value of the subApConstrTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubApConstrTypeId(Long value) {
        this.subApConstrTypeId = value;
    }

    /**
     * Gets the value of the suggestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuggestDate() {
        return suggestDate;
    }

    /**
     * Sets the value of the suggestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuggestDate(XMLGregorianCalendar value) {
        this.suggestDate = value;
    }

    /**
     * Gets the value of the suggestorGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSuggestorGroupId() {
        return suggestorGroupId;
    }

    /**
     * Sets the value of the suggestorGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSuggestorGroupId(Long value) {
        this.suggestorGroupId = value;
    }

    /**
     * Gets the value of the suggestorId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSuggestorId() {
        return suggestorId;
    }

    /**
     * Sets the value of the suggestorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSuggestorId(Long value) {
        this.suggestorId = value;
    }

    /**
     * Gets the value of the suggestorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestorName() {
        return suggestorName;
    }

    /**
     * Sets the value of the suggestorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestorName(String value) {
        this.suggestorName = value;
    }

    /**
     * Gets the value of the superForm property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSuperForm() {
        return superForm;
    }

    /**
     * Sets the value of the superForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSuperForm(Long value) {
        this.superForm = value;
    }

    /**
     * Gets the value of the supervisionProgress property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupervisionProgress() {
        return supervisionProgress;
    }

    /**
     * Sets the value of the supervisionProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupervisionProgress(Long value) {
        this.supervisionProgress = value;
    }

    /**
     * Gets the value of the supervisorId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupervisorId() {
        return supervisorId;
    }

    /**
     * Sets the value of the supervisorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupervisorId(Long value) {
        this.supervisorId = value;
    }

    /**
     * Gets the value of the supervisorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorName() {
        return supervisorName;
    }

    /**
     * Sets the value of the supervisorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorName(String value) {
        this.supervisorName = value;
    }

    /**
     * Gets the value of the supervisorPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorPerson() {
        return supervisorPerson;
    }

    /**
     * Sets the value of the supervisorPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorPerson(String value) {
        this.supervisorPerson = value;
    }

    /**
     * Gets the value of the supervisorPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorPhone() {
        return supervisorPhone;
    }

    /**
     * Sets the value of the supervisorPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorPhone(String value) {
        this.supervisorPhone = value;
    }

    /**
     * Gets the value of the sysCreatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSysCreatedDate() {
        return sysCreatedDate;
    }

    /**
     * Sets the value of the sysCreatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSysCreatedDate(XMLGregorianCalendar value) {
        this.sysCreatedDate = value;
    }

    /**
     * Gets the value of the sysGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSysGroupId() {
        return sysGroupId;
    }

    /**
     * Sets the value of the sysGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSysGroupId(Long value) {
        this.sysGroupId = value;
    }

    /**
     * Gets the value of the sysUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSysUserId() {
        return sysUserId;
    }

    /**
     * Sets the value of the sysUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSysUserId(Long value) {
        this.sysUserId = value;
    }

    /**
     * Gets the value of the timePercent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimePercent() {
        return timePercent;
    }

    /**
     * Sets the value of the timePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimePercent(Long value) {
        this.timePercent = value;
    }

    /**
     * Gets the value of the totalValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalValue() {
        return totalValue;
    }

    /**
     * Sets the value of the totalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalValue(Double value) {
        this.totalValue = value;
    }

    /**
     * Gets the value of the totalValueStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalValueStr() {
        return totalValueStr;
    }

    /**
     * Sets the value of the totalValueStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalValueStr(String value) {
        this.totalValueStr = value;
    }

    /**
     * Gets the value of the valueAppCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValueAppCost() {
        return valueAppCost;
    }

    /**
     * Sets the value of the valueAppCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValueAppCost(Double value) {
        this.valueAppCost = value;
    }

    /**
     * Gets the value of the vibaFirst property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVibaFirst() {
        return vibaFirst;
    }

    /**
     * Sets the value of the vibaFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVibaFirst(Long value) {
        this.vibaFirst = value;
    }

}
