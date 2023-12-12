package day03;

public class WhileEx1 {
	//while문 예제
	public static void main(String[] args) {
		//Hello world를 5번 출력하는 예제
		System.out.println("Hello World!");
		
		int i = 1; //초기화
		int count = 5;
		while(i <= count) {//조건식
			System.out.println("Hello World!"); //실행문
			++i; //증감식 (i++; i+=1; i=i+1; 모두 가능)
		}
	}

}
