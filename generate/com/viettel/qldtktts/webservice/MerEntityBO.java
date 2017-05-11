
package com.viettel.qldtktts.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * <p>Java class for merEntityBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="merEntityBO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.qldtktts.viettel.com/}basicBO">
 *       &lt;sequence>
 *         &lt;element name="acceptedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addedPart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amortStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="amountRemain" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="amountReq" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="amountUse" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="assetPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="boxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catEmployeeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="catMerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catMerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catMerchandise" type="{http://webservice.qldtktts.viettel.com/}catMerchandiseBO" minOccurs="0"/>
 *         &lt;element name="catStationBO" type="{http://webservice.qldtktts.viettel.com/}catStationBO" minOccurs="0"/>
 *         &lt;element name="catWarehouse" type="{http://webservice.qldtktts.viettel.com/}catWarehouseBO" minOccurs="0"/>
 *         &lt;element name="causeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changeAction" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="colorAlert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comboId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="configName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constrtCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constructionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contractCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="countConfirm" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="countExport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countHandOver" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="countInManageReq" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="countInWarehouse" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="countMaintain" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="countMerEntityAtStation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="countNode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="countOfDeliveryNote" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="countOfExpCmd" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="countOfExpReq" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="countOfImpCmd" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="countOfImpReq" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="countOfReceiptNote" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="countRemain" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="countUse" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deliveryNoteCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryNoteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="depreciationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doubleUnitPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="entityTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="executeDateBDSC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="executeDateBdsc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="executeDateKDHC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="executeDateKdhc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="executeMonthTimeUsed" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="expType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="expiredWarrantyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="failDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="failReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="groupBO" type="{http://webservice.qldtktts.viettel.com/}sysGroupBO" minOccurs="0"/>
 *         &lt;element name="groupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupNameExist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hanOverId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="handCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="handleWay" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="hierarchicalStt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="historyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="impType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="importDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="importStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isAppo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isCheckImp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isCheckedKcs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isCntAssigned" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isConfigMer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isContractAssigned" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isDevice" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isExpense" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isInventory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isLock" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isMapped" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isMerchandise" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isOk" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isOriginal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isProcessCompare" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isRecvGroupConfirm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isReject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isReqGroupConfirm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isSameSN" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isTemp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isVisible" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isWarranty" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isvalid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="keySearch" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="latestExportDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="latestImportDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="latestMaintainDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="latestMaintainDateBk" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lifeTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="limitCount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="madeYear" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="managerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mapNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="markNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxUsedTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="merCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merEntityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="merId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="merInCntType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="merModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merRootId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="merWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="merchandiseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minuteHandOverCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minuteHandOverDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="minuteHandOverId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="minuteHandoverCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneySum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="nameType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nationalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newSerial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextMaintainDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nextMaintainDateBk" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nodeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="objectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldContractId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="oldMerEntityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="oldMerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="oldPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldSerial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ordinal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="originalPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="packageId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="packageNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentConfigId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="parentSerial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partNumberOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partNumberRequired" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="partnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="percentQuality" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="plCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plImportId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="plIndId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="postRepairNoteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="preRepairNoteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="price2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="privateManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCompany" type="{http://webservice.qldtktts.viettel.com/}productCompanyBO" minOccurs="0"/>
 *         &lt;element name="productNational" type="{http://webservice.qldtktts.viettel.com/}productNationalBO" minOccurs="0"/>
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="propertyDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proposalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="provinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provinceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="quality" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="realSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recvGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replaceFor" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="replaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reqGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="restTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="restValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNumberOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNumberParent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialRequired" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="shipmentNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="splitMer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="stationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stationCodeExist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stationHouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="statusCheckReq" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="statusId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="statusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sumCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sumUnitPrice" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="twinMerEntityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="typeDefineHis" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="typeOutSide" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="typeStationMaintain" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="typeStationMaitain" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="unitPriceDomestic" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="unitPriceExport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitPriceForeign" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="upgradeParentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="useGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="usedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="usedDateExport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usedGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vndUnitPrice" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="warehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warehouseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="warehouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warehouseNameExist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warrantPartnerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="warrantyPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="whPosCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="whPosId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="whPosName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="withdrawPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="workItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workItemID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "merEntityBO", propOrder = {
    "acceptedDate",
    "accountType",
    "actionDescription",
    "actionTime",
    "addedPart",
    "address",
    "amortStartDate",
    "amountRemain",
    "amountReq",
    "amountUse",
    "assetPrice",
    "boxNo",
    "catEmployeeId",
    "catMerCode",
    "catMerName",
    "catMerchandise",
    "catStationBO",
    "catWarehouse",
    "causeName",
    "changeAction",
    "colorAlert",
    "comboId",
    "companyId",
    "companyName",
    "configName",
    "constrtCode",
    "constructionId",
    "contractCode",
    "contractId",
    "count",
    "countConfirm",
    "countExport",
    "countHandOver",
    "countInManageReq",
    "countInWarehouse",
    "countMaintain",
    "countMerEntityAtStation",
    "countNode",
    "countOfDeliveryNote",
    "countOfExpCmd",
    "countOfExpReq",
    "countOfImpCmd",
    "countOfImpReq",
    "countOfReceiptNote",
    "countRemain",
    "countUse",
    "countryName",
    "createdDate",
    "deliveryNoteCode",
    "deliveryNoteId",
    "depreciationDate",
    "description",
    "deviceType",
    "doubleUnitPrice",
    "email",
    "employeeCode",
    "employeeName",
    "entityType",
    "entityTypeName",
    "executeDateBDSC",
    "executeDateBdsc",
    "executeDateKDHC",
    "executeDateKdhc",
    "executeMonthTimeUsed",
    "expType",
    "expiredWarrantyDate",
    "failDate",
    "failReason",
    "fileId",
    "groupBO",
    "groupCode",
    "groupId",
    "groupName",
    "groupNameExist",
    "hanOverId",
    "handCode",
    "handleWay",
    "hierarchicalStt",
    "historyId",
    "impType",
    "importDate",
    "importStatus",
    "isAppo",
    "isCheckImp",
    "isCheckedKcs",
    "isCntAssigned",
    "isConfigMer",
    "isContractAssigned",
    "isDevice",
    "isExpense",
    "isInventory",
    "isLock",
    "isMapped",
    "isMerchandise",
    "isOk",
    "isOriginal",
    "isProcessCompare",
    "isRecvGroupConfirm",
    "isReject",
    "isReqGroupConfirm",
    "isSameSN",
    "isTemp",
    "isVisible",
    "isWarranty",
    "isvalid",
    "keySearch",
    "latestExportDate",
    "latestImportDate",
    "latestMaintainDate",
    "latestMaintainDateBk",
    "lifeTime",
    "limitCount",
    "madeYear",
    "managerName",
    "mapNo",
    "markNum",
    "maxUsedTime",
    "merCode",
    "merEntityId",
    "merId",
    "merInCntType",
    "merModel",
    "merName",
    "merRootId",
    "merWeight",
    "merchandiseName",
    "minuteHandOverCode",
    "minuteHandOverDate",
    "minuteHandOverId",
    "minuteHandoverCode",
    "modifyCode",
    "moneySum",
    "nameType",
    "nationalId",
    "nationalName",
    "newCode",
    "newSerial",
    "nextMaintainDate",
    "nextMaintainDateBk",
    "nodeCode",
    "nodeId",
    "objectCode",
    "oldCode",
    "oldContractId",
    "oldMerEntityId",
    "oldMerId",
    "oldPartNumber",
    "oldSerial",
    "oldSerialNumber",
    "ordinal",
    "originalPrice",
    "packageId",
    "packageNumber",
    "parentConfigId",
    "parentId",
    "parentSerial",
    "partNumber",
    "partNumberOwner",
    "partNumberRequired",
    "partnerName",
    "path",
    "percentQuality",
    "plCode",
    "plImportId",
    "plIndId",
    "postRepairNoteId",
    "preRepairNoteId",
    "price2",
    "privateManagerName",
    "processCode",
    "processName",
    "productCompany",
    "productNational",
    "projectId",
    "propertyDetail",
    "proposalId",
    "provinceCode",
    "provinceName",
    "qty",
    "quality",
    "realSerialNumber",
    "recvGroupCode",
    "replaceFor",
    "replaceName",
    "reqGroupCode",
    "restTime",
    "restValue",
    "serialNo",
    "serialNumber",
    "serialNumberOwner",
    "serialNumberParent",
    "serialRequired",
    "shipmentNo",
    "sourceId",
    "splitMer",
    "stationCode",
    "stationCodeExist",
    "stationHouseCode",
    "stationId",
    "statusCheckReq",
    "statusId",
    "statusName",
    "stt",
    "sumCount",
    "sumUnitPrice",
    "taxRate",
    "tel",
    "totalValue",
    "twinMerEntityId",
    "typeDefineHis",
    "typeOutSide",
    "typeStationMaintain",
    "typeStationMaitain",
    "unitId",
    "unitName",
    "unitPrice",
    "unitPriceDomestic",
    "unitPriceExport",
    "unitPriceForeign",
    "upgradeParentId",
    "useGroupId",
    "usedDate",
    "usedDateExport",
    "usedGroup",
    "userId",
    "userName",
    "vndUnitPrice",
    "warehouseCode",
    "warehouseId",
    "warehouseName",
    "warehouseNameExist",
    "warrantPartnerId",
    "warrantyPeriod",
    "whPosCode",
    "whPosId",
    "whPosName",
    "withdrawPrice",
    "workItemCode",
    "workItemID",
    "workItemId"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MerEntityBO
    extends BasicBO
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acceptedDate;
    protected Long accountType;
    protected String actionDescription;
    protected String actionTime;
    protected String addedPart;
    protected String address;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar amortStartDate;
    protected Double amountRemain;
    protected Double amountReq;
    protected Double amountUse;
    protected Double assetPrice;
    protected String boxNo;
    protected Long catEmployeeId;
    protected String catMerCode;
    protected String catMerName;
    protected CatMerchandiseBO catMerchandise;
    protected CatStationBO catStationBO;
    protected CatWarehouseBO catWarehouse;
    protected String causeName;
    protected Long changeAction;
    protected String colorAlert;
    protected Long comboId;
    protected Long companyId;
    protected String companyName;
    protected String configName;
    protected String constrtCode;
    protected Long constructionId;
    protected String contractCode;
    protected Long contractId;
    protected Double count;
    protected Double countConfirm;
    protected String countExport;
    protected Double countHandOver;
    protected Double countInManageReq;
    protected Double countInWarehouse;
    protected Long countMaintain;
    protected Double countMerEntityAtStation;
    protected Long countNode;
    protected Double countOfDeliveryNote;
    protected Double countOfExpCmd;
    protected Double countOfExpReq;
    protected Double countOfImpCmd;
    protected Double countOfImpReq;
    protected Double countOfReceiptNote;
    protected Double countRemain;
    protected Double countUse;
    protected String countryName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected String deliveryNoteCode;
    protected Long deliveryNoteId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depreciationDate;
    protected String description;
    protected String deviceType;
    protected Double doubleUnitPrice;
    protected String email;
    protected String employeeCode;
    protected String employeeName;
    protected Long entityType;
    protected String entityTypeName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar executeDateBDSC;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar executeDateBdsc;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar executeDateKDHC;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar executeDateKdhc;
    protected Long executeMonthTimeUsed;
    protected Long expType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiredWarrantyDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar failDate;
    protected String failReason;
    protected Long fileId;
    protected SysGroupBO groupBO;
    protected String groupCode;
    protected Long groupId;
    protected String groupName;
    protected String groupNameExist;
    protected Long hanOverId;
    protected String handCode;
    protected Long handleWay;
    protected String hierarchicalStt;
    protected Long historyId;
    protected Long impType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar importDate;
    protected String importStatus;
    protected Long isAppo;
    protected Long isCheckImp;
    protected Long isCheckedKcs;
    protected Long isCntAssigned;
    protected Long isConfigMer;
    protected Long isContractAssigned;
    protected Long isDevice;
    protected Long isExpense;
    protected Long isInventory;
    protected Long isLock;
    protected Long isMapped;
    protected Long isMerchandise;
    protected Long isOk;
    protected Long isOriginal;
    protected Long isProcessCompare;
    protected Long isRecvGroupConfirm;
    protected boolean isReject;
    protected Long isReqGroupConfirm;
    protected Long isSameSN;
    protected Long isTemp;
    protected Long isVisible;
    protected int isWarranty;
    protected Long isvalid;
    protected Long keySearch;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestExportDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestImportDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestMaintainDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestMaintainDateBk;
    protected Long lifeTime;
    protected Double limitCount;
    protected Long madeYear;
    protected String managerName;
    protected Long mapNo;
    protected Long markNum;
    protected Double maxUsedTime;
    protected String merCode;
    protected Long merEntityId;
    protected Long merId;
    protected Long merInCntType;
    protected String merModel;
    protected String merName;
    protected Long merRootId;
    protected Double merWeight;
    protected String merchandiseName;
    protected String minuteHandOverCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minuteHandOverDate;
    protected Long minuteHandOverId;
    protected String minuteHandoverCode;
    protected String modifyCode;
    protected Double moneySum;
    protected String nameType;
    protected Long nationalId;
    protected String nationalName;
    protected String newCode;
    protected String newSerial;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextMaintainDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextMaintainDateBk;
    protected String nodeCode;
    protected Long nodeId;
    protected String objectCode;
    protected String oldCode;
    protected Long oldContractId;
    protected Long oldMerEntityId;
    protected Long oldMerId;
    protected String oldPartNumber;
    protected String oldSerial;
    protected String oldSerialNumber;
    protected Long ordinal;
    protected Double originalPrice;
    protected Long packageId;
    protected String packageNumber;
    protected Long parentConfigId;
    protected Long parentId;
    protected String parentSerial;
    protected String partNumber;
    protected String partNumberOwner;
    protected Long partNumberRequired;
    protected String partnerName;
    protected String path;
    protected Double percentQuality;
    protected String plCode;
    protected Long plImportId;
    protected Long plIndId;
    protected Long postRepairNoteId;
    protected Long preRepairNoteId;
    protected Double price2;
    protected String privateManagerName;
    protected String processCode;
    protected String processName;
    protected ProductCompanyBO productCompany;
    protected ProductNationalBO productNational;
    protected Long projectId;
    protected String propertyDetail;
    protected Long proposalId;
    protected String provinceCode;
    protected String provinceName;
    protected BigDecimal qty;
    protected Long quality;
    protected String realSerialNumber;
    protected String recvGroupCode;
    protected Long replaceFor;
    protected String replaceName;
    protected String reqGroupCode;
    protected Long restTime;
    protected Double restValue;
    protected String serialNo;
    protected String serialNumber;
    protected String serialNumberOwner;
    protected String serialNumberParent;
    protected Long serialRequired;
    protected String shipmentNo;
    protected Long sourceId;
    protected Long splitMer;
    protected String stationCode;
    protected String stationCodeExist;
    protected String stationHouseCode;
    protected Long stationId;
    protected Long statusCheckReq;
    protected Long statusId;
    protected String statusName;
    protected int stt;
    protected Long sumCount;
    protected Long sumUnitPrice;
    protected Long taxRate;
    protected String tel;
    protected Double totalValue;
    protected Long twinMerEntityId;
    protected Long typeDefineHis;
    protected Long typeOutSide;
    protected Long typeStationMaintain;
    protected Long typeStationMaitain;
    protected Long unitId;
    protected String unitName;
    protected Double unitPrice;
    protected Double unitPriceDomestic;
    protected String unitPriceExport;
    protected Double unitPriceForeign;
    protected Long upgradeParentId;
    protected Long useGroupId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar usedDate;
    protected String usedDateExport;
    protected String usedGroup;
    protected Long userId;
    protected String userName;
    protected Long vndUnitPrice;
    protected String warehouseCode;
    protected Long warehouseId;
    protected String warehouseName;
    protected String warehouseNameExist;
    protected Long warrantPartnerId;
    protected Long warrantyPeriod;
    protected String whPosCode;
    protected Long whPosId;
    protected String whPosName;
    protected Double withdrawPrice;
    protected String workItemCode;
    protected Long workItemID;
    protected Long workItemId;

    /**
     * Gets the value of the acceptedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptedDate() {
        return acceptedDate;
    }

    /**
     * Sets the value of the acceptedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcceptedDate(XMLGregorianCalendar value) {
        this.acceptedDate = value;
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
     *     {@link String }
     *     
     */
    public String getActionTime() {
        return actionTime;
    }

    /**
     * Sets the value of the actionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionTime(String value) {
        this.actionTime = value;
    }

    /**
     * Gets the value of the addedPart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddedPart() {
        return addedPart;
    }

    /**
     * Sets the value of the addedPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddedPart(String value) {
        this.addedPart = value;
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
     * Gets the value of the amortStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAmortStartDate() {
        return amortStartDate;
    }

    /**
     * Sets the value of the amortStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAmortStartDate(XMLGregorianCalendar value) {
        this.amortStartDate = value;
    }

    /**
     * Gets the value of the amountRemain property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountRemain() {
        return amountRemain;
    }

    /**
     * Sets the value of the amountRemain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountRemain(Double value) {
        this.amountRemain = value;
    }

    /**
     * Gets the value of the amountReq property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountReq() {
        return amountReq;
    }

    /**
     * Sets the value of the amountReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountReq(Double value) {
        this.amountReq = value;
    }

    /**
     * Gets the value of the amountUse property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountUse() {
        return amountUse;
    }

    /**
     * Sets the value of the amountUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountUse(Double value) {
        this.amountUse = value;
    }

    /**
     * Gets the value of the assetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAssetPrice() {
        return assetPrice;
    }

    /**
     * Sets the value of the assetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAssetPrice(Double value) {
        this.assetPrice = value;
    }

    /**
     * Gets the value of the boxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxNo() {
        return boxNo;
    }

    /**
     * Sets the value of the boxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxNo(String value) {
        this.boxNo = value;
    }

    /**
     * Gets the value of the catEmployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCatEmployeeId() {
        return catEmployeeId;
    }

    /**
     * Sets the value of the catEmployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCatEmployeeId(Long value) {
        this.catEmployeeId = value;
    }

    /**
     * Gets the value of the catMerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatMerCode() {
        return catMerCode;
    }

    /**
     * Sets the value of the catMerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatMerCode(String value) {
        this.catMerCode = value;
    }

    /**
     * Gets the value of the catMerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatMerName() {
        return catMerName;
    }

    /**
     * Sets the value of the catMerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatMerName(String value) {
        this.catMerName = value;
    }

    /**
     * Gets the value of the catMerchandise property.
     * 
     * @return
     *     possible object is
     *     {@link CatMerchandiseBO }
     *     
     */
    public CatMerchandiseBO getCatMerchandise() {
        return catMerchandise;
    }

    /**
     * Sets the value of the catMerchandise property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatMerchandiseBO }
     *     
     */
    public void setCatMerchandise(CatMerchandiseBO value) {
        this.catMerchandise = value;
    }

    /**
     * Gets the value of the catStationBO property.
     * 
     * @return
     *     possible object is
     *     {@link CatStationBO }
     *     
     */
    public CatStationBO getCatStationBO() {
        return catStationBO;
    }

    /**
     * Sets the value of the catStationBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatStationBO }
     *     
     */
    public void setCatStationBO(CatStationBO value) {
        this.catStationBO = value;
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
     * Gets the value of the causeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseName() {
        return causeName;
    }

    /**
     * Sets the value of the causeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseName(String value) {
        this.causeName = value;
    }

    /**
     * Gets the value of the changeAction property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChangeAction() {
        return changeAction;
    }

    /**
     * Sets the value of the changeAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChangeAction(Long value) {
        this.changeAction = value;
    }

    /**
     * Gets the value of the colorAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorAlert() {
        return colorAlert;
    }

    /**
     * Sets the value of the colorAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorAlert(String value) {
        this.colorAlert = value;
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
     * Gets the value of the configName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigName() {
        return configName;
    }

    /**
     * Sets the value of the configName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigName(String value) {
        this.configName = value;
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
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCount(Double value) {
        this.count = value;
    }

    /**
     * Gets the value of the countConfirm property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCountConfirm() {
        return countConfirm;
    }

    /**
     * Sets the value of the countConfirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCountConfirm(Double value) {
        this.countConfirm = value;
    }

    /**
     * Gets the value of the countExport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountExport() {
        return countExport;
    }

    /**
     * Sets the value of the countExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountExport(String value) {
        this.countExport = value;
    }

    /**
     * Gets the value of the countHandOver property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCountHandOver() {
        return countHandOver;
    }

    /**
     * Sets the value of the countHandOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCountHandOver(Double value) {
        this.countHandOver = value;
    }

    /**
     * Gets the value of the countInManageReq property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCountInManageReq() {
        return countInManageReq;
    }

    /**
     * Sets the value of the countInManageReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCountInManageReq(Double value) {
        this.countInManageReq = value;
    }

    /**
     * Gets the value of the countInWarehouse property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCountInWarehouse() {
        return countInWarehouse;
    }

    /**
     * Sets the value of the countInWarehouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCountInWarehouse(Double value) {
        this.countInWarehouse = value;
    }

    /**
     * Gets the value of the countMaintain property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCountMaintain() {
        return countMaintain;
    }

    /**
     * Sets the value of the countMaintain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCountMaintain(Long value) {
        this.countMaintain = value;
    }

    /**
     * Gets the value of the countMerEntityAtStation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCountMerEntityAtStation() {
        return countMerEntityAtStation;
    }

    /**
     * Sets the value of the countMerEntityAtStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCountMerEntityAtStation(Double value) {
        this.countMerEntityAtStation = value;
    }

    /**
     * Gets the value of the countNode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCountNode() {
        return countNode;
    }

    /**
     * Sets the value of the countNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCountNode(Long value) {
        this.countNode = value;
    }

    /**
     * Gets the value of the countOfDeliveryNote property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCountOfDeliveryNote() {
        return countOfDeliveryNote;
    }

    /**
     * Sets the value of the countOfDeliveryNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCountOfDeliveryNote(Double value) {
        this.countOfDeliveryNote = value;
    }

    /**
     * Gets the value of the countOfExpCmd property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCountOfExpCmd() {
        return countOfExpCmd;
    }

    /**
     * Sets the value of the countOfExpCmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCountOfExpCmd(Double value) {
        this.countOfExpCmd = value;
    }

    /**
     * Gets the value of the countOfExpReq property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCountOfExpReq() {
        return countOfExpReq;
    }

    /**
     * Sets the value of the countOfExpReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCountOfExpReq(Double value) {
        this.countOfExpReq = value;
    }

    /**
     * Gets the value of the countOfImpCmd property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCountOfImpCmd() {
        return countOfImpCmd;
    }

    /**
     * Sets the value of the countOfImpCmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCountOfImpCmd(Double value) {
        this.countOfImpCmd = value;
    }

    /**
     * Gets the value of the countOfImpReq property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCountOfImpReq() {
        return countOfImpReq;
    }

    /**
     * Sets the value of the countOfImpReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCountOfImpReq(Double value) {
        this.countOfImpReq = value;
    }

    /**
     * Gets the value of the countOfReceiptNote property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCountOfReceiptNote() {
        return countOfReceiptNote;
    }

    /**
     * Sets the value of the countOfReceiptNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCountOfReceiptNote(Double value) {
        this.countOfReceiptNote = value;
    }

    /**
     * Gets the value of the countRemain property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCountRemain() {
        return countRemain;
    }

    /**
     * Sets the value of the countRemain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCountRemain(Double value) {
        this.countRemain = value;
    }

    /**
     * Gets the value of the countUse property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCountUse() {
        return countUse;
    }

    /**
     * Sets the value of the countUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCountUse(Double value) {
        this.countUse = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
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
     * Gets the value of the deliveryNoteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryNoteCode() {
        return deliveryNoteCode;
    }

    /**
     * Sets the value of the deliveryNoteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryNoteCode(String value) {
        this.deliveryNoteCode = value;
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
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the doubleUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDoubleUnitPrice() {
        return doubleUnitPrice;
    }

    /**
     * Sets the value of the doubleUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDoubleUnitPrice(Double value) {
        this.doubleUnitPrice = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntityType(Long value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the entityTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityTypeName() {
        return entityTypeName;
    }

    /**
     * Sets the value of the entityTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityTypeName(String value) {
        this.entityTypeName = value;
    }

    /**
     * Gets the value of the executeDateBDSC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecuteDateBDSC() {
        return executeDateBDSC;
    }

    /**
     * Sets the value of the executeDateBDSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecuteDateBDSC(XMLGregorianCalendar value) {
        this.executeDateBDSC = value;
    }

    /**
     * Gets the value of the executeDateBdsc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecuteDateBdsc() {
        return executeDateBdsc;
    }

    /**
     * Sets the value of the executeDateBdsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecuteDateBdsc(XMLGregorianCalendar value) {
        this.executeDateBdsc = value;
    }

    /**
     * Gets the value of the executeDateKDHC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecuteDateKDHC() {
        return executeDateKDHC;
    }

    /**
     * Sets the value of the executeDateKDHC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecuteDateKDHC(XMLGregorianCalendar value) {
        this.executeDateKDHC = value;
    }

    /**
     * Gets the value of the executeDateKdhc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecuteDateKdhc() {
        return executeDateKdhc;
    }

    /**
     * Sets the value of the executeDateKdhc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecuteDateKdhc(XMLGregorianCalendar value) {
        this.executeDateKdhc = value;
    }

    /**
     * Gets the value of the executeMonthTimeUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExecuteMonthTimeUsed() {
        return executeMonthTimeUsed;
    }

    /**
     * Sets the value of the executeMonthTimeUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExecuteMonthTimeUsed(Long value) {
        this.executeMonthTimeUsed = value;
    }

    /**
     * Gets the value of the expType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpType() {
        return expType;
    }

    /**
     * Sets the value of the expType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpType(Long value) {
        this.expType = value;
    }

    /**
     * Gets the value of the expiredWarrantyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiredWarrantyDate() {
        return expiredWarrantyDate;
    }

    /**
     * Sets the value of the expiredWarrantyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiredWarrantyDate(XMLGregorianCalendar value) {
        this.expiredWarrantyDate = value;
    }

    /**
     * Gets the value of the failDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFailDate() {
        return failDate;
    }

    /**
     * Sets the value of the failDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFailDate(XMLGregorianCalendar value) {
        this.failDate = value;
    }

    /**
     * Gets the value of the failReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * Sets the value of the failReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailReason(String value) {
        this.failReason = value;
    }

    /**
     * Gets the value of the fileId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFileId(Long value) {
        this.fileId = value;
    }

    /**
     * Gets the value of the groupBO property.
     * 
     * @return
     *     possible object is
     *     {@link SysGroupBO }
     *     
     */
    public SysGroupBO getGroupBO() {
        return groupBO;
    }

    /**
     * Sets the value of the groupBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link SysGroupBO }
     *     
     */
    public void setGroupBO(SysGroupBO value) {
        this.groupBO = value;
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
     * Gets the value of the groupNameExist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupNameExist() {
        return groupNameExist;
    }

    /**
     * Sets the value of the groupNameExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupNameExist(String value) {
        this.groupNameExist = value;
    }

    /**
     * Gets the value of the hanOverId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHanOverId() {
        return hanOverId;
    }

    /**
     * Sets the value of the hanOverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHanOverId(Long value) {
        this.hanOverId = value;
    }

    /**
     * Gets the value of the handCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandCode() {
        return handCode;
    }

    /**
     * Sets the value of the handCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandCode(String value) {
        this.handCode = value;
    }

    /**
     * Gets the value of the handleWay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHandleWay() {
        return handleWay;
    }

    /**
     * Sets the value of the handleWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHandleWay(Long value) {
        this.handleWay = value;
    }

    /**
     * Gets the value of the hierarchicalStt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchicalStt() {
        return hierarchicalStt;
    }

    /**
     * Sets the value of the hierarchicalStt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchicalStt(String value) {
        this.hierarchicalStt = value;
    }

    /**
     * Gets the value of the historyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHistoryId() {
        return historyId;
    }

    /**
     * Sets the value of the historyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHistoryId(Long value) {
        this.historyId = value;
    }

    /**
     * Gets the value of the impType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImpType() {
        return impType;
    }

    /**
     * Sets the value of the impType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImpType(Long value) {
        this.impType = value;
    }

    /**
     * Gets the value of the importDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getImportDate() {
        return importDate;
    }

    /**
     * Sets the value of the importDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setImportDate(XMLGregorianCalendar value) {
        this.importDate = value;
    }

    /**
     * Gets the value of the importStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportStatus() {
        return importStatus;
    }

    /**
     * Sets the value of the importStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportStatus(String value) {
        this.importStatus = value;
    }

    /**
     * Gets the value of the isAppo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsAppo() {
        return isAppo;
    }

    /**
     * Sets the value of the isAppo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsAppo(Long value) {
        this.isAppo = value;
    }

    /**
     * Gets the value of the isCheckImp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsCheckImp() {
        return isCheckImp;
    }

    /**
     * Sets the value of the isCheckImp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsCheckImp(Long value) {
        this.isCheckImp = value;
    }

    /**
     * Gets the value of the isCheckedKcs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsCheckedKcs() {
        return isCheckedKcs;
    }

    /**
     * Sets the value of the isCheckedKcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsCheckedKcs(Long value) {
        this.isCheckedKcs = value;
    }

    /**
     * Gets the value of the isCntAssigned property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsCntAssigned() {
        return isCntAssigned;
    }

    /**
     * Sets the value of the isCntAssigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsCntAssigned(Long value) {
        this.isCntAssigned = value;
    }

    /**
     * Gets the value of the isConfigMer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsConfigMer() {
        return isConfigMer;
    }

    /**
     * Sets the value of the isConfigMer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsConfigMer(Long value) {
        this.isConfigMer = value;
    }

    /**
     * Gets the value of the isContractAssigned property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsContractAssigned() {
        return isContractAssigned;
    }

    /**
     * Sets the value of the isContractAssigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsContractAssigned(Long value) {
        this.isContractAssigned = value;
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
     * Gets the value of the isExpense property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsExpense() {
        return isExpense;
    }

    /**
     * Sets the value of the isExpense property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsExpense(Long value) {
        this.isExpense = value;
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
     * Gets the value of the isMapped property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsMapped() {
        return isMapped;
    }

    /**
     * Sets the value of the isMapped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsMapped(Long value) {
        this.isMapped = value;
    }

    /**
     * Gets the value of the isMerchandise property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsMerchandise() {
        return isMerchandise;
    }

    /**
     * Sets the value of the isMerchandise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsMerchandise(Long value) {
        this.isMerchandise = value;
    }

    /**
     * Gets the value of the isOk property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsOk() {
        return isOk;
    }

    /**
     * Sets the value of the isOk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsOk(Long value) {
        this.isOk = value;
    }

    /**
     * Gets the value of the isOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsOriginal() {
        return isOriginal;
    }

    /**
     * Sets the value of the isOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsOriginal(Long value) {
        this.isOriginal = value;
    }

    /**
     * Gets the value of the isProcessCompare property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsProcessCompare() {
        return isProcessCompare;
    }

    /**
     * Sets the value of the isProcessCompare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsProcessCompare(Long value) {
        this.isProcessCompare = value;
    }

    /**
     * Gets the value of the isRecvGroupConfirm property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsRecvGroupConfirm() {
        return isRecvGroupConfirm;
    }

    /**
     * Sets the value of the isRecvGroupConfirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsRecvGroupConfirm(Long value) {
        this.isRecvGroupConfirm = value;
    }

    /**
     * Gets the value of the isReject property.
     * 
     */
    public boolean isIsReject() {
        return isReject;
    }

    /**
     * Sets the value of the isReject property.
     * 
     */
    public void setIsReject(boolean value) {
        this.isReject = value;
    }

    /**
     * Gets the value of the isReqGroupConfirm property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsReqGroupConfirm() {
        return isReqGroupConfirm;
    }

    /**
     * Sets the value of the isReqGroupConfirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsReqGroupConfirm(Long value) {
        this.isReqGroupConfirm = value;
    }

    /**
     * Gets the value of the isSameSN property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsSameSN() {
        return isSameSN;
    }

    /**
     * Sets the value of the isSameSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsSameSN(Long value) {
        this.isSameSN = value;
    }

    /**
     * Gets the value of the isTemp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsTemp() {
        return isTemp;
    }

    /**
     * Sets the value of the isTemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsTemp(Long value) {
        this.isTemp = value;
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
     * Gets the value of the isWarranty property.
     * 
     */
    public int getIsWarranty() {
        return isWarranty;
    }

    /**
     * Sets the value of the isWarranty property.
     * 
     */
    public void setIsWarranty(int value) {
        this.isWarranty = value;
    }

    /**
     * Gets the value of the isvalid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsvalid() {
        return isvalid;
    }

    /**
     * Sets the value of the isvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsvalid(Long value) {
        this.isvalid = value;
    }

    /**
     * Gets the value of the keySearch property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKeySearch() {
        return keySearch;
    }

    /**
     * Sets the value of the keySearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKeySearch(Long value) {
        this.keySearch = value;
    }

    /**
     * Gets the value of the latestExportDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestExportDate() {
        return latestExportDate;
    }

    /**
     * Sets the value of the latestExportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestExportDate(XMLGregorianCalendar value) {
        this.latestExportDate = value;
    }

    /**
     * Gets the value of the latestImportDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestImportDate() {
        return latestImportDate;
    }

    /**
     * Sets the value of the latestImportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestImportDate(XMLGregorianCalendar value) {
        this.latestImportDate = value;
    }

    /**
     * Gets the value of the latestMaintainDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestMaintainDate() {
        return latestMaintainDate;
    }

    /**
     * Sets the value of the latestMaintainDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestMaintainDate(XMLGregorianCalendar value) {
        this.latestMaintainDate = value;
    }

    /**
     * Gets the value of the latestMaintainDateBk property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestMaintainDateBk() {
        return latestMaintainDateBk;
    }

    /**
     * Sets the value of the latestMaintainDateBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestMaintainDateBk(XMLGregorianCalendar value) {
        this.latestMaintainDateBk = value;
    }

    /**
     * Gets the value of the lifeTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLifeTime() {
        return lifeTime;
    }

    /**
     * Sets the value of the lifeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLifeTime(Long value) {
        this.lifeTime = value;
    }

    /**
     * Gets the value of the limitCount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLimitCount() {
        return limitCount;
    }

    /**
     * Sets the value of the limitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLimitCount(Double value) {
        this.limitCount = value;
    }

    /**
     * Gets the value of the madeYear property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMadeYear() {
        return madeYear;
    }

    /**
     * Sets the value of the madeYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMadeYear(Long value) {
        this.madeYear = value;
    }

    /**
     * Gets the value of the managerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerName() {
        return managerName;
    }

    /**
     * Sets the value of the managerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerName(String value) {
        this.managerName = value;
    }

    /**
     * Gets the value of the mapNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMapNo() {
        return mapNo;
    }

    /**
     * Sets the value of the mapNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMapNo(Long value) {
        this.mapNo = value;
    }

    /**
     * Gets the value of the markNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMarkNum() {
        return markNum;
    }

    /**
     * Sets the value of the markNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMarkNum(Long value) {
        this.markNum = value;
    }

    /**
     * Gets the value of the maxUsedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxUsedTime() {
        return maxUsedTime;
    }

    /**
     * Sets the value of the maxUsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxUsedTime(Double value) {
        this.maxUsedTime = value;
    }

    /**
     * Gets the value of the merCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerCode() {
        return merCode;
    }

    /**
     * Sets the value of the merCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerCode(String value) {
        this.merCode = value;
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
     * Gets the value of the merId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMerId() {
        return merId;
    }

    /**
     * Sets the value of the merId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMerId(Long value) {
        this.merId = value;
    }

    /**
     * Gets the value of the merInCntType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMerInCntType() {
        return merInCntType;
    }

    /**
     * Sets the value of the merInCntType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMerInCntType(Long value) {
        this.merInCntType = value;
    }

    /**
     * Gets the value of the merModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerModel() {
        return merModel;
    }

    /**
     * Sets the value of the merModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerModel(String value) {
        this.merModel = value;
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
     * Gets the value of the merRootId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMerRootId() {
        return merRootId;
    }

    /**
     * Sets the value of the merRootId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMerRootId(Long value) {
        this.merRootId = value;
    }

    /**
     * Gets the value of the merWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMerWeight() {
        return merWeight;
    }

    /**
     * Sets the value of the merWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMerWeight(Double value) {
        this.merWeight = value;
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
     * Gets the value of the minuteHandOverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinuteHandOverCode() {
        return minuteHandOverCode;
    }

    /**
     * Sets the value of the minuteHandOverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinuteHandOverCode(String value) {
        this.minuteHandOverCode = value;
    }

    /**
     * Gets the value of the minuteHandOverDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinuteHandOverDate() {
        return minuteHandOverDate;
    }

    /**
     * Sets the value of the minuteHandOverDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinuteHandOverDate(XMLGregorianCalendar value) {
        this.minuteHandOverDate = value;
    }

    /**
     * Gets the value of the minuteHandOverId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinuteHandOverId() {
        return minuteHandOverId;
    }

    /**
     * Sets the value of the minuteHandOverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinuteHandOverId(Long value) {
        this.minuteHandOverId = value;
    }

    /**
     * Gets the value of the minuteHandoverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinuteHandoverCode() {
        return minuteHandoverCode;
    }

    /**
     * Sets the value of the minuteHandoverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinuteHandoverCode(String value) {
        this.minuteHandoverCode = value;
    }

    /**
     * Gets the value of the modifyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyCode() {
        return modifyCode;
    }

    /**
     * Sets the value of the modifyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyCode(String value) {
        this.modifyCode = value;
    }

    /**
     * Gets the value of the moneySum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMoneySum() {
        return moneySum;
    }

    /**
     * Sets the value of the moneySum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMoneySum(Double value) {
        this.moneySum = value;
    }

    /**
     * Gets the value of the nameType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameType() {
        return nameType;
    }

    /**
     * Sets the value of the nameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameType(String value) {
        this.nameType = value;
    }

    /**
     * Gets the value of the nationalId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNationalId() {
        return nationalId;
    }

    /**
     * Sets the value of the nationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNationalId(Long value) {
        this.nationalId = value;
    }

    /**
     * Gets the value of the nationalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalName() {
        return nationalName;
    }

    /**
     * Sets the value of the nationalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalName(String value) {
        this.nationalName = value;
    }

    /**
     * Gets the value of the newCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCode() {
        return newCode;
    }

    /**
     * Sets the value of the newCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCode(String value) {
        this.newCode = value;
    }

    /**
     * Gets the value of the newSerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSerial() {
        return newSerial;
    }

    /**
     * Sets the value of the newSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSerial(String value) {
        this.newSerial = value;
    }

    /**
     * Gets the value of the nextMaintainDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextMaintainDate() {
        return nextMaintainDate;
    }

    /**
     * Sets the value of the nextMaintainDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextMaintainDate(XMLGregorianCalendar value) {
        this.nextMaintainDate = value;
    }

    /**
     * Gets the value of the nextMaintainDateBk property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextMaintainDateBk() {
        return nextMaintainDateBk;
    }

    /**
     * Sets the value of the nextMaintainDateBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextMaintainDateBk(XMLGregorianCalendar value) {
        this.nextMaintainDateBk = value;
    }

    /**
     * Gets the value of the nodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeCode() {
        return nodeCode;
    }

    /**
     * Sets the value of the nodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeCode(String value) {
        this.nodeCode = value;
    }

    /**
     * Gets the value of the nodeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNodeId() {
        return nodeId;
    }

    /**
     * Sets the value of the nodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNodeId(Long value) {
        this.nodeId = value;
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
     * Gets the value of the oldContractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOldContractId() {
        return oldContractId;
    }

    /**
     * Sets the value of the oldContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOldContractId(Long value) {
        this.oldContractId = value;
    }

    /**
     * Gets the value of the oldMerEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOldMerEntityId() {
        return oldMerEntityId;
    }

    /**
     * Sets the value of the oldMerEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOldMerEntityId(Long value) {
        this.oldMerEntityId = value;
    }

    /**
     * Gets the value of the oldMerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOldMerId() {
        return oldMerId;
    }

    /**
     * Sets the value of the oldMerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOldMerId(Long value) {
        this.oldMerId = value;
    }

    /**
     * Gets the value of the oldPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPartNumber() {
        return oldPartNumber;
    }

    /**
     * Sets the value of the oldPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldPartNumber(String value) {
        this.oldPartNumber = value;
    }

    /**
     * Gets the value of the oldSerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSerial() {
        return oldSerial;
    }

    /**
     * Sets the value of the oldSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSerial(String value) {
        this.oldSerial = value;
    }

    /**
     * Gets the value of the oldSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSerialNumber() {
        return oldSerialNumber;
    }

    /**
     * Sets the value of the oldSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSerialNumber(String value) {
        this.oldSerialNumber = value;
    }

    /**
     * Gets the value of the ordinal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrdinal() {
        return ordinal;
    }

    /**
     * Sets the value of the ordinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrdinal(Long value) {
        this.ordinal = value;
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
     * Gets the value of the packageId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageId() {
        return packageId;
    }

    /**
     * Sets the value of the packageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageId(Long value) {
        this.packageId = value;
    }

    /**
     * Gets the value of the packageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageNumber() {
        return packageNumber;
    }

    /**
     * Sets the value of the packageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageNumber(String value) {
        this.packageNumber = value;
    }

    /**
     * Gets the value of the parentConfigId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentConfigId() {
        return parentConfigId;
    }

    /**
     * Sets the value of the parentConfigId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentConfigId(Long value) {
        this.parentConfigId = value;
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
     * Gets the value of the parentSerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentSerial() {
        return parentSerial;
    }

    /**
     * Sets the value of the parentSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentSerial(String value) {
        this.parentSerial = value;
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
     * Gets the value of the partNumberOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumberOwner() {
        return partNumberOwner;
    }

    /**
     * Sets the value of the partNumberOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumberOwner(String value) {
        this.partNumberOwner = value;
    }

    /**
     * Gets the value of the partNumberRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartNumberRequired() {
        return partNumberRequired;
    }

    /**
     * Sets the value of the partNumberRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartNumberRequired(Long value) {
        this.partNumberRequired = value;
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
     * Gets the value of the percentQuality property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentQuality() {
        return percentQuality;
    }

    /**
     * Sets the value of the percentQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentQuality(Double value) {
        this.percentQuality = value;
    }

    /**
     * Gets the value of the plCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlCode() {
        return plCode;
    }

    /**
     * Sets the value of the plCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlCode(String value) {
        this.plCode = value;
    }

    /**
     * Gets the value of the plImportId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlImportId() {
        return plImportId;
    }

    /**
     * Sets the value of the plImportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlImportId(Long value) {
        this.plImportId = value;
    }

    /**
     * Gets the value of the plIndId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlIndId() {
        return plIndId;
    }

    /**
     * Sets the value of the plIndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlIndId(Long value) {
        this.plIndId = value;
    }

    /**
     * Gets the value of the postRepairNoteId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPostRepairNoteId() {
        return postRepairNoteId;
    }

    /**
     * Sets the value of the postRepairNoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPostRepairNoteId(Long value) {
        this.postRepairNoteId = value;
    }

    /**
     * Gets the value of the preRepairNoteId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreRepairNoteId() {
        return preRepairNoteId;
    }

    /**
     * Sets the value of the preRepairNoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreRepairNoteId(Long value) {
        this.preRepairNoteId = value;
    }

    /**
     * Gets the value of the price2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrice2() {
        return price2;
    }

    /**
     * Sets the value of the price2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrice2(Double value) {
        this.price2 = value;
    }

    /**
     * Gets the value of the privateManagerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateManagerName() {
        return privateManagerName;
    }

    /**
     * Sets the value of the privateManagerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateManagerName(String value) {
        this.privateManagerName = value;
    }

    /**
     * Gets the value of the processCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessCode() {
        return processCode;
    }

    /**
     * Sets the value of the processCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessCode(String value) {
        this.processCode = value;
    }

    /**
     * Gets the value of the processName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessName() {
        return processName;
    }

    /**
     * Sets the value of the processName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessName(String value) {
        this.processName = value;
    }

    /**
     * Gets the value of the productCompany property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCompanyBO }
     *     
     */
    public ProductCompanyBO getProductCompany() {
        return productCompany;
    }

    /**
     * Sets the value of the productCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCompanyBO }
     *     
     */
    public void setProductCompany(ProductCompanyBO value) {
        this.productCompany = value;
    }

    /**
     * Gets the value of the productNational property.
     * 
     * @return
     *     possible object is
     *     {@link ProductNationalBO }
     *     
     */
    public ProductNationalBO getProductNational() {
        return productNational;
    }

    /**
     * Sets the value of the productNational property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductNationalBO }
     *     
     */
    public void setProductNational(ProductNationalBO value) {
        this.productNational = value;
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
     * Gets the value of the propertyDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyDetail() {
        return propertyDetail;
    }

    /**
     * Sets the value of the propertyDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyDetail(String value) {
        this.propertyDetail = value;
    }

    /**
     * Gets the value of the proposalId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProposalId() {
        return proposalId;
    }

    /**
     * Sets the value of the proposalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProposalId(Long value) {
        this.proposalId = value;
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
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuality(Long value) {
        this.quality = value;
    }

    /**
     * Gets the value of the realSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealSerialNumber() {
        return realSerialNumber;
    }

    /**
     * Sets the value of the realSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealSerialNumber(String value) {
        this.realSerialNumber = value;
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
     * Gets the value of the replaceFor property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReplaceFor() {
        return replaceFor;
    }

    /**
     * Sets the value of the replaceFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReplaceFor(Long value) {
        this.replaceFor = value;
    }

    /**
     * Gets the value of the replaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplaceName() {
        return replaceName;
    }

    /**
     * Sets the value of the replaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplaceName(String value) {
        this.replaceName = value;
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
     * Gets the value of the restTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRestTime() {
        return restTime;
    }

    /**
     * Sets the value of the restTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRestTime(Long value) {
        this.restTime = value;
    }

    /**
     * Gets the value of the restValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRestValue() {
        return restValue;
    }

    /**
     * Sets the value of the restValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRestValue(Double value) {
        this.restValue = value;
    }

    /**
     * Gets the value of the serialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNo(String value) {
        this.serialNo = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the serialNumberOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumberOwner() {
        return serialNumberOwner;
    }

    /**
     * Sets the value of the serialNumberOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumberOwner(String value) {
        this.serialNumberOwner = value;
    }

    /**
     * Gets the value of the serialNumberParent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumberParent() {
        return serialNumberParent;
    }

    /**
     * Sets the value of the serialNumberParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumberParent(String value) {
        this.serialNumberParent = value;
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
     * Gets the value of the shipmentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentNo() {
        return shipmentNo;
    }

    /**
     * Sets the value of the shipmentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentNo(String value) {
        this.shipmentNo = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceId(Long value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the splitMer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSplitMer() {
        return splitMer;
    }

    /**
     * Sets the value of the splitMer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSplitMer(Long value) {
        this.splitMer = value;
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
     * Gets the value of the stationCodeExist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationCodeExist() {
        return stationCodeExist;
    }

    /**
     * Sets the value of the stationCodeExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationCodeExist(String value) {
        this.stationCodeExist = value;
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
     * Gets the value of the statusCheckReq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStatusCheckReq() {
        return statusCheckReq;
    }

    /**
     * Sets the value of the statusCheckReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStatusCheckReq(Long value) {
        this.statusCheckReq = value;
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
     * Gets the value of the stt property.
     * 
     */
    public int getStt() {
        return stt;
    }

    /**
     * Sets the value of the stt property.
     * 
     */
    public void setStt(int value) {
        this.stt = value;
    }

    /**
     * Gets the value of the sumCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSumCount() {
        return sumCount;
    }

    /**
     * Sets the value of the sumCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSumCount(Long value) {
        this.sumCount = value;
    }

    /**
     * Gets the value of the sumUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSumUnitPrice() {
        return sumUnitPrice;
    }

    /**
     * Sets the value of the sumUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSumUnitPrice(Long value) {
        this.sumUnitPrice = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxRate(Long value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
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
     * Gets the value of the twinMerEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTwinMerEntityId() {
        return twinMerEntityId;
    }

    /**
     * Sets the value of the twinMerEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTwinMerEntityId(Long value) {
        this.twinMerEntityId = value;
    }

    /**
     * Gets the value of the typeDefineHis property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeDefineHis() {
        return typeDefineHis;
    }

    /**
     * Sets the value of the typeDefineHis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeDefineHis(Long value) {
        this.typeDefineHis = value;
    }

    /**
     * Gets the value of the typeOutSide property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeOutSide() {
        return typeOutSide;
    }

    /**
     * Sets the value of the typeOutSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeOutSide(Long value) {
        this.typeOutSide = value;
    }

    /**
     * Gets the value of the typeStationMaintain property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeStationMaintain() {
        return typeStationMaintain;
    }

    /**
     * Sets the value of the typeStationMaintain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeStationMaintain(Long value) {
        this.typeStationMaintain = value;
    }

    /**
     * Gets the value of the typeStationMaitain property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeStationMaitain() {
        return typeStationMaitain;
    }

    /**
     * Sets the value of the typeStationMaitain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeStationMaitain(Long value) {
        this.typeStationMaitain = value;
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

    /**
     * Gets the value of the unitPriceDomestic property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitPriceDomestic() {
        return unitPriceDomestic;
    }

    /**
     * Sets the value of the unitPriceDomestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitPriceDomestic(Double value) {
        this.unitPriceDomestic = value;
    }

    /**
     * Gets the value of the unitPriceExport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitPriceExport() {
        return unitPriceExport;
    }

    /**
     * Sets the value of the unitPriceExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitPriceExport(String value) {
        this.unitPriceExport = value;
    }

    /**
     * Gets the value of the unitPriceForeign property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitPriceForeign() {
        return unitPriceForeign;
    }

    /**
     * Sets the value of the unitPriceForeign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitPriceForeign(Double value) {
        this.unitPriceForeign = value;
    }

    /**
     * Gets the value of the upgradeParentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpgradeParentId() {
        return upgradeParentId;
    }

    /**
     * Sets the value of the upgradeParentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpgradeParentId(Long value) {
        this.upgradeParentId = value;
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
     * Gets the value of the usedDateExport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedDateExport() {
        return usedDateExport;
    }

    /**
     * Sets the value of the usedDateExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedDateExport(String value) {
        this.usedDateExport = value;
    }

    /**
     * Gets the value of the usedGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedGroup() {
        return usedGroup;
    }

    /**
     * Sets the value of the usedGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedGroup(String value) {
        this.usedGroup = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the vndUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVndUnitPrice() {
        return vndUnitPrice;
    }

    /**
     * Sets the value of the vndUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVndUnitPrice(Long value) {
        this.vndUnitPrice = value;
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
     * Gets the value of the warehouseNameExist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseNameExist() {
        return warehouseNameExist;
    }

    /**
     * Sets the value of the warehouseNameExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseNameExist(String value) {
        this.warehouseNameExist = value;
    }

    /**
     * Gets the value of the warrantPartnerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWarrantPartnerId() {
        return warrantPartnerId;
    }

    /**
     * Sets the value of the warrantPartnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWarrantPartnerId(Long value) {
        this.warrantPartnerId = value;
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

    /**
     * Gets the value of the whPosCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhPosCode() {
        return whPosCode;
    }

    /**
     * Sets the value of the whPosCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhPosCode(String value) {
        this.whPosCode = value;
    }

    /**
     * Gets the value of the whPosId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWhPosId() {
        return whPosId;
    }

    /**
     * Sets the value of the whPosId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWhPosId(Long value) {
        this.whPosId = value;
    }

    /**
     * Gets the value of the whPosName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhPosName() {
        return whPosName;
    }

    /**
     * Sets the value of the whPosName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhPosName(String value) {
        this.whPosName = value;
    }

    /**
     * Gets the value of the withdrawPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWithdrawPrice() {
        return withdrawPrice;
    }

    /**
     * Sets the value of the withdrawPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWithdrawPrice(Double value) {
        this.withdrawPrice = value;
    }

    /**
     * Gets the value of the workItemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkItemCode() {
        return workItemCode;
    }

    /**
     * Sets the value of the workItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkItemCode(String value) {
        this.workItemCode = value;
    }

    /**
     * Gets the value of the workItemID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkItemID() {
        return workItemID;
    }

    /**
     * Sets the value of the workItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkItemID(Long value) {
        this.workItemID = value;
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
