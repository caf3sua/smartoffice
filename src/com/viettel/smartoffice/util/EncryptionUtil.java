package com.viettel.smartoffice.util;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;

import com.viettel.smartoffice.model.dto.UserDTO;

public class EncryptionUtil {
	private static final String passPhrase = "biZndDtCMkdeP8K0V15OKMKnSi85";
	
	private static final String salt = "b88584e6dfd31adc712641cb39f4d0c2";
	
	private static final String iv = "af1940e3d50e3f099f1743c83d05ae4c";
	
	private static final int iterationCount = 1000;
	
	private static final int keySize = 256;
	
	public static String decrypt(String encryptedMessage) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, InvalidKeySpecException, BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException {
        return decrypt(encryptedMessage, "true");
    }
	
	public static String decrypt(String encryptedMessage, String enableEncrypt) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, InvalidKeySpecException, BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException {
		boolean isEncrypt = Boolean.parseBoolean(enableEncrypt);
		// No encrypt
		if (!isEncrypt) {
			return encryptedMessage;
		}
		
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        KeySpec spec = new PBEKeySpec(passPhrase.toCharArray(), salt.getBytes(), iterationCount, keySize);
        SecretKey key = new SecretKeySpec(factory.generateSecret(spec).getEncoded(), "AES");

        cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(hex(iv)));
        byte[] decrypted = cipher.doFinal(base64(encryptedMessage));

        return new String(decrypted, "UTF-8");
    }
	
	public static String encrypt(String input) {
		byte[] encrypted = null;
		
		try {
	        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
	        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
	        KeySpec spec = new PBEKeySpec(passPhrase.toCharArray(), salt.getBytes(), iterationCount, keySize);
	        SecretKey key = new SecretKeySpec(factory.generateSecret(spec).getEncoded(), "AES");
	
	        cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(hex(iv)));
	        encrypted = cipher.doFinal(input.getBytes("UTF-8"));
	        
	        return Base64.encodeBase64String(encrypted);
		} catch (Exception e) {
			return null;
		}
    }
	
	public static String decryptPassword(UserDTO userDTO) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, InvalidKeySpecException, BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException {
        String passPhrase = "biZndDtCMkdeP8K0V15OKMKnSi85";
        String salt = userDTO.getSalt();
        String iv = userDTO.getIv();
        int iterationCount = userDTO.getIterations();
        int keySize = userDTO.getKeySize();

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        KeySpec spec = new PBEKeySpec(passPhrase.toCharArray(), hex(salt), iterationCount, keySize);
        SecretKey key = new SecretKeySpec(factory.generateSecret(spec).getEncoded(), "AES");

        cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(hex(iv)));
        byte[] decrypted = cipher.doFinal(base64(userDTO.getEncryptedPassword()));

        return new String(decrypted, "UTF-8");
    }
	
	private String base64(byte[] bytes) {
        return Base64.encodeBase64String(bytes);
    }

    private static byte[] base64(String str) {
        return Base64.decodeBase64(str);
    }

    private static String hex(byte[] bytes) {
        return Hex.encodeHexString(bytes);
    }

    private static byte[] hex(String str) {
        try {
            return Hex.decodeHex(str.toCharArray());
        }
        catch (DecoderException e) {
            throw new IllegalStateException(e);
        }
    }
}
