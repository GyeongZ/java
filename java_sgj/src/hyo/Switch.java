package hyo;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("홀,짝 구별 할 숫자를 입력하세요. :  ");
		int num = scanner.nextInt();
		int result = num%2;
		
		switch(result) {
		case 0 :
			System.out.println("짝수입니다.");
			break;
		case 1 :
			System.out.println("홀수입니다.");
			break;
		default :
			System.out.println("숫자를 다시 입력하세요.");
			break;
		}
	}

}
