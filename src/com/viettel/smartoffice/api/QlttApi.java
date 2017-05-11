package com.viettel.smartoffice.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.viettel.smartoffice.framework.api.APIResponse;
import com.viettel.smartoffice.ws.dto.QlttRequest;

/**
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 *
 */
@RequestMapping("v1/qltt")
public interface QlttApi {
	static final String JSON_API_CONTENT_HEADER = "Content-type=application/json";
	
	/**
	 * @api {post} /v1/qltt/authenticate Xác thực account
	 * @apiName authenticate
	 * @apiGroup QLTT
	 * 
	 * @apiDescription Xác thực account để lấy thông tin Authentication token
	 * 
	 * @apiParam {String}		userName	user name of user
	 * @apiParam {String}		password	password of user
	 * @apiParam {String}		test		extra information
	 * 
	 * @apiParamExample {json} Request-Example:
	 * 				{"userName":"dongnd8","password":"test","test":"hehe"}
	 * 
	 * @apiSuccess {Object}   ClientResponse	đăng nhập thành công
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"userName":"dongnd8","password":"test","test":"hehe"}
	 *
	 * @apiError UserNotFound The id of the User was not found.
	 *
	 */
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public @ResponseBody APIResponse authenticate(@RequestBody QlttRequest dto);
	
	/**
	 * @api {post} /v1/qltt/getTypePermission Lấy type quyền account 
	 * @apiName getTypePermission
	 * @apiGroup QLTT
	 * 
	 * @apiDescription API lấy type quyền account (nếu cần thiết), hiện mình chỉ cho view giống nhau thì có thể chưa gấp cái này. Chưa làm.
	 * 
	 * @apiParamExample {json} Request-Example:
	 * 				{}
	 * 
	 * @apiSuccess {Object}   APIResponse	thành công
	 *
	 * @apiSuccessExample Success-Response:
	 *     {}
	 */
	@RequestMapping(value = "/getTypePermission", method = RequestMethod.POST)
    public @ResponseBody APIResponse getTypePermission(@RequestBody QlttRequest dto);
	
	/**
	 * @api {post} /v1/qltt/getDocumentInfo Tra cứu tài liệu theo các tiêu chí
	 * @apiName getDocumentInfo
	 * @apiGroup QLTT
	 * 
	 * @apiDescription Tra cứu tài liệu theo các tiêu chí (nếu PMTH cung cấp được dạng keyword chung)
	 * 
	 * @apiParam {String}		name			Tên tài liệu
	 * @apiParam {String}		code			Mã tài liệu
	 * @apiParam {String}		description		Nội dung tài liệu
	 * @apiParam {String}		authorName		Tác giả tài liệu
	 * @apiParam {Long}			type			Trạng thái tài liệu (0: search theo mục, 1: tài liệu được xem nhiều nhất, 2: tài liệu mới nhất)
	 * 
	 * @apiParamExample {json} Request-Example:
	 * 				{"name":"Ten tai lieu","code":"ma tai lieu","description":"mo ta","authorName":"ten tac gia","type":"0"}
	 * 
	 * @apiSuccess {Object}   documentServiceBean	nội dung thông tin trả về gồm ít nhất các thông tin trên + ảnh đại diện của tài liệu, có thể thêm một số trường có sẵn cũng được.
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"result":[{"documentId":5102,"code":"CTKT.00.KT.129","name":"Bộ Chỉ tiêu kỹ thuật cơ bản cho hệ thống quản lý","description":"Bộ Chỉ tiêu kỹ thuật cơ bản cho hệ thống quản lý màn hình tập trung","authorName":"TT Sơn","documentCategory":null,"docCategoryName":"Programming language","status":null,"statusName":"Còn hiệu lực","type":null,"fileAttachment":[{"fileAttachmentId":1001743,"filePath":"document/20160226/520070/869D5nHCRmyhJpptRRy5dXVFx18=.pdf","fileName":"javaForTesters-sample.pdf","parentId":5109,"createdDate":null,"createdUser":null,"modifiedDate":null,"modifiedUser":null,"status":null,"type":null,"fileType":null,"fileSize":null,"compareById":true}]},{"documentId":5109,"code":"877/QĐ-VTQĐ-TCNL","name":"QĐ ban hành Quy định về xử lý kỷ luật với cán bộ, nhân viên trong Tập đoàn Viễn thông Quân đội (bản sửa đổi, bổ sung)","description":"QĐ ban hành Quy định về xử lý kỷ luật với cán bộ, nhân viên trong Tập đoàn Viễn thông Quân đội (bản sửa đổi, bổ sung)","authorName":"TT Hùng","documentCategory":null,"docCategoryName":"Telecommunication","status":null,"statusName":"Còn hiệu lực","type":null,"fileAttachment":[{"fileAttachmentId":1001743,"filePath":"document/20160226/520070/869D5nHCRmyhJpptRRy5dXVFx18=.pdf","fileName":"javaForTesters-sample.pdf","parentId":5109,"createdDate":null,"createdUser":null,"modifiedDate":null,"modifiedUser":null,"status":null,"type":null,"fileType":null,"fileSize":null,"compareById":true}]},{"documentId":2020,"code":"GL.VTQD.NCSX.12","name":"Guideline tính giá trị sản lượng của các đơn vị khối NCSX","description":"Guideline tính giá trị sản lượng của các đơn vị khối NCSX","authorName":"TT Chiến","documentCategory":null,"docCategoryName":"Infrastructure, Construction","status":null,"statusName":"Hết hiệu lực","type":null,"fileAttachment":[{"fileAttachmentId":1001743,"filePath":"document/20160226/520070/869D5nHCRmyhJpptRRy5dXVFx18=.pdf","fileName":"javaForTesters-sample.pdf","parentId":5109,"createdDate":null,"createdUser":null,"modifiedDate":null,"modifiedUser":null,"status":null,"type":null,"fileType":null,"fileSize":null,"compareById":true}]}]},"resultCode":200}
	 */
	@RequestMapping(value = "/getDocumentInfo", method = RequestMethod.POST)
    public @ResponseBody APIResponse getDocumentInfo(@RequestBody QlttRequest dto);
	
	
	/**
	 * @api {post} /v1/qltt/getDocumentCategory list case thư mục tài liệu để browser.
	 * @apiName getDocumentCategory
	 * @apiGroup QLTT
	 * 
	 * @apiDescription APIs list case thư mục tài liệu để browser.
	 * 
	 * @apiParam {Long}			documentCategoryId		ID của DocumentCategory
	 * @apiParam {Long}			type			type: 1 lấy toàn bộ cây thư mục, 2 lấy toàn bộ lĩnh vực con bắt đầu từ id, 3 lấy lĩnh vực con cấp 1 từ id.
	 * 
	 * @apiParamExample {json} Request-Example:
	 * 				{"documentCategoryId":2051,"type":1}
	 * 
	 * @apiSuccess {Object}   DocumentCategoryServiceBean	nội dung thông tin trả về gồm ít nhất các thông tin trên + ảnh đại diện của tài liệu, có thể thêm một số trường có sẵn cũng được.
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":{"result":[{"documentId":5102,"code":"CTKT.00.KT.129","name":"Bộ Chỉ tiêu kỹ thuật cơ bản cho hệ thống quản lý","description":"Bộ Chỉ tiêu kỹ thuật cơ bản cho hệ thống quản lý màn hình tập trung","authorName":"TT Sơn","documentCategory":null,"docCategoryName":"Programming language","status":null,"statusName":"Còn hiệu lực","type":null,"fileAttachment":[{"fileAttachmentId":1001743,"filePath":"document/20160226/520070/869D5nHCRmyhJpptRRy5dXVFx18=.pdf","fileName":"javaForTesters-sample.pdf","parentId":5109,"createdDate":null,"createdUser":null,"modifiedDate":null,"modifiedUser":null,"status":null,"type":null,"fileType":null,"fileSize":null,"compareById":true}]},{"documentId":5109,"code":"877/QĐ-VTQĐ-TCNL","name":"QĐ ban hành Quy định về xử lý kỷ luật với cán bộ, nhân viên trong Tập đoàn Viễn thông Quân đội (bản sửa đổi, bổ sung)","description":"QĐ ban hành Quy định về xử lý kỷ luật với cán bộ, nhân viên trong Tập đoàn Viễn thông Quân đội (bản sửa đổi, bổ sung)","authorName":"TT Hùng","documentCategory":null,"docCategoryName":"Telecommunication","status":null,"statusName":"Còn hiệu lực","type":null,"fileAttachment":[{"fileAttachmentId":1001743,"filePath":"document/20160226/520070/869D5nHCRmyhJpptRRy5dXVFx18=.pdf","fileName":"javaForTesters-sample.pdf","parentId":5109,"createdDate":null,"createdUser":null,"modifiedDate":null,"modifiedUser":null,"status":null,"type":null,"fileType":null,"fileSize":null,"compareById":true}]},{"documentId":2020,"code":"GL.VTQD.NCSX.12","name":"Guideline tính giá trị sản lượng của các đơn vị khối NCSX","description":"Guideline tính giá trị sản lượng của các đơn vị khối NCSX","authorName":"TT Chiến","documentCategory":null,"docCategoryName":"Infrastructure, Construction","status":null,"statusName":"Hết hiệu lực","type":null,"fileAttachment":[{"fileAttachmentId":1001743,"filePath":"document/20160226/520070/869D5nHCRmyhJpptRRy5dXVFx18=.pdf","fileName":"javaForTesters-sample.pdf","parentId":5109,"createdDate":null,"createdUser":null,"modifiedDate":null,"modifiedUser":null,"status":null,"type":null,"fileType":null,"fileSize":null,"compareById":true}]}]},"resultCode":200}
	 */
	@RequestMapping(value = "/getDocumentCategory", method = RequestMethod.POST)
    public @ResponseBody APIResponse getDocumentCategory(@RequestBody QlttRequest dto);
	
	
	/**
	 * @api {post} /v1/qltt/downloadFile download tải liệu -> lấy file về để preview.
	 * @apiName downloadFile
	 * @apiGroup QLTT
	 * 
	 * @apiDescription API download tải liệu -> lấy file về để preview.
	 * Data test: document/20160411/520078/Nn0kDqF2lBxOJPLU83IPvfK38A=.pdf, 
	 * 
	 * @apiParam {String}		filePath		Path đến file cần download
	 * 
	 * @apiParamExample {json} Request-Example:
	 * 				{"filePath":"document/20160411/520078/Nn0kDqF2lBxOJPLU83IPvfK38A=.pdf"}
	 * 
	 * @apiSuccess {String}   data	String được mã hóa từ dữ liệu dang byte[] của file bằng sun.misc.BASE64Decoder
	 *
	 * @apiSuccessExample Success-Response:
	 *     {"data":"MDMwMzI3NSAwMDAwMCBuDQowMDAw\nMzAz...","resultCode":200}
	 */
	@RequestMapping(value = "/downloadFile", method = RequestMethod.POST)
    public @ResponseBody APIResponse downloadFile(@RequestBody QlttRequest dto);
}
