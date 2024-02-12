package hyo;

public class If {

	public static void main(String[] args) {
		boolean money = true;
		if (money) {
//		    System.out.println("택시를 타고 가라");
		}else {
		    System.out.println("걸어가라");
		}
		/*
		int goal = 20;
		if (goal >= 30) {
		    System.out.println("트로피를 받는다.");
		}else {
		    System.out.println("트로피를 받지 못한다.");
		}
		*/
		int goal = 30;
		boolean winner = true;
		
		if (goal >= 30 && winner) {
			System.out.println("올해의 발롱도르 선수");
		}else {
			System.out.println("비수상자");
		}
		
		
	}

}
