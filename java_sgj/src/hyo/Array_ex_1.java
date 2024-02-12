package hyo;


public class Array_ex_1 {
	
	public static void main(String[] args) {
		
		// 선언을 한 후 초기화
		int a = 0;
		int [] score = new int [5];
		
		score [0] = 10;
		score [1] = 20;
		score [2] = 30;
		score [3] = 30;
		score [4] = 50;
//		score [5] = 60;
		
		System.out.println();
		
		// 선언과 초기화를 동시에
		int [] score2 = {10,20,30,40,50};
		
		String [] arrstr = {"김","이","박","신","남"};
		for(int i = 0; i<arrstr.length; i++) {
			System.out.println(arrstr[i]);			
		}
		System.out.println("출력 끝");

//						
		for(int i = 4; i<arrstr.length; i--) {
			System.out.println(arrstr[i]);
		}
		System.out.println("역순 출력");
		
	}
}
