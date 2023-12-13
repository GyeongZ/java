package day04;


public class StarEx3 {

	public static void main(String[] args) {
		/*		* i=1 ' '=4 (공백은 4개)	*갯수=1개
		 * 	   ** i=2 ' '=3				*갯수=2개
		 *    *** i=3 ' '=2				*갯수=3개
		 *   **** i=4 ' '=1				*갯수=4개
		 *  ***** i=5 ' '=0				*갯수=5개
		 *			  ' '=5-i 			*갯수=i개    
		 */
		
		int rows = 5;
		for(int i = 1; i <= rows; i++) {
			// '(공백)'을 5-i개 출력
			for(int j = 1; j<=rows-i; j++) {
				System.out.print(' ');
			}
			//*을 i개 출력
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			//엔터
			System.out.println();
		}
			
	}
			
}

