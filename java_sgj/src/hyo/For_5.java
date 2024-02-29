package hyo;

public class For_5 {

	public static void main(String[] args) {

		for(int i = 0; i<5; i++) {
			System.out.println("첫번째 for문");
			System.out.println(i);
			
			for(int j=1; j<6; j++) {
				System.out.println("두번째 for문");
				System.out.println(j);
				
				if(i<j) {
					System.out.println("if문 출력");
					System.out.println("i의 값은? : "+ i);
					System.out.println("j의 값은? : "+ j);
					System.out.println("---------전체적으로 한번 종료---------");
					break;
				}
			}
		}
	}

}
