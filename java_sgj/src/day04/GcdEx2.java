package day04;

import java.util.Scanner;

public class GcdEx2 {

	public static void main(String[] args) {
		/* 두 정수의 공약수를 출력하는 코드를 작성하세요.
		 * 약수 : 나누어서 떨어지는 수
		 * 공약수 : 공통으로 있는 약수
		 * 12의 약수 : 1,2,3,4,6,12
		 * 8의 약수 : 1,2,4,8
		 * 8과 12의 공약수 : 1,2,4
		 * 반복회수	: i는 1부터 num1까지 1씩 증가
		 * 규칙성(=실행문): i는 num1의 약수이고, i가 num2의 약수이면 i를 출력
		 * 			=> num1을 i로 나누었을 때 나머지가 0과 같고,
		 * 			=> num2를 i로 나누었을 때 나머지가 0과 같다면 i를 출력
		 * 반복문종료후 : 없음
		 */
		//Scanner scan = new Scanner(System.in);
		//System.out.print("두 정수를 입력하세요 : ");
		
		//int num1 = scan.nextInt();
		//int num2 = scan.nextInt();
	
		
		//for(int i = 1; i <= num1; i++) {
		//	if(num1 % i == 0) {
		//		System.out.print("두 수의 공약수 : " + i+ (i== num1?"\n":", "));
		//		}
		//	}
	
		//scan.close();
		
		int num1 = 8, num2 = 12;
	
		for( int i = 1 ; i <= num1 ; i++) {
			if(num1 % i == 0 && num2 % i== 0) {
				System.out.println((i == 1 ? "" : ", ") + i);
			}
		}
	}

}
