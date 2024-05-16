package io.ch01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MyFileInputStream {

	public static void main(String[] args) {

		// 외부에 있는 파일 데이터를 읽을려면 input
		FileInputStream in = null;
		BufferedInputStream bin = null;

		try {
			in = new FileInputStream("a.txt"); // 기반 스트림
			bin = new BufferedInputStream(in); // 보조 스트림에 사용 -> 기반 스트림이 필요 하다. 

			
			int data;
			while ((data = in.read()) != -1) {
				System.out.print((char) data);
			}
	

		} catch (Exception e) {
			// 리소스 자원 정리 -> 반대로 -> 열었던 자원에 순서를 반대로 닫아 주면된다. 
			if (bin != null) {
				try {
					bin.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		if (in != null) {
			try {
				in.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}

}
