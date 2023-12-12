package day03;

public class WhileMultipleTableEx1 {

	public static void main(String[] args) {

		/* 구구단 2단을 출력하는 코드를 작성하세요.
		 * 2 X 1 = 2
		 * ...
		 * 2 X 9 = 18
		 * 
		 * 생각 할 것
		 * 반복회수     : i는 1부터 9까지 1씩 증가
		 * 규칙성      : 2 X i = 2*i를 출력
		 * 반복문 종료 후: 없음
		 */
		
		//int i = 1;
		//int count = 9;
		//while (i <= count) {
			//실행문 : System.out.println(2 + " x " + i + " = " + 2*i);
			//증감식 : ++i;
			
		//강사님 코드
			
		int num = 2;
		int i = 1;
		while(i <= 9) {
			System.out.println(num + " X " + i + " = " + num*1);
			i++;
			}
		}
	
	}

