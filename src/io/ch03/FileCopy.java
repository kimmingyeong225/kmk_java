package io.ch03;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {

		// 스트림은 기본적으로 단방향이다. (한방향으로 데이터를 흘러보낼 수 있다는 뜻)
		// 입력 스트림, 출력 스트림 두개가 필요하다

		// 파일 경로 (복사할 대상)
		String sourceFilePath = "C:\\Users\\KDP\\Downloads\\a.zip";
		// 목적지 파일
		String destinationFilePath = "copy1.zip";

		// 소요 시간 확인
		long startTime = System.nanoTime();

		try (FileInputStream in = new FileInputStream(sourceFilePath);
				FileOutputStream out = new FileOutputStream(destinationFilePath)) {

			int data;
			while ((data = in.read()) != -1) {
				// 파일에출력
				out.write(data);

			}
			System.out.println("입력스트림--> 출력스트림--> 입력--> 출력 에 반복 완료");

		} catch (Exception e) {

		}

		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("복사의 소요 시간 : " + duration);

		// 소요 시간을 추 단위로 변환 --> 포맷팅
		double seconds = duration / 1_000_000_000.0; // double 타입으로 연산해야 정확해서 소수점 붙여줌
		// String 클래스에 format 메서드 사용해보기
		String resultFormat = String.format("소요 시간은 : %.6f초 입니다", seconds); // 하나의 문자열 리턴
		// %는 포맷 지정자의 시작
		// f 지정자는 float, double 유형의 변수를 인자로 받아 처리하겠다.
		System.out.println(resultFormat);

	}

}
