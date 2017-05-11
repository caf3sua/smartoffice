package com.viettel.smartoffice.controller.v1;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Date;
import java.util.HashMap;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.viettel.smartoffice.api.UserApi;
import com.viettel.smartoffice.auth.AuthenticationFailedException;
import com.viettel.smartoffice.auth.JWTTokenAuthFilter;
import com.viettel.smartoffice.framework.api.APIResponse;
import com.viettel.smartoffice.framework.controller.BaseController;
import com.viettel.smartoffice.model.dto.UserDTO;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 *
 * Referred: https://github.com/mpetersen/aes-example, 
 * http://niels.nu/blog/2015/json-web-tokens.html
 */
@Controller
@PropertySources(@PropertySource("classpath:config.properties"))
public class UserController extends BaseController implements UserApi {
	static final String JSON_API_CONTENT_HEADER = "Content-type=application/json";
	
    private static Logger LOG = LoggerFactory.getLogger(UserController.class);
    
    private static final String USE_DOMAIN = "SmartOffice";

    /*
     * (non-Javadoc)
     * @see com.viettel.smartoffice.api.UserApi#login(com.viettel.smartoffice.model.dto.UserDTO, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    public @ResponseBody APIResponse login(@RequestBody UserDTO userDTO,
                                                  HttpServletRequest request, HttpServletResponse response) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeySpecException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException, AuthenticationFailedException {
    	Validate.isTrue(StringUtils.isNotBlank(userDTO.getUsername()), "Username/phone is blank");
        Validate.isTrue(StringUtils.isNotBlank(userDTO.getPassword()), "Password is blank");
        String password = userDTO.getPassword();
        
        LOG.info("Looking for user by username: " + userDTO.getUsername());
//        User user = userService.findByUsername(userDTO.getUsername());
//        
//        HashMap<String, Object> authResp = new HashMap<>();
//        if(userService.isValidPass(user, password)) {
//            LOG.info("User authenticated: "+user.getEmail());
//            userService.loginUser(user, request);
//            createAuthResponse(user, authResp);
//        } else {
//            throw new AuthenticationFailedException("Invalid username/password combination");
//        }

        return APIResponse.toOkResponse("Success");
    }

    /*
     * (non-Javadoc)
     * @see com.viettel.smartoffice.api.UserApi#logout(com.viettel.smartoffice.model.dto.UserDTO)
     */
    @Override
    public @ResponseBody APIResponse logout(@RequestBody UserDTO userDTO) {
        return APIResponse.toOkResponse("success");
    }

    /*
     * (non-Javadoc)
     * @see com.viettel.smartoffice.api.UserApi#renewToken(com.viettel.smartoffice.model.dto.UserDTO)
     */
    @Override
	public APIResponse renewToken(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return null;
	}
    

//    private void createAuthResponse(User user, HashMap<String, Object> authResp) {
//        String token = Jwts.builder()
//        		.setSubject(user.getUsername())
//                .claim("role", USE_DOMAIN)
//                .setIssuedAt(new Date())
//                .signWith(SignatureAlgorithm.HS256, JWTTokenAuthFilter.JWT_KEY).compact();
//        authResp.put("token", token);
//        authResp.put("user", user);
//    }
    
    private void createAuthResponse(UserDTO user, HashMap<String, Object> authResp) {
        String token = Jwts.builder()
        		.setSubject(user.getUsername())
                .claim("role", USE_DOMAIN)
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, JWTTokenAuthFilter.JWT_KEY).compact();
        authResp.put("token", token);
        authResp.put("user", user);
    }
}
