package com.product.util;

import java.util.Base64;

public class CommonUtil {

	public static byte[] Encryptpassword(String plainText) {
		byte[] encryptpassword = Base64.getEncoder().encode(plainText.getBytes());
		return encryptpassword;

	}

	public static String Decryptpassword(String plainText) {
		byte[] decryptpassword = Base64.getDecoder().decode(plainText.getBytes());
		return new String(decryptpassword);

	}

}
