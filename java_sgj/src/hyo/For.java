package hyo;

public class For {

	public static void main(String[] args) {
		
		System.out.println("2단입니다.");
		for(int i = 1; i<10; i++) {
			int sum = 2*i;
			System.out.println( 2 + "x" + i + "=" + sum);
		}
		
		System.out.println("9까지의 구구단입니다.");
		for(int i = 2; i<10; i++) {
			for(int r = 1; r<10; r++) {
				System.out.println( i + "x" + r + "=" + i*r);
			}
			System.out.println(i+"단입니다.");
		}
		
	}

}
