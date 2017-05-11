/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voffice.service2.smartoffice;

import com.voffice.service2.encrypt.AES;
import com.voffice.service2.encrypt.FunctionCommon;

/**
 *
 * @author os01
 */
public class VofficeRsaKeyPublic {
    private static String AESKey = "";
    private static String RSAPublicKey = "";

    public static void main(String[] args) {
        getRSAKeyPublic();
    }
    
    private static String getRSAKeyPublic() {
        System.out.println();
        System.out.println("-------------- getRSAKeyPublic --------------");
        String result = "";
        try {
            String dataRequestMH = FunctionCommon.sendPostService2(
                    "Authenticate.getRsaKeyPublic", null, null, null);
            String codeErr = FunctionCommon
                    .getCodeRequestService2(dataRequestMH);
            if (codeErr.equals("200")) {
                System.out.println("getRSAKeyPublic-OK");
                // Lay key RSA thanh cong
                RSAPublicKey = FunctionCommon.getDataRequestService2ByKeyJson(
                        dataRequestMH, "result.data.strPublicKey").toString();
                // Tao key Aes
                AESKey = AES.createAesKey();
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = "";
        }
        return result;
    }
}
