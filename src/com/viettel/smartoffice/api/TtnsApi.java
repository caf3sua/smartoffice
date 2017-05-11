package com.viettel.smartoffice.api;

import javax.ws.rs.QueryParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.viettel.smartoffice.framework.api.APIResponse;
import com.viettel.smartoffice.ws.dto.TtnsRequest;

/**
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 *
 */
@RequestMapping("v1/ttns")
public interface TtnsApi {
	static final String JSON_API_CONTENT_HEADER = "Content-type=application/json";
	
	/**
	 * @api {get} /get-access-token API lấy access token
	 * @apiName get-access-token
	 * @apiGroup TTNS
	 * 
	 * @apiDescription API lấy access token. <br>
	 * http://localhost:8080/smartoffice/api/v1/ttns/get-access-token
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * 
	 * @apiExample {curl} Example usage:
	 *     curl -i http://10.58.71.138:8765/APIs/oauth/token?grant_type=password&client_id=smartOffice2-client-id&client_secret=12345&username=smartOffice2&password=password
	 * 
	 * @apiSuccess {Object}   APIResponse	OK contains access-key of TTNS
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":"7bf4b181-8143-42a5-a5c1-76b5185a2da4","resultCode":200}
	 */
	@RequestMapping(value = "/get-access-token", method = RequestMethod.GET)
	public @ResponseBody APIResponse getAccessToken();
	
	/**
	 * 1. API lấy quá trình công tác của nhân viên
	 * http://localhost:8080/smartoffice/api/v1/ttns/{id}/work-process
	 * 
	 * {"data":{"statusType":"OK","entity":[{"positionCode":"379","positionId":7458,"positionName":"PBan Doanh thu hàng hoá","organizationId":240506,"organizationName":"Ban giám đốc 2-Ban Tổng giám đốc-Khối cơ quan Tập đoàn","organizationCode":"BGDTD","type":1,"effectiveDate":1490374800000,"expiredDate":null},{"positionCode":"370","positionId":7450,"positionName":"PBan Truyền thông ","organizationId":148845,"organizationName":"Thủ trưởng đơn vị-Ban Tổng giám đốc-Khối cơ quan Tập đoàn","organizationCode":"001","type":1,"effectiveDate":1490288400000,"expiredDate":1490288400000},{"positionCode":"370","positionId":7450,"positionName":"PBan Truyền thông ","organizationId":148845,"organizationName":"Thủ trưởng đơn vị-Ban Tổng giám đốc-Khối cơ quan Tập đoàn","organizationCode":"001","type":1,"effectiveDate":1484154000000,"expiredDate":1490202000000},{"positionCode":"370","positionId":7450,"positionName":"PBan Truyền thông ","organizationId":240506,"organizationName":"Ban giám đốc 2-Ban Tổng giám đốc-Khối cơ quan Tập đoàn","organizationCode":"BGDTD","type":1,"effectiveDate":1483981200000,"expiredDate":1484067600000},{"positionCode":"345","positionId":7732,"positionName":"Tổ trưởng tổ hành chính","organizationId":148847,"organizationName":"Ban Lãnh đạo-Văn phòng-Khối cơ quan Tập đoàn","organizationCode":"001","type":1,"effectiveDate":1472662800000,"expiredDate":1483894800000},{"positionCode":"345","positionId":7732,"positionName":"Tổ trưởng tổ hành chính","organizationId":148845,"organizationName":"Thủ trưởng đơn vị-Ban Tổng giám đốc-Khối cơ quan Tập đoàn","organizationCode":"001","type":1,"effectiveDate":1472576400000,"expiredDate":1472576400000},{"positionCode":"1600","positionId":8914,"positionName":"NV An toàn mạng","organizationId":198738,"organizationName":"Phụ trách trung tâm-TT thiết kế PM kinh doanh viễn thông-Trung tâm Phần mềm Viễn thông Viettel","organizationCode":"001","type":1,"effectiveDate":1470330000000,"expiredDate":1472490000000},{"positionCode":"376","positionId":7456,"positionName":"TBan Cước kết nối0","organizationId":238914,"organizationName":"Phòng Xử lý báo hỏng-TT CSKH Hồ Chí Minh-Trung tâm Chăm sóc khách hàng - TCT VT","organizationCode":"015","type":1,"effectiveDate":1457542800000,"expiredDate":1470243600000},{"positionCode":"384","positionId":7462,"positionName":"NV Kinh doanh VoIP","organizationId":150072,"organizationName":"Ban Kế hoạch đào tạo-Phòng Đào tạo-Trung tâm Đào tạo Viettel","organizationCode":"002","type":1,"effectiveDate":1438362000000,"expiredDate":1457456400000},{"positionCode":"374","positionId":7454,"positionName":"NV Hỗ trợ tỉnh","organizationId":148848,"organizationName":"Ban Hợp tác Quốc tế-Văn phòng-Khối cơ quan Tập đoàn","organizationCode":"002","type":1,"effectiveDate":1431277200000,"expiredDate":1438275600000},{"positionCode":"9348","positionId":9348,"positionName":"Bảo vệ mỏ","organizationId":150099,"organizationName":"Phụ trách khoa-Khoa Kinh tế-Trung tâm Đào tạo Viettel","organizationCode":"001","type":4,"effectiveDate":1396198800000,"expiredDate":1398790800000},{"positionCode":"407","positionId":7485,"positionName":"Tổng Giám đốc","organizationId":150069,"organizationName":"Thủ trưởng đơn vị-Ban Giám đốc TT-Trung tâm Đào tạo Viettel","organizationCode":"001","type":4,"effectiveDate":1395853200000,"expiredDate":1396112400000},{"positionCode":"052","positionId":7830,"positionName":"Giám đốc Trung tâm","organizationId":148857,"organizationName":"Ban Tổ chức-Phòng Chính trị-Khối cơ quan Tập đoàn","organizationCode":"002","type":1,"effectiveDate":1391446800000,"expiredDate":1431190800000},{"positionCode":"CD000403_T","positionId":8224,"positionName":"Trưởng bộ phận bán hàng","organizationId":236101,"organizationName":"Ban phát triển-Phòng Giải pháp tích hợp-Trung tâm Giải pháp Doanh nghiệp - TT GP.CNTT-VT","organizationCode":"003","type":1,"effectiveDate":1378832400000,"expiredDate":1391360400000},{"positionCode":"1116","positionId":8464,"positionName":"Kỹ sư phát triển phần mềm","organizationId":203328,"organizationName":"Nhân viên-Nhân viên-Trung tâm Giải pháp và ứng dụng - TT GP CNTT-VT (hết hiệu lực)","organizationCode":"001","type":1,"effectiveDate":1368810000000,"expiredDate":1378746000000},{"positionCode":"1116","positionId":8464,"positionName":"Kỹ sư phát triển phần mềm","organizationId":200053,"organizationName":"Trợ lý nghiệp vụ-Phòng Phần mềm BCCS-Trung tâm Giải pháp và Ứng dụng - CTy VT","organizationCode":"002","type":1,"effectiveDate":1366650000000,"expiredDate":1368723600000},{"positionCode":"1345","positionId":8096,"positionName":"NV Phân tích","organizationId":199886,"organizationName":"Nhân viên-Nhân viên-Trung tâm Phần mềm Doanh nghiệp - TT GP CNTT-VT (hết hiệu lực)","organizationCode":"002","type":1,"effectiveDate":1354294800000,"expiredDate":1366563600000},{"positionCode":"1345","positionId":8096,"positionName":"NV Phân tích","organizationId":196859,"organizationName":"Ban Phân tích và thiết kế CSDL-Phòng Phát triển phần mềm-Trung tâm Phần mềm Doanh nghiệp Viettel","organizationCode":"003","type":1,"effectiveDate":1343754000000,"expiredDate":1354208400000},{"positionCode":"1116","positionId":8464,"positionName":"Kỹ sư phát triển phần mềm","organizationId":164661,"organizationName":"Ban Tổ chức lao động-Phòng Tổ chức - Chính trị-Trung tâm Phần mềm Viễn thông Viettel","organizationCode":"002","type":1,"effectiveDate":1321894800000,"expiredDate":1343667600000},{"positionCode":"1116","positionId":8464,"positionName":"Kỹ sư phát triển phần mềm","organizationId":164622,"organizationName":"Phòng Phần mềm ERP-TTPM Giải pháp Doanh nghiệp-Trung tâm PM Doanh nghiệp Viettel (hết hiệu lực)","organizationCode":"002","type":1,"effectiveDate":1314723600000,"expiredDate":1321808400000},{"positionCode":"1116","positionId":8464,"positionName":"Kỹ sư phát triển phần mềm","organizationId":151216,"organizationName":"Phòng Phần mềm ERP-Trung tâm Phần mềm Giải pháp doanh nghiệp-Trung tâm Phần mềm Viettel (hết hiệu lực)","organizationCode":"002","type":1,"effectiveDate":1301590800000,"expiredDate":1314637200000},{"positionCode":"069","positionId":7838,"positionName":"NV CNTT","organizationId":149837,"organizationName":"Phòng PM Tài sản và Tài chính-Trung tâm PM Giải pháp doanh nghiệp-Trung tâm Phần mềm - Cty VT(hết hiệu lực)","organizationCode":"002","type":1,"effectiveDate":1282237200000,"expiredDate":1301504400000},{"positionCode":"374","positionId":7454,"positionName":"NV Hỗ trợ tỉnh","organizationId":148865,"organizationName":"Ban Tổng hợp-Phòng Kế hoạch-Khối cơ quan Tập đoàn","organizationCode":"002","type":1,"effectiveDate":1277917200000,"expiredDate":1282150800000}],"entityType":"java.util.ArrayList","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200},"resultCode":200}
	 */
	@RequestMapping(value = "/{id}/work-process", method = RequestMethod.GET)
	public @ResponseBody APIResponse workProcess(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * API lấy quá trình công tác gần nhất của nhân viên 
	 * http://localhost:8080/smartoffice/api/v1/ttns/{id}/work-process/latest
	 * 
	 * {"statusType":"OK","entity":{"positionCode":"379","positionId":7458,"positionName":"PBan Doanh thu hàng hoá","organizationId":240506,"organizationName":"Ban giám đốc 2-Ban Tổng giám đốc-Khối cơ quan Tập đoàn","organizationCode":"BGDTD","type":1,"effectiveDate":1490374800000,"expiredDate":null},"entityType":"com.viettel.employee.model.EmpWorkProcessBean","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200}
	 */
	@RequestMapping(value = "/{id}/work-process/latest", method = RequestMethod.GET)
	public @ResponseBody APIResponse workProcessLatest(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * APIs lấy thông tin quá trình đào tạo và nghiên cứu
	 * http://localhost:8080/smartoffice/api/v1/ttns/41387/education-process
	 * param: 
	 * from_time
	 * end_time
	 */
	@RequestMapping(value = "/{id}/education-process", method = RequestMethod.POST)
	public @ResponseBody APIResponse educationProcess(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id, @RequestBody TtnsRequest dto);
	
	/**
	 * APIs lấy thông tin quá trình đào tạo và nghiên cứu gần nhất
	 * http://localhost:8080/smartoffice/api/v1/ttns/41387/education-process/latest
	 * 
	 * {"statusType":"OK","entity":{"edStarDate":null,"edEndDate":null,"edProfessional":"CNTT","edType":"Chính qui","rank":null,"isInternational":null,"status":2,"rejectComment":null,"edPlace":"ĐH Công nghệ - ĐHQG Hà Nội","levelEducation":"Đại học","educationProcessId":"677062","degreeDecissionNumber":"123","degreeName":"Kỹ sư","isMainEduForm":1,"isSpecializedSchool":1},"entityType":"com.viettel.employee.model.EducationProcessBean","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200}
	 */
	@RequestMapping(value = "/{id}/education-process/latest", method = RequestMethod.GET)
	public @ResponseBody APIResponse educationProcessLatest(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * APIs lấy diễn biến lương chức danh
	 * http://localhost:8080/smartoffice/api/v1/ttns/41387/salary-process
	 * 
	 * {"statusType":"OK","entity":[{"decisionNumber":"HDLD","signDate":1285866000000,"salaryPosition":null,"hscd":"3.9","effectiveStartDate":1285866000000,"effectiveEndDate":1285866000000,"salaryWage":"2/12","percent":null,"salaryTableName":"1612- Bảng lương thực hiện từ 1/3/2010","salaryCategoryName":"20-Chuyên viên; Kỹ sư","raiseDate":1285866000000},{"decisionNumber":"2433/QĐ-VTQĐ-TCNL","signDate":1320080400000,"salaryPosition":null,"hscd":"3.9","effectiveStartDate":1320080400000,"effectiveEndDate":null,"salaryWage":"2","percent":"0","salaryTableName":"2433 - Bang luong thuc hien tu 1/11/2011 2433 - Bang luong thuc hien tu 1/11/2011 2433 - Bang luong thuc hien tu 1/11/2011","salaryCategoryName":"19-Chuyên viên; Kỹ sư","raiseDate":1286298000000},{"decisionNumber":"1835/QĐ-VTQĐ-TCNL","signDate":1316019600000,"salaryPosition":6000000,"hscd":"3.9","effectiveStartDate":1309453200000,"effectiveEndDate":1319994000000,"salaryWage":"2","percent":null,"salaryTableName":"1835 - Bảng lương thực hiện từ 1/07/2011","salaryCategoryName":"19-Chuyên viên, kỹ sư","raiseDate":1286038800000},{"decisionNumber":"12/2010-NL-TCLĐ","signDate":1263056400000,"salaryPosition":null,"hscd":"3.9","effectiveStartDate":1285952400000,"effectiveEndDate":1309366800000,"salaryWage":"2/12","percent":null,"salaryTableName":"1612- Bảng lương thực hiện từ 1/3/2010","salaryCategoryName":"20-Chuyên viên; Kỹ sư","raiseDate":1285952400000}],"entityType":"java.util.ArrayList","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200}
	 */
	@RequestMapping(value = "/{id}/salary-process", method = RequestMethod.GET)
	public @ResponseBody APIResponse salaryProcess(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * APIs lấy diễn biến lương chức danh mới nhất
	 * http://localhost:8080/smartoffice/api/v1/ttns/{id}/salary-process/latest
	 * {"statusType":"OK","entity":{"decisionNumber":"2433/QĐ-VTQĐ-TCNL","signDate":1320080400000,"salaryPosition":null,"hscd":"3.9","effectiveStartDate":1320080400000,"effectiveEndDate":null,"salaryWage":"2","percent":"0","salaryTableName":"2433 - Bang luong thuc hien tu 1/11/2011 2433 - Bang luong thuc hien tu 1/11/2011 2433 - Bang luong thuc hien tu 1/11/2011","salaryCategoryName":"19-Chuyên viên; Kỹ sư","raiseDate":1286298000000},"entityType":"com.viettel.employee.model.VEmpSalaryFactorBean","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200}
	 */
	@RequestMapping(value = "/{id}/salary-process/latest", method = RequestMethod.GET)
	public @ResponseBody APIResponse salaryProcessLatest(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * APIs lấy diễn biến lương bảo hiểm
	 * http://localhost:8080/smartoffice/api/v1/ttns/{id}/insurance-process
	 * 
	 * {"statusType":"OK","entity":[{"decisionNumber":"dq","signDate":1472662800000,"raiseDate":1472662800000,"factor":"2.16","effectiveStartDate":1470762000000,"effectiveEndDate":null,"salaryWage":"2/3","salaryTableName":"Bảng lương công nhân lái xe","salaryCategoryName":"N1-Xe tắc xi, xe con ở các doanh nghiệp, xe tải dưới 3,5 tấn, xe khách dưới 20 chỗ ngồi"},{"decisionNumber":"sda","signDate":1446483600000,"raiseDate":1446483600000,"factor":"1.89","effectiveStartDate":1446483600000,"effectiveEndDate":1470675600000,"salaryWage":"4/12","salaryTableName":"Thừa hành phục vụ","salaryCategoryName":"N1-Nhân viên văn thư"},{"decisionNumber":"HDLD","signDate":1285866000000,"raiseDate":1285866000000,"factor":"3.9","effectiveStartDate":1285866000000,"effectiveEndDate":1446397200000,"salaryWage":"5/12","salaryTableName":"Chuyên môn nghiệp vụ","salaryCategoryName":"N3-Chuyên viên, kinh tế viên, kỹ sư"}],"entityType":"java.util.ArrayList","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200}
	 */
	@RequestMapping(value = "/{id}/insurance-process", method = RequestMethod.GET)
	public @ResponseBody APIResponse insuranceProcess(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * APIs lấy diễn biến lương bảo hiểm mới nhất
	 * http://localhost:8080/smartoffice/api/v1/ttns/{id}/insurance-process/latest
	 * 
	 * {"statusType":"OK","entity":{"decisionNumber":"dq","signDate":1472662800000,"raiseDate":1472662800000,"factor":"2.16","effectiveStartDate":1470762000000,"effectiveEndDate":null,"salaryWage":"2/3","salaryTableName":"Bảng lương công nhân lái xe","salaryCategoryName":"N1-Xe tắc xi, xe con ở các doanh nghiệp, xe tải dưới 3,5 tấn, xe khách dưới 20 chỗ ngồi"},"entityType":"com.viettel.employee.model.VEmpSalaryProcessBean","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200}
	 */
	@RequestMapping(value = "/{id}/insurance-process/latest", method = RequestMethod.GET)
	public @ResponseBody APIResponse insuranceProcessLatest(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * 9. APIs lấy quá trình diện đối tượng
	 * http://localhost:8080/smartoffice/api/v1/ttns/{id}/emp-type-process
	 * 
	 * {"statusType":"OK","entity":[{"empTypeName":"Hợp đồng lao động","empTypeLaber":"Hợp đồng dài hạn","empTypeTimeLaber":null,"startDate":1468515600000,"endDate":null},{"empTypeName":"QNCN","empTypeLaber":null,"empTypeTimeLaber":null,"startDate":1464714000000,"endDate":1468429200000},{"empTypeName":"QNCN","empTypeLaber":null,"empTypeTimeLaber":null,"startDate":1456765200000,"endDate":1464627600000},{"empTypeName":"SQDB","empTypeLaber":null,"empTypeTimeLaber":null,"startDate":1454259600000,"endDate":1456678800000},{"empTypeName":"SQ","empTypeLaber":null,"empTypeTimeLaber":"12","startDate":1451581200000,"endDate":1454173200000},{"empTypeName":"QNCN","empTypeLaber":null,"empTypeTimeLaber":null,"startDate":1438362000000,"endDate":1451494800000},{"empTypeName":"Hợp đồng lao động","empTypeLaber":"Hợp đồng dài hạn","empTypeTimeLaber":null,"startDate":1431277200000,"endDate":1438275600000},{"empTypeName":"Hợp đồng lao động","empTypeLaber":"Hợp đồng dài hạn","empTypeTimeLaber":null,"startDate":1343754000000,"endDate":1431190800000},{"empTypeName":"Hợp đồng lao động","empTypeLaber":"Hợp đồng dài hạn","empTypeTimeLaber":null,"startDate":1317402000000,"endDate":1343667600000},{"empTypeName":"Hợp đồng lao động","empTypeLaber":"Hợp đồng dài hạn","empTypeTimeLaber":null,"startDate":1285866000000,"endDate":1317315600000},{"empTypeName":"Hợp đồng lao động","empTypeLaber":"Thử việc","empTypeTimeLaber":"2","startDate":1277917200000,"endDate":1285779600000}],"entityType":"java.util.ArrayList","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200}
	 */
	@RequestMapping(value = "/{id}/emp-type-process", method = RequestMethod.GET)
	public @ResponseBody APIResponse empTypeProcess(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * 10. APIs lấy quá trình diện đối tượng mới nhất
	 * http://localhost:8080/smartoffice/api/v1/ttns/{id}/emp-type-process/latest
	 * 
	 * {"statusType":"OK","entity":{"empTypeName":"Hợp đồng lao động","empTypeLaber":"Hợp đồng dài hạn","empTypeTimeLaber":null,"startDate":1468515600000,"endDate":null},"entityType":"com.viettel.employee.model.VEmpTypeProcessBean","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200}
	 */
	@RequestMapping(value = "/{id}/emp-type-process/latest", method = RequestMethod.GET)
	public @ResponseBody APIResponse empTypeProcessLatest(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * 11. APIs lấy quá trình loại cán bộ
	 * http://10.58.71.138:8765/APIs/api/v1/manager/employee/{id}/manager-type-process
	 */
	@RequestMapping(value = "/{id}/manager-type-process", method = RequestMethod.GET)
	public @ResponseBody APIResponse managerTypeProcess(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * 12. APIs lấy quá trình loại cán bộ mới nhất
	 * http://10.58.71.138:8765/APIs/api/v1/manager/employee/{id}/manager-type-process/latest
	 */
	@RequestMapping(value = "/{id}/manager-type-process/latest", method = RequestMethod.GET)
	public @ResponseBody APIResponse managerTypeProcessLatest(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * 13. APIs lấy danh sách khen thưởng của nhân viên
	 * http://localhost:8080/smartoffice/api/v1/ttns/{id}/reward
	 * 
	 * {"statusType":"OK","entity":[{"rwSignDate":null,"rwReason":null,"rwDocument":null,"rwForm":"Bằng khen cấp Bộ","rwPuType":null,"rwType":null,"rwLevel":null},{"rwSignDate":1262192400000,"rwReason":"Khen thưởng năm 2009","rwDocument":"3477/QĐ-TCT-CTr","rwForm":null,"rwPuType":"Lao động tiên tiến","rwType":null,"rwLevel":null}],"entityType":"java.util.ArrayList","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200}
	 */
	@RequestMapping(value = "/{id}/reward", method = RequestMethod.GET)
	public @ResponseBody APIResponse reward(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * 14. APIs lấy danh sách Kỷ luật của nhân viên
	 * http://localhost:8080/smartoffice/api/v1/ttns/{id}/descipline
	 * 
	 * {"statusType":"OK","entity":[{"rwSignDate":1375030800000,"rwReason":"Thực hiện sai quy trình tuyển dụng nhân viên địa bàn (vi phạm năm 2012)","rwDocument":"5140","rwForm":"Khiển trách","rwPuType":null,"rwType":null,"rwLevel":"Kinh doanh"},{"rwSignDate":1289408400000,"rwReason":"12345+6","rwDocument":"123456","rwForm":"Cách chức","rwPuType":null,"rwType":null,"rwLevel":"Kỹ thuật"}],"entityType":"java.util.ArrayList","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200}
	 */
	@RequestMapping(value = "/{id}/descipline", method = RequestMethod.GET)
	public @ResponseBody APIResponse descipline(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * 15. APIs lấy thuế và giảm trừ
	 * http://localhost:8080/smartoffice/api/v1/ttns/{id}/tax-reduction
	 * 
	 * {"statusType":"OK","entity":[{"deName":"Nguyễn Kimi","relative":"Con gái","deReson":null,"deStartDate":1451581200000,"deEndDate":null,"status":null,"taxReductionId":223245,"familyRelationShipId":180172},{"deName":"Vũ Thị Dung","relative":"Mẹ","deReson":null,"deStartDate":1444842000000,"deEndDate":null,"status":null,"taxReductionId":222897,"familyRelationShipId":149133},{"deName":"Vũ Thị Dung","relative":"Mẹ","deReson":null,"deStartDate":1444842000000,"deEndDate":null,"status":null,"taxReductionId":222812,"familyRelationShipId":149133},{"deName":"Vũ Thị Dung","relative":"Mẹ","deReson":null,"deStartDate":1444842000000,"deEndDate":null,"status":null,"taxReductionId":222884,"familyRelationShipId":149133},{"deName":"Vũ Thị Dung","relative":"Mẹ","deReson":null,"deStartDate":1443632400000,"deEndDate":1446224400000,"status":null,"taxReductionId":222737,"familyRelationShipId":149133},{"deName":"Vũ Thị Dung","relative":"Mẹ","deReson":null,"deStartDate":1443632400000,"deEndDate":1446224400000,"status":null,"taxReductionId":222738,"familyRelationShipId":149133},{"deName":"Nguyễn Văn Tuân","relative":"Anh","deReson":null,"deStartDate":1443632400000,"deEndDate":null,"status":null,"taxReductionId":222780,"familyRelationShipId":149137},{"deName":"Vũ Thị Dung","relative":null,"deReson":null,"deStartDate":1443632400000,"deEndDate":1445965200000,"status":null,"taxReductionId":222735,"familyRelationShipId":149133},{"deName":"Tùng 20cm","relative":null,"deReson":null,"deStartDate":1443632400000,"deEndDate":1471453200000,"status":null,"taxReductionId":222734,"familyRelationShipId":180021},{"deName":"Nguyễn Văn Tuân","relative":null,"deReson":null,"deStartDate":1443632400000,"deEndDate":null,"status":null,"taxReductionId":222752,"familyRelationShipId":149137},{"deName":"Vũ Thị Dung","relative":null,"deReson":null,"deStartDate":1443632400000,"deEndDate":1445965200000,"status":null,"taxReductionId":222736,"familyRelationShipId":149133},{"deName":"Vũ Thị Dung","relative":null,"deReson":null,"deStartDate":1443632400000,"deEndDate":null,"status":null,"taxReductionId":222750,"familyRelationShipId":149133},{"deName":"Vũ Thị Dung","relative":"Mẹ","deReson":null,"deStartDate":1443632400000,"deEndDate":1451494800000,"status":null,"taxReductionId":222779,"familyRelationShipId":149133},{"deName":"Nguyễn Thị Xâm","relative":"Chị","deReson":null,"deStartDate":1267376400000,"deEndDate":null,"status":null,"taxReductionId":223132,"familyRelationShipId":149135},{"deName":"Nguyễn Văn Năng","relative":"Bố","deReson":null,"deStartDate":1264957200000,"deEndDate":1444410000000,"status":null,"taxReductionId":223082,"familyRelationShipId":180121},{"deName":"Nguyễn Văn Tuyền","relative":"Anh","deReson":null,"deStartDate":1241110800000,"deEndDate":null,"status":null,"taxReductionId":222420,"familyRelationShipId":149138},{"deName":"Tùng 20cm","relative":"Cháu ruột","deReson":null,"deStartDate":1233421200000,"deEndDate":null,"status":null,"taxReductionId":222661,"familyRelationShipId":180021},{"deName":"Lương Thị Huyền","relative":"Vợ","deReson":null,"deStartDate":1233421200000,"deEndDate":null,"status":null,"taxReductionId":223091,"familyRelationShipId":180131},{"deName":"Tùng 20cm","relative":"Cháu ruột","deReson":null,"deStartDate":1199120400000,"deEndDate":1225386000000,"status":null,"taxReductionId":222660,"familyRelationShipId":180021},{"deName":"Vũ Thị Dung","relative":"Mẹ","deReson":null,"deStartDate":476038800000,"deEndDate":null,"status":null,"taxReductionId":222400,"familyRelationShipId":149133}],"entityType":"java.util.ArrayList","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200}
	 */
	@RequestMapping(value = "/{id}/tax-reduction", method = RequestMethod.GET)
	public @ResponseBody APIResponse taxReduction(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * 16. APIs lấy quan hệ gia đình
	 * http://localhost:8080/smartoffice/api/v1/ttns/{id}/family-relationship
	 * 
	 * {"statusType":"OK","entity":[{"fullName":"6546546","relationTypeName":"Anh của Bố","yearOfBirth":6565,"currentRelated":1,"idPasspordNumber":null,"nationName":null,"isLivingAbroad":null,"permanentResidence":null,"currentResidence":null,"job":null,"workOrganization":null,"unionParty":0,"policyType":null,"policyYear":null,"decideNumber":null,"sacrificePlace":null,"soldierLevelName":null,"injuryPercent":null,"familyRelationshipId":180772,"taxNumber":null},{"fullName":"Hoang Khắc Hợp","relationTypeName":"Anh","yearOfBirth":2015,"currentRelated":1,"idPasspordNumber":"123456","nationName":"Barbados","isLivingAbroad":null,"permanentResidence":null,"currentResidence":"Đức Đồng - Đức Thọ - Hà Tĩnh","job":null,"workOrganization":null,"unionParty":0,"policyType":null,"policyYear":null,"decideNumber":null,"sacrificePlace":null,"soldierLevelName":null,"injuryPercent":"0","familyRelationshipId":180432,"taxNumber":null},{"fullName":"Nguyễn Kimi","relationTypeName":"Con gái","yearOfBirth":2015,"currentRelated":1,"idPasspordNumber":null,"nationName":"Viet Nam","isLivingAbroad":null,"permanentResidence":null,"currentResidence":null,"job":"Còn nhỏ","workOrganization":null,"unionParty":null,"policyType":null,"policyYear":null,"decideNumber":null,"sacrificePlace":null,"soldierLevelName":null,"injuryPercent":null,"familyRelationshipId":180172,"taxNumber":null},{"fullName":"Lương Thị Huyền","relationTypeName":"Vợ","yearOfBirth":1988,"currentRelated":1,"idPasspordNumber":"151534087","nationName":"Vietnam","isLivingAbroad":null,"permanentResidence":null,"currentResidence":"Hà Nội","job":"Tester","workOrganization":null,"unionParty":null,"policyType":null,"policyYear":null,"decideNumber":null,"sacrificePlace":null,"soldierLevelName":null,"injuryPercent":null,"familyRelationshipId":180131,"taxNumber":null},{"fullName":"Nguyễn Thị Huệ","relationTypeName":"Mẹ của vợ","yearOfBirth":1965,"currentRelated":1,"idPasspordNumber":null,"nationName":"Vietnam","isLivingAbroad":1,"permanentResidence":"dfhsdfhsdf","currentResidence":null,"job":"Trồng trọt","workOrganization":null,"unionParty":0,"policyType":null,"policyYear":null,"decideNumber":null,"sacrificePlace":null,"soldierLevelName":null,"injuryPercent":null,"familyRelationshipId":180130,"taxNumber":null},{"fullName":"Nguyễn Văn Năng","relationTypeName":"Bố","yearOfBirth":1958,"currentRelated":1,"idPasspordNumber":null,"nationName":"Viet Nam","isLivingAbroad":null,"permanentResidence":null,"currentResidence":null,"job":"Trồng trọt","workOrganization":null,"unionParty":null,"policyType":null,"policyYear":null,"decideNumber":null,"sacrificePlace":null,"soldierLevelName":null,"injuryPercent":null,"familyRelationshipId":180121,"taxNumber":null},{"fullName":"Tùng 20cm","relationTypeName":"Cháu ruột","yearOfBirth":null,"currentRelated":1,"idPasspordNumber":"Hộ chiếu","nationName":"Vietnam","isLivingAbroad":1,"permanentResidence":"Hộ khẩu thường trú","currentResidence":"Nơi ở hiện nay","job":"Nghề nghiệp","workOrganization":"đơn vị công tác","unionParty":2,"policyType":1,"policyYear":2015,"decideNumber":"giấy báo tử","sacrificePlace":"nơi chiến trường","soldierLevelName":null,"injuryPercent":"0","familyRelationshipId":180021,"taxNumber":"mã số thuế"},{"fullName":"Nguyễn Văn Liệu","relationTypeName":"Anh","yearOfBirth":1979,"currentRelated":1,"idPasspordNumber":"98765445345345CA","nationName":"Taiwan","isLivingAbroad":null,"permanentResidence":null,"currentResidence":"số nhà A12345 - ngách 20/11 - phố 70","job":"Đi học","workOrganization":"Thái Bình","unionParty":null,"policyType":1,"policyYear":null,"decideNumber":null,"sacrificePlace":null,"soldierLevelName":null,"injuryPercent":null,"familyRelationshipId":149137,"taxNumber":null},{"fullName":"Nguyễn Thị Xâm","relationTypeName":"Chị","yearOfBirth":1975,"currentRelated":1,"idPasspordNumber":null,"nationName":"Vietnam","isLivingAbroad":null,"permanentResidence":null,"currentResidence":"An Quý, Quỳnh Phụ, Thái Bình","job":"Làm ruộng","workOrganization":"Thái Bình","unionParty":null,"policyType":1,"policyYear":0,"decideNumber":null,"sacrificePlace":null,"soldierLevelName":null,"injuryPercent":null,"familyRelationshipId":149135,"taxNumber":null},{"fullName":"Nguyễn Thị Duyên","relationTypeName":"Chị","yearOfBirth":1973,"currentRelated":1,"idPasspordNumber":"12432134","nationName":"Vietnam","isLivingAbroad":null,"permanentResidence":"3214234","currentResidence":"Quỳnh Lưu, Quỳnh Phụ, Thái Bình","job":"Làm ruộng","workOrganization":"Thái Bình","unionParty":0,"policyType":1,"policyYear":null,"decideNumber":null,"sacrificePlace":"ewrtwtqt","soldierLevelName":null,"injuryPercent":"0","familyRelationshipId":149134,"taxNumber":"1234123412"},{"fullName":"Vũ Thị Dung","relationTypeName":"Mẹ","yearOfBirth":null,"currentRelated":1,"idPasspordNumber":"112345","nationName":"Suriname","isLivingAbroad":1,"permanentResidence":"Thái Bình","currentResidence":"Quỳnh Lưu, Quỳnh Phụ, Thái Bình 1","job":"Làm nông","workOrganization":"Thái Bình","unionParty":1,"policyType":2,"policyYear":2014,"decideNumber":"so quyet dinh","sacrificePlace":"adad","soldierLevelName":"Hạng 4/4","injuryPercent":"90","familyRelationshipId":149133,"taxNumber":"12345"}],"entityType":"java.util.ArrayList","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200}
	 */
	@RequestMapping(value = "/{id}/family-relationship", method = RequestMethod.GET)
	public @ResponseBody APIResponse familyRelationship(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * 17. APIs lấy thành tích nổi bật cá nhân
	 * http://localhost:8080/smartoffice/api/v1/ttns/{id}/relic-feature
	 * 
	 * {"statusType":"OK","entity":[],"entityType":"java.util.ArrayList","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200}
	 */
	@RequestMapping(value = "/{id}/relic-feature", method = RequestMethod.GET)
	public @ResponseBody APIResponse relicFeature(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/*
	 * ------------------------------------------
	 * Compassionate Leave - Nghỉ phép
	 * ------------------------------------------
	 */
	/**
	 * @api {get} /:id/compassionate-leave lấy danh sách nghỉ của nhân viên
	 * @apiName compassionate-leave-employee
	 * @apiGroup TTNS-CompassionateLeave
	 * 
	 * @apiDescription 18. APIs lấy danh sách nghỉ của nhân viên. <br>
	 * http://localhost:8080/smartoffice/api/v1/ttns/{id}/compassionate-leave
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		type			Loại đơn xin nghỉ {0: Lấy tất cả,1:Xin nghỉ phép,3 : Xin nghỉ ốm,5: xin nghỉ con ốm,7: Xin nghỉ việc riêng }
	 * @apiParam {Number}		from_date		Thời gian xin nghỉ từ ngày (Không bắt buộc)
	 * @apiParam {Number}		to_date			Thời gian xin nghỉ đến ngày (Không bắt buộc)
	 * @apiParam {Number}		status			Trạng thái Trình ký { 0:Chưa trình ký,1:Đã phê duyệt,2:Từ chối phê duyệt,3:Đang chờ phê duyệt} (Không bắt buộc)
	 * 
	 * @apiSuccess {Object}   APIResponse	danh sách nghỉ của nhân viên
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"statusType":"OK","entity":[{"type":1,"fromDate":1472691600000,"toDate":1473417000000,"status":1},{"type":1,"fromDate":1473814800000,"toDate":1473935400000,"status":2},{"type":1,"fromDate":1473814800000,"toDate":1473849000000,"status":3},{"type":1,"fromDate":1473901200000,"toDate":1474021800000,"status":2},{"type":3,"fromDate":1444440000000,"toDate":1444872600000,"status":3},{"type":3,"fromDate":1444439700000,"toDate":1444879800000,"status":3},{"type":3,"fromDate":1441674540000,"toDate":1440637680000,"status":3},{"type":3,"fromDate":1476950400000,"toDate":1476954000000,"status":0},{"type":3,"fromDate":1476954000000,"toDate":1476961200000,"status":3},{"type":3,"fromDate":1436947620000,"toDate":1436861220000,"status":3},{"type":3,"fromDate":1473670560000,"toDate":1473756960000,"status":0},{"type":5,"fromDate":1436724420000,"toDate":1440094080000,"status":0},{"type":5,"fromDate":1438135620000,"toDate":1441418940000,"status":3},{"type":5,"fromDate":1477101600000,"toDate":1479787200000,"status":0},{"type":7,"fromDate":1279577040000,"toDate":1441017000000,"status":3},{"type":7,"fromDate":1438402080000,"toDate":1440821280000,"status":3},{"type":7,"fromDate":1444036200000,"toDate":1446282600000,"status":0},{"type":7,"fromDate":1444440600000,"toDate":1444872600000,"status":3},{"type":7,"fromDate":1439456880000,"toDate":1439284080000,"status":3},{"type":7,"fromDate":1444440600000,"toDate":1444872000000,"status":3},{"type":7,"fromDate":1461204240000,"toDate":1461377040000,"status":0},{"type":7,"fromDate":1444461600000,"toDate":1444905000000,"status":3},{"type":7,"fromDate":1436242020000,"toDate":1437797220000,"status":0},{"type":7,"fromDate":1438229220000,"toDate":1436155620000,"status":0}],"entityType":"java.util.ArrayList","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200},"resultCode":200}
	 */
	@RequestMapping(value = "/{id}/compassionate-leave", method = RequestMethod.GET)
	public @ResponseBody APIResponse compassionateLeaveGetByEmployeeId(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id, 
			@QueryParam("from_date") String fromDate,
			@QueryParam("to_date") String todate,
			@QueryParam("type") String type,
			@QueryParam("status") String status);
	
	/**
	 * @api {get} /compassionate-leave lấy danh sách nghỉ bởi ID đơn xin nghỉ hoặc loại
	 * @apiName compassionate-leave
	 * @apiGroup TTNS-CompassionateLeave
	 * 
	 * @apiDescription 18.1. APIs lấy danh sách nghỉ của nhân viên. <br>
	 * http://localhost:8080/smartoffice/api/v1/ttns/compassionate-leave
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {String}		personalFormId	Id đơn xin nghỉ phép - not required
	 * @apiParam {String}		type			Loại đơn xin nghỉ {1: Xin nghỉ phép, 3: Xin nghỉ ốm, 5: xin nghỉ con ốm, 7: Xin nghỉ việc riêng } - not required
	 * 
	 * @apiExample {curl} Example usage:
	 *     curl -i http://localhost:8080/smartoffice/api/v1/ttns/compassionate-leave?type=0&personalFormId=1189
	 * 
	 * @apiSuccess {Object}   APIResponse	danh sách nghỉ của nhân viên
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"statusType":"OK","entity":[{"personalFormId":1189,"empoyeeId":461856,"type":1,"organizationId":164648,"reason":"đơn xin nghỉ phép 7/4","fromDate":1491526800000,"toDate":1491561000000,"phoneNumber":"01657678657","stayAddress":"CN Viettel Hà Giang","employeeReplaceId":null,"positionReplace":null,"resolveScope":null,"position":"PBan Doanh thu hàng hoá","status":1,"createdDate":1490762056000,"currentAddress":"Mễ trì hạ - nam Từ Liêm - hà Nội","modifyDate":null,"title":null,"department":"CHỈ HUY ĐƠN VỊ","titleSiger1":"NGƯỜI KÝ 1","titleSiger2":null,"titleSiger3":null,"titleSiger4":null}],"entityType":"java.util.ArrayList","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200},"resultCode":200}
	 */
	@RequestMapping(value = "/compassionate-leave", method = RequestMethod.GET)
	public @ResponseBody APIResponse compassionateLeaveGetList(@RequestHeader("TTNS-TOKEN") String token, 
			@QueryParam("personalFormId") String personalFormId,
			@QueryParam("type") String type);
	
	
	/**
	 * @api {post} /:id/compassionate-leave đăng kí/update nghỉ của nhân viên 
	 * @apiName register-update-compassionate-leave
	 * @apiGroup TTNS-CompassionateLeave
	 * 
	 * @apiDescription 19. APIs đăng kí nghỉ của nhân viên . <br>
	 * http://localhost:8080/smartoffice/api/v1/ttns/{id}/compassionate-leave
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		type			Loại đơn xin nghỉ {0: Lấy tất cả, 1: Xin nghỉ phép, 3: Xin nghỉ ốm, 5: xin nghỉ con ốm, 7: Xin nghỉ việc riêng }
	 * @apiParam {Number}		id				ID đăng kí nghỉ (Không bắt buộc)
	 * @apiParam {Number}		from_date		Thời gian xin nghỉ từ ngày
	 * @apiParam {Number}		to_date			Thời gian xin nghỉ đến ngày
	 * @apiParam {String}		reason			Lý do (Không bắt buộc với các trường hợp xin Nghỉ con ốm, xin nghỉ ốm)
	 * @apiParam {String}		type_resign		Loại hình nghỉ (Bắt buộc với TH nghỉ việc riêng Còn lại không bắt buộc) 1:Có hưởng lương, 2: Không hưởng lương
	 * 
	 * @apiExample {curl} Example usage:
	 *     curl -i http://localhost:8080/smartoffice/api/v1/ttns/41387/compassionate-leave
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"statusType":"OK","entity":"Thành công","entityType":"java.lang.StringBuilder","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200},"resultCode":200}
	 */
	@RequestMapping(value = "/{id}/compassionate-leave", method = RequestMethod.POST)
	public @ResponseBody APIResponse compassionateLeaveRegister(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id, @RequestBody TtnsRequest dto);
	
	/**
	 * @api {post} /:id/compassionate-leave/delete Xóa đăng kí nghỉ của nhân viên 
	 * @apiName compassionate-leave-delete
	 * @apiGroup TTNS-CompassionateLeave
	 * 
	 * @apiDescription APIs xóa đăng kí nghỉ của nhân viên<br>
	 * http://10.58.71.138:8765/TTNSWebService/api/v1/employee/{id}/compassionate-leave/delete
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		form_type_id		Id loại đơn xin nghỉ 1: xóa đơn xin nghỉ phép 3: Xóa đơn xin nghỉ ốm 5: Xóa đơn xin nghỉ con ốm 7: xóa đơn xin nghỉ việc riêng.
	 * @apiParam {Number}		personal_form_id	Id đơn xin nghỉ
	 * 
	 * @apiExample {curl} Example usage:
	 *     curl -i http://localhost:8080/smartoffice/api/v1/ttns/41387/compassionate-leave/delete
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"statusType":"OK","entity":"Suscess","entityType":"java.lang.String","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200},"resultCode":200}
	 */
	@RequestMapping(value = "/{id}/compassionate-leave/delete", method = RequestMethod.POST)
	public @ResponseBody APIResponse compassionateLeaveDelete(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id, @RequestBody TtnsRequest dto);
	
	/**
	 * @api {post} /:id/remaining-annual Lấy số ngày phép còn lại của nhân viên
	 * @apiName remaining-annual
	 * @apiGroup TTNS-CompassionateLeave
	 * 
	 * @apiDescription APIs Lấy số ngày phép còn lại của nhân viên. <br>
	 * http://localhost:8080/smartoffice/api/v1/ttns/{id}/remaining-annual
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * 
	 * @apiExample {curl} Example usage:
	 *     curl -i http://localhost:8080/smartoffice/api/v1/ttns/41387/remaining-annual
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {}
	 */
	@RequestMapping(value = "/{id}/remaining-annual", method = RequestMethod.GET)
	public @ResponseBody APIResponse remainingAnnual(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * @api {post} /:id/compassionate-leave/sign trình ký đăng kí nghỉ của nhân viên
	 * @apiName compassionate-leave/sign
	 * @apiGroup TTNS-CompassionateLeave
	 * 
	 * @apiDescription APIs trình ký đăng kí nghỉ của nhân viên. <br>
	 * http://localhost:8080/smartoffice/api/v1/ttns/{id}/compassionate-leave/sign
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		type	Id loại đơn xin nghỉ
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"statusType":"OK","entity":"Thành công","entityType":"java.lang.StringBuilder","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200},"resultCode":200}
	 */
	@RequestMapping(value = "/{id}/compassionate-leave/sign", method = RequestMethod.POST)
	public @ResponseBody APIResponse compassionateLeaveSign(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id, @RequestBody TtnsRequest dto);
	
	
	/*
	 * ------------------------------------------
	 * Salary
	 * ------------------------------------------
	 */
	/**
	 * 22. APIs diễn biến lương phụ cấp
	 * http://localhost:8080/smartoffice/api/v1/ttns/{id}/allowance-process
	 */
	@RequestMapping(value = "/{id}/allowance-process", method = RequestMethod.GET)
	public @ResponseBody APIResponse allowanceProcess(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * 24. APIs danh sách hồ sơ đính kèm
	 * http://localhost:8080/smartoffice/api/v1/ttns/{id}/attach-file
	 */
	@RequestMapping(value = "/{id}/attach-file", method = RequestMethod.GET)
	public @ResponseBody APIResponse attachFile(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * 27. APIs Lấy thông tin thống kê quân số trực nghỉ trong đơn vị
	 * http://localhost:8080/smartoffice/api/v1/ttns-daily
	 */
	@RequestMapping(value = "/employee-daily", method = RequestMethod.GET)
	// TODO: not found
	public @ResponseBody APIResponse employeeDaily(@RequestHeader("TTNS-TOKEN") String token, TtnsRequest dto);
}
