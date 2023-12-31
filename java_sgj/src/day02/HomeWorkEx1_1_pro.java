package day02;

import java.util.Scanner;

public class HomeWorkEx1_1_pro {

	public static void main(String[] args) {
		/* 성적을 입력받아 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * 90이상 ~ 100 이하 : A
		 * 80이상 ~ 90 미만 : B
		 * 70이상 ~ 80 미만 : C
		 * 60이상 ~ 70 미만 : D
		 * 60미만 : F
		 * 0보다 작거나 100보다 큰 경우 : 잘못된 점수
		 */
		
		//성적을 콘솔에서 입력 받음
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요. : ");
		int score = scan.nextInt();
		
		//성적을 기준으로 학점을 출력
		//(먼저 말로 풀어서)성적이 90점 이상이고 성적이 100점 이하이면 A학점 출력
		if(score >= 90 && score <= 100) {
			System.out.println(score + "점은 A");
		}
		//성적이 80점이상이고 90점미만이면 A학점 출력
		//동시에 만족할수있으면 if 아니기 때문에 else if
		else if(score >= 80 && score < 90) {
			System.out.println(score + "점은 B");
		}
		else if(score >= 70 && score < 80) {
			System.out.println(score + "점은 C");
		}
		else if(score >= 60 && score < 70) {
			System.out.println(score + "점은 D");
		}
		else if(score >= 0 && score < 60) {
			System.out.println(score + "점은 F");
		}
		else{
			System.out.println("잘못된 점수");
		}
		
		
		//순서가 중요한 대신 조건식이 간결해지는 방법
		if(score < 0 || score > 100) {
			System.out.println("잘못된 점수");
		}else if(score >= 90) {
			System.out.println(score + "점은 A");
		}else if(score >= 80) {
			System.out.println(score + "점은 B");
		}else if(score >= 70) {
			System.out.println(score + "점은 C");
		}else if(score >= 60) {
			System.out.println(score + "점은 D");
		}else{
			System.out.println(score + "점은 F");
		}
		scan.close();
	}

}
