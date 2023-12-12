package day03;

import java.util.Scanner;

public class ForUpDownEx1 {

	public static void main(String[] args) {

		/* 숫자 업다운 게임을 작성하세요.
		 * 랜덤으로 생성된 숫자를 맞추는 게임
		 * 예시) 랜덤으로 생성된 숫자 : 30
		 * 입력한 정수 : 50
		 * Down! 을 출력합니다
		 * 입력한 정수 : 20
		 * Up! 을 출력합니다
		 * 입력한 정수 : 30
		 * 정답!
		 */
		//랜덤한 수 생성
		
		//반복문 실행 : 조건식만 입력
			//정수 입력
			//정수와 랜덤한 수를 비교 후 결과를 출력
		
		int min = 1, max = 100;
		int r = (int)(Math.random() * (max-min+1) + min);
		
		Scanner scan = new Scanner(System.in);
		int num = min -1;
		System.out.println("랜덤 : " + r);
		
		for( ; num != r; ) {
		
			System.out.print("1~100사이의 수를 입력하세요. : ");
			num = scan.nextInt();
			
			if(num > r) {
				System.out.println("Down!");			
			}else if(num < 7) {
				System.out.println("Up!");
			}else {
				System.out.println("정답입니다~");
			}
		}	
	}
}
