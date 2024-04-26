package basic;

public class Test {

	public static void main(String[] args) {
		int i, j;//변수 정의

	//1. 	
			 for( i = 1;  i<4; i++ ){ 		//i >> 행
					for(j=0; j<3;  j++) {		//j >> 열
						System.out.print(j+" "); //출력
					}
					System.out.println(); //줄 바꿈
				}
				
	//2. 
		     for(i=1; i<5; i++) {
					for(j=1; j<=i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				
	//3.
			 for(i=1; i<=5; i++) {
					for(j=1; j<=5-i; j++) {
						System.out.print("");
					}
					for(int k=1; k<=i*2-1; k++) {
						System.out.print("*");
					}
					System.out.println();
				}
				
	//4.
			  for(i=1; i<=5; i++) {
					for(j=1; j<=5-i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			  
			  
				
			}//end of main

		}//end of class
		

