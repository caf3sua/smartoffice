
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
 * <p>Java class for cntContractBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cntContractBO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.qldtktts.viettel.com/}basicBO">
 *       &lt;sequence>
 *         &lt;element name="ableToChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ableToUpdate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="acceptCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acceptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actionContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agreementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agreementType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cancelDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cancelReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catPartners" type="{http://webservice.qldtktts.viettel.com/}catPartnersBO" minOccurs="0"/>
 *         &lt;element name="catServiceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="checkApproval" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cntFormPaymentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cntKindType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cntSubType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cntTotalCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cntTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compInCnt" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="componentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constructorCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractAgreement" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contractFrameId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contractName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractPriceFc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="creatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="currencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="depreciationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="discountUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="errRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="errRatioComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="finishContractDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="finishedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="foreignCurrentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="formsId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="goithauId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="groupPricePercentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="groupPriceShipmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="groupUsingId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="guaranteeDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="guaranteeDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="guaranteeMerNo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="guaranteeMerPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="importGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="importMerGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isApprove" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isExtended" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isExtension" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isLock" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isOld" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isPayment" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isProposal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isRealValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="liQuidateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="liquidateCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="liquidateReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listUnsynConfig" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loThauId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mapDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="merCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="merCostRemain" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="merDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="merType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneyDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="moneyDeliveryValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="originalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="otherCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="packageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="partnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payCurrencyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="payCurrencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="payModeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="payModeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="paymentExpire" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="paymentGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phaseOrder" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="poCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="projInvestProjectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="projectMngCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="proposalFacDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="proposalFacValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="provinceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ratioTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="realLiquidateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="realPayDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="realPayValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonDeny" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requireChangeMer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="revenueLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="signGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="signedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="signer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singerAccept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singerLiquidate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spareCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="statusId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="statusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supervisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sysGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tacSignDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="trackingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="updatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="useGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="warrantyBegin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="warrantyPartnerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="warrantyPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cntContractBO", propOrder = {
    "ableToChange",
    "ableToUpdate",
    "acceptCode",
    "acceptDate",
    "accountType",
    "actionContent",
    "agreementCode",
    "agreementType",
    "cancelDate",
    "cancelReason",
    "catPartners",
    "catServiceId",
    "checkApproval",
    "cntFormPaymentId",
    "cntKindType",
    "cntSubType",
    "cntTotalCost",
    "cntTypeId",
    "code",
    "compInCnt",
    "componentName",
    "constructorCost",
    "content",
    "contractAgreement",
    "contractFrameId",
    "contractId",
    "contractName",
    "contractPriceFc",
    "createdDate",
    "creatorId",
    "creatorName",
    "currencyId",
    "currencyName",
    "currencyRate",
    "depreciationDate",
    "description",
    "discount",
    "discountUnit",
    "duration",
    "errRatio",
    "errRatioComment",
    "expireDate",
    "finishContractDate",
    "finishedDate",
    "foreignCurrentId",
    "formsId",
    "goithauId",
    "groupPricePercentId",
    "groupPriceShipmentId",
    "groupUsingId",
    "guaranteeDateFrom",
    "guaranteeDateTo",
    "guaranteeMerNo",
    "guaranteeMerPercent",
    "importGroupId",
    "importMerGroupId",
    "isActive",
    "isApprove",
    "isExtended",
    "isExtension",
    "isLock",
    "isOld",
    "isPayment",
    "isProposal",
    "isRealValue",
    "isType",
    "liQuidateCode",
    "liquidateCost",
    "liquidateReason",
    "listUnsynConfig",
    "loThauId",
    "mapDate",
    "merCost",
    "merCostRemain",
    "merDescription",
    "merName",
    "merQuantity",
    "merType",
    "moneyDeliveryDate",
    "moneyDeliveryValue",
    "originalId",
    "otherCost",
    "packageCode",
    "packageName",
    "partnerId",
    "partnerName",
    "payCurrencyId",
    "payCurrencyName",
    "payDate",
    "payModeId",
    "payModeName",
    "payValue",
    "paymentExpire",
    "paymentGroupId",
    "phaseOrder",
    "poCode",
    "processGroupId",
    "projInvestProjectId",
    "projectId",
    "projectMngCost",
    "proposalFacDate",
    "proposalFacValue",
    "provinceId",
    "ratioTypeId",
    "realLiquidateDate",
    "realPayDate",
    "realPayValue",
    "reason",
    "reasonDeny",
    "requireChangeMer",
    "revenueLimit",
    "signGroupId",
    "signedDate",
    "signer",
    "singerAccept",
    "singerLiquidate",
    "spareCost",
    "statusId",
    "statusName",
    "supervisor",
    "sysGroupName",
    "tacSignDate",
    "taxRate",
    "totalValue",
    "trackingCode",
    "transRate",
    "updatedDate",
    "useGroupId",
    "warrantyBegin",
    "warrantyPartnerId",
    "warrantyPeriod"
})
public class CntContractBO
    extends BasicBO
{

    protected Boolean ableToChange;
    protected Long ableToUpdate;
    protected String acceptCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acceptDate;
    protected Long accountType;
    protected String actionContent;
    protected String agreementCode;
    protected Long agreementType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelDate;
    protected String cancelReason;
    protected CatPartnersBO catPartners;
    protected Long catServiceId;
    protected Long checkApproval;
    protected Long cntFormPaymentId;
    protected Long cntKindType;
    protected Long cntSubType;
    protected Double cntTotalCost;
    protected Long cntTypeId;
    protected String code;
    @XmlElement(nillable = true)
    protected List<Object> compInCnt;
    protected String componentName;
    protected Double constructorCost;
    protected String content;
    protected Long contractAgreement;
    protected Long contractFrameId;
    protected Long contractId;
    protected String contractName;
    protected Double contractPriceFc;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected Long creatorId;
    protected String creatorName;
    protected Long currencyId;
    protected String currencyName;
    protected Double currencyRate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depreciationDate;
    protected String description;
    protected Double discount;
    protected Long discountUnit;
    protected Long duration;
    protected Double errRatio;
    protected String errRatioComment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expireDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishContractDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishedDate;
    protected Long foreignCurrentId;
    protected Long formsId;
    protected Long goithauId;
    protected Long groupPricePercentId;
    protected Long groupPriceShipmentId;
    protected Long groupUsingId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar guaranteeDateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar guaranteeDateTo;
    protected Double guaranteeMerNo;
    protected Double guaranteeMerPercent;
    protected Long importGroupId;
    protected Long importMerGroupId;
    protected Long isActive;
    protected Long isApprove;
    protected Long isExtended;
    protected Long isExtension;
    protected Long isLock;
    protected Long isOld;
    protected Long isPayment;
    protected Long isProposal;
    protected Long isRealValue;
    protected Long isType;
    protected String liQuidateCode;
    protected Double liquidateCost;
    protected String liquidateReason;
    @XmlElement(nillable = true)
    protected List<Object> listUnsynConfig;
    protected Long loThauId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mapDate;
    protected Double merCost;
    protected Double merCostRemain;
    protected String merDescription;
    protected String merName;
    protected Double merQuantity;
    protected String merType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar moneyDeliveryDate;
    protected Double moneyDeliveryValue;
    protected Long originalId;
    protected Double otherCost;
    protected String packageCode;
    protected String packageName;
    protected Long partnerId;
    protected String partnerName;
    protected Long payCurrencyId;
    protected String payCurrencyName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDate;
    protected Long payModeId;
    protected String payModeName;
    protected Double payValue;
    protected Long paymentExpire;
    protected Long paymentGroupId;
    protected Long phaseOrder;
    protected String poCode;
    protected Long processGroupId;
    protected Long projInvestProjectId;
    protected Long projectId;
    protected Double projectMngCost;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar proposalFacDate;
    protected Double proposalFacValue;
    protected Long provinceId;
    protected Long ratioTypeId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar realLiquidateDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar realPayDate;
    protected Double realPayValue;
    protected String reason;
    protected String reasonDeny;
    protected Long requireChangeMer;
    protected Double revenueLimit;
    protected Long signGroupId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signedDate;
    protected String signer;
    protected String singerAccept;
    protected String singerLiquidate;
    protected Double spareCost;
    protected Long statusId;
    protected String statusName;
    protected String supervisor;
    protected String sysGroupName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tacSignDate;
    protected Double taxRate;
    protected Double totalValue;
    protected String trackingCode;
    protected Double transRate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;
    protected Long useGroupId;
    protected Long warrantyBegin;
    protected Long warrantyPartnerId;
    protected Long warrantyPeriod;

    /**
     * Gets the value of the ableToChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAbleToChange() {
        return ableToChange;
    }

    /**
     * Sets the value of the ableToChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbleToChange(Boolean value) {
        this.ableToChange = value;
    }

    /**
     * Gets the value of the ableToUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAbleToUpdate() {
        return ableToUpdate;
    }

    /**
     * Sets the value of the ableToUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAbleToUpdate(Long value) {
        this.ableToUpdate = value;
    }

    /**
     * Gets the value of the acceptCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptCode() {
        return acceptCode;
    }

    /**
     * Sets the value of the acceptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptCode(String value) {
        this.acceptCode = value;
    }

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
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountType(Long value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the actionContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionContent() {
        return actionContent;
    }

    /**
     * Sets the value of the actionContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionContent(String value) {
        this.actionContent = value;
    }

    /**
     * Gets the value of the agreementCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementCode() {
        return agreementCode;
    }

    /**
     * Sets the value of the agreementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementCode(String value) {
        this.agreementCode = value;
    }

    /**
     * Gets the value of the agreementType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAgreementType() {
        return agreementType;
    }

    /**
     * Sets the value of the agreementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAgreementType(Long value) {
        this.agreementType = value;
    }

    /**
     * Gets the value of the cancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelDate() {
        return cancelDate;
    }

    /**
     * Sets the value of the cancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelDate(XMLGregorianCalendar value) {
        this.cancelDate = value;
    }

    /**
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReason(String value) {
        this.cancelReason = value;
    }

    /**
     * Gets the value of the catPartners property.
     * 
     * @return
     *     possible object is
     *     {@link CatPartnersBO }
     *     
     */
    public CatPartnersBO getCatPartners() {
        return catPartners;
    }

    /**
     * Sets the value of the catPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatPartnersBO }
     *     
     */
    public void setCatPartners(CatPartnersBO value) {
        this.catPartners = value;
    }

    /**
     * Gets the value of the catServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCatServiceId() {
        return catServiceId;
    }

    /**
     * Sets the value of the catServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCatServiceId(Long value) {
        this.catServiceId = value;
    }

    /**
     * Gets the value of the checkApproval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCheckApproval() {
        return checkApproval;
    }

    /**
     * Sets the value of the checkApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCheckApproval(Long value) {
        this.checkApproval = value;
    }

    /**
     * Gets the value of the cntFormPaymentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCntFormPaymentId() {
        return cntFormPaymentId;
    }

    /**
     * Sets the value of the cntFormPaymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCntFormPaymentId(Long value) {
        this.cntFormPaymentId = value;
    }

    /**
     * Gets the value of the cntKindType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCntKindType() {
        return cntKindType;
    }

    /**
     * Sets the value of the cntKindType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCntKindType(Long value) {
        this.cntKindType = value;
    }

    /**
     * Gets the value of the cntSubType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCntSubType() {
        return cntSubType;
    }

    /**
     * Sets the value of the cntSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCntSubType(Long value) {
        this.cntSubType = value;
    }

    /**
     * Gets the value of the cntTotalCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCntTotalCost() {
        return cntTotalCost;
    }

    /**
     * Sets the value of the cntTotalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCntTotalCost(Double value) {
        this.cntTotalCost = value;
    }

    /**
     * Gets the value of the cntTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCntTypeId() {
        return cntTypeId;
    }

    /**
     * Sets the value of the cntTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCntTypeId(Long value) {
        this.cntTypeId = value;
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
     * Gets the value of the compInCnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compInCnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompInCnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getCompInCnt() {
        if (compInCnt == null) {
            compInCnt = new ArrayList<Object>();
        }
        return this.compInCnt;
    }

    /**
     * Gets the value of the componentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentName() {
        return componentName;
    }

    /**
     * Sets the value of the componentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentName(String value) {
        this.componentName = value;
    }

    /**
     * Gets the value of the constructorCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConstructorCost() {
        return constructorCost;
    }

    /**
     * Sets the value of the constructorCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConstructorCost(Double value) {
        this.constructorCost = value;
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
     * Gets the value of the contractAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractAgreement() {
        return contractAgreement;
    }

    /**
     * Sets the value of the contractAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractAgreement(Long value) {
        this.contractAgreement = value;
    }

    /**
     * Gets the value of the contractFrameId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractFrameId() {
        return contractFrameId;
    }

    /**
     * Sets the value of the contractFrameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractFrameId(Long value) {
        this.contractFrameId = value;
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
     * Gets the value of the contractName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * Sets the value of the contractName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractName(String value) {
        this.contractName = value;
    }

    /**
     * Gets the value of the contractPriceFc property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getContractPriceFc() {
        return contractPriceFc;
    }

    /**
     * Sets the value of the contractPriceFc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setContractPriceFc(Double value) {
        this.contractPriceFc = value;
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
     * Gets the value of the currencyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrencyId() {
        return currencyId;
    }

    /**
     * Sets the value of the currencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrencyId(Long value) {
        this.currencyId = value;
    }

    /**
     * Gets the value of the currencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /**
     * Sets the value of the currencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyName(String value) {
        this.currencyName = value;
    }

    /**
     * Gets the value of the currencyRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrencyRate() {
        return currencyRate;
    }

    /**
     * Sets the value of the currencyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrencyRate(Double value) {
        this.currencyRate = value;
    }

    /**
     * Gets the value of the depreciationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepreciationDate() {
        return depreciationDate;
    }

    /**
     * Sets the value of the depreciationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepreciationDate(XMLGregorianCalendar value) {
        this.depreciationDate = value;
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
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscount(Double value) {
        this.discount = value;
    }

    /**
     * Gets the value of the discountUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiscountUnit() {
        return discountUnit;
    }

    /**
     * Sets the value of the discountUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiscountUnit(Long value) {
        this.discountUnit = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDuration(Long value) {
        this.duration = value;
    }

    /**
     * Gets the value of the errRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getErrRatio() {
        return errRatio;
    }

    /**
     * Sets the value of the errRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setErrRatio(Double value) {
        this.errRatio = value;
    }

    /**
     * Gets the value of the errRatioComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrRatioComment() {
        return errRatioComment;
    }

    /**
     * Sets the value of the errRatioComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrRatioComment(String value) {
        this.errRatioComment = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the finishContractDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinishContractDate() {
        return finishContractDate;
    }

    /**
     * Sets the value of the finishContractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinishContractDate(XMLGregorianCalendar value) {
        this.finishContractDate = value;
    }

    /**
     * Gets the value of the finishedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinishedDate() {
        return finishedDate;
    }

    /**
     * Sets the value of the finishedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinishedDate(XMLGregorianCalendar value) {
        this.finishedDate = value;
    }

    /**
     * Gets the value of the foreignCurrentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getForeignCurrentId() {
        return foreignCurrentId;
    }

    /**
     * Sets the value of the foreignCurrentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setForeignCurrentId(Long value) {
        this.foreignCurrentId = value;
    }

    /**
     * Gets the value of the formsId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFormsId() {
        return formsId;
    }

    /**
     * Sets the value of the formsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFormsId(Long value) {
        this.formsId = value;
    }

    /**
     * Gets the value of the goithauId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGoithauId() {
        return goithauId;
    }

    /**
     * Sets the value of the goithauId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGoithauId(Long value) {
        this.goithauId = value;
    }

    /**
     * Gets the value of the groupPricePercentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupPricePercentId() {
        return groupPricePercentId;
    }

    /**
     * Sets the value of the groupPricePercentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupPricePercentId(Long value) {
        this.groupPricePercentId = value;
    }

    /**
     * Gets the value of the groupPriceShipmentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupPriceShipmentId() {
        return groupPriceShipmentId;
    }

    /**
     * Sets the value of the groupPriceShipmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupPriceShipmentId(Long value) {
        this.groupPriceShipmentId = value;
    }

    /**
     * Gets the value of the groupUsingId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupUsingId() {
        return groupUsingId;
    }

    /**
     * Sets the value of the groupUsingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupUsingId(Long value) {
        this.groupUsingId = value;
    }

    /**
     * Gets the value of the guaranteeDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGuaranteeDateFrom() {
        return guaranteeDateFrom;
    }

    /**
     * Sets the value of the guaranteeDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGuaranteeDateFrom(XMLGregorianCalendar value) {
        this.guaranteeDateFrom = value;
    }

    /**
     * Gets the value of the guaranteeDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGuaranteeDateTo() {
        return guaranteeDateTo;
    }

    /**
     * Sets the value of the guaranteeDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGuaranteeDateTo(XMLGregorianCalendar value) {
        this.guaranteeDateTo = value;
    }

    /**
     * Gets the value of the guaranteeMerNo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGuaranteeMerNo() {
        return guaranteeMerNo;
    }

    /**
     * Sets the value of the guaranteeMerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGuaranteeMerNo(Double value) {
        this.guaranteeMerNo = value;
    }

    /**
     * Gets the value of the guaranteeMerPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGuaranteeMerPercent() {
        return guaranteeMerPercent;
    }

    /**
     * Sets the value of the guaranteeMerPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGuaranteeMerPercent(Double value) {
        this.guaranteeMerPercent = value;
    }

    /**
     * Gets the value of the importGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImportGroupId() {
        return importGroupId;
    }

    /**
     * Sets the value of the importGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImportGroupId(Long value) {
        this.importGroupId = value;
    }

    /**
     * Gets the value of the importMerGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImportMerGroupId() {
        return importMerGroupId;
    }

    /**
     * Sets the value of the importMerGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImportMerGroupId(Long value) {
        this.importMerGroupId = value;
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
     * Gets the value of the isApprove property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsApprove() {
        return isApprove;
    }

    /**
     * Sets the value of the isApprove property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsApprove(Long value) {
        this.isApprove = value;
    }

    /**
     * Gets the value of the isExtended property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsExtended() {
        return isExtended;
    }

    /**
     * Sets the value of the isExtended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsExtended(Long value) {
        this.isExtended = value;
    }

    /**
     * Gets the value of the isExtension property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsExtension() {
        return isExtension;
    }

    /**
     * Sets the value of the isExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsExtension(Long value) {
        this.isExtension = value;
    }

    /**
     * Gets the value of the isLock property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsLock() {
        return isLock;
    }

    /**
     * Sets the value of the isLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsLock(Long value) {
        this.isLock = value;
    }

    /**
     * Gets the value of the isOld property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsOld() {
        return isOld;
    }

    /**
     * Sets the value of the isOld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsOld(Long value) {
        this.isOld = value;
    }

    /**
     * Gets the value of the isPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsPayment() {
        return isPayment;
    }

    /**
     * Sets the value of the isPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsPayment(Long value) {
        this.isPayment = value;
    }

    /**
     * Gets the value of the isProposal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsProposal() {
        return isProposal;
    }

    /**
     * Sets the value of the isProposal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsProposal(Long value) {
        this.isProposal = value;
    }

    /**
     * Gets the value of the isRealValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsRealValue() {
        return isRealValue;
    }

    /**
     * Sets the value of the isRealValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsRealValue(Long value) {
        this.isRealValue = value;
    }

    /**
     * Gets the value of the isType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsType() {
        return isType;
    }

    /**
     * Sets the value of the isType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsType(Long value) {
        this.isType = value;
    }

    /**
     * Gets the value of the liQuidateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiQuidateCode() {
        return liQuidateCode;
    }

    /**
     * Sets the value of the liQuidateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiQuidateCode(String value) {
        this.liQuidateCode = value;
    }

    /**
     * Gets the value of the liquidateCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLiquidateCost() {
        return liquidateCost;
    }

    /**
     * Sets the value of the liquidateCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLiquidateCost(Double value) {
        this.liquidateCost = value;
    }

    /**
     * Gets the value of the liquidateReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiquidateReason() {
        return liquidateReason;
    }

    /**
     * Sets the value of the liquidateReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiquidateReason(String value) {
        this.liquidateReason = value;
    }

    /**
     * Gets the value of the listUnsynConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listUnsynConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListUnsynConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getListUnsynConfig() {
        if (listUnsynConfig == null) {
            listUnsynConfig = new ArrayList<Object>();
        }
        return this.listUnsynConfig;
    }

    /**
     * Gets the value of the loThauId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLoThauId() {
        return loThauId;
    }

    /**
     * Sets the value of the loThauId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLoThauId(Long value) {
        this.loThauId = value;
    }

    /**
     * Gets the value of the mapDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMapDate() {
        return mapDate;
    }

    /**
     * Sets the value of the mapDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMapDate(XMLGregorianCalendar value) {
        this.mapDate = value;
    }

    /**
     * Gets the value of the merCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMerCost() {
        return merCost;
    }

    /**
     * Sets the value of the merCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMerCost(Double value) {
        this.merCost = value;
    }

    /**
     * Gets the value of the merCostRemain property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMerCostRemain() {
        return merCostRemain;
    }

    /**
     * Sets the value of the merCostRemain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMerCostRemain(Double value) {
        this.merCostRemain = value;
    }

    /**
     * Gets the value of the merDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerDescription() {
        return merDescription;
    }

    /**
     * Sets the value of the merDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerDescription(String value) {
        this.merDescription = value;
    }

    /**
     * Gets the value of the merName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerName() {
        return merName;
    }

    /**
     * Sets the value of the merName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerName(String value) {
        this.merName = value;
    }

    /**
     * Gets the value of the merQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMerQuantity() {
        return merQuantity;
    }

    /**
     * Sets the value of the merQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMerQuantity(Double value) {
        this.merQuantity = value;
    }

    /**
     * Gets the value of the merType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerType() {
        return merType;
    }

    /**
     * Sets the value of the merType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerType(String value) {
        this.merType = value;
    }

    /**
     * Gets the value of the moneyDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMoneyDeliveryDate() {
        return moneyDeliveryDate;
    }

    /**
     * Sets the value of the moneyDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMoneyDeliveryDate(XMLGregorianCalendar value) {
        this.moneyDeliveryDate = value;
    }

    /**
     * Gets the value of the moneyDeliveryValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMoneyDeliveryValue() {
        return moneyDeliveryValue;
    }

    /**
     * Sets the value of the moneyDeliveryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMoneyDeliveryValue(Double value) {
        this.moneyDeliveryValue = value;
    }

    /**
     * Gets the value of the originalId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginalId() {
        return originalId;
    }

    /**
     * Sets the value of the originalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginalId(Long value) {
        this.originalId = value;
    }

    /**
     * Gets the value of the otherCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOtherCost() {
        return otherCost;
    }

    /**
     * Sets the value of the otherCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOtherCost(Double value) {
        this.otherCost = value;
    }

    /**
     * Gets the value of the packageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageCode() {
        return packageCode;
    }

    /**
     * Sets the value of the packageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageCode(String value) {
        this.packageCode = value;
    }

    /**
     * Gets the value of the packageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * Sets the value of the packageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageName(String value) {
        this.packageName = value;
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
     * Gets the value of the payCurrencyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayCurrencyId() {
        return payCurrencyId;
    }

    /**
     * Sets the value of the payCurrencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayCurrencyId(Long value) {
        this.payCurrencyId = value;
    }

    /**
     * Gets the value of the payCurrencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayCurrencyName() {
        return payCurrencyName;
    }

    /**
     * Sets the value of the payCurrencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayCurrencyName(String value) {
        this.payCurrencyName = value;
    }

    /**
     * Gets the value of the payDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDate() {
        return payDate;
    }

    /**
     * Sets the value of the payDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDate(XMLGregorianCalendar value) {
        this.payDate = value;
    }

    /**
     * Gets the value of the payModeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayModeId() {
        return payModeId;
    }

    /**
     * Sets the value of the payModeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayModeId(Long value) {
        this.payModeId = value;
    }

    /**
     * Gets the value of the payModeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayModeName() {
        return payModeName;
    }

    /**
     * Sets the value of the payModeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayModeName(String value) {
        this.payModeName = value;
    }

    /**
     * Gets the value of the payValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPayValue() {
        return payValue;
    }

    /**
     * Sets the value of the payValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPayValue(Double value) {
        this.payValue = value;
    }

    /**
     * Gets the value of the paymentExpire property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentExpire() {
        return paymentExpire;
    }

    /**
     * Sets the value of the paymentExpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentExpire(Long value) {
        this.paymentExpire = value;
    }

    /**
     * Gets the value of the paymentGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentGroupId() {
        return paymentGroupId;
    }

    /**
     * Sets the value of the paymentGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentGroupId(Long value) {
        this.paymentGroupId = value;
    }

    /**
     * Gets the value of the phaseOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPhaseOrder() {
        return phaseOrder;
    }

    /**
     * Sets the value of the phaseOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPhaseOrder(Long value) {
        this.phaseOrder = value;
    }

    /**
     * Gets the value of the poCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoCode() {
        return poCode;
    }

    /**
     * Sets the value of the poCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoCode(String value) {
        this.poCode = value;
    }

    /**
     * Gets the value of the processGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProcessGroupId() {
        return processGroupId;
    }

    /**
     * Sets the value of the processGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProcessGroupId(Long value) {
        this.processGroupId = value;
    }

    /**
     * Gets the value of the projInvestProjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProjInvestProjectId() {
        return projInvestProjectId;
    }

    /**
     * Sets the value of the projInvestProjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProjInvestProjectId(Long value) {
        this.projInvestProjectId = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProjectId(Long value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the projectMngCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProjectMngCost() {
        return projectMngCost;
    }

    /**
     * Sets the value of the projectMngCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProjectMngCost(Double value) {
        this.projectMngCost = value;
    }

    /**
     * Gets the value of the proposalFacDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProposalFacDate() {
        return proposalFacDate;
    }

    /**
     * Sets the value of the proposalFacDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProposalFacDate(XMLGregorianCalendar value) {
        this.proposalFacDate = value;
    }

    /**
     * Gets the value of the proposalFacValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProposalFacValue() {
        return proposalFacValue;
    }

    /**
     * Sets the value of the proposalFacValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProposalFacValue(Double value) {
        this.proposalFacValue = value;
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
     * Gets the value of the ratioTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRatioTypeId() {
        return ratioTypeId;
    }

    /**
     * Sets the value of the ratioTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRatioTypeId(Long value) {
        this.ratioTypeId = value;
    }

    /**
     * Gets the value of the realLiquidateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRealLiquidateDate() {
        return realLiquidateDate;
    }

    /**
     * Sets the value of the realLiquidateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRealLiquidateDate(XMLGregorianCalendar value) {
        this.realLiquidateDate = value;
    }

    /**
     * Gets the value of the realPayDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRealPayDate() {
        return realPayDate;
    }

    /**
     * Sets the value of the realPayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRealPayDate(XMLGregorianCalendar value) {
        this.realPayDate = value;
    }

    /**
     * Gets the value of the realPayValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRealPayValue() {
        return realPayValue;
    }

    /**
     * Sets the value of the realPayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRealPayValue(Double value) {
        this.realPayValue = value;
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
     * Gets the value of the reasonDeny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonDeny() {
        return reasonDeny;
    }

    /**
     * Sets the value of the reasonDeny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonDeny(String value) {
        this.reasonDeny = value;
    }

    /**
     * Gets the value of the requireChangeMer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequireChangeMer() {
        return requireChangeMer;
    }

    /**
     * Sets the value of the requireChangeMer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequireChangeMer(Long value) {
        this.requireChangeMer = value;
    }

    /**
     * Gets the value of the revenueLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRevenueLimit() {
        return revenueLimit;
    }

    /**
     * Sets the value of the revenueLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRevenueLimit(Double value) {
        this.revenueLimit = value;
    }

    /**
     * Gets the value of the signGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSignGroupId() {
        return signGroupId;
    }

    /**
     * Sets the value of the signGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSignGroupId(Long value) {
        this.signGroupId = value;
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
     * Gets the value of the signer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigner() {
        return signer;
    }

    /**
     * Sets the value of the signer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigner(String value) {
        this.signer = value;
    }

    /**
     * Gets the value of the singerAccept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingerAccept() {
        return singerAccept;
    }

    /**
     * Sets the value of the singerAccept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingerAccept(String value) {
        this.singerAccept = value;
    }

    /**
     * Gets the value of the singerLiquidate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingerLiquidate() {
        return singerLiquidate;
    }

    /**
     * Sets the value of the singerLiquidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingerLiquidate(String value) {
        this.singerLiquidate = value;
    }

    /**
     * Gets the value of the spareCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpareCost() {
        return spareCost;
    }

    /**
     * Sets the value of the spareCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpareCost(Double value) {
        this.spareCost = value;
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
     * Gets the value of the supervisor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisor() {
        return supervisor;
    }

    /**
     * Sets the value of the supervisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisor(String value) {
        this.supervisor = value;
    }

    /**
     * Gets the value of the sysGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysGroupName() {
        return sysGroupName;
    }

    /**
     * Sets the value of the sysGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysGroupName(String value) {
        this.sysGroupName = value;
    }

    /**
     * Gets the value of the tacSignDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTacSignDate() {
        return tacSignDate;
    }

    /**
     * Sets the value of the tacSignDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTacSignDate(XMLGregorianCalendar value) {
        this.tacSignDate = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxRate(Double value) {
        this.taxRate = value;
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
     * Gets the value of the trackingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingCode() {
        return trackingCode;
    }

    /**
     * Sets the value of the trackingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingCode(String value) {
        this.trackingCode = value;
    }

    /**
     * Gets the value of the transRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTransRate() {
        return transRate;
    }

    /**
     * Sets the value of the transRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTransRate(Double value) {
        this.transRate = value;
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
     * Gets the value of the useGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUseGroupId() {
        return useGroupId;
    }

    /**
     * Sets the value of the useGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUseGroupId(Long value) {
        this.useGroupId = value;
    }

    /**
     * Gets the value of the warrantyBegin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWarrantyBegin() {
        return warrantyBegin;
    }

    /**
     * Sets the value of the warrantyBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWarrantyBegin(Long value) {
        this.warrantyBegin = value;
    }

    /**
     * Gets the value of the warrantyPartnerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWarrantyPartnerId() {
        return warrantyPartnerId;
    }

    /**
     * Sets the value of the warrantyPartnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWarrantyPartnerId(Long value) {
        this.warrantyPartnerId = value;
    }

    /**
     * Gets the value of the warrantyPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWarrantyPeriod() {
        return warrantyPeriod;
    }

    /**
     * Sets the value of the warrantyPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWarrantyPeriod(Long value) {
        this.warrantyPeriod = value;
    }

}
