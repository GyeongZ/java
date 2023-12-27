package day13;

public class WrapperEx1 {

	public static void main(String[] args) {
		int num1 = 1;
		Integer num2 = 1;
		num2 = null;
		num2 = num1;
		System.out.println(num2);
		
		//integer는 null값도 저장하고 int값도 저장됨
		
		num2 = 20;
		num1 = num2;
		System.out.println(num1);
		
		/* 예외 발생 : num2가 null이어서 int로 저장할 수 없음
		 * (이 경우에는 integer X)
		num2 = null;
		num1 = num2;
		System.out.println(num1);
		*/
		
		
		//문자열을 정수로, 실수로, 숫자로 바꿀 수 있다
		String str = "12345";
		int num3 = Integer.parseInt(str);
		System.out.println(num3);
		System.out.println(num3 * 10); //문자열을 정수로 바꿨기 때문에 연산이 가능해진다.
	}

}
