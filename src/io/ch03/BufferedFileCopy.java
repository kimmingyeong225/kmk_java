package io.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopy {
	
	public static void main(String[] args) {
		// (바이트 기반 스트림을 활용)
		//기반 스트림 + 보조스트림을 활용해서
		//파일 복사 기능을 만들고
		//소요 시간을 측정하시오
		
		long startTime = System.nanoTime();
		
		String sourceFilePath = "C:\\Users\\KDP\\Downloads\\a.zip";
		String destinationFilePath = "cope2.zip";
		
		try(	FileInputStream in = new FileInputStream(sourceFilePath);
				FileOutputStream out = new FileOutputStream(destinationFilePath);
				BufferedInputStream fin = new BufferedInputStream(in); // out만 적으면 안되고 in, out 둘 다 적어줘야 됨
				BufferedOutputStream fout = new BufferedOutputStream(out)
				){
			
			//byte[] bytes = data.getBytes();
			int data;
			//ff.write(data);
			while((data = in.read()) != -1) {
				out.write(data);
			}
			fout.flush(); // flush <- 이거 해주기!
			// 매번 입출력을 발생하는 것이 아니라 한번에 입출력을사용
			System.out.println("입력스트림--> 출력스트림--> 입력--> 출력 에 반복 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("복사 소유 시간 : " + duration);
		
		double secods = duration / 1_000_000_000.0;
		
		String reslutFormat = String.format("소요 시간은 : %.6f초 입니다 ", secods);
		System.out.println(reslutFormat);
		
	}

}
