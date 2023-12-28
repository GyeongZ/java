package day14;

import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionEx1 {

	public static void main(String[] args) {
		//두 정수와 산술 연산자를 입력받아 산술 연산하는 코드를 작성하세요.
		//단, 0으로 나눌 때 예외처리를 적용한다.
		
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 정수를 입력하세요.");
		scan.nextInt();
		
		try {
		System.out.println("num1"+ "+" + "num2" + "=" num1 + num2);
		System.out.println("num1"+ "-" + "num2" + "=" num1 - num2);
		System.out.println("num1"+ "*" + "num2" + "=" num1 * num2);
		System.out.println("num1"+ "%" + "num2" + "=" num1 % num2);
		System.out.println("num1"+ "/" + "num2" + "=" num1 / num2);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됩니다.");
		}
		catch(Exception e) {
			System.out.println("모든 예외를 처리합니다.");
		}
		System.out.println("프로그램을 종료합니다.");
		 */
		
		//두 정수와 산술 연산자를 입력
		System.out.print("두 정수와 산술 연산자를 입력하세요. (예 1 + 2) : ");
		Scanner scan = new Scanner(System.in);
		
		try {
			int num1 = scan.nextInt();
			char op = scan.next().charAt(0);
			int num2 = scan.nextInt();
			double res = 0;
			
			//연산자에 맞게 결과를 출력
			switch(op) {
			case '+': res = num1 + num2; break;
			case '-': res = num1 - num2; break;
			case '*': res = num1 * num2; break;
			case '/': res = num1 / num2; break;
			case '%': res = num1 % num2; break;
			}
			String pattern = "{0} {1} {2} = {3}";
			System.out.println(MessageFormat.format(pattern, num1,op,num2,res));
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(InputMismatchException e) {
			System.out.println("입력을 잘못했습니다");
		}
	}

}
