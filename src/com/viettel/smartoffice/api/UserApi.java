package com.viettel.smartoffice.api;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.viettel.smartoffice.auth.AuthenticationFailedException;
import com.viettel.smartoffice.framework.api.APIResponse;
import com.viettel.smartoffice.model.dto.UserDTO;

/**
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 *
 */
@RequestMapping("v1/user")
public interface UserApi {
	static final String JSON_API_CONTENT_HEADER = "Content-type=application/json";
	
    /**
     * Authenticate a user
     *
     * @param userDTO
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST, headers = {JSON_API_CONTENT_HEADER})
    public @ResponseBody APIResponse login(@RequestBody UserDTO userDTO, HttpServletRequest request, HttpServletResponse response) 
    		throws NoSuchPaddingException
    		, NoSuchAlgorithmException
    		, InvalidKeySpecException
    		, InvalidAlgorithmParameterException
    		, InvalidKeyException
    		, BadPaddingException
    		, IllegalBlockSizeException
    		, UnsupportedEncodingException
    		, AuthenticationFailedException;
    

    /**
     * Logs out a user by deleting the session
     *
     * @param userDTO
     * @return
     */
    @RequestMapping(value = "/logout", method = RequestMethod.DELETE)
    public @ResponseBody APIResponse logout(@RequestBody UserDTO userDTO);
    
    /**
     * Renew token
     *
     * @param userDTO
     * @return
     */
    @RequestMapping(value = "/renew_token", method = RequestMethod.POST)
    public @ResponseBody APIResponse renewToken(@RequestBody UserDTO userDTO);
}
