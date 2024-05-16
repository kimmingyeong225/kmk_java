package io.ch02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class MyBufferedOutputStream {

	public static void main(String[] args) {

		// 현재 시간 (시작)
		long start = System.nanoTime(); // (더 정밀한 현재 시간을 출력)

		String data = "기반 스트림 + 보조 스트림을 활용해보자";

		// try - catch - resorce 활용
		try (FileOutputStream fos = new FileOutputStream("output2.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {

			// 코드 수행 부분
			byte[] bytes = data.getBytes();
			// 보조 스트림 (버퍼)
			bos.write(bytes);
			// 간혹 버퍼에 데이터가 남아 있다면 중복된 데이터를 쓸 수 있다
			// 한 번 사용한 다음에
			bos.flush(); // flush --> 물을 내리다. (버퍼에 담긴 데이터를 비워야 새로운 데이터를 넣을 수 있으니까)

			System.out.println("보조 스트림을 활용한 파일 출력 완료");
			// 시간 측정을 해보고 싶다

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 현재 시간 (종료)
		long end = System.nanoTime();
		// 종료 - 시작 = 소요 시간
		long duraiton = end - start;
		System.out.println("기반 스트림 파일 입출력 소요 시간 : " + duraiton);
		// 실행 코드 안에 다가 적어야됨

	}

}
