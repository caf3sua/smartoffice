package com.viettel.smartoffice.api;

import javax.ws.rs.QueryParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.viettel.smartoffice.framework.api.APIResponse;
import com.viettel.smartoffice.ws.dto.TtnsTimeKeepingRequest;

/**
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 *
 */
@RequestMapping("v1/ttns-timekeeping")
public interface TtnsTimeKeepingApi {
	static final String JSON_API_CONTENT_HEADER = "Content-type=application/json";
	
	/*
	 * ------------------------------------------
	 * TimeKeeping - Chấm công
	 * ------------------------------------------
	 */
	/**
	 * @api {post} /v1/ttns-timekeeping/timeKeeping/employee/update Approve time keeping for employee by id
	 * @apiName updateTimekeeping
	 * @apiGroup TTNS-TimeKeeping
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		approve_employee_id	ID of register in out
	 * @apiParam {String}		id Id of self time keeping
	 * @apiParam {Number}		status [1: approve, 2: reject]
	 * @apiParam {Number}		reason Require if status = 2
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {}
	 */
	@RequestMapping(value = "/timeKeeping/employee/update", method = RequestMethod.POST)
	public @ResponseBody APIResponse updateTimekeeping(@RequestHeader("TTNS-TOKEN") String token, @RequestBody TtnsTimeKeepingRequest dto);
	
	/**
	 * @api {post} /v1/ttns-timekeeping/timeKeeping/employee/approve/update Approve timekeeping employee by time
	 * @apiName approveTimekeeping
	 * @apiGroup TTNS-TimeKeeping
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		employee_id	Id of employee for get time keeping
	 * @apiParam {Number}		approve_emp_id Id of employee approve
	 * @apiParam {Number}		from_time Time stamp of date time keeping
	 * @apiParam {Number}		end_time Time stamp of date time keeping
	 * @apiParam {Number}		comment comment of manager
	 * @apiParam {String}		type [1:approve, 2 deny]
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"statusType":"BAD_REQUEST","entity":"Employee have not permisson approved","entityType":"java.lang.String","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":400},"resultCode":200}
	 */
	@RequestMapping(value = "/timeKeeping/employee/approve/update", method = RequestMethod.POST)
	public @ResponseBody APIResponse approveTimekeeping(@RequestHeader("TTNS-TOKEN") String token, @RequestBody TtnsTimeKeepingRequest dto);
	
	
	/**
	 * @api {post} /v1/ttns-timekeeping/calculate/sabatical/update Calculate Sabatical of employee
	 * @apiName calculate-sabatical-update
	 * @apiGroup TTNS-TimeKeeping
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		lstEmpIds	Employees
	 * @apiParam {Number}		year year calculate
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {}
	 */
	@RequestMapping(value = "/calculate/sabatical/update", method = RequestMethod.POST)
	public @ResponseBody APIResponse calculateSabatical(@RequestHeader("TTNS-TOKEN") String token, @RequestBody TtnsTimeKeepingRequest dto);
	
	/**
	 * @api {post} /v1/ttns-timekeeping/timeKeeping/employee/delete Delete timekeeping
	 * @apiName deleteTimekeeping
	 * @apiGroup TTNS-TimeKeeping
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		employee_id	Id of employee for get time keeping
	 * @apiParam {String}		Id ID of timeKeeping
	 * @apiParam {String}		Comment Reason deleted, Requried if date timkeeping after now date
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"statusType":"OK","entity":0.0,"entityType":"java.lang.Double","metadata":{},"status":200},"resultCode":200}
	 */
	@RequestMapping(value = "/timeKeeping/employee/delete", method = RequestMethod.POST)
	public @ResponseBody APIResponse deleteTimekeeping(@RequestHeader("TTNS-TOKEN") String token, @RequestBody TtnsTimeKeepingRequest dto);
	
	/**
	 * @api {post} /v1/ttns-timekeeping/timeKeeping/workDayType/:id Get work day type by id
	 * @apiName workDayType
	 * @apiGroup TTNS-TimeKeeping
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {String}		Id The WordayType-ID.
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"workdayTypeId":441,"code":"K","name":"K- Lương sản phẩm","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":1},"resultCode":200}
	 */
	@RequestMapping(value = "/timeKeeping/workDayType/{id}", method = RequestMethod.GET)
	public @ResponseBody APIResponse workDayTypeByIdTimekeeping(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);

	/**
	 * @api {post} /v1/ttns-timekeeping/history-in-out Insert history in out
	 * @apiName history-in-out
	 * @apiGroup TTNS-TimeKeeping
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {String}		history List history in out
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {}
	 */
	@RequestMapping(value = "/history-in-out", method = RequestMethod.POST)
	public @ResponseBody APIResponse historyInoutTimekeeping(@RequestHeader("TTNS-TOKEN") String token, @RequestBody TtnsTimeKeepingRequest dto);
	
	/**
	 * @api {post} /v1/ttns-timekeeping/timeKeeping/workDayType List all work day type
	 * @apiName timeKeeping-workDayType
	 * @apiGroup TTNS-TimeKeeping
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		workdayTypeId ID WorkDayType.
	 * @apiParam {String}		code Code of WorkDayType.
	 * @apiParam {String}		name Name of WorkDayType
	 * @apiParam {Number}		affairMode Công chế độ
	 * @apiParam {Number}		shiftMod Công làm ca
	 * @apiParam {Number}		overtimeMode Công làm thêm.
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":[{"workdayTypeId":441,"code":"K","name":"K- Lương sản phẩm","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":1},{"workdayTypeId":442,"code":"CH","name":"CH- Trực chỉ huy T7, CN, ngày lễ, ngày nghỉ bù lễ","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":null,"shiftMode":null,"overtimeMode":1,"isReturn":null},{"workdayTypeId":443,"code":"TT","name":"TT- Trực ban ngày thường","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":null,"shiftMode":1,"overtimeMode":null,"isReturn":null},{"workdayTypeId":444,"code":"TĐT","name":"TĐT - Trực đêm ngày thường","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":null,"shiftMode":1,"overtimeMode":null,"isReturn":null},{"workdayTypeId":445,"code":"C3","name":"C3- Làm ca đêm","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":null,"shiftMode":null,"overtimeMode":null,"isReturn":null},{"workdayTypeId":446,"code":"TL","name":"TL- Trực ban ngày nghỉ hàng tuần hoặc lễ, tết","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":null,"shiftMode":1,"overtimeMode":null,"isReturn":null},{"workdayTypeId":447,"code":"X","name":"X- Công chế độ tính lương thời gian","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":1},{"workdayTypeId":448,"code":"Ô","name":"Nghỉ ốm","description":null,"isActive":1,"insuranceTypeId":3550.0,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":2},{"workdayTypeId":449,"code":"Cô","name":"Cô- Con ốm","description":null,"isActive":1,"insuranceTypeId":3550.0,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":2},{"workdayTypeId":450,"code":"TS","name":"TS- Thai sản","description":null,"isActive":1,"insuranceTypeId":3551.0,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":2},{"workdayTypeId":451,"code":"KT","name":"KT- Nghỉ khám thai, sảy thai","description":null,"isActive":1,"insuranceTypeId":3551.0,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":2},{"workdayTypeId":452,"code":"P","name":"P- Nghỉ phép","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":1},{"workdayTypeId":453,"code":"L","name":"L- Nghỉ lễ, tết","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":1},{"workdayTypeId":454,"code":"H","name":"H- Học tập hưởng lương BH","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":1},{"workdayTypeId":455,"code":"NB","name":"NB- Nghỉ bù","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":1},{"workdayTypeId":456,"code":"Ro","name":"Ro- Nghỉ không lương","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":2},{"workdayTypeId":457,"code":"Rv","name":"Rv- Nghỉ việc riêng có hưởng lương","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":1},{"workdayTypeId":458,"code":"CV","name":"CV- Chờ việc","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":1},{"workdayTypeId":459,"code":"TN","name":"TN- Tai nạn","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":1},{"workdayTypeId":460,"code":"Đc","name":"Đc- Nghỉ chờ hưu","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":1},{"workdayTypeId":461,"code":"CT","name":"CT- Công tác","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":1},{"workdayTypeId":462,"code":"GT","name":"GT- Làm thêm ngày thường","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":null,"shiftMode":1,"overtimeMode":null,"isReturn":2},{"workdayTypeId":463,"code":"GN","name":"GN- Làm thêm ngày nghỉ hàng tuần","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":null,"shiftMode":null,"overtimeMode":1,"isReturn":null},{"workdayTypeId":464,"code":"GL","name":"GL- Làm thêm ngày lễ, tết","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":null,"shiftMode":null,"overtimeMode":1,"isReturn":null},{"workdayTypeId":465,"code":"OT","name":"OT- Hưởng 70%","description":null,"isActive":1,"insuranceTypeId":3551.0,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":1},{"workdayTypeId":466,"code":"Rb","name":"Rb- Công nghỉ việc riêng hưởng lương Bảo hiểm","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":null,"shiftMode":null,"overtimeMode":null,"isReturn":1},{"workdayTypeId":467,"code":"Pb","name":"Pb- Công nghỉ phép lương Bảo hiểm","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":null,"shiftMode":null,"overtimeMode":null,"isReturn":1},{"workdayTypeId":541,"code":"CN","name":"Công tác nước ngoài","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":1},{"workdayTypeId":581,"code":"DS","name":"DS - Dưỡng sức sau sinh và sau ốm","description":"Công dưỡng sức sau sinh và sau ốm. Chấm khi nghỉ sau sinh 4 tháng và hết ốm","isActive":1,"insuranceTypeId":3557.0,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":1},{"workdayTypeId":641,"code":"CHT","name":"CHT - Trực chỉ huy ngày thường","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":null,"shiftMode":1,"overtimeMode":null,"isReturn":null},{"workdayTypeId":621,"code":"TĐL","name":"TĐL - Trực đêm ngày lễ","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":null,"shiftMode":1,"overtimeMode":null,"isReturn":null},{"workdayTypeId":622,"code":"C","name":"C- Chờ giao việc","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":null},{"workdayTypeId":681,"code":"DTC","name":"Đình chỉ công tác","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":1},{"workdayTypeId":701,"code":"ĐT","name":"Công đào tạo","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":1},{"workdayTypeId":662,"code":"DC","name":"Công di chuyển","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":1,"shiftMode":null,"overtimeMode":null,"isReturn":1},{"workdayTypeId":741,"code":"K3","name":"K3 - Làm kíp 3","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":null,"shiftMode":1,"overtimeMode":null,"isReturn":1},{"workdayTypeId":721,"code":"K1","name":"K1 - Làm kíp 1","description":null,"isActive":null,"insuranceTypeId":null,"affairMode":null,"shiftMode":1,"overtimeMode":null,"isReturn":1},{"workdayTypeId":722,"code":"K2","name":"K2 - Làm kíp 2","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":null,"shiftMode":1,"overtimeMode":null,"isReturn":1},{"workdayTypeId":723,"code":"K4","name":"K4 - Làm kíp 4","description":null,"isActive":1,"insuranceTypeId":null,"affairMode":null,"shiftMode":1,"overtimeMode":null,"isReturn":1}],"resultCode":200}
	 */
	@RequestMapping(value = "/timeKeeping/workDayType", method = RequestMethod.GET)
	public @ResponseBody APIResponse workDayTypeTimeKeeping(@RequestHeader("TTNS-TOKEN") String token
			, @QueryParam("workdayTypeId") Long workdayTypeId
			, @QueryParam("code") String code
			, @QueryParam("name") String name
			, @QueryParam("affairMode") Long affairMode
			, @QueryParam("shiftMod") Long shiftMod
			, @QueryParam("overtimeMode") Long overtimeMode);
	
	/**
	 * @api {post} /v1/ttns-timekeeping/timeKeeping/employee List time keeping by employee
	 * @apiName timeKeepingEmployee
	 * @apiGroup TTNS-TimeKeeping
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		employee_id Id of employee for get time keeping
	 * @apiParam {Number}		manager_id Id of manage employee for get time keeping
	 * @apiParam {Number}		from_time Time stamp of from date to get time keeping
	 * @apiParam {Number}		to_time Time stamp of to date to get time keeping
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"statusType":"NOT_FOUND","entity":"Manager do not have permission with employee","entityType":"java.lang.String","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":404},"resultCode":200}
	 */
	@RequestMapping(value = "/timeKeeping/employee", method = RequestMethod.GET)
	public @ResponseBody APIResponse timeKeepingByemployeeId(@RequestHeader("TTNS-TOKEN") String token
			, @QueryParam("employee_id") Long employee_id
			, @QueryParam("manager_id") Long manager_id
			, @QueryParam("from_time") Long from_time
			, @QueryParam("to_time") Long to_time);
	
	/**
	 * @api {post} /v1/ttns-timekeeping/timeKeeping/employee Time keeping for employee
	 * @apiName timeKeepingEmployeeGetList
	 * @apiGroup TTNS-TimeKeeping
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		employee_id Id of employee for get time keeping
	 * @apiParam {Number}		time_keeping Time stamp of date time keeping
	 * @apiParam {String}		work_place_type [ONSITE_IN: work on site in Viettel group,ONSITE_OUT: work on site out Viettel group,DEFAULT: work on office]: required if type IN [WORK, WORK_HALF_DAY]
	 * @apiParam {String}		type [WORK: Work all day, LEAVE: Leave all day, WORK_HALF_DAY: Work half day (4h)]
	 * @apiParam {String}		source_data tye of [default is: 'API_TIMEKEEPING', if time keeping by device this is MAC_ADDRESS]
	 * @apiParam {String}		private_key private key of uuid
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"statusType":"OK","entity":{"totalTimeKeeping":0.0,"timeKeepings":[{"id":"SELF_122041","year":null,"allDay":null,"start":1494435600000,"end":null,"url":null,"className":null,"editable":null,"startEditable":null,"durationEditable":null,"rendering":null,"overlap":null,"constraint":null,"source":null,"color":null,"backgroundColor":null,"borderColor":null,"textColor":null,"title":"Ro:8","startDate":1494435600000,"workName":"Ro- Nghỉ không lương","workdayTypeId":null,"empSelfTimekeepingId":"122041","status":"0","confirm":null,"isLock":null,"isWork":null,"realWork":null}],"totalLeave":0.0,"totalUnpaid":1.0,"totalPersonalReason":0.0},"entityType":"com.viettel.timekeeping.model.EmpTimeKeepingModel","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200},"resultCode":200}
	 */
	@RequestMapping(value = "/timeKeeping/employee", method = RequestMethod.POST)
	public @ResponseBody APIResponse timeKeepingRegister(@RequestHeader("TTNS-TOKEN") String token, @RequestBody TtnsTimeKeepingRequest dto);
	
	/**
	 * @api {post} /v1/ttns-timekeeping/timeKeeping/mobile-integrated get private key
	 * @apiName timeKeeping-mobile-integrated
	 * @apiGroup TTNS-TimeKeeping
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		employee_id Id of employee for get time keeping
	 * @apiParam {String}		uuid id of project/device
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"statusType":"OK","entity":"ffaa6d124a9ebe7a53e4f0cf6dbdac2ebbf784e4df159bc02151927c2ffa226d","entityType":"java.lang.String","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200},"resultCode":200}
	 */
	@RequestMapping(value = "/timeKeeping/mobile-integrated", method = RequestMethod.GET)
	public @ResponseBody APIResponse mobileIntegrated(@RequestHeader("TTNS-TOKEN") String token
			, @QueryParam("employee_id") Long employee_id
			, @QueryParam("uuid") String uuid);
	
	/**
	 * @api {post} /v1/ttns-timekeeping/timeKeeping/device Get all timekeeping device
	 * @apiName timeKeeping-device
	 * @apiGroup TTNS-TimeKeeping
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {String}		type [ALL, DELETE, UPDATE, INSERT] List type
	 * @apiParam {Number}		syncTime Time stamp of sync time
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":[{"timekeepingDeviceId":1,"name":"Wifi PH1 T41","address":"T41 Keangnam Landmark","macAddress":"1c:2d","serialNumber":"123456aw","type":1,"createdTime":1475600400000},{"timekeepingDeviceId":2,"name":"WIFI tang 41","address":"TP-LINK TECHNOLOGIES CO.,LTD.","macAddress":" 30:B5:C2:8A:7A:73","serialNumber":"123456aw","type":1,"createdTime":1475600400000},{"timekeepingDeviceId":4,"name":"WIFI tang 41","address":"D-Link International","macAddress":"BC:F6:85:C2:0A:F9","serialNumber":"123456aw","type":1,"createdTime":1475600400000},{"timekeepingDeviceId":5,"name":"WIFI tang 41","address":"TP-LINK TECHNOLOGIES CO.,LTD.","macAddress":"E8:94:F6:A8:59:CF","serialNumber":"123456aw","type":1,"createdTime":1475600400000},{"timekeepingDeviceId":6,"name":"WIFI tang 41","address":"TP-LINK TECHNOLOGIES CO.,LTD.","macAddress":"E8:94:F6:98:5F:81","serialNumber":"123456aw","type":1,"createdTime":1475600400000},{"timekeepingDeviceId":3,"name":"WIFI tang 41","address":"TP-LINK TECHNOLOGIES CO.,LTD.","macAddress":"E8:94:F6:A8:61:2B","serialNumber":"123456aw","type":1,"createdTime":1475600400000},{"timekeepingDeviceId":7,"name":"TTPM1_1","address":"TP-LINK TECHNOLOGIES CO.,LTD.","macAddress":"F8:E9:03:B7:F8:2C","serialNumber":"123456aw","type":1,"createdTime":1475600400000},{"timekeepingDeviceId":8,"name":"TP_LINK_A8612A","address":"TP-LINK TECHNOLOGIES CO.,LTD.","macAddress":"E8:94:F6:A8:61:2A","serialNumber":"123456aw","type":1,"createdTime":1475600400000},{"timekeepingDeviceId":9,"name":"TP_PM1_4","address":"TP-LINK TECHNOLOGIES CO.,LTD.","macAddress":"E8:94:F6:A8:59:CE","serialNumber":"123456aw","type":1,"createdTime":1475600400000},{"timekeepingDeviceId":10,"name":"TP_PM1_2","address":"TP-LINK TECHNOLOGIES CO.,LTD.","macAddress":"34:64:A9:0D:E3:5D","serialNumber":"123456aw","type":1,"createdTime":1475600400000},{"timekeepingDeviceId":11,"name":"wifi-gdviet","address":"TP-LINK TECHNOLOGIES CO.,LTD.","macAddress":"E8:94:F6:98:5F:81","serialNumber":"123456aw","type":1,"createdTime":1475600400000}],"resultCode":200}
	 */
	@RequestMapping(value = "/timeKeeping/device", method = RequestMethod.GET)
	public @ResponseBody APIResponse timeKeepingDevice(@RequestHeader("TTNS-TOKEN") String token
			, @QueryParam("type") String type
			, @QueryParam("syncTime") Long syncTime);
	
	/**
	 * @api {post} /v1/ttns-timekeeping/timeKeeping/device/:id Get timekeeping device
	 * @apiName timeKeeping-device-id
	 * @apiGroup TTNS-TimeKeeping
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		id The TimeKeeping Device.
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"timekeepingDeviceId":1,"name":"Wifi PH1 T41","address":"T41 Keangnam Landmark","macAddress":"1c:2d","serialNumber":"123456aw","type":1,"createdTime":1475600400000},"resultCode":200}
	 */
	@RequestMapping(value = "/timeKeeping/device/{id}", method = RequestMethod.GET)
	public @ResponseBody APIResponse timeKeepingDeviceId(@RequestHeader("TTNS-TOKEN") String token
			, @PathVariable("id") String id);
}
