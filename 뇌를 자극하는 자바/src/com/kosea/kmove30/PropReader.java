package com.kosea.kmove30;

import java.io.FileInputStream;
import java.util.Properties;

public class PropReader {

	public static void main(String[] args) {

		try {

			// 프로퍼티 파일 위치
			String propFile = "config.properties";

			// 프로퍼티 객체 생성
			Properties props = new Properties();

			// 프로퍼티 파일 스트림에 담기
			FileInputStream fis = new FileInputStream(propFile);

			// 프로퍼티 파일 로딩
			props.load(new java.io.BufferedInputStream(fis));

			// 항목 읽기
			String value = props.getProperty("APPLE");

			// 콘솔 출력
			System.out.println(value);

		} catch (Exception e) {
	        e.printStackTrace();
		}

	}

}

// 출처: http://fruitdev.tistory.com/109 [과일가게 개발자]
