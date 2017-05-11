package com.viettel.smartoffice.api;

import javax.ws.rs.QueryParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.viettel.smartoffice.framework.api.APIResponse;
import com.viettel.smartoffice.ws.dto.TtnsRegisterInOutRequest;

/**
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 *
 */
@RequestMapping("v1/ttns-inout")
public interface TtnsRegisterInOutApi {
	static final String JSON_API_CONTENT_HEADER = "Content-type=application/json";
	
	/*
	 * ------------------------------------------
	 * RegisterInOut - Đăng kí vào ra
	 * ------------------------------------------
	 */
	/**
	 * @api {post} /v1/ttns-inout/register/inout/update Approve Register in out
	 * @apiName update
	 * @apiGroup TTNS-RegisterInOut
	 * 
	 * @apiDescription APIs Approve Register in out. <br>
	 * http://localhost:8080/smartoffice/api/v1/ttns-inout/register/inout/update
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		emp_out_reg_id	ID of register in out
	 * @apiParam {Number}		status Approve status [1=accept, 3=deny]
	 * @apiParam {String}		reason Reason approve (Require if status = 2)
	 * @apiParam {Number}		emp_approve_id EmployeeId of manager
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"statusType":"BAD_REQUEST","entity":"Employee have not permisson approved","entityType":"java.lang.String","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":400},"resultCode":200}
	 */
	@RequestMapping(value = "/register/inout/update", method = RequestMethod.POST)
	public @ResponseBody APIResponse update(@RequestHeader("TTNS-TOKEN") String token, @RequestBody TtnsRegisterInOutRequest dto);
	
	/**
	 * @api {post} /v1/ttns-inout/register/inout/delete/:id DELETE register in out by id
	 * @apiName delete
	 * @apiGroup TTNS-RegisterInOut
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		id	The register in out-ID.
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"statusType":"OK","entity":"OK","entityType":"java.lang.String","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200},"resultCode":200}
	 */
	@RequestMapping(value = "/register/inout/delete/{id}", method = RequestMethod.POST)
	public @ResponseBody APIResponse delete(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id, @RequestBody TtnsRegisterInOutRequest dto);
	
	
	/**
	 * @api {post} /v1/ttns-inout/register/inout/reason reason
	 * @apiName reason
	 * @apiGroup TTNS-RegisterInOut
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		id	The register in out-ID.
	 * @apiParam {String}		type	[ALL, DELETE, UPDATE, INSERT] List type
	 * @apiParam {Number}		id	The register in out-ID.
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":[{"reasonOutId":165,"code":"NcO","name":"Nghỉ con ốm","workdayTypeId":449,"timeHoursStart":8,"timeMinuteStart":0,"timeHoursEnd":12,"timeMinuteEnd":0,"workHours":8,"createdTime":null},{"reasonOutId":41,"code":"Test","name":"something","workdayTypeId":447,"timeHoursStart":null,"timeMinuteStart":null,"timeHoursEnd":null,"timeMinuteEnd":null,"workHours":5,"createdTime":null},{"reasonOutId":164,"code":"CT","name":"Công tác","workdayTypeId":461,"timeHoursStart":null,"timeMinuteStart":null,"timeHoursEnd":null,"timeMinuteEnd":null,"workHours":8,"createdTime":null},{"reasonOutId":166,"code":"KT","name":"Khám thai","workdayTypeId":451,"timeHoursStart":8,"timeMinuteStart":30,"timeHoursEnd":12,"timeMinuteEnd":0,"workHours":8,"createdTime":null},{"reasonOutId":241,"code":"CTnuangay","name":"Công tác nửa ngày","workdayTypeId":461,"timeHoursStart":8,"timeMinuteStart":0,"timeHoursEnd":12,"timeMinuteEnd":0,"workHours":4,"createdTime":null},{"reasonOutId":221,"code":"nghi sang","name":"Nghỉ phép buổi sáng","workdayTypeId":452,"timeHoursStart":8,"timeMinuteStart":0,"timeHoursEnd":12,"timeMinuteEnd":0,"workHours":4,"createdTime":null},{"reasonOutId":222,"code":"nghichieu","name":"Nghỉ phép buổi chiều","workdayTypeId":452,"timeHoursStart":13,"timeMinuteStart":30,"timeHoursEnd":17,"timeMinuteEnd":30,"workHours":4,"createdTime":null},{"reasonOutId":223,"code":"ra ngoai","name":"Ra ngoài việc riêng","workdayTypeId":null,"timeHoursStart":null,"timeMinuteStart":null,"timeHoursEnd":null,"timeMinuteEnd":null,"workHours":null,"createdTime":null},{"reasonOutId":200,"code":"NP","name":"Nghỉ phép","workdayTypeId":452,"timeHoursStart":null,"timeMinuteStart":null,"timeHoursEnd":null,"timeMinuteEnd":null,"workHours":8,"createdTime":null},{"reasonOutId":201,"code":"ĐH","name":"Đi họp","workdayTypeId":null,"timeHoursStart":null,"timeMinuteStart":null,"timeHoursEnd":null,"timeMinuteEnd":null,"workHours":null,"createdTime":null}],"resultCode":200}
	 */
	@RequestMapping(value = "/register/inout/reason", method = RequestMethod.GET)
	public @ResponseBody APIResponse reason(@RequestHeader("TTNS-TOKEN") String token, @QueryParam("syncTime") Long syncTime
			, @QueryParam("type") String type);
	
	/**
	 * @api {post} /v1/ttns-inout/register/inout/approved/:id approved
	 * @apiName approved
	 * @apiGroup TTNS-RegisterInOut
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		status	1 = approved, 2 = deny, 3 = queue, 4 = all
	 * @apiParam {Number}		from_time	
	 * @apiParam {Number}		end_time
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"statusType":"OK","entity":[],"entityType":"java.util.ArrayList","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200},"resultCode":200}
	 */
	@RequestMapping(value = "/register/inout/approved/{id}", method = RequestMethod.GET)
	public @ResponseBody APIResponse approved(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id
			, @QueryParam("status") Long status
			, @QueryParam("from_time") Long from_time
			, @QueryParam("end_time") Long end_time);
	
	/**
	 * @api {post} /v1/ttns-inout/register/inout Get list register in out
	 * @apiName getListInOut
	 * @apiGroup TTNS-RegisterInOut
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {String}		type	[ALL, DELETE, UPDATE, INSERT] List type
	 * @apiParam {Number}		sync_time	
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 * 		{}
	 */
	@RequestMapping(value = "/register/inout", method = RequestMethod.GET)
	public @ResponseBody APIResponse getListInOut(@RequestHeader("TTNS-TOKEN") String token, @QueryParam("type") String type
			, @QueryParam("sync_time") Long sync_time);

	/**
	 * @api {post} /v1/ttns-inout/register/inout/workplace Get list work place
	 * @apiName workplace
	 * @apiGroup TTNS-RegisterInOut
	 * 
	 * @apiDescription APIs Get list work place. <br>
	 * http://localhost:8080/smartoffice/api/v1/ttns-inout/register/inout/workplace
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {String}		type	[ALL, DELETE, UPDATE, INSERT] List type
	 * @apiParam {Number}		syncTime	Time stamp of sync time
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":[{"stt":-2,"dataSource":"HOALAC","originId":6,"workPlaceId":21,"code":null,"name":"TANG HAM B2","parentId":null,"address":null,"createUser":null,"createDate":1426472046000,"modifyUser":null,"modifyDate":1427108021000},{"stt":1,"dataSource":"HOALAC","originId":7,"workPlaceId":22,"code":null,"name":"TANG 1","parentId":null,"address":null,"createUser":null,"createDate":1426472046000,"modifyUser":null,"modifyDate":1427108021000},{"stt":-1,"dataSource":"HOALAC","originId":8,"workPlaceId":23,"code":null,"name":"TANG HAM B1","parentId":null,"address":null,"createUser":null,"createDate":1426472046000,"modifyUser":null,"modifyDate":1427108021000},{"stt":2,"dataSource":"HOALAC","originId":9,"workPlaceId":24,"code":null,"name":"TANG 2","parentId":null,"address":null,"createUser":null,"createDate":1426472046000,"modifyUser":null,"modifyDate":1427108021000},{"stt":7,"dataSource":"HOALAC","originId":10,"workPlaceId":25,"code":null,"name":"TANG 7","parentId":null,"address":null,"createUser":null,"createDate":1426472046000,"modifyUser":null,"modifyDate":1427108021000},{"stt":6,"dataSource":"HOALAC","originId":11,"workPlaceId":26,"code":null,"name":"TANG 6","parentId":null,"address":null,"createUser":null,"createDate":1426472046000,"modifyUser":null,"modifyDate":1427108021000},{"stt":8,"dataSource":"HOALAC","originId":12,"workPlaceId":27,"code":null,"name":"TANG 8","parentId":null,"address":null,"createUser":null,"createDate":1426472046000,"modifyUser":null,"modifyDate":1427108021000},{"stt":9,"dataSource":"HOALAC","originId":13,"workPlaceId":28,"code":null,"name":"TANG 9","parentId":null,"address":null,"createUser":null,"createDate":1426472046000,"modifyUser":null,"modifyDate":1427108021000},{"stt":10,"dataSource":"HOALAC","originId":14,"workPlaceId":29,"code":null,"name":"TANG 10","parentId":null,"address":null,"createUser":null,"createDate":1426472046000,"modifyUser":null,"modifyDate":1427108021000},{"stt":11,"dataSource":"HOALAC","originId":15,"workPlaceId":30,"code":null,"name":"TANG 11","parentId":null,"address":null,"createUser":null,"createDate":1426472046000,"modifyUser":null,"modifyDate":1427108021000},{"stt":12,"dataSource":"HOALAC","originId":16,"workPlaceId":31,"code":null,"name":"TANG 12","parentId":null,"address":null,"createUser":null,"createDate":1426472046000,"modifyUser":null,"modifyDate":1427108021000},{"stt":15,"dataSource":"HOALAC","originId":17,"workPlaceId":32,"code":null,"name":"TANG 15","parentId":null,"address":null,"createUser":null,"createDate":1426472046000,"modifyUser":null,"modifyDate":1427108021000},{"stt":16,"dataSource":"HOALAC","originId":18,"workPlaceId":33,"code":null,"name":"TANG 16","parentId":null,"address":null,"createUser":null,"createDate":1426472046000,"modifyUser":null,"modifyDate":1427108021000},{"stt":17,"dataSource":"HOALAC","originId":19,"workPlaceId":34,"code":null,"name":"TANG 17","parentId":null,"address":null,"createUser":null,"createDate":1426472046000,"modifyUser":null,"modifyDate":1427108021000},{"stt":18,"dataSource":"HOALAC","originId":20,"workPlaceId":35,"code":null,"name":"TANG 18","parentId":null,"address":null,"createUser":null,"createDate":1426472046000,"modifyUser":null,"modifyDate":1427108021000},{"stt":19,"dataSource":"HOALAC","originId":21,"workPlaceId":36,"code":null,"name":"TANG 19","parentId":null,"address":null,"createUser":null,"createDate":1426472046000,"modifyUser":null,"modifyDate":1427108021000},{"stt":20,"dataSource":"HOALAC","originId":22,"workPlaceId":37,"code":null,"name":"TANG 20","parentId":null,"address":null,"createUser":null,"createDate":1426472046000,"modifyUser":null,"modifyDate":1427108021000},{"stt":21,"dataSource":"HOALAC","originId":23,"workPlaceId":38,"code":null,"name":"TANG 21","parentId":null,"address":null,"createUser":null,"createDate":1426472046000,"modifyUser":null,"modifyDate":1427108021000},{"stt":-2,"dataSource":"CROWNE","originId":6,"workPlaceId":1,"code":null,"name":"TANG HAM B2","parentId":null,"address":null,"createUser":null,"createDate":1425357179000,"modifyUser":null,"modifyDate":1427168505000},{"stt":1,"dataSource":"CROWNE","originId":7,"workPlaceId":2,"code":null,"name":"TANG 1","parentId":null,"address":null,"createUser":null,"createDate":1425357179000,"modifyUser":null,"modifyDate":1427168505000},{"stt":-1,"dataSource":"CROWNE","originId":8,"workPlaceId":3,"code":null,"name":"TANG HAM B1","parentId":null,"address":null,"createUser":null,"createDate":1425357179000,"modifyUser":null,"modifyDate":1427168505000},{"stt":2,"dataSource":"CROWNE","originId":9,"workPlaceId":4,"code":null,"name":"TANG 2","parentId":null,"address":null,"createUser":null,"createDate":1425357179000,"modifyUser":null,"modifyDate":1427168505000},{"stt":7,"dataSource":"CROWNE","originId":10,"workPlaceId":5,"code":null,"name":"TANG 7","parentId":null,"address":null,"createUser":null,"createDate":1425357179000,"modifyUser":null,"modifyDate":1427168505000},{"stt":6,"dataSource":"CROWNE","originId":11,"workPlaceId":6,"code":null,"name":"TANG 6","parentId":null,"address":null,"createUser":null,"createDate":1425357179000,"modifyUser":null,"modifyDate":1427168505000},{"stt":8,"dataSource":"CROWNE","originId":12,"workPlaceId":7,"code":null,"name":"TANG 8","parentId":null,"address":null,"createUser":null,"createDate":1425357179000,"modifyUser":null,"modifyDate":1427168505000},{"stt":9,"dataSource":"CROWNE","originId":13,"workPlaceId":8,"code":null,"name":"TANG 9","parentId":null,"address":null,"createUser":null,"createDate":1425357179000,"modifyUser":null,"modifyDate":1427168505000},{"stt":10,"dataSource":"CROWNE","originId":14,"workPlaceId":9,"code":null,"name":"TANG 10","parentId":null,"address":null,"createUser":null,"createDate":1425357179000,"modifyUser":null,"modifyDate":1427168505000},{"stt":11,"dataSource":"CROWNE","originId":15,"workPlaceId":10,"code":null,"name":"TANG 11","parentId":null,"address":null,"createUser":null,"createDate":1425357179000,"modifyUser":null,"modifyDate":1427168505000},{"stt":12,"dataSource":"CROWNE","originId":16,"workPlaceId":11,"code":null,"name":"TANG 12","parentId":null,"address":null,"createUser":null,"createDate":1425357179000,"modifyUser":null,"modifyDate":1427168505000},{"stt":15,"dataSource":"CROWNE","originId":17,"workPlaceId":12,"code":null,"name":"TANG 15","parentId":null,"address":null,"createUser":null,"createDate":1425357179000,"modifyUser":null,"modifyDate":1427168505000},{"stt":16,"dataSource":"CROWNE","originId":18,"workPlaceId":13,"code":null,"name":"TANG 16","parentId":null,"address":null,"createUser":null,"createDate":1425357179000,"modifyUser":null,"modifyDate":1427168505000},{"stt":17,"dataSource":"CROWNE","originId":19,"workPlaceId":14,"code":null,"name":"TANG 17","parentId":null,"address":null,"createUser":null,"createDate":1425357179000,"modifyUser":null,"modifyDate":1427168505000},{"stt":18,"dataSource":"CROWNE","originId":20,"workPlaceId":15,"code":null,"name":"TANG 18","parentId":null,"address":null,"createUser":null,"createDate":1425357179000,"modifyUser":null,"modifyDate":1427168505000},{"stt":19,"dataSource":"CROWNE","originId":21,"workPlaceId":16,"code":null,"name":"TANG 19","parentId":null,"address":null,"createUser":null,"createDate":1425357179000,"modifyUser":null,"modifyDate":1427168505000},{"stt":20,"dataSource":"CROWNE","originId":22,"workPlaceId":17,"code":null,"name":"TANG 20","parentId":null,"address":null,"createUser":null,"createDate":1425357179000,"modifyUser":null,"modifyDate":1427168505000},{"stt":21,"dataSource":"CROWNE","originId":23,"workPlaceId":18,"code":null,"name":"TANG 21","parentId":null,"address":null,"createUser":null,"createDate":1425357179000,"modifyUser":null,"modifyDate":1427168505000}],"resultCode":200}
	 */
	@RequestMapping(value = "/register/inout/workplace", method = RequestMethod.GET)
	public @ResponseBody APIResponse workplace(@RequestHeader("TTNS-TOKEN") String token, @QueryParam("type") String type
			, @QueryParam("sync_time") Long fromTime);
	
	/**
	 * @api {post} /v1/ttns-inout/register/inout/reason/:id Get reason out by id
	 * @apiName reasonById
	 * @apiGroup TTNS-RegisterInOut
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		id		The reason out-ID.
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"reasonOutId":165,"code":"NcO","name":"Nghỉ con ốm","workdayTypeId":449,"timeHoursStart":8,"timeMinuteStart":0,"timeHoursEnd":12,"timeMinuteEnd":0,"workHours":8,"createdTime":null},"resultCode":200}
	 */
	@RequestMapping(value = "/register/inout/reason/{id}", method = RequestMethod.GET)
	public @ResponseBody APIResponse reasonById(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * @api {post} /v1/ttns-inout/register/inout/:id Get register in out by id
	 * @apiName inoutById
	 * @apiGroup TTNS-RegisterInOut
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		id		The register in out-ID.
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"empOutRegId":43690,"workPlaceId":4,"reasonDetail":"H?p v? quy?t to�n c�c d? �n b?t d?ng s?n.","createDate":null,"createUser":null,"modifyDate":null,"modifyUser":null,"processingDate":null,"empApproveId":41387,"approveDate":1443067029000,"status":1,"empId":17281,"timeOutReg":1426006800000,"reasonOutId":2,"timeStart":1426035600000,"timeEnd":1426048200000,"reasonOut":null,"workPlace":null,"comment":null},"resultCode":200}
	 */
	@RequestMapping(value = "/register/inout/{id}", method = RequestMethod.GET)
	public @ResponseBody APIResponse inoutById(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * @api {post} /v1/ttns-inout/register/inout/workplace/:id Get work place by id
	 * @apiName workplaceById
	 * @apiGroup TTNS-RegisterInOut
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		id		The work place-ID..
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"stt":2,"dataSource":"CROWNE","originId":9,"workPlaceId":4,"code":null,"name":"TANG 2","parentId":null,"address":null,"createUser":null,"createDate":1425357179000,"modifyUser":null,"modifyDate":1427168505000},"resultCode":200}
	 */
	@RequestMapping(value = "/register/inout/workplace/{id}", method = RequestMethod.GET)
	public @ResponseBody APIResponse workplaceById(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id);
	
	/**
	 * @api {post} /v1/ttns-inout/register/inout Register in out 
	 * @apiName register
	 * @apiGroup TTNS-RegisterInOut
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		employee_id		ID of employee
	 * @apiParam {Number}		from_time		Time stamp of start time
	 * @apiParam {Number}		end_time		Time stamp of end time
	 * @apiParam {Number}		reason_out_id		Reason ID
	 * @apiParam {Number}		work_place_id		Work Place ID
	 * @apiParam {String}		reason_detail		Detail reason
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"statusType":"OK","entity":{"empOutRegId":44484,"workPlaceId":4,"reasonDetail":"Di há»p dá»± Ã¡n","createDate":1494318327271,"createUser":"118957","modifyDate":1494318327271,"modifyUser":"118957","processingDate":1494318327271,"empApproveId":null,"approveDate":null,"status":2,"empId":47604,"timeOutReg":1494318327271,"reasonOutId":164,"timeStart":1495731600000,"timeEnd":1495818000000,"reasonOut":"Công tác","workPlace":"CROWNE - TANG 2","comment":null},"entityType":"com.viettel.timekeeping.model.EmpOutRegBO","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200},"resultCode":200}
	 */
	@RequestMapping(value = "/register/inout", method = RequestMethod.POST)
	public @ResponseBody APIResponse register(@RequestHeader("TTNS-TOKEN") String token, @RequestBody TtnsRegisterInOutRequest dto);
	
	/**
	 * @api {post} /v1/ttns-inout/register/inout/employee/effective/:id get List in out reg of employee id effective
	 * @apiName registerGetList
	 * @apiGroup TTNS-RegisterInOut
	 * 
	 * @apiHeader {String} Authorization Users unique token access-key.
	 * @apiHeader {String} TTNS-TOKEN Access-key get from /token to access TTNS.
	 * @apiParam {Number}		from_time		Time stamp of start time
	 * @apiParam {Number}		end_time		Time stamp of end time
	 * @apiParam {Number}		status		1 = approved, 2 = queue, 3 = deny, 4 = all
	 * 
	 * @apiSuccess {String}   OK	Success
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"statusType":"OK","entity":[{"empOutRegId":44480,"workPlaceId":4,"reasonDetail":"Di họp dự án","createDate":1494317223758,"createUser":"118957","modifyDate":1494317223758,"modifyUser":"118957","processingDate":1494317223758,"empApproveId":null,"approveDate":null,"status":2,"empId":47604,"timeOutReg":1494317223758,"reasonOutId":164,"timeStart":1495731600000,"timeEnd":1495818000000,"reasonOut":"Công tác","workPlace":"CROWNE - TANG 2"},{"empOutRegId":44481,"workPlaceId":4,"reasonDetail":"Di họp dự án","createDate":1494317661739,"createUser":"118957","modifyDate":1494317661739,"modifyUser":"118957","processingDate":1494317661739,"empApproveId":null,"approveDate":null,"status":2,"empId":47604,"timeOutReg":1494317661739,"reasonOutId":164,"timeStart":1495731600000,"timeEnd":1495818000000,"reasonOut":"Công tác","workPlace":"CROWNE - TANG 2"},{"empOutRegId":44484,"workPlaceId":4,"reasonDetail":"Di há»p dá»± Ã¡n","createDate":1494318327271,"createUser":"118957","modifyDate":1494318327271,"modifyUser":"118957","processingDate":1494318327271,"empApproveId":null,"approveDate":null,"status":2,"empId":47604,"timeOutReg":1494318327271,"reasonOutId":164,"timeStart":1495731600000,"timeEnd":1495818000000,"reasonOut":"Công tác","workPlace":"CROWNE - TANG 2"},{"empOutRegId":44483,"workPlaceId":4,"reasonDetail":"Di họp dự án","createDate":1494317669841,"createUser":"118957","modifyDate":1494317669841,"modifyUser":"118957","processingDate":1494317669841,"empApproveId":null,"approveDate":null,"status":2,"empId":47604,"timeOutReg":1494317669841,"reasonOutId":164,"timeStart":1495731600000,"timeEnd":1495818000000,"reasonOut":"Công tác","workPlace":"CROWNE - TANG 2"},{"empOutRegId":44482,"workPlaceId":4,"reasonDetail":"Di họp dự án","createDate":1494317665300,"createUser":"118957","modifyDate":1494317665300,"modifyUser":"118957","processingDate":1494317665300,"empApproveId":null,"approveDate":null,"status":2,"empId":47604,"timeOutReg":1494317665300,"reasonOutId":164,"timeStart":1495731600000,"timeEnd":1495818000000,"reasonOut":"Công tác","workPlace":"CROWNE - TANG 2"}],"entityType":"java.util.ArrayList","metadata":{"Content-Type":[{"type":"application","subtype":"json","parameters":{},"wildcardType":false,"wildcardSubtype":false}]},"status":200},"resultCode":200}
	 */
	@RequestMapping(value = "/register/inout/employee/effective/{id}", method = RequestMethod.GET)
	public @ResponseBody APIResponse registerGetList(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id
			, @QueryParam("status") Long status
			, @QueryParam("from_time") Long from_time
			, @QueryParam("end_time") Long end_time);
}
