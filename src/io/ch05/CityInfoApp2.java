package io.ch05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CityInfoApp2 {

	public static void main(String[] args) {

		System.out.println("도시 이름을 입력 하세요(예 : Seoul, NewYork)");

		// try catch resource
		try (Scanner scanner = new Scanner(System.in)) {

			String city = scanner.nextLine();
			String fileName = city + ".txt";

			// 1. FileReader 단점 보안 코드
			try (FileInputStream fis = new FileInputStream(fileName); // 한 바이트씩 읽음
					InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); // fis-> 문자값이 깨져서 (인코딩)
					BufferedReader br = new BufferedReader(isr)) { // 이런 형식을 데코레이션이라고 한다.

				System.out.println(city + " 에 대한 정보 : ");
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}

			} catch (Exception e) {
				System.out.println("해당 파일을 찾을 수 없습니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}// end of main

}// end of class
