package com.viettel.smartoffice.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.viettel.smartoffice.framework.api.APIResponse;
import com.viettel.smartoffice.ws.dto.KttsRequest;

/**
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 *
 */
@RequestMapping("v1/ktts")
public interface KttsApi {
	static final String JSON_API_CONTENT_HEADER = "Content-type=application/json";
	
	/**
	 * @api {post} /v1/ktts/countEntityByUser WS đếm số lượng tài sản theo cá nhân, BBBG, số BBBG chưa xác nhận
	 * @apiName countEntityByUser
	 * @apiGroup KTTS
	 * 
	 * @apiDescription WS đếm số lượng tài sản theo cá nhân, BBBG, số BBBG chưa xác nhận, 
	 * 
	 * @apiParam {String}		employeeId			mã nhân viên (109, 169202),
	 * @apiParam {Long}			type				(Optional) Loại, 1 - count tài sản theo cá nhân, 2 - count BBBG, 3 - count BBBG chưa xác nhận
	 * @apiParam {String}		keyword				(Optional) Từ khóa
	 * 
	 * @apiParamExample {json} Request-Example:
	 * 				{"employeeId":"169202","type":1}
	 * 
	 * @apiSuccess {Object}   APIResponse	số lượng tài sản theo cá nhân
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"return":8},"resultCode":200}
	 */
	@RequestMapping(value = "/countEntityByUser", method = RequestMethod.POST)
    public @ResponseBody APIResponse countEntityByUser(@RequestBody KttsRequest dto);
	
	
	/**
	 * @api {post} /v1/ktts/getListEntityByUser WS danh sách tài sản theo cá nhân (bao gồm chi tiết sản phẩm)
	 * @apiName getListEntityByUser
	 * @apiGroup KTTS
	 * 
	 * @apiDescription WS danh sách tài sản theo cá nhân (bao gồm chi tiết sản phẩm)
	 * 
	 * @apiParam {String}		employeeId			mã nhân viên, (109, 169202)
	 * @apiParam {String}		keyword				(Optional) Từ khóa
	 * @apiParam {Integer}		start				Vị trí bản ghi
	 * @apiParam {Integer}		limit				Số lượng bản ghi
	 * 
	 * @apiParamExample {json} Request-Example:
	 * 				{"employeeId":"169202","start":"0","limit":"10"}
	 * 
	 * @apiSuccess {Object}   MerEntityId	Danh sách tài sản
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"listMerEntity":[{"assetPrice":1200.0,"catEmployeeId":521,"catMerCode":"TC100","catMerName":"THE CAO MG 100","count":1.0,"entityType":0,"isDevice":0,"isReject":false,"isWarranty":0,"merEntityId":1414419201757,"minuteHandOverCode":"BBBG_TSCN_TCT/17/000011","minuteHandOverDate":1492534800000,"restTime":12,"serialNumber":"SN019647HONG","statusName":"Đang sử dụng","stt":0,"unitName":"bộ","usedDate":1317747600000},{"catEmployeeId":521,"catMerCode":"037093","catMerName":"MPĐ_ Italia_250KVA_GP280_Dầu_Có vỏ chống ồn","companyName":"?n Độ","count":1.0,"entityType":0,"isDevice":1,"isReject":false,"isWarranty":0,"merEntityId":1414420668236,"minuteHandOverCode":"BBBG_TSCN_TCT/17/000010","minuteHandOverDate":1492534800000,"restTime":12,"serialNumber":"SN91320132034","stationCode":"BGG158","statusName":"Đang sử dụng","stt":0,"unitName":"chiếc"},{"catEmployeeId":521,"catMerCode":"CXD_VT","catMerName":"Chưa xác định vật tư","count":1.0,"entityType":0,"isDevice":0,"isReject":false,"isWarranty":0,"merEntityId":1414419237547,"minuteHandOverCode":"BBBG_TSCN_TCT/17/000009","minuteHandOverDate":1492534800000,"restTime":12,"statusName":"Đang sử dụng","stt":0,"unitName":"bộ","usedDate":1444237200000},{"assetPrice":25000.0,"catEmployeeId":521,"catMerCode":"002890","catMerName":"Cáp quang treo 4Fo","companyName":"Huawei-TQ","count":3.0,"entityType":0,"isDevice":0,"isReject":false,"isWarranty":0,"lifeTime":16,"merEntityId":1414420755207,"minuteHandOverCode":"BBBG_TSCN_TCT/17/000009","minuteHandOverDate":1492534800000,"privateManagerName":" Đã báo hỏng: 1; Đã báo KSD: 1;","restTime":4,"restValue":18750.0,"statusName":"Đang sử dụng","stt":0,"unitName":"m","usedDate":1460566800000},{"catEmployeeId":521,"catMerCode":"002878","catMerName":"Cáp Đồng Treo 1000x2x0,4","count":1.0,"entityType":0,"isDevice":0,"isReject":false,"isWarranty":0,"lifeTime":16,"merEntityId":1414420755204,"minuteHandOverCode":"BBBG_TSCN_TCT/17/000008","minuteHandOverDate":1492448400000,"restTime":12,"stationCode":"HNI1990-HNI0017_HNI1547-HNI1749","statusName":"Đang sử dụng","stt":0,"unitName":"m"},{"assetPrice":123.0,"catEmployeeId":521,"catMerCode":"SAMSUNGE1100T","catMerName":"Máy điện thoại Samsung E1100T","companyName":"Hãng thêm mới","count":1.0,"entityType":0,"isDevice":0,"isReject":false,"isWarranty":0,"merEntityId":1414419238184,"minuteHandOverCode":"BBBG_TSCN_TCT/17/000007","minuteHandOverDate":1492448400000,"restTime":12,"stationCode":"DBN219","statusName":"Đang sử dụng","stt":0,"unitName":"Lọ","usedDate":1505494800000},{"assetPrice":1.0,"catEmployeeId":521,"catMerCode":"003159","catMerName":"Cục lạnh điều hòa Panasonic 12000BT","companyName":"ERICSSON","count":1.0,"entityType":0,"isDevice":1,"isReject":false,"isWarranty":0,"merEntityId":1414415522353,"minuteHandOverCode":"BBBG_TSCN_TCT/17/000007","minuteHandOverDate":1492448400000,"restTime":12,"serialNumber":"SAE55697618","stationCode":"SFONE-QTOAN","statusName":"Đang sử dụng","stt":0,"unitName":"card","usedDate":1467910800000},{"assetPrice":400000.0,"catEmployeeId":521,"catMerCode":"003860","catMerName":"Bản cam kết","companyName":"Samsung","count":1.0,"entityType":0,"isDevice":0,"isReject":false,"isWarranty":0,"lifeTime":3,"merEntityId":1414419235081,"minuteHandOverCode":"BBBG_TSCN_TCT/17/000006","minuteHandOverDate":1492448400000,"restTime":12,"restValue":1600000.0,"stationCode":"HNI5045","statusName":"Đang sử dụng","stt":0,"unitName":"tờ","usedDate":1406307600000},{"assetPrice":500000.0,"catEmployeeId":521,"catMerCode":"001610","catMerName":"Backplane Of Giga Universal Service Network","companyName":"bfds","count":1.0,"entityType":0,"isDevice":1,"isReject":false,"isWarranty":0,"lifeTime":4,"merEntityId":1414419238196,"minuteHandOverCode":"BBBG_TSCN_TCT/17/000006","minuteHandOverDate":1492448400000,"restTime":12,"restValue":1500000.0,"serialNumber":"CT22092016000","stationCode":"HNI5053","statusName":"Đang sử dụng","stt":0,"unitName":"bộ","usedDate":1455469200000},{"assetPrice":1.0,"catEmployeeId":521,"catMerCode":"003159","catMerName":"Cục lạnh điều hòa Panasonic 12000BT","companyName":"ERICSSON","count":1.0,"entityType":0,"isDevice":1,"isReject":false,"isWarranty":0,"merEntityId":1414415522351,"minuteHandOverCode":"BBBG_TSCN_TCT/17/000006","minuteHandOverDate":1492448400000,"restTime":12,"serialNumber":"SAE53577067","stationCode":"SFONE-QTOAN","statusName":"Đang sử dụng","stt":0,"unitName":"card","usedDate":1467910800000}],"status":"Success"},"resultCode":200}
	 */
	@RequestMapping(value = "/getListEntityByUser", method = RequestMethod.POST)
    public @ResponseBody APIResponse getListEntityByUser(@RequestBody KttsRequest dto);
	
	
	/**
	 * @api {post} /v1/ktts/getListEntityInHan WS danh sách tài sản trong BBBG TSCN (có phân trang)
	 * @apiName getListEntityInHan
	 * @apiGroup KTTS
	 * 
	 * @apiDescription WS danh sách tài sản trong BBBG TSCN (có phân trang)
	 * 
	 * @apiParam {Long}		idBBBGTSCN			Id của BBBGTSCN
	 * @apiParam {Integer}		start				Vị trí bản ghi
	 * @apiParam {Integer}		limit				Số lượng bản ghi
	 * 
	 * @apiParamExample {json} Request-Example:
	 * 				{"idBBBGTSCN":"1862","start":0,"limit":10}
	 * 
	 * @apiSuccess {Object}   APIResponse	thành công
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"listMerEntity":[{"assetPrice":1.95E7,"catMerCode":"000505","catMerName":"16??8.5 grounding copper bar","count":1.0,"entityType":0,"isReject":false,"isWarranty":0,"merEntityId":1414417052870,"minuteHandOverId":1862,"restTime":12,"stationCode":"TRAM_G_TONG_TRAM_CNT","statusName":"Chưa sử dụng","stt":0,"unitName":"bộ"},{"assetPrice":1.95E7,"catMerCode":"000505","catMerName":"16??8.5 grounding copper bar","count":1.0,"entityType":0,"isReject":false,"isWarranty":0,"merEntityId":1414417055635,"minuteHandOverId":1862,"restTime":12,"stationCode":"TRAM_G_TONG_TRAM_CNT","statusName":"Chưa sử dụng","stt":0,"unitName":"bộ"},{"assetPrice":1.95E7,"catMerCode":"000505","catMerName":"16??8.5 grounding copper bar","count":1.0,"entityType":0,"isReject":false,"isWarranty":0,"merEntityId":1414417053418,"minuteHandOverId":1862,"restTime":12,"stationCode":"TRAM_G_TONG_TRAM_CNT","statusName":"Chưa sử dụng","stt":0,"unitName":"bộ"},{"assetPrice":1.95E7,"catMerCode":"000505","catMerName":"16??8.5 grounding copper bar","count":1.0,"entityType":0,"isReject":false,"isWarranty":0,"merEntityId":1414417055131,"minuteHandOverId":1862,"restTime":12,"stationCode":"TRAM_G_TONG_TRAM_CNT","statusName":"Chưa sử dụng","stt":0,"unitName":"bộ"},{"assetPrice":100000.0,"catMerCode":"008586","catMerName":"HUB 8 cổng 10/100 Planet","count":1.0,"entityType":0,"isReject":false,"isWarranty":0,"merEntityId":1414411236905,"minuteHandOverId":1862,"restTime":12,"serialNumber":"6550","stationCode":"TT.HGG002","statusName":"Hỏng","stt":0,"unitName":"chiếc"},{"assetPrice":100000.0,"catMerCode":"008589","catMerName":"Hệ thống giá đỡ và lồng điều hòa cho nhà trạm C408","count":1.0,"entityType":0,"isReject":false,"isWarranty":0,"merEntityId":1414411236906,"minuteHandOverId":1862,"restTime":12,"serialNumber":"6553","stationCode":"TT.HGG002","statusName":"Hỏng","stt":0,"unitName":"Bộ"},{"assetPrice":100000.0,"catMerCode":"008590","catMerName":"Thang cáp trong nhà Container (sửa từ thang cáp Huawei) (1bộ = m)","count":1.0,"entityType":0,"isReject":false,"isWarranty":0,"merEntityId":1414411236907,"minuteHandOverId":1862,"restTime":12,"serialNumber":"6554","stationCode":"TT.HGG002","statusName":"Hỏng","stt":0,"unitName":"Bộ"},{"assetPrice":100000.0,"catMerCode":"008592","catMerName":"Dây điện thoại có gia cường (2x0,65) + (7x0,4)","count":1.0,"entityType":0,"isReject":false,"isWarranty":0,"merEntityId":1414411236909,"minuteHandOverId":1862,"restTime":12,"serialNumber":"6556","stationCode":"TT.HGG002","statusName":"Hỏng","stt":0,"unitName":"mét"},{"assetPrice":100000.0,"catMerCode":"008593","catMerName":"Mực in Hp 1160","count":1.0,"entityType":0,"isReject":false,"isWarranty":0,"merEntityId":1414411236910,"minuteHandOverId":1862,"restTime":12,"serialNumber":"6557","stationCode":"TT.HGG002","statusName":"Hỏng","stt":0,"unitName":"Cái"},{"assetPrice":1.0,"catMerCode":"006549","catMerName":"?ng nhựa thoát nước cục lạnh","companyName":"Viet Nam","count":2.0,"entityType":0,"isReject":false,"isWarranty":0,"merEntityId":1414419237441,"minuteHandOverId":1862,"nodeCode":"MSS111111","restTime":12,"stationCode":"TT.HGG007","statusName":"Chưa sử dụng","stt":0,"unitName":"m"}],"status":"Success"},"resultCode":200}
	 */
	@RequestMapping(value = "/getListEntityInHan", method = RequestMethod.POST)
    public @ResponseBody APIResponse getListEntityInHan(@RequestBody KttsRequest dto);
	
	
	/**
	 * @api {post} /v1/ktts/getListHandoverByUser WS danh sách BBBG TSCN theo cá nhân
	 * @apiName getListHandoverByUser
	 * @apiGroup KTTS
	 * 
	 * @apiParam {String}		employeeId			mã nhân viên,
	 * @apiParam {Number}		status				(không bắt buộc) trạng thái của BBBG, 0- dang ban giao; 1- da xac nhan; 2- da tu choi
	 * @apiParam {String}		keyword				(Optional) Từ khóa
	 * @apiParam {Integer}		start				Vị trí bản ghi
	 * @apiParam {Integer}		limit				Số lượng bản ghi
	 * 
	 * @apiParamExample {json} Request-Example:
	 * 				{"employeeId":169202,"status":1,"start":0,"limit":10}
	 * 
	 * @apiSuccess {Object}   APIResponse	thành công
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"listMinuteHandOver":[{"acceptDescription":null,"countAsset":1,"createdDate":null,"creatorId":null,"creatorName":null,"description":"test","employeeMinuteHandOVerName":"Đỗ Thu Hà","employeeMinuteHandOverCode":"050166","employeeMinuteReceiverCode":null,"employeeMinuteReceiverName":null,"employeeSignCode":null,"employeeSignName":null,"groupId":null,"groupName":null,"isActive":null,"minuteHandOverCode":"BBBG_TSCN_TCT/17/000011","minuteHandOverDate":1492534800000,"minuteHandOverGiverId":null,"minuteHandOverId":2834,"minuteHandOverReceiverId":null,"minuteHandOverSignId":null,"status":1,"statusName":null,"type":null},{"acceptDescription":null,"countAsset":2,"createdDate":null,"creatorId":null,"creatorName":null,"description":"tet Ã¡dgf","employeeMinuteHandOVerName":"Đỗ Thu Hà","employeeMinuteHandOverCode":"050166","employeeMinuteReceiverCode":null,"employeeMinuteReceiverName":null,"employeeSignCode":null,"employeeSignName":null,"groupId":null,"groupName":null,"isActive":null,"minuteHandOverCode":"BBBG_TSCN_TCT/17/000010","minuteHandOverDate":1492534800000,"minuteHandOverGiverId":null,"minuteHandOverId":2833,"minuteHandOverReceiverId":null,"minuteHandOverSignId":null,"status":1,"statusName":null,"type":null},{"acceptDescription":null,"countAsset":2,"createdDate":null,"creatorId":null,"creatorName":null,"description":"test","employeeMinuteHandOVerName":"Đỗ Thu Hà","employeeMinuteHandOverCode":"050166","employeeMinuteReceiverCode":null,"employeeMinuteReceiverName":null,"employeeSignCode":null,"employeeSignName":null,"groupId":null,"groupName":null,"isActive":null,"minuteHandOverCode":"BBBG_TSCN_TCT/17/000009","minuteHandOverDate":1492534800000,"minuteHandOverGiverId":null,"minuteHandOverId":2832,"minuteHandOverReceiverId":null,"minuteHandOverSignId":null,"status":1,"statusName":null,"type":null},{"acceptDescription":null,"countAsset":2,"createdDate":null,"creatorId":null,"creatorName":null,"description":"test abc","employeeMinuteHandOVerName":"Đỗ Thu Hà","employeeMinuteHandOverCode":"050166","employeeMinuteReceiverCode":null,"employeeMinuteReceiverName":null,"employeeSignCode":null,"employeeSignName":null,"groupId":null,"groupName":null,"isActive":null,"minuteHandOverCode":"BBBG_TSCN_TCT/17/000008","minuteHandOverDate":1492448400000,"minuteHandOverGiverId":null,"minuteHandOverId":2831,"minuteHandOverReceiverId":null,"minuteHandOverSignId":null,"status":1,"statusName":null,"type":null},{"acceptDescription":null,"countAsset":3,"createdDate":null,"creatorId":null,"creatorName":null,"description":"thunt35 test","employeeMinuteHandOVerName":"Đỗ Thu Hà","employeeMinuteHandOverCode":"050166","employeeMinuteReceiverCode":null,"employeeMinuteReceiverName":null,"employeeSignCode":null,"employeeSignName":null,"groupId":null,"groupName":null,"isActive":null,"minuteHandOverCode":"BBBG_TSCN_TCT/17/000007","minuteHandOverDate":1492448400000,"minuteHandOverGiverId":null,"minuteHandOverId":2830,"minuteHandOverReceiverId":null,"minuteHandOverSignId":null,"status":1,"statusName":null,"type":null},{"acceptDescription":null,"countAsset":3,"createdDate":null,"creatorId":null,"creatorName":null,"description":"test","employeeMinuteHandOVerName":"Đỗ Thu Hà","employeeMinuteHandOverCode":"050166","employeeMinuteReceiverCode":null,"employeeMinuteReceiverName":null,"employeeSignCode":null,"employeeSignName":null,"groupId":null,"groupName":null,"isActive":null,"minuteHandOverCode":"BBBG_TSCN_TCT/17/000006","minuteHandOverDate":1492448400000,"minuteHandOverGiverId":null,"minuteHandOverId":2829,"minuteHandOverReceiverId":null,"minuteHandOverSignId":null,"status":1,"statusName":null,"type":null},{"acceptDescription":null,"countAsset":3,"createdDate":null,"creatorId":null,"creatorName":null,"description":"Từ chối","employeeMinuteHandOVerName":"Đỗ Thu Hà","employeeMinuteHandOverCode":"050166","employeeMinuteReceiverCode":null,"employeeMinuteReceiverName":null,"employeeSignCode":null,"employeeSignName":null,"groupId":null,"groupName":null,"isActive":null,"minuteHandOverCode":"BBBG_TSCN_TCT/17/000005","minuteHandOverDate":1492362000000,"minuteHandOverGiverId":null,"minuteHandOverId":2828,"minuteHandOverReceiverId":null,"minuteHandOverSignId":null,"status":1,"statusName":null,"type":null},{"acceptDescription":null,"countAsset":5,"createdDate":null,"creatorId":null,"creatorName":null,"description":null,"employeeMinuteHandOVerName":"Đỗ Thu Hà","employeeMinuteHandOverCode":"050166","employeeMinuteReceiverCode":null,"employeeMinuteReceiverName":null,"employeeSignCode":null,"employeeSignName":null,"groupId":null,"groupName":null,"isActive":null,"minuteHandOverCode":"BBBG_TSCN_TCT/17/000004","minuteHandOverDate":1491930000000,"minuteHandOverGiverId":null,"minuteHandOverId":2827,"minuteHandOverReceiverId":null,"minuteHandOverSignId":null,"status":1,"statusName":null,"type":null}],"status":"Success"},"resultCode":200}
	 */
	@RequestMapping(value = "/getListHandoverByUser", method = RequestMethod.POST)
    public @ResponseBody APIResponse getListHandoverByUser(@RequestBody KttsRequest dto);
	
	
	/**
	 * @api {post} /v1/ktts/updateStatusEntity WS báo hỏng/ báo mất/ báo không sử dụng
	 * @apiName updateStatusEntity
	 * @apiGroup KTTS
	 * 
	 * @apiDescription WS báo hỏng/ báo mất/ báo không sử dụng
	 * 
	 * @apiParam {Long}		merEntityId			Id tài sản
	 * @apiParam {String}		count				Số lượng
	 * @apiParam {String}		date				Ngày
	 * @apiParam {String}		type				tình trạng của tài sản viết trong BBBG (1 - báo mất , 2 - báo hỏng, 3 - báo không sử dụng)
	 * @apiParam {String}		reason				Lý do
	 * 
	 * @apiParamExample {json} Request-Example:
	 * 				{}
	 * 
	 * @apiSuccess {Object}   APIResponse	thành công
	 *
	 * @apiSuccessExample Success-Response:
	 *     {}
	 */
	@RequestMapping(value = "/updateStatusEntity", method = RequestMethod.POST)
    public @ResponseBody APIResponse updateStatusEntity(@RequestBody KttsRequest dto);
	
	
	/**
	 * @api {post} /v1/ktts/updateTypeInHan WS xác nhận/ từ chối BBBG TSCN
	 * @apiName updateTypeInHan
	 * @apiGroup KTTS
	 * 
	 * @apiDescription WS xác nhận/ từ chối BBBG TSCN
	 * 
	 * @apiParam {Long}		idBBBGTSCN			Id của BBBGTSCN
	 * @apiParam {String}		reason				Lý do
	 * @apiParam {String}		type			(không bắt buộc) Loại 1 - báo mất , 2 - báo hỏng, 3 - báo không sử dụng
	 * 
	 * @apiParamExample {json} Request-Example:
	 * 				{}
	 * 
	 * @apiSuccess {String}   Result	Success/Error
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"status":"Success"},"resultCode":200}
	 */
	@RequestMapping(value = "/updateTypeInHan", method = RequestMethod.POST)
    public @ResponseBody APIResponse updateTypeInHan(@RequestBody KttsRequest dto);
}
