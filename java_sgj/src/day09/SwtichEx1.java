package day09;

public class SwtichEx1 {

	public static void main(String[] args) {
			//switch문 안에 자역 변수를 선언하는 경우 발생할 수 있는 문제점
		
		for(int i = 0; i<5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 0; i<5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int menu = 2;
		// int num; 이렇게 미리 안하면 아래와 같은 일 발생
		switch(menu) {
		case 1:
			int num = 10; //여기서 선언된 num이 break문이 없으면 case2까지 갈수있기 때문에
					 //여기서 선언된 num은 이후
					//switch문 아래 코드에서 사용할 수 있음
			System.out.println(num);
			break;
		case 2:
			num = 20; //int num = 20;//을 하면 위에서 선언된 num과 중복, 에러 발생
			System.out.println(num);
			break;
		}
	}
	
}
