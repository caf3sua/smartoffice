/*
 * Copyright (c) 2016 Bitel Peru and/or its affiliates. All rights reserved.
 */
package com.viettel.smartoffice.ws.client;
import javax.ws.rs.QueryParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.viettel.smartoffice.framework.api.APIResponse;
import com.viettel.smartoffice.ws.dto.TtnsRegisterInOutRequest;
import com.viettel.smartoffice.ws.dto.TtnsRequest;
import com.viettel.smartoffice.ws.dto.TtnsResponse;
import com.viettel.smartoffice.ws.dto.TtnsTimeKeepingRequest;

/**
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 *
 */
public interface TtnsClient {
	
	/**
	 * @return {"access_token":"63ac5e4e-e431-4a99-bc92-63666d33b3a7","token_type":"bearer","refresh_token":"d5419875-9951-411c-87f0-c644571484d2","expires_in":3507,"scope":"read trust write"}
	 */
	public TtnsResponse getAccessToken();
	
	/**
	 * API lấy quá trình công tác của nhân viên
	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/work-process
	 * 
	 * @return 
	 */
	public TtnsResponse workProcess(String token, TtnsRequest dto);
	
	/**
	 * API lấy quá trình công tác gần nhất của nhân viên 
	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/work-process/latest
	 */
	public TtnsResponse workProcessLatest(String token, TtnsRequest dto);
	
	/**
	 * APIs lấy thông tin quá trình đào tạo và nghiên cứu
	 * http://10.58.71.138:8765/APIs/api/v1/employee/41387/education-process
	 */
	public TtnsResponse educationProcess(String token, TtnsRequest dto);
	
	/**
	 * APIs lấy thông tin quá trình đào tạo và nghiên cứu gần nhất
	 * http://10.58.71.138:8765/APIs/api/v1/employee/41387/education
	 */
	public TtnsResponse educationProcessLatest(String token, TtnsRequest dto);
	
	/**
	 * APIs lấy diễn biến lương chức danh
	 * http://10.58.71.138:8765/APIs/api/v1/employee/41387/salary-process
	 */
	public TtnsResponse salaryProcess(String token, TtnsRequest dto);
	
	/**
	 * 6. APIs lấy diễn biến lương chức danh mới nhất
	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/salary-process/latest
	 */
	public TtnsResponse salaryProcessLatest(String token, TtnsRequest dto);
	
	/**
	 * APIs lấy diễn biến lương bảo hiểm
	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/insurance-process
	 */
	public TtnsResponse insuranceProcess(String token, TtnsRequest dto);
	
	/**
	 * APIs lấy diễn biến lương bảo hiểm mới nhất
	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/insurance-process/latest
	 */
	public TtnsResponse insuranceProcessLatest(String token, TtnsRequest dto);
	
	/**
	 * 9. APIs lấy quá trình diện đối tượng
	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/emp-type-process
	 */
	public TtnsResponse empTypeProcess(String token, TtnsRequest dto);
	
	/**
	 * 10. APIs lấy quá trình diện đối tượng mới nhất
	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/emp-type-process/latest
	 */
	public TtnsResponse empTypeProcessLatest(String token, TtnsRequest dto);
	
	/**
	 * 11. APIs lấy quá trình loại cán bộ
	 * http://10.58.71.138:8765/APIs/api/v1/manager/employee/{id}/manager-type-process
	 */
	public TtnsResponse managerTypeProcess(String token, TtnsRequest dto);
	
	/**
	 * 12. APIs lấy quá trình loại cán bộ mới nhất
	 * http://10.58.71.138:8765/APIs/api/v1/manager/employee/{id}/manager-type-process/latest
	 */
	public TtnsResponse managerTypeProcessLatest(String token, TtnsRequest dto);
	
	/**
	 * 13. APIs lấy danh sách khen thưởng của nhân viên
	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/reward
	 */
	public TtnsResponse reward(String token, TtnsRequest dto);
	
	/**
	 * 14. APIs lấy danh sách Kỷ luật của nhân viên
	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/descipline
	 */
	public TtnsResponse descipline(String token, TtnsRequest dto);
	
	/**
	 * 15. APIs lấy thuế và giảm trừ
	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/tax-reduction
	 */
	public TtnsResponse taxReduction(String token, TtnsRequest dto);
	
	/**
	 * 16. APIs lấy quan hệ gia đình
	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/family-relationship
	 */
	public TtnsResponse familyRelationship(String token, TtnsRequest dto);
	
	/**
	 * 17. APIs lấy thành tích nổi bật cá nhân
	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/relic-feature
	 */
	public TtnsResponse relicFeature(String token, TtnsRequest dto);
	
	/**
	 * 18. APIs lấy danh sách nghỉ của nhân viên
	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/compassionate-leave 
	 */
	public TtnsResponse compassionateLeaveGetByEmployeeId(String token, TtnsRequest dto);
	
	/**
	 * 18.1. APIs lấy danh sách nghỉ của nhân viên
	 * http://10.58.71.138:8765/APIs/api/v1/employee/compassionate-leave 
	 */
	public TtnsResponse compassionateLeaveGetList(String token, TtnsRequest dto);
	
	/**
	 * 19. APIs đăng kí nghỉ của nhân viên 
	 * POST
	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/compassionate-leave
	 */
	public TtnsResponse compassionateLeaveRegister(String token, TtnsRequest dto);
	
	/**
	 * 20. APIs xóa đăng kí nghỉ của nhân viên
	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/compassionate-leave/delete
	 */
	public TtnsResponse compassionateLeaveDelete(String token, TtnsRequest dto);
	
	/**
	 * 21. APIs trình ký đăng kí nghỉ của nhân viên
	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/compassionate-leave/sign
	 */
	public TtnsResponse compassionateLeaveSign(String token, TtnsRequest dto);
	
	/**
	 * 22. APIs diễn biến lương phụ cấp
	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/allowance-process
	 */
	public TtnsResponse allowanceProcess(String token, TtnsRequest dto);
	
//	/**
//	 * 23. APIs Quá trình tham gia bảo hiểm xã hội
//	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/insurance-process 
//	 */
//	public TtnsResponse insuranceProcess(TtnsRequest dto);
	
	/**
	 * 24. APIs danh sách hồ sơ đính kèm
	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/attach-file
	 */
	public TtnsResponse attachFile(String token, TtnsRequest dto);
	
//	/**
//	 * 25. APIs thông tin đơn xin nghỉ phép theo id
//	 * http://10.58.71.138:8765/APIs/api/v1/employee/compassionate-leave
//	 */
//	public TtnsResponse compassionateLeaveGetById(TtnsRequest dto);
	
	/**
	 * 26. APIs Lấy số ngày phép còn lại của nhân viên
	 * http://10.58.71.138:8765/APIs/api/v1/employee/{id}/remaining-annual
	 */
	public TtnsResponse remainingAnnual(String token, TtnsRequest dto);
	
	/**
	 * 27. APIs Lấy thông tin thống kê quân số trực nghỉ trong đơn vị
	 * http://10.58.71.138:8765/APIs/api/v1/employee-daily
	 */
	public TtnsResponse employeeDaily(String token, TtnsRequest dto);
	
	/*
	 * ------------------------------------------
	 * RegisterInOut - Đăng kí vào ra
	 * ------------------------------------------
	 */
	public TtnsResponse update(String token, TtnsRegisterInOutRequest dto);
	
	public TtnsResponse delete(String token, String id, TtnsRegisterInOutRequest dto);

	public TtnsResponse reason(String token, Long syncTime, String type);

	public TtnsResponse approved(String token, String id, Long status, Long fromTime, Long endTime);

	public TtnsResponse getListInOut(String token, String type, Long syncTime);

	public TtnsResponse workplace(String token, String type, Long syncTime);

	public TtnsResponse reasonById(String token, String id);

	public TtnsResponse inoutById(String token, String id);

	public TtnsResponse workplaceById(String token, String id);

	public TtnsResponse register(String token, TtnsRegisterInOutRequest dto);

	public TtnsResponse registerGetList(String token, String id, Long status, Long from_time, Long end_time);
	
	/*
	 * ------------------------------------------
	 * Timekeeping - Chấm công
	 * ------------------------------------------
	 */
	public TtnsResponse updateTimekeeping(String token, TtnsTimeKeepingRequest dto);
	
	public TtnsResponse approveTimekeeping(String token, TtnsTimeKeepingRequest dto);
	
	public TtnsResponse calculateSabatical(String token, TtnsTimeKeepingRequest dto);

	public TtnsResponse deleteTimekeeping(String token, TtnsTimeKeepingRequest dto);
	
	public TtnsResponse workDayTypeByIdTimekeeping(String token, String id);

	public TtnsResponse historyInoutTimekeeping(String token, TtnsTimeKeepingRequest dto);
	
	public TtnsResponse workDayTypeTimeKeeping(String token, Long workdayTypeId, String code, String name, Long affairMode, Long shiftMod, Long overtimeMode);
	
	public TtnsResponse timeKeepingByemployeeId(String token, Long employee_id, Long manager_id, Long from_time, Long to_time);
	
	public TtnsResponse timeKeepingRegister(String token, TtnsTimeKeepingRequest dto);
	
	public TtnsResponse mobileIntegrated(String token, Long employee_id, String uuid);
	
	public TtnsResponse timeKeepingDevice(String token, String type, Long syncTime);
	
	public TtnsResponse timeKeepingDeviceId(String token, String id);
}