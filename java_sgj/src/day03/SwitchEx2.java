package day03;

public class SwitchEx2 {
	//switch문 예제
	public static void main(String[] args) {
		//정수를 입력받아 입력받은 정수의 홀짝 판별 예제를 switch문을 이용하여 작성하세요.
		
		int num = 876465;
		
		switch(num % 2) {
		case 0:
			System.out.println(num + "의 숫자는 짝수입니다.");
			break;
		default:
			System.out.println(num + "의 숫자는 홀수입니다.");
			}
		
		//if문으로 했을때
		if(num % 2 == 0) {
			System.out.println(num + "의 숫자는 짝수입니다.");
		}else {
			System.out.println(num + "의 숫자는 홀수입니다.");
		}
		
	}

}
