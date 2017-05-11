package com.voffice.service2.connection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	
	public static void main(String[] args) {
		
		String s = "Anh <b> Ba </b> rat dep <b> trai </b>";
		String regex = "<b>(?<highlight>.*?)</b>";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		
		while (matcher.find()) {
			System.out.println("highlight=" + matcher.group("highlight").trim());
		}
		
	}

}
