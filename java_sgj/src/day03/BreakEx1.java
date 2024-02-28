package day03;

import java.util.Scanner;

public class BreakEx1 {

	public static void main(String[] args) {

		// 문자를 입력해서 입력한 문자를 출력하고, q를 입력하면 종료하는 예제
		Scanner scan = new Scanner(System.in);
		
		int k = 1;
		
		while(k != 0) {
			
			for(int i = 1; i<10; i++) {
    			int sum = 2*i;
    			System.out.println( 2 + "x" + i + "=" + sum);
    		}
			System.out.print("숫자 입력 : ");
			k = scan.nextInt();
			System.out.println("숫자: " + k);
			
			if(k == 0) {
				System.out.println("끝났습니다.");
				break;
				
			}
		}
		scan.close();		
	}

}
