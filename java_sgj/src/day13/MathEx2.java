package day13;

public class MathEx2 {

	public static void main(String[] args) {
		//주어진 실수의 소수점 3자리에서 올림한 값을 출력하는 코드를 작성하세요. ceil 이용
		double num = 1.234567,num2 = 100;
		double num5 = num * num2;
		System.out.println("---"+ num5);
		System.out.println("---" + Math.ceil(num5));
		num5 = num5 / 100;
		System.out.println("---"+ num5);
		

	//강사님
		num = num * 100;
		num = Math.ceil(num);
		System.out.println(num);
		num = num / 100;
		System.out.println(num);
		
		
		//주어진 실수의 소수점 n자리에서 올림한 값을 출력하는 코드를 작성하세요.
		/*
		int n = 3;
		double num3 = 1.234567;
		
		n = n - 1;
		n = Math.pow(10, n);
		num3 = num4 * n;
		num3 = Math.ceil(num3);
		num3 = num4 / n;
		System.out.println(num3);
		*/
		
	//강사님
		int n = 5;
		double num3 = 1.234567;
		num3 = num3 * Math.pow(10, n-1);
		num3 = Math.ceil(num3);
		num3 = num3 / Math.pow(10, n-1);
		System.out.println(num3);
	
	}

}
