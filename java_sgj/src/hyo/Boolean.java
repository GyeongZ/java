package hyo;

public class Boolean {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 200;
		boolean big = num1 < num2;
		
		if (big) {
			System.out.println(num2 + " 숫자가 큰 것이 맞습니다.");
		}else {
			System.out.println(num2 + " 숫자가 작습니다.");
		}
		
		int num3 = 3000;
		int num4 = 10;
		boolean big2 = num3 < num4;
		
		if (big2) {
			System.out.println(num4 + " 숫자가 큰 것이 맞습니다.");
		}else {
			System.out.println(num4 + " 숫자가 작습니다.");
		}
	}

}
