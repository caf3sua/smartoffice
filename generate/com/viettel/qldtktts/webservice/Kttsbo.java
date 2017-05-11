
package com.viettel.qldtktts.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * <p>Java class for kttsbo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kttsbo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.qldtktts.viettel.com/}basicBO">
 *       &lt;sequence>
 *         &lt;element name="acceptanceBO" type="{http://webservice.qldtktts.viettel.com/}acceptanceBO" minOccurs="0"/>
 *         &lt;element name="assetMoveCmdBO" type="{http://webservice.qldtktts.viettel.com/}assetMoveCmdBO" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listAssetHis" type="{http://webservice.qldtktts.viettel.com/}assetHisBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listAssetPostRepair" type="{http://webservice.qldtktts.viettel.com/}assetPostRepairNoteBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listAssetPreRepair" type="{http://webservice.qldtktts.viettel.com/}assetPreRepairNoteBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listCatMerchandise" type="{http://webservice.qldtktts.viettel.com/}catMerchandiseBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listCatPartner" type="{http://webservice.qldtktts.viettel.com/}catPartnersBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listCombo" type="{http://webservice.qldtktts.viettel.com/}vMerEntityComboBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listConstruction" type="{http://webservice.qldtktts.viettel.com/}constrConstructionsBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listContract" type="{http://webservice.qldtktts.viettel.com/}cntContractBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listError" type="{http://webservice.qldtktts.viettel.com/}errorBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listFileTranfer" type="{http://webservice.qldtktts.viettel.com/}fileTranfer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listLine" type="{http://webservice.qldtktts.viettel.com/}lineBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listLinkNims" type="{http://webservice.qldtktts.viettel.com/}linkNimsBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listMapLinkLine" type="{http://webservice.qldtktts.viettel.com/}mapLinkNimsLineBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listMerConfig" type="{http://webservice.qldtktts.viettel.com/}catMerConfigBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listMerEntity" type="{http://webservice.qldtktts.viettel.com/}merEntityBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listMinuteHandOver" type="{http://webservice.qldtktts.viettel.com/}minuteHandOverBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listScript" type="{http://webservice.qldtktts.viettel.com/}catLimitScriptsBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listStation" type="{http://webservice.qldtktts.viettel.com/}catStationBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listSysGroup" type="{http://webservice.qldtktts.viettel.com/}sysGroupBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listSysUser" type="{http://webservice.qldtktts.viettel.com/}vSysUserBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listWarehouse" type="{http://webservice.qldtktts.viettel.com/}catWarehouseBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lstMerchandiseOrderBO" type="{http://webservice.qldtktts.viettel.com/}merchandiseOrderBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="merEntityBO" type="{http://webservice.qldtktts.viettel.com/}merEntityBO" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wareExpNoteBO" type="{http://webservice.qldtktts.viettel.com/}wareExpNoteBO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kttsbo", propOrder = {
    "acceptanceBO",
    "assetMoveCmdBO",
    "errorCode",
    "errorInfo",
    "listAssetHis",
    "listAssetPostRepair",
    "listAssetPreRepair",
    "listCatMerchandise",
    "listCatPartner",
    "listCombo",
    "listConstruction",
    "listContract",
    "listError",
    "listFileTranfer",
    "listLine",
    "listLinkNims",
    "listMapLinkLine",
    "listMerConfig",
    "listMerEntity",
    "listMinuteHandOver",
    "listScript",
    "listStation",
    "listSysGroup",
    "listSysUser",
    "listWarehouse",
    "lstMerchandiseOrderBO",
    "merEntityBO",
    "status",
    "wareExpNoteBO"
})
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Kttsbo
    extends BasicBO
{

    protected AcceptanceBO acceptanceBO;
    protected AssetMoveCmdBO assetMoveCmdBO;
    protected String errorCode;
    protected String errorInfo;
    @XmlElement(nillable = true)
    protected List<AssetHisBO> listAssetHis;
    @XmlElement(nillable = true)
    protected List<AssetPostRepairNoteBO> listAssetPostRepair;
    @XmlElement(nillable = true)
    protected List<AssetPreRepairNoteBO> listAssetPreRepair;
    @XmlElement(nillable = true)
    protected List<CatMerchandiseBO> listCatMerchandise;
    @XmlElement(nillable = true)
    protected List<CatPartnersBO> listCatPartner;
    @XmlElement(nillable = true)
    protected List<VMerEntityComboBO> listCombo;
    @XmlElement(nillable = true)
    protected List<ConstrConstructionsBO> listConstruction;
    @XmlElement(nillable = true)
    protected List<CntContractBO> listContract;
    @XmlElement(nillable = true)
    protected List<ErrorBO> listError;
    @XmlElement(nillable = true)
    protected List<FileTranfer> listFileTranfer;
    @XmlElement(nillable = true)
    protected List<LineBO> listLine;
    @XmlElement(nillable = true)
    protected List<LinkNimsBO> listLinkNims;
    @XmlElement(nillable = true)
    protected List<MapLinkNimsLineBO> listMapLinkLine;
    @XmlElement(nillable = true)
    protected List<CatMerConfigBO> listMerConfig;
    @XmlElement(nillable = true)
    protected List<MerEntityBO> listMerEntity;
    @XmlElement(nillable = true)
    protected List<MinuteHandOverBO> listMinuteHandOver;
    @XmlElement(nillable = true)
    protected List<CatLimitScriptsBO> listScript;
    @XmlElement(nillable = true)
    protected List<CatStationBO> listStation;
    @XmlElement(nillable = true)
    protected List<SysGroupBO> listSysGroup;
    @XmlElement(nillable = true)
    protected List<VSysUserBO> listSysUser;
    @XmlElement(nillable = true)
    protected List<CatWarehouseBO> listWarehouse;
    @XmlElement(nillable = true)
    protected List<MerchandiseOrderBO> lstMerchandiseOrderBO;
    protected MerEntityBO merEntityBO;
    protected String status;
    protected WareExpNoteBO wareExpNoteBO;

    /**
     * Gets the value of the acceptanceBO property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptanceBO }
     *     
     */
    public AcceptanceBO getAcceptanceBO() {
        return acceptanceBO;
    }

    /**
     * Sets the value of the acceptanceBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptanceBO }
     *     
     */
    public void setAcceptanceBO(AcceptanceBO value) {
        this.acceptanceBO = value;
    }

    /**
     * Gets the value of the assetMoveCmdBO property.
     * 
     * @return
     *     possible object is
     *     {@link AssetMoveCmdBO }
     *     
     */
    public AssetMoveCmdBO getAssetMoveCmdBO() {
        return assetMoveCmdBO;
    }

    /**
     * Sets the value of the assetMoveCmdBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetMoveCmdBO }
     *     
     */
    public void setAssetMoveCmdBO(AssetMoveCmdBO value) {
        this.assetMoveCmdBO = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorInfo() {
        return errorInfo;
    }

    /**
     * Sets the value of the errorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorInfo(String value) {
        this.errorInfo = value;
    }

    /**
     * Gets the value of the listAssetHis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listAssetHis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListAssetHis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetHisBO }
     * 
     * 
     */
    public List<AssetHisBO> getListAssetHis() {
        if (listAssetHis == null) {
            listAssetHis = new ArrayList<AssetHisBO>();
        }
        return this.listAssetHis;
    }

    /**
     * Gets the value of the listAssetPostRepair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listAssetPostRepair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListAssetPostRepair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetPostRepairNoteBO }
     * 
     * 
     */
    public List<AssetPostRepairNoteBO> getListAssetPostRepair() {
        if (listAssetPostRepair == null) {
            listAssetPostRepair = new ArrayList<AssetPostRepairNoteBO>();
        }
        return this.listAssetPostRepair;
    }

    /**
     * Gets the value of the listAssetPreRepair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listAssetPreRepair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListAssetPreRepair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetPreRepairNoteBO }
     * 
     * 
     */
    public List<AssetPreRepairNoteBO> getListAssetPreRepair() {
        if (listAssetPreRepair == null) {
            listAssetPreRepair = new ArrayList<AssetPreRepairNoteBO>();
        }
        return this.listAssetPreRepair;
    }

    /**
     * Gets the value of the listCatMerchandise property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listCatMerchandise property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListCatMerchandise().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatMerchandiseBO }
     * 
     * 
     */
    public List<CatMerchandiseBO> getListCatMerchandise() {
        if (listCatMerchandise == null) {
            listCatMerchandise = new ArrayList<CatMerchandiseBO>();
        }
        return this.listCatMerchandise;
    }

    /**
     * Gets the value of the listCatPartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listCatPartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListCatPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatPartnersBO }
     * 
     * 
     */
    public List<CatPartnersBO> getListCatPartner() {
        if (listCatPartner == null) {
            listCatPartner = new ArrayList<CatPartnersBO>();
        }
        return this.listCatPartner;
    }

    /**
     * Gets the value of the listCombo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listCombo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListCombo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VMerEntityComboBO }
     * 
     * 
     */
    public List<VMerEntityComboBO> getListCombo() {
        if (listCombo == null) {
            listCombo = new ArrayList<VMerEntityComboBO>();
        }
        return this.listCombo;
    }

    /**
     * Gets the value of the listConstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listConstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListConstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstrConstructionsBO }
     * 
     * 
     */
    public List<ConstrConstructionsBO> getListConstruction() {
        if (listConstruction == null) {
            listConstruction = new ArrayList<ConstrConstructionsBO>();
        }
        return this.listConstruction;
    }

    /**
     * Gets the value of the listContract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listContract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CntContractBO }
     * 
     * 
     */
    public List<CntContractBO> getListContract() {
        if (listContract == null) {
            listContract = new ArrayList<CntContractBO>();
        }
        return this.listContract;
    }

    /**
     * Gets the value of the listError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorBO }
     * 
     * 
     */
    public List<ErrorBO> getListError() {
        if (listError == null) {
            listError = new ArrayList<ErrorBO>();
        }
        return this.listError;
    }

    /**
     * Gets the value of the listFileTranfer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listFileTranfer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListFileTranfer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileTranfer }
     * 
     * 
     */
    public List<FileTranfer> getListFileTranfer() {
        if (listFileTranfer == null) {
            listFileTranfer = new ArrayList<FileTranfer>();
        }
        return this.listFileTranfer;
    }

    /**
     * Gets the value of the listLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineBO }
     * 
     * 
     */
    public List<LineBO> getListLine() {
        if (listLine == null) {
            listLine = new ArrayList<LineBO>();
        }
        return this.listLine;
    }

    /**
     * Gets the value of the listLinkNims property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listLinkNims property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListLinkNims().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkNimsBO }
     * 
     * 
     */
    public List<LinkNimsBO> getListLinkNims() {
        if (listLinkNims == null) {
            listLinkNims = new ArrayList<LinkNimsBO>();
        }
        return this.listLinkNims;
    }

    /**
     * Gets the value of the listMapLinkLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listMapLinkLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListMapLinkLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapLinkNimsLineBO }
     * 
     * 
     */
    public List<MapLinkNimsLineBO> getListMapLinkLine() {
        if (listMapLinkLine == null) {
            listMapLinkLine = new ArrayList<MapLinkNimsLineBO>();
        }
        return this.listMapLinkLine;
    }

    /**
     * Gets the value of the listMerConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listMerConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListMerConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatMerConfigBO }
     * 
     * 
     */
    public List<CatMerConfigBO> getListMerConfig() {
        if (listMerConfig == null) {
            listMerConfig = new ArrayList<CatMerConfigBO>();
        }
        return this.listMerConfig;
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
     * Gets the value of the listMinuteHandOver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listMinuteHandOver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListMinuteHandOver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MinuteHandOverBO }
     * 
     * 
     */
    public List<MinuteHandOverBO> getListMinuteHandOver() {
        if (listMinuteHandOver == null) {
            listMinuteHandOver = new ArrayList<MinuteHandOverBO>();
        }
        return this.listMinuteHandOver;
    }

    /**
     * Gets the value of the listScript property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listScript property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListScript().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatLimitScriptsBO }
     * 
     * 
     */
    public List<CatLimitScriptsBO> getListScript() {
        if (listScript == null) {
            listScript = new ArrayList<CatLimitScriptsBO>();
        }
        return this.listScript;
    }

    /**
     * Gets the value of the listStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatStationBO }
     * 
     * 
     */
    public List<CatStationBO> getListStation() {
        if (listStation == null) {
            listStation = new ArrayList<CatStationBO>();
        }
        return this.listStation;
    }

    /**
     * Gets the value of the listSysGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listSysGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListSysGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SysGroupBO }
     * 
     * 
     */
    public List<SysGroupBO> getListSysGroup() {
        if (listSysGroup == null) {
            listSysGroup = new ArrayList<SysGroupBO>();
        }
        return this.listSysGroup;
    }

    /**
     * Gets the value of the listSysUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listSysUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListSysUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VSysUserBO }
     * 
     * 
     */
    public List<VSysUserBO> getListSysUser() {
        if (listSysUser == null) {
            listSysUser = new ArrayList<VSysUserBO>();
        }
        return this.listSysUser;
    }

    /**
     * Gets the value of the listWarehouse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listWarehouse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListWarehouse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatWarehouseBO }
     * 
     * 
     */
    public List<CatWarehouseBO> getListWarehouse() {
        if (listWarehouse == null) {
            listWarehouse = new ArrayList<CatWarehouseBO>();
        }
        return this.listWarehouse;
    }

    /**
     * Gets the value of the lstMerchandiseOrderBO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstMerchandiseOrderBO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstMerchandiseOrderBO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MerchandiseOrderBO }
     * 
     * 
     */
    public List<MerchandiseOrderBO> getLstMerchandiseOrderBO() {
        if (lstMerchandiseOrderBO == null) {
            lstMerchandiseOrderBO = new ArrayList<MerchandiseOrderBO>();
        }
        return this.lstMerchandiseOrderBO;
    }

    /**
     * Gets the value of the merEntityBO property.
     * 
     * @return
     *     possible object is
     *     {@link MerEntityBO }
     *     
     */
    public MerEntityBO getMerEntityBO() {
        return merEntityBO;
    }

    /**
     * Sets the value of the merEntityBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerEntityBO }
     *     
     */
    public void setMerEntityBO(MerEntityBO value) {
        this.merEntityBO = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the wareExpNoteBO property.
     * 
     * @return
     *     possible object is
     *     {@link WareExpNoteBO }
     *     
     */
    public WareExpNoteBO getWareExpNoteBO() {
        return wareExpNoteBO;
    }

    /**
     * Sets the value of the wareExpNoteBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link WareExpNoteBO }
     *     
     */
    public void setWareExpNoteBO(WareExpNoteBO value) {
        this.wareExpNoteBO = value;
    }

}
