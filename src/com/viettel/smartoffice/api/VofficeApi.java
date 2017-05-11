package com.viettel.smartoffice.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.viettel.smartoffice.framework.api.APIResponse;
import com.viettel.smartoffice.ws.dto.VofficeRequest;

/**
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 *
 */
@RequestMapping("v1/voffice")
public interface VofficeApi {
	static final String JSON_API_CONTENT_HEADER = "Content-type=application/json";

	/**
	 * @api {post} /v1/voffice/get_access_token Lấy token để đăng nhập Voffice
	 * @apiName get_access_token
	 * @apiGroup Voffice
	 * 
	 * @apiDescription Hàm Lấy token để đăng nhập Voffice. API: Authenticate.login
	 * <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiParam {String}		username				Username đăng nhập
	 * @apiParam {String}		password				Password đăng nhập
	 * 
	 * @apiParamExample {json} Request-Example:
	 * 				{"username":"010993","password":"222222a@"}
	 * 
	 * @apiSuccess {Long}   	access_token		Access token của Voffice
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"access_token":"3F71412BAFDAE695DAA03108A21AAE57","aes_key":"5626e23598951e0d1379f97c1687bb73VIAESKEYSPACE4f05646eb5187f61","rsa_public_key":"30820122300D06092A864886F70D01010105000382010F003082010A0282010100956D701A507EB4253D8E4891D271A66158B9BA48D6795AB8B6ABEAA57796A4D1DD369C7E69CE4BFE8C98E00EB40FA254C45E3207B7FA56A2C1B21DB6660422855E9CCCA7DBEC1CCCD82A65C5D5A86C5945CFB5C4C4771432BE42C9D08565808C4CE6DA508BFCECFF4D214DB4C348420217C09F717F7DFA06F185634A06DF454DFCC6BF218F4B94D6EA72C144A229699CD10C7EB0E45C0814AB4254A29B1D853F35DACFB07AE68C27DEC8290738E5308C9A0444C4136051EFE58965EB49DE1753774F357A7755887B6AF2C4AC0F8EC7D5D3D141208CC995D65B4ABC67D7E56C764D9FFE45ADF0B1BCD752014EC5E414D802B1275603FBF6EE37460569087FEC650203010001"},"resultCode":0}
	 */
	@RequestMapping(value = "/get_access_token", method = RequestMethod.POST)
	public @ResponseBody APIResponse getAccessToken(@RequestBody VofficeRequest dto);
	
	/**
	 * @api {post} /v1/voffice/sum_mission Lấy số lượng nhiệm vụ
	 * @apiName sum_mission
	 * @apiGroup Voffice
	 * 
	 * @apiDescription Hàm Lấy số lượng nhiệm vụ. API: missionAction.findMissionByCondition
	 * <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiParam {String}		access_token		Token accesss vào Voffice
	 * @apiParam {String}		aes_key				AES key để encrypt data
	 * @apiParam {String}		rsa_public_key		RSA public key để encrypt data
	 * @apiParam {String}		typeMission			tim kiếm theo loại nhiệm vụ (Nhiệm vụ thực hiện: 1, Nhiệm vụ giao đi: 2, Nhiệm vụ phối hợp: 3, Nhiệm vụ BGĐ giao: 4, Nhiệm vụ tôi giao: 5, Nhiệm vụ đơn vị đăng ky': 6, Nhiệm vụ sắp hết hạn: 7)
	 * @apiParam {Array}		listStatus			(Lựa chọn) tim kiếm theo danh sach trạng thái của nhiệm vụ (Chậm tiến độ: 0, Chưa thực hiện: 1,	Đang thực hiện: 2, Đa hoàn thành: 3, Đa kết thúc: 4, Yêu cầu đóng: 5, Đã đóng: 6, Yêu cầu gia hạn: 7, Chưa đóng: 8, Đã chuyển: 9)
	 * @apiParam {Array}		searchOrgIds		(Lựa chọn) tim kiếm theo đơn vị
	 * 
	 * @apiParamExample {json} Request-Example:
	 * {
	 * 		"access_token":"EA55FD0EAE096A02A87CB827BC2F468B"
	 *		,"aes_key":"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e"
	 *		,"rsa_public_key":"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001"
	 *		,"typeMission":"1"
	 *		,"listStatus":[0]
	 * }
	 * 
	 * @apiSuccess {Long}   	missionId		id nhiệm vụ
	 * @apiSuccess {String}   	missionName		tên nhiệm vụ
	 * @apiSuccess {String}   	status			trạng thái nhiệm vụ (0. Chưa giao đi (đang ở trạng thái lưu tạm), 1. Chua thuc hien, 2. Dang thuc hien, 3. Da hoan thanh, 4. Da phe duyet, 5. Yeu cau dong, 6. Da dong, 7. Yêu cầu gia hạn)
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":1325,"resultCode":200}
	 */
	@RequestMapping(value = "/sum_mission", method = RequestMethod.POST)
	public @ResponseBody APIResponse getSumMission(@RequestBody VofficeRequest dto);
	
	/**
	 * @api {post} /v1/voffice/sum_task lấy số lượng công việc
	 * @apiName sum_task
	 * @apiGroup Voffice
	 * 
	 * @apiDescription Hàm lấy số lượng công việc. API: taskAction.getCountHomeTask
	 * <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiParam {String}		access_token		Token accesss vào Voffice
	 * @apiParam {String}		aes_key				AES key để encrypt data
	 * @apiParam {String}		rsa_public_key		RSA public key để encrypt data
	 * @apiParam {String}		type				Loại (0- việc giao đi; 1 - việc thực hiện)
	 * 
	 * @apiParamExample {json} Request-Example:
	 * {
	 * 		"access_token":"EA55FD0EAE096A02A87CB827BC2F468B"
	 *		,"aes_key":"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e"
	 *		,"rsa_public_key":"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001"
	 *		,"type":"1"
	 * }
	 * 
	 * @apiSuccess {Long}   newTask				số lượng việc chưa thực hiện
	 * @apiSuccess {Long}   inProgress			số lượng đang thực hiện
	 * @apiSuccess {Long}   completed			số lượng việc đã hoàn thành
	 * @apiSuccess {Long}   overdue				số lượng việc chậm tiến độ
	 * @apiSuccess {Long}   urgenTask			số lượng việc sắp đến hạn
	 * @apiSuccess {Long}   typeTask			loại việc 1  việc thực hiện; 0 - việc giao đi
	 * @apiSuccess {Long}   isApprovalTask		0 - ko có quyền ký PGV; 1 - có quyền ký phiếu giao việc
	 * @apiSuccess {Long}   isApprovalEvalTask	0 - ko có quyền ký đánh giá; 1 - có quyền đánh giá
	 * @apiSuccess {Long}   approvalTask		Số lượng phiếu giao việc
	 * @apiSuccess {Long}   approvalEvaluation	số lượng phiếu đánh giá
	 * @apiSuccess {Long}   nDayUrgenTask		số ngày cấu hình cảnh báo sắp đến hạn
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"newTask":5,"inProgress":3,"completed":0,"overdue":448,"approvalTask":7,"approvalEvaluation":10,"typeTask":0,"isApprovalTask":1,"isApprovalEvalTask":1,"nDayUrgenTask":0}
	 */
	@RequestMapping(value = "/sum_task", method = RequestMethod.POST)
	public @ResponseBody APIResponse getSumTask(@RequestBody VofficeRequest dto);
	
	
	/**
	 * @api {post} /v1/voffice/sum_doc Lấy số lượng văn bản ký điện tử theo trạng thái trên màn hình home
	 * @apiName sum_doc
	 * @apiGroup Voffice
	 * 
	 * @apiDescription Hàm Lấy số lượng văn bản ký điện tử theo trạng thái trên màn hình home. API: textAction.getCountTextDashboard
	 * <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiParam {String}		access_token		Token accesss vào Voffice
	 * @apiParam {String}		aes_key				AES key để encrypt data
	 * @apiParam {String}		rsa_public_key		RSA public key để encrypt data
	 * @apiParam {String}		fromDate	ngày tìm kiếm từ (mặc định là ngày của 2 tuần trước)
	 * @apiParam {String}		toDate		ngày tìm kiếm đến (mặc định là ngày hiện tại)
	 * 
	 * @apiParamExample {json} Request-Example:
	 * {
	 * 		"access_token":"EA55FD0EAE096A02A87CB827BC2F468B"
	 *		,"aes_key":"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e"
	 *		,"rsa_public_key":"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001"
	 *		,"fromDate":"02/02/2017"
	 *		,"toDate":"16/02/2017"
	 * }
	 * 
	 * @apiSuccess {Long}   countTextSigned				số lượng văn bản đang chờ ban hành
	 * @apiSuccess {Long}   countTextWaitSign			Số lượng văn bản đang chờ ký duyệt
	 * @apiSuccess {Long}   countTextWaitingInitial		số lượng văn bản đang chờ nháy
	 * @apiSuccess {Long}   countTextSecretaryWaitSign	số lượng văn bản đang chờ xét duyệt (với user là văn thư)
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"countTextSigned":626,"countTextWaitSign":6,"countTextWaitingInitial":1},"resultCode":200}
	 */
	@RequestMapping(value = "/sum_doc", method = RequestMethod.POST)
	public @ResponseBody APIResponse getSumDoc(@RequestBody VofficeRequest dto);
	
	/**
	 * @api {post} /v1/voffice/search_task Tìm kiếm danh sách công việc
	 * @apiName search_task
	 * @apiGroup Voffice
	 * 
	 * @apiDescription Hàm Tìm kiếm danh sách công việc. API : taskAction.getListTask
	 * <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiParam {String}		access_token		Token accesss vào Voffice
	 * @apiParam {String}		aes_key				AES key để encrypt data
	 * @apiParam {String}		rsa_public_key		RSA public key để encrypt data
	 * @apiParam {String}		isCount				0 - lấy danh sách; 1 - lấy số lượng
	 * @apiParam {String}		startRecord			bản ghi bắt đầu
	 * @apiParam {String}		pageSize			số bản ghi
	 * @apiParam {String}		taskName			tên công việc
	 * @apiParam {String}		content				nội dung công việc
	 * @apiParam {String}		commanderId			id người giao việc
	 * @apiParam {String}		enforcementId		id người thực hiện
	 * 
	 * @apiParamExample {json} Request-Example:
	 * {
	 * 		"access_token":"EA55FD0EAE096A02A87CB827BC2F468B"
	 *		,"aes_key":"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e"
	 *		,"rsa_public_key":"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001"
	 *		,"isCount":"0"
	 *		,"taskName":"taoj cong viec tren mobile"
	 * }
	 * 
	 * @apiSuccessExample Success-Response:
	 *     [{"taskId":1022995,"taskName":"suar viecj taoj cong viec tren mobile","content":"kfkf","startTime":"05/04/2017 23:40","endTime":"06/04/2017 17:30","taskType":1,"commanderId":6485,"commanderName":"Nguyễn Phúc Đức","enforcementId":18927,"enforcementName":"Phạm Xuân Hoàng","enforcementEmail":"18927","enforcementMobilePhone":"0000000000","commandType":1,"orgName":"Trợ lý nghiệp vụ - Nhóm Dự án - Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1","completedPercent":"0","isCompleted":0,"status":1,"createdBy":6485,"ratingPoint":3,"taskType2":2,"isMajor":1,"taskApprovalId":6485,"approvalState":1,"delayTime":"4:17:35:33","fileId":"219029","fileName":"Bao_cao_giao_nhiem_vu.pdf","filePath":"/task/201704/056000/9d33ea8b-b782-4b2d-a10f-b40885d5a29d.pdf","commanderMobilePhone":"0983015813","commanderEmail":"6485","listFileApproval":[{"fileAttachmentId":219029,"fileName":"Bao_cao_giao_nhiem_vu.pdf","filePath":"/task/201704/056000/9d33ea8b-b782-4b2d-a10f-b40885d5a29d.pdf","fileType":1}],"fileType":1,"period":"201704","createName":"Nguyễn Phúc Đức"},{"taskId":1022994,"taskName":"taoj cong viec tren mobile","content":"kfkf","startTime":"05/04/2017 23:40","endTime":"06/04/2017 17:30","taskType":1,"commanderId":6485,"commanderName":"Nguyễn Phúc Đức","enforcementId":449648,"enforcementName":"Bùi Trường Vinh","enforcementEmail":"449648","enforcementMobilePhone":"0000000000","commandType":1,"orgName":"Thủ trưởng đơn vị - Ban Giám đốc - Trung tâm Phần mềm Khai thác dữ liệu - TT PM 1 - Trung tâm Phần mềm Viettel 1","completedPercent":"0","isCompleted":0,"status":1,"createdBy":6485,"ratingPoint":3,"taskType2":2,"isMajor":1,"taskApprovalId":6485,"approvalState":1,"delayTime":"4:17:35:33","fileId":"219028","fileName":"Bao_cao_giao_nhiem_vu.pdf","filePath":"/task/201704/168274/86b30daf-008d-4d0c-9747-bc814dc7a341.pdf","commanderMobilePhone":"0983015813","commanderEmail":"6485","listFileApproval":[{"fileAttachmentId":219028,"fileName":"Bao_cao_giao_nhiem_vu.pdf","filePath":"/task/201704/168274/86b30daf-008d-4d0c-9747-bc814dc7a341.pdf","fileType":1}],"fileType":1,"period":"201704","createName":"Nguyễn Phúc Đức"}]
	 */
	@RequestMapping(value = "/search_task", method = RequestMethod.POST)
	public @ResponseBody APIResponse searchListTask(@RequestBody VofficeRequest dto);

	/**
	 * @api {post} /v1/voffice/search_mission Tìm kiếm danh sách nhiệm vụ
	 * @apiName search_mission
	 * @apiGroup Voffice
	 * 
	 * @apiDescription Hàm Tìm kiếm danh sách nhiệm vụ. API: missionAction.findMissionByCondition
	 * Thuc hien: "enforcementId":6485 <br>
	 * Giao di : "commanderId":6485
	 * <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiParam {String}		access_token		Token accesss vào Voffice
	 * @apiParam {String}		aes_key				AES key để encrypt data
	 * @apiParam {String}		rsa_public_key		RSA public key để encrypt data
	 * @apiParam {String}		isCount				0 - lấy danh sách; 1 - lấy số lượng
	 * @apiParam {String}		startRecord			bản ghi bắt đầu
	 * @apiParam {String}		pageSize			số bản ghi
	 * @apiParam {String}		typeMission			tim kiếm theo loại nhiệm vụ(Nhiệm vụ thực hiện: 1, Nhiệm vụ giao đi: 2, Nhiệm vụ phối hợp: 3, Nhiệm vụ BGĐ giao: 4, Nhiệm vụ tôi giao: 5, Nhiệm vụ đơn vị đăng ky': 6, Nhiệm vụ sắp hết hạn: 7)
	 * @apiParam {String}		missionName			tên nhiệm vụ
	 * @apiParam {String}		missionId			Id nhiệm vụ bản ghi
	 * @apiParam {Number}		content				(Lựa chọn) nội dung NV
	 * @apiParam {Number}		orgAssignId			(Lựa chọn) id đơn vị giao NV
	 * @apiParam {Number}		orgPerformId		(Lựa chọn) đơn vị thực hiện NV
	 * @apiParam {Array}		searchOrgIds		(Lựa chọn) tim kiếm theo đơn vị
	 * @apiParam {Array}		listStatus			(Lựa chọn) tim kiếm theo danh sach trạng thái của nhiệm vụ (Chậm tiến độ: 0, Chưa thực hiện: 1,	Đang thực hiện: 2, Đa hoàn thành: 3, Đa kết thúc: 4, Yêu cầu đóng: 5, Đã đóng: 6, Yêu cầu gia hạn: 7, Chưa đóng: 8, Đã chuyển: 9)
	 * 
	 * @apiParamExample {json} Request-Example:
	 * {
	 * 		"access_token":"EA55FD0EAE096A02A87CB827BC2F468B"
	 *		,"aes_key":"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e"
	 *		,"rsa_public_key":"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001"
	 *		,"isCount":"0"
	 *		,"missionName":"Tên nhiệm vụ_biên bản họp"
	 *		,"typeMission":"2"
	 * }
	 * 
	 * @apiSuccessExample Success-Response:
	 *     {"data":[{"missionId":28479,"missionName":"Tên nhiệm vụ_biên bản họp","missionPath":"/28479/","content":"Nội dung nhiệm vụ_biên bản họp","target":"Mục tiêu nhiệm vụ","dateStart":"08/04/2017 00:00:00","dateComplete":"18/04/2017 00:00:00","weight":1,"orgAssignId":259217,"assignId":6485,"assignEmail":"nguyenphucduc:\"+_)(*&^%$#@!@viettel.com.vn","orgPerformId":259220,"frequenceUpdate":2,"fieldId":7,"status":1,"createdDate":"08/04/2017 17:21:01","createdBy":6485,"updatedDate":"08/04/2017 17:26:28","isCompleted":0,"isTransferOrgPerform":0,"ORG_PERFORM_NAME":"Nhóm sản phẩm 1 - Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1","ORG_ASSIGN_NAME":"Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1","USER_ASSIGN_NAME":"Nguyễn Phúc Đức","EMP_LEVEL":"9223372036854775807","POSITION_NAME":"Thủ trưởng","lstMissionProcesses":[],"isDocReport":1,"orgPerform":{"sysOrganizationId":259220,"pathName":"Nhóm sản phẩm 1 - Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1","isActive":0},"orgAssign":{"sysOrganizationId":259217,"pathName":"Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1","isActive":0},"assign":{"fullName":"Nguyễn Phúc Đức","empLevel":9223372036854775807,"sysUserId":6485,"positionName":"Thủ trưởng"},"documentReference":[],"missionGroup":1},{"missionId":28481,"missionName":"Tên nhiệm vụ_biên bản họp","missionPath":"/28481/","content":"Nội dung nhiệm vụ_biên bản họp","target":"Mục tiêu nhiệm vụ","dateStart":"08/04/2017 00:00:00","dateComplete":"18/04/2017 00:00:00","weight":1,"orgAssignId":259217,"assignId":6485,"assignEmail":"nguyenphucduc:\"+_)(*&^%$#@!@viettel.com.vn","orgPerformId":259224,"frequenceUpdate":2,"fieldId":7,"status":1,"createdDate":"08/04/2017 17:21:01","createdBy":6485,"updatedDate":"08/04/2017 17:26:28","isCompleted":0,"isTransferOrgPerform":0,"ORG_PERFORM_NAME":"Nhóm Dự án - Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1","ORG_ASSIGN_NAME":"Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1","USER_ASSIGN_NAME":"Nguyễn Phúc Đức","EMP_LEVEL":"9223372036854775807","POSITION_NAME":"Thủ trưởng","lstMissionProcesses":[],"isDocReport":1,"orgPerform":{"sysOrganizationId":259224,"pathName":"Nhóm Dự án - Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1","isActive":0},"orgAssign":{"sysOrganizationId":259217,"pathName":"Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1","isActive":0},"assign":{"fullName":"Nguyễn Phúc Đức","empLevel":9223372036854775807,"sysUserId":6485,"positionName":"Thủ trưởng"},"documentReference":[],"missionGroup":1},{"missionId":28480,"missionName":"Tên nhiệm vụ_biên bản họp","missionPath":"/28480/","content":"Nội dung nhiệm vụ_biên bản họp","target":"Mục tiêu nhiệm vụ","dateStart":"08/04/2017 00:00:00","dateComplete":"18/04/2017 00:00:00","weight":1,"orgAssignId":259217,"assignId":6485,"assignEmail":"nguyenphucduc:\"+_)(*&^%$#@!@viettel.com.vn","orgPerformId":259222,"frequenceUpdate":2,"fieldId":7,"status":1,"createdDate":"08/04/2017 17:21:01","createdBy":6485,"updatedDate":"08/04/2017 17:26:28","isCompleted":0,"isTransferOrgPerform":0,"ORG_PERFORM_NAME":"Nhóm sản phẩm 2 - Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1","ORG_ASSIGN_NAME":"Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1","USER_ASSIGN_NAME":"Nguyễn Phúc Đức","EMP_LEVEL":"9223372036854775807","POSITION_NAME":"Thủ trưởng","lstMissionProcesses":[],"isDocReport":1,"orgPerform":{"sysOrganizationId":259222,"pathName":"Nhóm sản phẩm 2 - Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1","isActive":0},"orgAssign":{"sysOrganizationId":259217,"pathName":"Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1","isActive":0},"assign":{"fullName":"Nguyễn Phúc Đức","empLevel":9223372036854775807,"sysUserId":6485,"positionName":"Thủ trưởng"},"documentReference":[],"missionGroup":1}],"resultCode":200}
	 */
	@RequestMapping(value = "/search_mission", method = RequestMethod.POST)
	public @ResponseBody APIResponse searchListMission(@RequestBody VofficeRequest dto);

	
	/**
	 * @api {post} /v1/voffice/search_doc Tìm kiếm danh sách văn bản + số lượng vb
	 * @apiName search_doc
	 * @apiGroup Voffice
	 * 
	 * @apiDescription Hàm Tìm kiếm danh sách văn bản + số lượng vb. API: DocumentAction.search
	 * <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiParam {String}		access_token		Token accesss vào Voffice
	 * @apiParam {String}		aes_key				AES key để encrypt data
	 * @apiParam {String}		rsa_public_key		RSA public key để encrypt data
	 * @apiParam {String}		isCount				0 - lấy danh sách; 1 - lấy số lượng
	 * @apiParam {String}		startRecord			bản ghi bắt đầu
	 * @apiParam {String}		pageSize			số bản ghi
	 * @apiParam {String}		status				Trạng thái xử lý (0 - tất cả; 1 - công văn chưa xử lý; 2 - Công văn chưa đọc; 3 - Công văn đã đọc; 4 - công văn đã xử lý )
	 * @apiParam {String}		type				1 - Công văn nhận được; 2 - công văn tôi tạo; 3 - công văn chuyển đi
	 * @apiParam {String}		documentId			Id văn bản
	 * @apiParam {String}		title				Tiêu đề văn bản
	 * 
	 * @apiParamExample {json} Request-Example:
	 * 	{
	 * 		"access_token":"EA55FD0EAE096A02A87CB827BC2F468B"
	 *		,"aes_key":"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e"
	 *		,"rsa_public_key":"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001"
	 *		,"isCount":"0"
	 *		,"title":"8:31 hongntl chuyển văn bản thường cho nhóm"
	 *		,"status":"0"
	 *		,"type":"3"
	 *		,"documentId":391177
	 * }
	 * 
	 * @apiSuccessExample Success-Response:
	 *     {"data":[{"documentId":391177,"code":"3131/CT","title":"8:31 hongntl chuyển văn bản thường cho nhóm","promulgateDate":"24/02/2017 00:00:00","receiveDate":"24/02/2017 00:00:00","isArrive":1,"priorityId":1,"priority":"Bình thường","typeId":2,"type":"Chỉ thị","stypeId":1,"stype":"Bình thường","areaId":2,"area":"Công nghệ thông tin","total":1,"listAttachment":[{"documentId":391177,"attachment":"/Van_ban/2017/2/24/391177/593f3c53-6012-492b-96d4-37dfb33ba5d1.pdf","name":"Test chữ ký ngang_4ck.pdf","fileAttachmentId":382710,"storage":"storage8591","filePage":1,"fileSize":103490}],"sendDocType":"Gửi qua hệ thống Voffice"}],"resultCode":200}
	 */
	@RequestMapping(value = "/search_doc", method = RequestMethod.POST)
	public @ResponseBody APIResponse searchListDoc(@RequestBody VofficeRequest dto);

	
	/**
	 * @api {post} /v1/voffice/search_text Tìm kiếm danh sách văn bản ký điện tử
	 * @apiName search_text
	 * @apiGroup Voffice
	 * 
	 * @apiDescription Hàm Tìm kiếm danh sách văn bản ký điện tử. API: textAction.searchText
	 * <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiParam {String}		access_token		Token accesss vào Voffice
	 * @apiParam {String}		aes_key				AES key để encrypt data
	 * @apiParam {String}		rsa_public_key		RSA public key để encrypt data
	 * @apiParam {String}		isCount				0 - lấy danh sách; 1 - lấy số lượng
	 * @apiParam {String}		startRecord			bản ghi bắt đầu
	 * @apiParam {String}		pageSize			số bản ghi
	 * @apiParam {String}		type				loại văn bản tìm kiếm (2 - văn bản xét duyệt; 3 - văn bản ký duyệt; 4 - văn bản ban hành; 7 - văn bản trình ký )
	 * @apiParam {Long}			state				trạng thái văn bản (-3 - Tìm kiếm tất cả ký chính cho mobile; -2 - Tìm kiếm tất cả ký nháy; -1 - Tìm kiếm tất cả ký chính cho web;  0 - chờ ký duyệt/xét duyệt, Chưa trình ký(khi type = 7); 1 - đang xử lý (khi type = 7), văn thư đã từ chối (khi type = 2); 2 - đã từ chối ký duyệt, lãnh đạo đã từ chối (khi type = 2); 3 - người ký cuối đã ký duyệt(Chờ ban hành), văn thư đã xét duyệt (khi type = 2); 4 - đã ký duyệt(user login đã ký khi type = 3), lãnh đạo đã ký duyệt(khi type = 2), đã ban hành (khi type = 4,7); 5 - Chờ ký nháy; 6 - Luồng công văn bị hủy(khi type = 2); 7 - văn bản đã ký nhưng bị lãnh đạo cấp trên từ chối ký; 25 - đã từ chối ký nháy; 27 - Đã hủy ban hành; 45 - đã ký nháy;)	SMO lấy chờ ký nháy truyền: type = 3; state = 5	Lấy chờ ký duyệt truyền:  type = 3; state = 0
	 * @apiParam {String}		keyword				từ khóa tìm kiếm (tìm kiếm theo mã văn bản, tiêu đề, nội dung, id văn bản)
	 * @apiParam {String}		title				tiêu đề
	 * @apiParam {String}		description			nội dung
	 * @apiParam {String}		registerNumber		số đăng ký
	 * @apiParam {String}		code				mã văn bản
	 * @apiParam {String}		areaId				id ngành(lĩnh vực)
	 * @apiParam {String}		typeId				id hình thức văn bản
	 *  
	 * @apiParamExample {json} Request-Example:
	 * 	{
	 * 		"access_token":"EA55FD0EAE096A02A87CB827BC2F468B"
	 *		,"aes_key":"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e"
	 *		,"rsa_public_key":"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001"
	 *		,"isCount":"0"
	 *		,"status":"0"
	 *		,"type":"3"
	 *		,"state":0
	 * }
	 * 
	 * @apiSuccessExample Success-Response:
	 *     {}
	 */
	@RequestMapping(value = "/search_text", method = RequestMethod.POST)
	public @ResponseBody APIResponse searchListText(@RequestBody VofficeRequest dto);
	
	
	/**
	 * @api {post} /v1/voffice/get_list_meeting Lấy danh sách 3 lịch họp gần nhất của user
	 * @apiName get_list_meeting
	 * @apiGroup Voffice
	 * 
	 * @apiDescription Hàm Lấy danh sách 3 lịch họp gần nhất của user. API: MettingWeek.get3MeetingNearestOnDashboard
	 * <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiParam {String}		access_token		Token accesss vào Voffice
	 * @apiParam {String}		aes_key				AES key để encrypt data
	 * @apiParam {String}		rsa_public_key		RSA public key để encrypt data
	 * @apiParam {String}		fromDate			ngày hiện tại sau khi convert sang múi giờ việt nam.(truyền null hệ thống tự động lấy theo giờ hiện tại của server để so sánh) định dạng: dd/MM/yyyy hh24:mm:ss
	 * @apiParam {String}		pageSize			số lượng cuộc họp lấy ra (null để lấy tất cả)
	 *  
	 * @apiParamExample {json} Request-Example:
	 * 				{"fromDate":"16/02/2017 14:09:00","pageSize":5} 
	 * 	{
	 * 		"access_token":"EA55FD0EAE096A02A87CB827BC2F468B"
	 *		,"aes_key":"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e"
	 *		,"rsa_public_key":"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001"
	 *		,"fromDate":"16/02/2017 14:09:00"
	 *		,"pageSize":5
	 * }
	 * 
	 * @apiSuccessExample Success-Response:
	 *     [{"duration":"14:19 - 16:19","roomName":"PH TTPm1","subject":"Cuộc họp test3","startHour":"14","endHour":"16","startMinute":"19","endMinute":"19","meetingId":224316,"startTime":"16/02/2017 14:19:00","endTime":"16/02/2017 16:19:00","isPresident":0,"isParticipate":1,"isPrepare":0,"type":0},{"duration":"17:21 - 19:21","roomName":"PH TTPm1","subject":"Cuộc họp test5","startHour":"17","endHour":"19","startMinute":"21","endMinute":"21","meetingId":224317,"startTime":"16/02/2017 17:21:00","endTime":"16/02/2017 19:21:00","isPresident":0,"isParticipate":1,"isPrepare":0,"type":0},{"duration":"19:22 - 22:22","roomName":"PH TTPm1","subject":"Cuộc họp test4","startHour":"19","endHour":"22","startMinute":"22","endMinute":"22","meetingId":224318,"startTime":"16/02/2017 19:22:00","endTime":"16/02/2017 22:22:00","isPresident":0,"isParticipate":1,"isPrepare":0,"type":0}]
	 */
	@RequestMapping(value = "/get_list_meeting", method = RequestMethod.POST)
	public @ResponseBody APIResponse getListMeeting(@RequestBody VofficeRequest dto);

	/**
	 * @api {post} /v1/voffice/get_list_doc Lấy chi tiết văn bản
	 * @apiName get_list_doc
	 * @apiGroup Voffice
	 * 
	 * @apiDescription Hàm Lấy chi tiết văn bản. API: DocumentAction.getDocumentDetail
	 * <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiParam {String}		access_token		Token accesss vào Voffice
	 * @apiParam {String}		aes_key				AES key để encrypt data
	 * @apiParam {String}		rsa_public_key		RSA public key để encrypt data
	 * @apiParam {Long}		documentId			Id văn bản
	 * 
	 * @apiParamExample {json} Request-Example:
	 * 				{"documentId":"382752"}
	 * {
	 * 		"access_token":"EA55FD0EAE096A02A87CB827BC2F468B"
	 *		,"aes_key":"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e"
	 *		,"rsa_public_key":"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001"
	 *		,"documentId":382752
	 * }
	 * 
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"documentId":382752,"registerNumber":"12","officeSender":"dfa","code":"12/CV-dfa","title":"test gui van ban cho admin","promulgateDate":"26/07/2012 00:00:00","receiveDate":"26/07/2012 00:00:00","deadlineDate":"29/07/2012 00:00:00","isArrive":1,"priorityId":1,"priority":"Bình thường","content":"test gui van ban cho admin","stypeId":1,"stype":"Bình thường","areaId":1,"area":"Hành Chính","isLock":1,"creatorId":74,"numberOfCopy":2,"listAttachment":[{"documentId":382752,"attachment":"/Van_ban/2012/7/26/382752/SEFOLTgwMDI4NTIyOTAwMDAtMDlDTi1ZMjAxMS1MMDAgQkg=.pdf","name":"HAN-8002852290000-09CN-Y2011-L00 BH.pdf","fileAttachmentId":373056}],"attachFiles":[{"documentId":382752,"attachment":"/Van_ban/2012/7/26/382752/SEFOLTgwMDI4NTIyOTAwMDAtMDlDTi1ZMjAxMS1MMDAgQkg=.pdf","name":"HAN-8002852290000-09CN-Y2011-L00 BH.pdf","fileAttachmentId":373056}],"listComment":[{"staffId":55433,"receiverId":26201,"receiveDate":"31/05/2016 09:52:57","commentContent":"New","groupId":6683,"senderName":"Nguyen Thanh Nam","fullName":"Nguyen Thanh Nam","senderEmail":"abcd@viettel.com.vn","senderMobile":"132435345","senderGroupName":"Tổng Công ty Mạng lưới Viettel fullnameVO1","groupName":"Tổng Công ty Mạng lưới Viettel fullnameVO1","receiverName":"Nguyễn Phúc Đức","receiverEmail":"email010993@viettel.com.vn","isReceiveDirect":true},{"staffId":55433,"receiverId":26201,"receiveDate":"31/05/2016 09:52:57","commentContent":"New","groupId":6683,"senderName":"Nguyen Thanh Nam","fullName":"Nguyen Thanh Nam","senderEmail":"abcd@viettel.com.vn","senderMobile":"132435345","senderGroupName":"Tổng Công ty Mạng lưới Viettel fullnameVO1","groupName":"Tổng Công ty Mạng lưới Viettel fullnameVO1","receiverName":"Nguyễn Phúc Đức","receiverEmail":"email010993@viettel.com.vn","isReceiveDirect":true},{"staffId":72,"receiverId":26201,"receiveDate":"26/05/2016 18:20:40","commentContent":"test","groupId":38,"staffId2":495224,"groupId2":254951,"receiverId2":1054,"senderName":"Phạm Thị Hạnh","fullName":"Phạm Thị Hạnh","senderEmail":"495224","senderMobile":"0976636353","senderGroupName":"Phòng Sản phẩm văn phòng điện tử","groupName":"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1","receiverName":"Nguyễn Thanh Nam","receiverEmail":"1054","isReceiveDirect":true},{"staffId":72,"receiverId":55433,"receiveDate":"26/05/2016 18:29:08","commentContent":"test","groupId":38,"staffId2":495224,"groupId2":254951,"receiverId2":1054,"senderName":"Phạm Thị Hạnh","fullName":"Phạm Thị Hạnh","senderEmail":"495224","senderMobile":"0976636353","senderGroupName":"Phòng Sản phẩm văn phòng điện tử","groupName":"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1","receiverName":"Nguyễn Thanh Nam","receiverEmail":"1054","dReceiveDate":"May 26, 2016 6:29:08 PM"},{"staffId":72,"receiverId":55433,"receiveDate":"26/05/2016 18:29:08","commentContent":"test","groupId":38,"staffId2":495224,"groupId2":254951,"receiverId2":1054,"senderName":"Phạm Thị Hạnh","fullName":"Phạm Thị Hạnh","senderEmail":"495224","senderMobile":"0976636353","senderGroupName":"Phòng Sản phẩm văn phòng điện tử","groupName":"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1","receiverName":"Nguyễn Thanh Nam","receiverEmail":"1054","dReceiveDate":"May 26, 2016 6:29:08 PM"},{"staffId":72,"receiverId":55433,"receiveDate":"26/05/2016 18:26:48","commentContent":"test","groupId":38,"staffId2":495224,"groupId2":254951,"receiverId2":1054,"senderName":"Phạm Thị Hạnh","fullName":"Phạm Thị Hạnh","senderEmail":"495224","senderMobile":"0976636353","senderGroupName":"Phòng Sản phẩm văn phòng điện tử","groupName":"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1","receiverName":"Nguyễn Thanh Nam","receiverEmail":"1054","dReceiveDate":"May 26, 2016 6:26:48 PM"},{"staffId":72,"receiverId":55433,"receiveDate":"26/05/2016 18:26:48","commentContent":"test","groupId":38,"staffId2":495224,"groupId2":254951,"receiverId2":1054,"senderName":"Phạm Thị Hạnh","fullName":"Phạm Thị Hạnh","senderEmail":"495224","senderMobile":"0976636353","senderGroupName":"Phòng Sản phẩm văn phòng điện tử","groupName":"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1","receiverName":"Nguyễn Thanh Nam","receiverEmail":"1054","dReceiveDate":"May 26, 2016 6:26:48 PM"},{"staffId":72,"receiverId":55433,"receiveDate":"26/05/2016 18:26:03","commentContent":"test","groupId":38,"staffId2":495224,"groupId2":254951,"receiverId2":1054,"senderName":"Phạm Thị Hạnh","fullName":"Phạm Thị Hạnh","senderEmail":"495224","senderMobile":"0976636353","senderGroupName":"Phòng Sản phẩm văn phòng điện tử","groupName":"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1","receiverName":"Nguyễn Thanh Nam","receiverEmail":"1054","dReceiveDate":"May 26, 2016 6:26:03 PM"},{"staffId":72,"receiverId":55433,"receiveDate":"26/05/2016 18:26:03","commentContent":"test","groupId":38,"staffId2":495224,"groupId2":254951,"receiverId2":1054,"senderName":"Phạm Thị Hạnh","fullName":"Phạm Thị Hạnh","senderEmail":"495224","senderMobile":"0976636353","senderGroupName":"Phòng Sản phẩm văn phòng điện tử","groupName":"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1","receiverName":"Nguyễn Thanh Nam","receiverEmail":"1054","dReceiveDate":"May 26, 2016 6:26:03 PM"},{"staffId":72,"receiverId":55433,"receiveDate":"26/05/2016 18:17:41","commentContent":"test","groupId":38,"staffId2":495224,"groupId2":254951,"receiverId2":1054,"senderName":"Phạm Thị Hạnh","fullName":"Phạm Thị Hạnh","senderEmail":"495224","senderMobile":"0976636353","senderGroupName":"Phòng Sản phẩm văn phòng điện tử","groupName":"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1","receiverName":"Nguyễn Thanh Nam","receiverEmail":"1054","dReceiveDate":"May 26, 2016 6:17:41 PM"},{"staffId":72,"receiverId":55433,"receiveDate":"26/05/2016 18:17:41","commentContent":"test","groupId":38,"staffId2":495224,"groupId2":254951,"receiverId2":1054,"senderName":"Phạm Thị Hạnh","fullName":"Phạm Thị Hạnh","senderEmail":"495224","senderMobile":"0976636353","senderGroupName":"Phòng Sản phẩm văn phòng điện tử","groupName":"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1","receiverName":"Nguyễn Thanh Nam","receiverEmail":"1054","dReceiveDate":"May 26, 2016 6:17:41 PM"}],"listReceiverSameUser":[],"listReceiver":[{"staffId":26201,"receiverId":42789,"receiveDate":"30/05/2016 09:06:33","commentContent":"test","receiverGroupId":0,"staffId2":6485,"receiverId2":733,"receiverGroupId2":148845,"fullName":"Hoàng Anh Xuân","groupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","receiverName":"Hoàng Anh Xuân","receiverEmail":"733","receiverMobile":"0000000000","receiverGroupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","email":"733","mobile":"0000000000","total":27,"status":2,"documentInStaffId":28061911,"isProcessed":0,"isInDepartment":0},{"staffId":26201,"receiverId":55377,"receiveDate":"30/05/2016 09:06:33","commentContent":"test","receiverGroupId":0,"staffId2":6485,"receiverId2":736,"receiverGroupId2":148845,"fullName":"Lê Đăng Dũng","groupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","receiverName":"Lê Đăng Dũng","receiverEmail":"736","receiverMobile":"0000000000","receiverGroupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","email":"736","mobile":"0000000000","status":2,"documentInStaffId":28061912,"isProcessed":0,"isInDepartment":0},{"staffId":26201,"receiverId":55378,"receiveDate":"30/05/2016 09:06:33","commentContent":"test","receiverGroupId":0,"staffId2":6485,"receiverId2":2440,"receiverGroupId2":148845,"fullName":"Hoàng Công Vĩnh","groupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","receiverName":"Hoàng Công Vĩnh","receiverEmail":"2440","receiverMobile":"0000000000","receiverGroupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","email":"2440","mobile":"0000000000","status":2,"documentInStaffId":28061916,"isProcessed":0,"isInDepartment":0},{"staffId":26201,"receiverId":25,"receiveDate":"30/05/2016 09:06:33","commentContent":"test","receiverGroupId":0,"staffId2":6485,"receiverId2":8840,"receiverGroupId2":148845,"fullName":"Hoàng Sơn","groupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","receiverName":"Hoàng Sơn","receiverEmail":"8840","receiverMobile":"0000000000","receiverGroupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","email":"8840","mobile":"0000000000","status":2,"documentInStaffId":28061904,"isProcessed":0,"isInDepartment":0},{"staffId":26201,"receiverId":52026,"receiveDate":"30/05/2016 09:06:33","commentContent":"test","receiverGroupId":0,"staffId2":6485,"receiverId2":737,"receiverGroupId2":148845,"fullName":"Nguyễn Mạnh Hùng","groupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","receiverName":"Nguyễn Mạnh Hùng","receiverEmail":"737","receiverMobile":"0000000000","receiverGroupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","email":"737","mobile":"0000000000","status":2,"documentInStaffId":28061903,"isProcessed":0,"isInDepartment":0}],"listGroup":[{"receiverGroupId":78,"staffId":26201,"groupId":6683,"receiveDate":"24/05/2016 14:12:17","documentInGroupId":5082,"documentId":382752,"receiverGroupName":"Phòng Kỹ thuật","receiverParentGroupId":6683,"groupName":"Phòng Kỹ thuật","total":5},{"receiverGroupId":6697,"staffId":26201,"groupId":6683,"receiveDate":"24/05/2016 14:12:17","documentInGroupId":5081,"documentId":382752,"receiverGroupName":"Phòng Kế hoạch ","receiverParentGroupId":6683,"groupName":"Phòng Kế hoạch ","total":0},{"receiverGroupId":135154,"staffId":26201,"groupId":6683,"receiveDate":"24/05/2016 14:12:17","documentInGroupId":5080,"documentId":382752,"receiverGroupName":"Phòng Công nghệ Thông tin","receiverParentGroupId":6683,"groupName":"Phòng Công nghệ Thông tin","total":0},{"receiverGroupId":6701,"staffId":26201,"groupId":6683,"receiveDate":"24/05/2016 14:12:16","documentInGroupId":5079,"documentId":382752,"receiverGroupName":"Phòng Chính trị","receiverParentGroupId":6683,"groupName":"Phòng Chính trị","total":0},{"receiverGroupId":118007,"staffId":26201,"groupId":6683,"receiveDate":"24/05/2016 14:12:16","documentInGroupId":5078,"documentId":382752,"receiverGroupName":"Ban Truyền thông","receiverParentGroupId":6683,"groupName":"Ban Truyền thông","total":0}],"id":382752,"isConfidential":1,"toDate":"26/07/2012 00:00:00","documentAdjacentTypeId":1,"commentFromDir":[{"staffId":55433,"receiverId":26201,"receiveDate":"31/05/2016 09:52:57","commentContent":"New","groupId":6683,"senderName":"Nguyen Thanh Nam","fullName":"Nguyen Thanh Nam","senderEmail":"abcd@viettel.com.vn","senderMobile":"132435345","senderGroupName":"Tổng Công ty Mạng lưới Viettel fullnameVO1","groupName":"Tổng Công ty Mạng lưới Viettel fullnameVO1","receiverName":"Nguyễn Phúc Đức","receiverEmail":"email010993@viettel.com.vn","isReceiveDirect":true},{"staffId":55433,"receiverId":26201,"receiveDate":"31/05/2016 09:52:57","commentContent":"New","groupId":6683,"senderName":"Nguyen Thanh Nam","fullName":"Nguyen Thanh Nam","senderEmail":"abcd@viettel.com.vn","senderMobile":"132435345","senderGroupName":"Tổng Công ty Mạng lưới Viettel fullnameVO1","groupName":"Tổng Công ty Mạng lưới Viettel fullnameVO1","receiverName":"Nguyễn Phúc Đức","receiverEmail":"email010993@viettel.com.vn","isReceiveDirect":true},{"staffId":72,"receiverId":26201,"receiveDate":"26/05/2016 18:20:40","commentContent":"test","groupId":38,"staffId2":495224,"groupId2":254951,"receiverId2":1054,"senderName":"Phạm Thị Hạnh","fullName":"Phạm Thị Hạnh","senderEmail":"495224","senderMobile":"0976636353","senderGroupName":"Phòng Sản phẩm văn phòng điện tử","groupName":"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1","receiverName":"Nguyễn Thanh Nam","receiverEmail":"1054","isReceiveDirect":true},{"staffId":72,"receiverId":55433,"receiveDate":"26/05/2016 18:29:08","commentContent":"test","groupId":38,"staffId2":495224,"groupId2":254951,"receiverId2":1054,"senderName":"Phạm Thị Hạnh","fullName":"Phạm Thị Hạnh","senderEmail":"495224","senderMobile":"0976636353","senderGroupName":"Phòng Sản phẩm văn phòng điện tử","groupName":"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1","receiverName":"Nguyễn Thanh Nam","receiverEmail":"1054","dReceiveDate":"May 26, 2016 6:29:08 PM"},{"staffId":72,"receiverId":55433,"receiveDate":"26/05/2016 18:29:08","commentContent":"test","groupId":38,"staffId2":495224,"groupId2":254951,"receiverId2":1054,"senderName":"Phạm Thị Hạnh","fullName":"Phạm Thị Hạnh","senderEmail":"495224","senderMobile":"0976636353","senderGroupName":"Phòng Sản phẩm văn phòng điện tử","groupName":"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1","receiverName":"Nguyễn Thanh Nam","receiverEmail":"1054","dReceiveDate":"May 26, 2016 6:29:08 PM"},{"staffId":72,"receiverId":55433,"receiveDate":"26/05/2016 18:26:48","commentContent":"test","groupId":38,"staffId2":495224,"groupId2":254951,"receiverId2":1054,"senderName":"Phạm Thị Hạnh","fullName":"Phạm Thị Hạnh","senderEmail":"495224","senderMobile":"0976636353","senderGroupName":"Phòng Sản phẩm văn phòng điện tử","groupName":"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1","receiverName":"Nguyễn Thanh Nam","receiverEmail":"1054","dReceiveDate":"May 26, 2016 6:26:48 PM"},{"staffId":72,"receiverId":55433,"receiveDate":"26/05/2016 18:26:48","commentContent":"test","groupId":38,"staffId2":495224,"groupId2":254951,"receiverId2":1054,"senderName":"Phạm Thị Hạnh","fullName":"Phạm Thị Hạnh","senderEmail":"495224","senderMobile":"0976636353","senderGroupName":"Phòng Sản phẩm văn phòng điện tử","groupName":"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1","receiverName":"Nguyễn Thanh Nam","receiverEmail":"1054","dReceiveDate":"May 26, 2016 6:26:48 PM"},{"staffId":72,"receiverId":55433,"receiveDate":"26/05/2016 18:26:03","commentContent":"test","groupId":38,"staffId2":495224,"groupId2":254951,"receiverId2":1054,"senderName":"Phạm Thị Hạnh","fullName":"Phạm Thị Hạnh","senderEmail":"495224","senderMobile":"0976636353","senderGroupName":"Phòng Sản phẩm văn phòng điện tử","groupName":"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1","receiverName":"Nguyễn Thanh Nam","receiverEmail":"1054","dReceiveDate":"May 26, 2016 6:26:03 PM"},{"staffId":72,"receiverId":55433,"receiveDate":"26/05/2016 18:26:03","commentContent":"test","groupId":38,"staffId2":495224,"groupId2":254951,"receiverId2":1054,"senderName":"Phạm Thị Hạnh","fullName":"Phạm Thị Hạnh","senderEmail":"495224","senderMobile":"0976636353","senderGroupName":"Phòng Sản phẩm văn phòng điện tử","groupName":"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1","receiverName":"Nguyễn Thanh Nam","receiverEmail":"1054","dReceiveDate":"May 26, 2016 6:26:03 PM"},{"staffId":72,"receiverId":55433,"receiveDate":"26/05/2016 18:17:41","commentContent":"test","groupId":38,"staffId2":495224,"groupId2":254951,"receiverId2":1054,"senderName":"Phạm Thị Hạnh","fullName":"Phạm Thị Hạnh","senderEmail":"495224","senderMobile":"0976636353","senderGroupName":"Phòng Sản phẩm văn phòng điện tử","groupName":"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1","receiverName":"Nguyễn Thanh Nam","receiverEmail":"1054","dReceiveDate":"May 26, 2016 6:17:41 PM"},{"staffId":72,"receiverId":55433,"receiveDate":"26/05/2016 18:17:41","commentContent":"test","groupId":38,"staffId2":495224,"groupId2":254951,"receiverId2":1054,"senderName":"Phạm Thị Hạnh","fullName":"Phạm Thị Hạnh","senderEmail":"495224","senderMobile":"0976636353","senderGroupName":"Phòng Sản phẩm văn phòng điện tử","groupName":"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1","receiverName":"Nguyễn Thanh Nam","receiverEmail":"1054","dReceiveDate":"May 26, 2016 6:17:41 PM"}],"empRecipientDoc":[],"empSendDoc":[{"staffId":26201,"receiverId":42789,"receiveDate":"30/05/2016 09:06:33","commentContent":"test","receiverGroupId":0,"staffId2":6485,"receiverId2":733,"receiverGroupId2":148845,"fullName":"Hoàng Anh Xuân","groupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","receiverName":"Hoàng Anh Xuân","receiverEmail":"733","receiverMobile":"0000000000","receiverGroupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","email":"733","mobile":"0000000000","total":27,"status":2,"documentInStaffId":28061911,"isProcessed":0,"isInDepartment":0},{"staffId":26201,"receiverId":55377,"receiveDate":"30/05/2016 09:06:33","commentContent":"test","receiverGroupId":0,"staffId2":6485,"receiverId2":736,"receiverGroupId2":148845,"fullName":"Lê Đăng Dũng","groupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","receiverName":"Lê Đăng Dũng","receiverEmail":"736","receiverMobile":"0000000000","receiverGroupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","email":"736","mobile":"0000000000","status":2,"documentInStaffId":28061912,"isProcessed":0,"isInDepartment":0},{"staffId":26201,"receiverId":55378,"receiveDate":"30/05/2016 09:06:33","commentContent":"test","receiverGroupId":0,"staffId2":6485,"receiverId2":2440,"receiverGroupId2":148845,"fullName":"Hoàng Công Vĩnh","groupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","receiverName":"Hoàng Công Vĩnh","receiverEmail":"2440","receiverMobile":"0000000000","receiverGroupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","email":"2440","mobile":"0000000000","status":2,"documentInStaffId":28061916,"isProcessed":0,"isInDepartment":0},{"staffId":26201,"receiverId":25,"receiveDate":"30/05/2016 09:06:33","commentContent":"test","receiverGroupId":0,"staffId2":6485,"receiverId2":8840,"receiverGroupId2":148845,"fullName":"Hoàng Sơn","groupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","receiverName":"Hoàng Sơn","receiverEmail":"8840","receiverMobile":"0000000000","receiverGroupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","email":"8840","mobile":"0000000000","status":2,"documentInStaffId":28061904,"isProcessed":0,"isInDepartment":0},{"staffId":26201,"receiverId":52026,"receiveDate":"30/05/2016 09:06:33","commentContent":"test","receiverGroupId":0,"staffId2":6485,"receiverId2":737,"receiverGroupId2":148845,"fullName":"Nguyễn Mạnh Hùng","groupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","receiverName":"Nguyễn Mạnh Hùng","receiverEmail":"737","receiverMobile":"0000000000","receiverGroupName":"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn","email":"737","mobile":"0000000000","status":2,"documentInStaffId":28061903,"isProcessed":0,"isInDepartment":0}],"groupReceiverDoc":[{"receiverGroupId":78,"staffId":26201,"groupId":6683,"receiveDate":"24/05/2016 14:12:17","documentInGroupId":5082,"documentId":382752,"receiverGroupName":"Phòng Kỹ thuật","receiverParentGroupId":6683,"groupName":"Phòng Kỹ thuật","total":5},{"receiverGroupId":6697,"staffId":26201,"groupId":6683,"receiveDate":"24/05/2016 14:12:17","documentInGroupId":5081,"documentId":382752,"receiverGroupName":"Phòng Kế hoạch ","receiverParentGroupId":6683,"groupName":"Phòng Kế hoạch ","total":0},{"receiverGroupId":135154,"staffId":26201,"groupId":6683,"receiveDate":"24/05/2016 14:12:17","documentInGroupId":5080,"documentId":382752,"receiverGroupName":"Phòng Công nghệ Thông tin","receiverParentGroupId":6683,"groupName":"Phòng Công nghệ Thông tin","total":0},{"receiverGroupId":6701,"staffId":26201,"groupId":6683,"receiveDate":"24/05/2016 14:12:16","documentInGroupId":5079,"documentId":382752,"receiverGroupName":"Phòng Chính trị","receiverParentGroupId":6683,"groupName":"Phòng Chính trị","total":0},{"receiverGroupId":118007,"staffId":26201,"groupId":6683,"receiveDate":"24/05/2016 14:12:16","documentInGroupId":5078,"documentId":382752,"receiverGroupName":"Ban Truyền thông","receiverParentGroupId":6683,"groupName":"Ban Truyền thông","total":0}],"lstCvGroup":[{"groupID":2323,"groupId":2323,"name":" Trưởng phó P/B thuộc TTKV3","receiveDate":"28/05/2016 09:29:50"},{"groupID":10375,"groupId":10375,"name":"646464","receiveDate":"28/05/2016 09:29:50"}],"sendDocType":"Gửi qua hệ thống Voffice"},"resultCode":200}
	 */
	@RequestMapping(value = "/view_detail_doc", method = RequestMethod.POST)
	public @ResponseBody APIResponse getDetailDoc(@RequestBody VofficeRequest dto);
	
	
	/**
	 * @api {post} /v1/voffice/get_list_user_sign_with_role Lấy dánh sách đơn vị và role của user
	 * @apiName get_list_user_sign_with_role
	 * @apiGroup Voffice
	 * 
	 * @apiDescription Hàm Lấy dánh sách đơn vị và role của user. API : DocumentService.getLitsUserSignWithRole. 
	 * <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiParam {String}		access_token		Token accesss vào Voffice
	 * @apiParam {String}		aes_key				AES key để encrypt data
	 * @apiParam {String}		rsa_public_key		RSA public key để encrypt data
	 * @apiParam {Long}		username			username đăng nhập
	 * 
	 * @apiParamExample {json} Request-Example:
	 * {
	 * 		"access_token":"EA55FD0EAE096A02A87CB827BC2F468B"
	 *		,"aes_key":"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e"
	 *		,"rsa_public_key":"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001"
	 * }
	 * 
	 * @apiSuccessExample Success-Response:
	 *     [{"userRoleId":861216,"sysUserId":6485,"orgId":259210,"fullName":"Nguyễn Phúc Đức","orgName":"Trung tâm Phần mềm nhân sự - TT PM 1 - Trung tâm Phần mềm Viettel 1"},{"userRoleId":861215,"sysUserId":6485,"orgId":259217,"position":"Trưởng Trung tâm","fullName":"Nguyễn Phúc Đức","orgName":"Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1"}]
	 */
	@RequestMapping(value = "/get_list_user_sign_with_role", method = RequestMethod.POST)
	public @ResponseBody APIResponse getGetListUserSignWithRole(@RequestBody VofficeRequest dto);
	
	/**
	 * @api {post} /v1/voffice/get_text_detail Lấy chi tiết văn bản ký điện tử
	 * @apiName get_text_detail
	 * @apiGroup Voffice
	 * 
	 * @apiDescription Hàm Lấy chi tiết văn bản ký điện tử. API: textAction.getTextDetail
	 * <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiParam {String}		access_token		Token accesss vào Voffice
	 * @apiParam {String}		aes_key				AES key để encrypt data
	 * @apiParam {String}		rsa_public_key		RSA public key để encrypt data
	 * @apiParam {Long}		textId			Id của văn bản ký
	 * 
	 * @apiParamExample {json} Request-Example:
	 * {
	 * 		"access_token":"EA55FD0EAE096A02A87CB827BC2F468B"
	 *		,"aes_key":"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e"
	 *		,"rsa_public_key":"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001"
	 *		,"textId":90144
	 * }
	 * 
	 * @apiSuccessExample Success-Response:
	 *     {"result":{"mess":{"errorCode":200,"message":"ThĂ nh cĂ´ng"},"data": {"title":"Tao file ky","content":"Tao file ky","departSentSign":"Thá»§ trÆ°á»Ÿng Ä‘Æ¡n vá»‹ - Ban GiĂ¡m Ä‘á»‘c - Trung tĂ¢m Pháº§n má»m VÄƒn phĂ²ng Ä‘iá»‡n tá»¬ - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1","departSentSignFullPathVof2":"Thá»§ trÆ°á»Ÿng Ä‘Æ¡n vá»‹ - Ban GiĂ¡m Ä‘á»‘c - Trung tĂ¢m Pháº§n má»m VÄƒn phĂ²ng Ä‘iá»‡n tá»¬ - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1","departSentSignId":"7385","creator":"Nguyá»…n PhĂºc Äá»©c","createDate":"03/04/2017 15:22:59","email":"6485","phoneNumber":"0983015813","state":"1","urgencyCode":"1","urgencyName":"BĂ¬nh thÆ°á»ng","securityCode":"1","securityName":"BĂ¬nh thÆ°á»ng","typeId":"13","typeName":"Káº¿t luáº¬n","promulgatingDepart":"Trung tĂ¢m Pháº§n má»m VÄƒn phĂ²ng Ä‘iá»‡n tá»¬ - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1","areaId":7,"areaString":"Káº¿ hoáº¡ch","signLevel":"0","code":"KL-PM1TTVPDT","fileMainSign":[{"fileAttachmentId":120477,"fileName":"To trinh dieu chinh ke hoach san xuat 06 clip viral 4G.pdf","filePath":"/Text/2017/4/3/90144/0b234807-314f-4079-9d13-00324017acb8.pdf","storage":"storage8591","lFilePage":5,"lFileSize":3571137}],"fileAttachFromSign":[],"fileAttachFromDoc":[],"listSubmitter":[{"textProcessId":"411583","departSentSignFullPathVof2":"TrÆ°á»Ÿng Trung tĂ¢m - Trung tĂ¢m Pháº§n má»m VÄƒn phĂ²ng Ä‘iá»‡n tá»¬ - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1","email":"6485","departmentName":"TrÆ°á»Ÿng Trung tĂ¢m - Trung tĂ¢m Pháº§n má»m VÄƒn phĂ²ng Ä‘iá»‡n tá»¬ - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1","departmentSignId":"6683","signer":"Nguyá»…n PhĂºc Äá»©c","signerId":"6485","signerIdVO1":"26201","signerCode":"010993","status":0,"senderId":26201,"senderName":"Nguyá»…n PhĂºc Äá»©c","receivedId":"259217","haveImageSign":"0","signatureType":"3","signLevel":"0","aliasName":"Nguyá»…n PhĂºc Äá»©c","strCardNumner":"010993","isCreateSignWeb2":1,"orgVhrSignName":"Trung tĂ¢m Pháº§n má»m VÄƒn phĂ²ng Ä‘iá»‡n tá»¬ - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1","stateUserSign":0,"mobile":"0983015813","empVhrId":6485,"empVhrName":"Nguyá»…n PhĂºc Äá»©c","lstFilesCommentSign":[],"isReplaceSigner":1}],"listReviewer":[],"listInnitialSigner":[],"lstStaffSend":[{"isSecrectaryVo1":false,"receiverId":"6485","receiverName":"Nguyá»…n PhĂºc Äá»©c","orgName":"Thá»§ trÆ°á»Ÿng Ä‘Æ¡n vá»‹ - Ban GiĂ¡m Ä‘á»‘c - Trung tĂ¢m Pháº§n má»m VÄƒn phĂ²ng Ä‘iá»‡n tá»¬ - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1","orgId":"259219"},{"isSecrectaryVo1":false,"receiverId":"18927","receiverName":"Pháº¡m XuĂ¢n HoĂ ng","orgName":"Thá»§ trÆ°á»Ÿng Ä‘Æ¡n vá»‹ - Ban GiĂ¡m Ä‘á»‘c - Trung tĂ¢m Pháº§n má»m Sáº£n pháº©m má»›i - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1","orgId":"259228"},{"isSecrectaryVo1":false,"receiverId":"422850","receiverName":"LĂª Cao CÆ°á»ng","orgName":"Trá»£ lĂ½ nghiá»‡p vá»¥ - NhĂ³m sáº£n pháº©m 2 - Trung tĂ¢m Pháº§n má»m VÄƒn phĂ²ng Ä‘iá»‡n tá»¬ - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1","orgId":"259223"},{"isSecrectaryVo1":false,"receiverId":"449648","receiverName":"BĂ¹i TrÆ°á»ng Vinh","orgName":"Thá»§ trÆ°á»Ÿng Ä‘Æ¡n vá»‹ - Ban GiĂ¡m Ä‘á»‘c - Trung tĂ¢m Pháº§n má»m Khai thĂ¡c dá»¯ liá»‡u - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1","orgId":"259251"},{"isSecrectaryVo1":false,"receiverId":"488816","receiverName":"Nguyá»…n Thá»‹ Thu","orgName":"Trá»£ lĂ½ nghiá»‡p vá»¥ - NhĂ³m Dá»± Ă¡n - Trung tĂ¢m Pháº§n má»m TĂ¬ch há»£p - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1","orgId":"259248"},{"isSecrectaryVo1":false,"receiverId":"495224","receiverName":"Pháº¡m Thá»‹ Háº¡nh","orgName":"Trá»£ lĂ½ nghiá»‡p vá»¥ - NhĂ³m Dá»± Ă¡n - Trung tĂ¢m Pháº§n má»m VÄƒn phĂ²ng Ä‘iá»‡n tá»¬ - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1","orgId":"259225"}],"textId":90144,"isLienKe":0,"creatorId":26201,"officePublishedId":259217,"autoPublicText":"0","autoPromulgateText":"1","autoSendText":"1","AUTO_PROMULGATE_TEXT":1,"AUTO_SEND_TEXT":1,"isCreateSignWeb2":1,"stateUserSign":0,"creatorIdVof2":6485,"sendDate":"03/04/2017 15:22:59"}}}
	 */
	@RequestMapping(value = "/get_text_detail", method = RequestMethod.POST)
	public @ResponseBody APIResponse getTextDetail(@RequestBody VofficeRequest dto);
	
	/**
	 * @api {post} /v1/voffice/get_task_text Lấy chi tiết công việc
	 * @apiName get_task_text
	 * @apiGroup Voffice
	 * 
	 * @apiDescription Hàm Lấy chi tiết công việc. Method: taskAction.getTaskDetail
	 * <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiParam {String}		access_token		Token accesss vào Voffice
	 * @apiParam {String}		aes_key				AES key để encrypt data
	 * @apiParam {String}		rsa_public_key		RSA public key để encrypt data
	 * @apiParam {Long}		taskId			id công việc
	 * 
	 * @apiParamExample {json} Request-Example:
	 * {
	 * 		"access_token":"EA55FD0EAE096A02A87CB827BC2F468B"
	 *		,"aes_key":"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e"
	 *		,"rsa_public_key":"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001"
	 *		,"textId":90144
	 *		,"type":0
	 *		,"isListFile":0
	 * }
	 * 
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"taskId":1022992,"taskName":"Công việc 2 người","content":"dfg","startTime":"05/04/2017 08:00","endTime":"05/04/2017 17:30","taskType":1,"taskTypeName":"Công việc chức năng","commanderId":6485,"commanderName":"Nguyễn Phúc Đức","enforcementId":375911,"enforcementName":"Trần Văn Bằng","enforcementEmail":"375911","enforcementMobilePhone":"987806506","updateFrequency":1,"updateFrequencyName":"Cập nhật theo ngày","fieldId":77,"commandType":1,"orgId":259225,"orgName":"Trợ lý nghiệp vụ - Nhóm Dự án - Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1","completedPercent":"0","isCompleted":0,"status":2,"statusName":"Đang thực hiện","createdDate":"05/04/2017 23:16:00","createdBy":6485,"taskResult":"s","partitionBy":"201704","taskPath":"/1022992/","ratingPoint":3,"taskType2":2,"taskTypeName2":"Công việc đột xuất","isMajor":1,"permissionsForTask":{"delete":1,"edit":1,"receiveTask":0,"rejectReceive":0,"reAssign":0,"close":0,"update":0,"approve":0,"rejectApprove":0,"transferredTask":1},"commanderMobilePhone":"0983015813","commanderEmail":"nguyenphucduc:\"+_)(*&^%$#@!@viettel.com.vn"},"resultCode":200}
	 */
	@RequestMapping(value = "/get_task_detail", method = RequestMethod.POST)
	public @ResponseBody APIResponse getTaskDetail(@RequestBody VofficeRequest dto);
	
	/**
	 * @api {post} /v1/voffice/get_mission_detail Lấy chi tiết nhiệm vụ
	 * @apiName get_mission_detail
	 * @apiGroup Voffice
	 * 
	 * @apiDescription Hàm Lấy chi tiết nhiệm vụ. Method: missionAction.getMissionDetail
	 * <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiParam {String}		access_token		Token accesss vào Voffice
	 * @apiParam {String}		aes_key				AES key để encrypt data
	 * @apiParam {String}		rsa_public_key		RSA public key để encrypt data
	 * @apiParam {Long}		missionId			id nhiệm vụ
	 * 
	 * @apiParamExample {json} Request-Example:
	 * {
	 * 		"access_token":"EA55FD0EAE096A02A87CB827BC2F468B"
	 *		,"aes_key":"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e"
	 *		,"rsa_public_key":"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001"
	 *		,"missionId":28542
	 * }
	 * 
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"missionId":28542,"missionName":"giao cho hồng 2204","missionPath":"/28542/","content":"fdsfe","target":"fefe","dateStart":"22/04/2017","dateComplete":"22/04/2017","orgType":1,"orgAssignId":259217,"orgAssignName":"Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1","assignId":6485,"assignName":"Nguyễn Phúc Đức","assignEmail":"nguyenphucduc:\"+_)(*&^%$#@!@viettel.com.vn","assignMobilePhone":"0983015813","orgPerformId":259222,"orgPerformName":"Nhóm sản phẩm 2 - Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1","frequenceUpdate":2,"frequenceUpdateName":"Cập nhật theo tuần","fieldId":597,"status":1,"statusName":"Chưa thực hiện","createdDate":"22/04/2017","createdBy":6485,"createdByName":"Nguyễn Phúc Đức","createdByEmail":"nguyenphucduc:\"+_)(*&^%$#@!@viettel.com.vn","createdByMobilePhone":"0983015813","delFlag":0,"isTransferOrgPerform":0,"listSource":[{"sourceMapId":26765,"sourceName":"ề","sourceType":1,"sourceTypeName":"Theo nguồn gốc khác","objectType":2}],"permissionOfAssignOrg":{"created":true,"deliver":true,"guide":false,"edit":true,"delete":true,"transfer":true,"checked":false},"permissionOfPerformOrg":{"create":true,"reject":false,"approve":false,"update":false},"permissionOfCombinationOrg":{"update":false},"levelImportance":1,"isDocReport":1,"listDocumentRef":[],"missionGroup":1},"resultCode":200}
	 */
	@RequestMapping(value = "/get_mission_detail", method = RequestMethod.POST)
	public @ResponseBody APIResponse getMissionDetail(@RequestBody VofficeRequest dto);
}
