package com.viettel.smartoffice.framework.api;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.viettel.smartoffice.ws.dto.KttsResponse;
import com.viettel.smartoffice.ws.dto.QlttResponse;
import com.viettel.smartoffice.ws.dto.TtnsResponse;
import com.viettel.smartoffice.ws.dto.VofficeResponse;

/**
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class APIResponse {
    public static final String API_RESPONSE = "apiResponse";
    Object data;
    String time;
    String message;
    String errorCode;
	long resultCode;
    Object extraResult;

    public static class ExceptionAPIResponse extends APIResponse {
        Object details;

        public Object getDetails() {
            return details;
        }

        public void setDetails(Object details) {
            this.details = details;
        }
    }
    
    public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

    public Object getExtraResult() {
        return extraResult;
    }

    public void setExtraResult(Object extraResult) {
        this.extraResult = extraResult;
    }
    
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static APIResponse toOkResponse(Object data, long httpCode, String message) {
        return toAPIResponse(data, httpCode, message);
    }
    
    public static APIResponse toOkResponse(Object data, long httpCode) {
        return toAPIResponse(data, httpCode);
    }
    
    public static APIResponse toOkResponse(Object data) {
        return toAPIResponse(data, 200);
    }

    public static APIResponse toErrorResponse(Object data) {
        return toAPIResponse(data, 2001);
    }

    public Object getData() {
		return data;
	}

	public String getMessage() {
		return message;
	}

	public long getResultCode() {
		return resultCode;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setResultCode(long resultCode) {
		this.resultCode = resultCode;
	}
	
    public static ExceptionAPIResponse toExceptionResponse(String data, Object details) {
        ExceptionAPIResponse response = new ExceptionAPIResponse();
        response.setData(data);
        response.setDetails(details);
        response.setResultCode(2001);
        return response;
    }

    public APIResponse withModelAndView(ModelAndView modelAndView) {
        modelAndView.addObject(API_RESPONSE, this);
        return this;
    }

    public static APIResponse toAPIResponse(String message, long code) {
        APIResponse response = new APIResponse();
        response.setResultCode(code);
        response.setMessage(message);
        return response;
    }
    
    public static APIResponse toAPIResponse(Object data, long code) {
        APIResponse response = new APIResponse();
        response.setData(data);
        response.setResultCode(code);
        return response;
    }
    
    public static APIResponse toAPIResponse(Object data, long code, String message) {
        APIResponse response = new APIResponse();
        response.setData(data);
        response.setResultCode(code);
        response.setMessage(message);
        return response;
    }
    
    public static APIResponse toAPIResponse(VofficeResponse dto) {
        APIResponse response = new APIResponse();
        response.setData(dto.getData());
        if (StringUtils.isNotEmpty(dto.getErrorCode())) {
        	response.setResultCode(Long.parseLong(dto.getErrorCode()));
        } else {
        	response.setResultCode(HttpStatus.OK.value());
        }
        response.setMessage(dto.getMessage());
        return response;
    }
    
    public static APIResponse toAPIResponse(TtnsResponse dto) {
        APIResponse response = new APIResponse();
        response.setData(dto.getData());
        response.setResultCode(dto.getStatusCode());
        response.setMessage(dto.getMessage());
        return response;
    }
    
    
    public static APIResponse toAPIResponse(QlttResponse dto) {
        APIResponse response = new APIResponse();
        response.setData(dto.getData());
        response.setResultCode(dto.getStatusCode());
        response.setMessage(dto.getMessage());
        return response;
    }
    
    // KTTS
    public static APIResponse toAPIResponse(KttsResponse dto) {
        APIResponse response = new APIResponse();
        if (StringUtils.equalsIgnoreCase("SUCCESS", dto.getStatus())) {
        	response.setResultCode(200);
        } else {
        	response.setResultCode(2001);
        }
        response.setData(dto.getData());
        response.setMessage(dto.getErrorInfo());
        response.setErrorCode(dto.getErrorCode());
        return response;
    }
}
