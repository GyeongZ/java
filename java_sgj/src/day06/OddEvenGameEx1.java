package day06;

import java.util.Scanner;

public class OddEvenGameEx1 {

	public static void main(String[] args) {
		//정수 num가 주어졌을 때 홀수인지 짝수인지 판별하는 예제
			
		//num % 2 = 0 (짝수는 2의 배수이므로 나누면 0)
		
		/* (생각하기)
		int num = 10;
		
		if(정수 num이 짝수이면) {
			System.out.println(num + "은 짝수입니다.");
		} else(아니면 홀수이다) {
			System.out.println(num + "은 홀수입니다.");
		}*/
		
		/*(강사님)
		int num = 10;
		
		if(num % 2 == 0) {
			System.out.println(num + "은 짝수입니다.");
		} else {
			System.out.println(num + "은 홀수입니다.");
		}*/
		
		
		//(게임 만들기)
		
		int num = 0;
		int min = 1, max = 100;
		int totalMoney = 10000; //게임 시작시 주어지는 금액
		num = (int)(Math.random()*(max - min + 1) + min);
		
		//아래 코드를 현재 금액이 0이 될때까지 반복하도록 수정하라.
		while(totalMoney > 0) {
					
			//num가 1~100 사이의 랜덤한 수를 생성하는 코드를 작성
			Scanner scan = new Scanner(System.in);
			
			//사용자가 0또는 1을 입력받는(받으려면 스캐너 사용!!)코드를 작성 0:짝수, 1:홀수
			System.out.println("짝수는 (0)/ 홀수는 (1)");
			int user = scan.nextInt();
			
			// 사용자가 게임에 투입할 금액을 입력하는 코드를 작성(1원~현재 금액까지)
			System.out.println("게임에 사용할 금액을 입력하세요.(1~"+totalMoney+") : ");
			int money = scan.nextInt();
			
			//입력받은 money가 totalMoney보다 크면 totalMoney로 수정하는 코드를 작성
			if(money > totalMoney) {
				money =  totalMoney;
			}
			//한줄로 쓰면 money = money ? totalMoney : money
			
			if(num % 2 == 0) {
				System.out.println(num + "는 짝수!");
			} else {
				System.out.println(num + "는 홀수!");
			}
			
			// 사용자가 입력한 값이 맞았는지 틀렸는지를 출력하는 코드를 작성
			// 사용자가 입력한 값이 num의 홀짝과 맞는지를 출력하는 코드를 작성
			// 승이면 배팅 금액을 주고, 패일때는 배팅 금액을 차감하는 코드를 작성
			
			if(user == num % 2) { //(위에 짝수는 0을 클릭하라고 했기때문에)
				System.out.println("사용자 승!");
				totalMoney += money; //
			}else {
				System.out.println("사용자 패!");
				totalMoney -= money;
			}
			
			//현재 금액을 출력한다.
			System.out.println("현재 금액 : " + totalMoney);
	
			System.out.println("배팅 금액이 없으므로 게임을 종료합니다");

			scan.close();
		}
	}

}
