package day04;

public class StarEx4 {

	public static void main(String[] args) {
		/*     *      i=1, ' '=4, 	*갯수=1
		 *    ***     i=2, ' '=3, 	*갯수=3
		 *   *****    i=3, ' '=2, 	*갯수=5
		 *  *******   i=4, ' '=1, 	*갯수=7
		 * *********  i=5, ' '=0, 	*갯수=9
		 *                 	5-i		 2*i-1
		 */
		
		int rows = 5;
		for(int i=1; i<= 5; i++) {
			// ' ' 출력 5-i개
			for(int j = 1; j<= rows - i; j++) {
				System.out.print(' ');
			}
			// *출력 2*i-1개
			for(int j = 1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			//엔터
			System.out.println();
		}
	}

}
