package structure;

public class MainTest1 {

	public static void main(String[] args) {
		
		TencoIntArray tencoIntArray = new TencoIntArray();
		tencoIntArray.addElement(100);
		tencoIntArray.addElement(200);
		tencoIntArray.addElement(300);
		tencoIntArray.addElement(400);
		//tencoIntArray.insertElement(5, 50); // 테스트 이후에 수정 -todo
		// 0에 50을 넣는다
		
		//System.out.println(tencoIntArray.getElement(0));
		tencoIntArray.printAll();
		System.out.println("-------------------");
		System.out.println(tencoIntArray.getCountSize());
		System.out.println("-------------------");
		System.out.println(tencoIntArray.isEmpty());
		System.out.println("-------------------");
		tencoIntArray.removeAll();
		tencoIntArray.printAll();
		
		
	}// end of main
		
}// end of class
