package day05;

import java.util.Scanner;

public class ArrayEx1_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		int[]korScore = new int [5];
		for(int i=0; i<=4 ;i++){
			System.out.println("학생의 국어 성적은 : ");
			korScore[i] = scan.nextInt(); 
		}
		scan.close();
	}
}
