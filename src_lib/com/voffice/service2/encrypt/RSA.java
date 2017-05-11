package com.voffice.service2.encrypt;

/**
 *
 * @author datnv5
 */
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import org.apache.log4j.Logger;

/**
 * RSA
 * @author datnv5
 */
public class RSA {

    private PublicKey public_Key;
    private PrivateKey private_Key;

    public PrivateKey getPrivate_Key() {
        return private_Key;
    }

    public PublicKey getPublic_Key() {
        return public_Key;
    }

    public RSA() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048); //2048 used for normal securities
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            public_Key = keyPair.getPublic();
            private_Key = keyPair.getPrivate();
        } catch (NoSuchAlgorithmException ex) {
            LOGGER.error("Loi tao khoa he mat RSA", ex);
        }
    }
    private static final Logger LOGGER = Logger.getLogger(RSA.class);

    public static void main(String[] args) throws IOException {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048); //1024 used for normal securities
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            PublicKey publicKey = keyPair.getPublic();
            PrivateKey privateKey = keyPair.getPrivate();
            
            String aa = FunctionCommon.bytesToHex(publicKey.getEncoded());
            PublicKey kkkk = convertByteToPublicKey(FunctionCommon.hexStringToByteArray(aa));
            
            System.out.println("Public Key - " + publicKey);
            System.out.println("Public Key111 - " + kkkk);
            
            System.out.println("Private Key - " + privateKey);

            //RSA rsaObj = new RSA();

            //Encrypt Data using Public Key
            String aesKey = AES.createAesKey();
            System.out.println("chuoi khoa - " + aesKey);
            byte[] encryptedData = RSA.encryptData(aesKey, publicKey);
            System.out.println("chuoi khoa MH - " + FunctionCommon.bytesToHex(encryptedData));
            //Descypt Data using Private Key
            String a = RSA.decryptData(encryptedData, privateKey);
            System.out.println("chuoi khoa - " + a);

        } catch (NoSuchAlgorithmException e) {
            LOGGER.error("Sai thuat toan ma hoa", e);
        }

    }

    /**
     * Encrypt Data
     * @param data
     * @throws IOException
     */
    public  static  byte[] encryptData(String data, PublicKey keyPL) throws IOException {
        byte[] dataToEncrypt = data.getBytes();
        byte[] encryptedData = null;
        try {
            PublicKey pubKey = keyPL;
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, pubKey);
            encryptedData = cipher.doFinal(dataToEncrypt);
        } catch (Exception e) {
            LOGGER.error("RSA: encryptData", e);
        }
        return encryptedData;
    }

    /**
     * Encrypt Data
     * @param data
     * @throws IOException
     */
    public  static  String decryptData(byte[] data, PrivateKey keyPr) throws IOException {
        String strDecreate = null;
        byte[] descryptedData = null;

        try {
            PrivateKey privateKey = keyPr;
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            descryptedData = cipher.doFinal(data);
            strDecreate = new String(descryptedData);

        } catch (Exception e) {
            LOGGER.error("RSA: decryptData", e);
        }
        return strDecreate;
    }

    /**
     * convert byte toPublicKey
     * @param publicKeyBytes
     * @return
     */
    public  static  PublicKey  convertByteToPublicKey(byte[] publicKeyBytes){
        PublicKey publicKey = null;
        try {
            KeyFactory kf = KeyFactory.getInstance("RSA");
            publicKey = kf.generatePublic(new X509EncodedKeySpec(publicKeyBytes));
        } catch (InvalidKeySpecException ex) {
           LOGGER.error("RSA: convertByteToPublicKey", ex);
        } catch (NoSuchAlgorithmException ex) {
            LOGGER.error("RSA: convertByteToPublicKey", ex);
        }
        return publicKey;
    }

    /**
     * ham thuc hien: convertByteToPrivateKey
     * @param publicKeyBytes
     * @return
     */
    public  static  PrivateKey  convertByteToPrivateKey(byte[] privateKeyBytes){
        PrivateKey privateKey = null;
        try {
            KeyFactory kf = KeyFactory.getInstance("RSA");
            privateKey = kf.generatePrivate(new PKCS8EncodedKeySpec(privateKeyBytes));
        } catch (InvalidKeySpecException ex) {
             LOGGER.error("RSA: convertByteToPublicKey", ex);
        }  catch (NoSuchAlgorithmException ex) {
            LOGGER.error("RSA: convertByteToPublicKey", ex);
        }
        return privateKey;
    }
}
