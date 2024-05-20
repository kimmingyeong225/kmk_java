package io.ch06;

import java.io.BufferedWriter;
import java.io.FileWriter;

// 버퍼를 활용 파일 출력 스트림에 사용
public class MyFileBufferedWriter {

	public static void main(String[] args) {
		
		String filePate = "output2.txt";
		
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePate))){
			bw.write("첫 번재 줄 입니다.");
			bw.newLine();
			bw.write("두 번째 줄 입니다");
			bw.newLine();
			bw.write("세 번째 줄 입니다");
			
			// 버퍼를 비우고 데이터 쓰기
			bw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}// end of main

}// end of class
