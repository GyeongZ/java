package day08;

/* 학생의 국어, 영어, 수학 성적을 관리하기 위한 프로그램을 작성하려고 한다.
 * 이때 필요한 학생 클래스를 생성해보세요.
 */
public class Student2 {
	//멤버변수 : 학년, 반, 번호, 이름, 성적(국어,영어,수학)
	int kor, eng, math;
	int grade, classNum, num;
	String name; //이름
	
	//메서드 : 학생 정보 확인, 학생 성적 확인, 국어성적 수정, 수학성적 수정, 영어성적 수정
	/* 기능 : 학생 정보(학년,반,번호,이름)을 콘솔에 출력하는 메서드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 => void
	 * 메서드명 : printInfo
	 */
	public void printInfo() {
		System.out.println("-------------");
		System.out.println("학년 :" + grade);
		System.out.println("반 :" + classNum);
		System.out.println("번호 :" + num);
		System.out.println("이름 :" + name);
	}
	
	/* 기능 : 학생 성적(학년,반,번호,이름,국어,영어,수학)을 콘솔에 출력하는 메서드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 => void
	 * 메서드명 : printScore
	 */
	public void printScore() {
		System.out.println("-------------");
		System.out.println("학년 :" + grade);
		System.out.println("반 :" + classNum);
		System.out.println("번호 :" + num);
		System.out.println("이름 :" + name);
		System.out.println("국어 :" + kor);
		System.out.println("영어 :" + eng);
		System.out.println("수학 :" + math);
	}
	
	/* 기능 : 국어 성적을 수정하는 메서드
	 * 매개변수 : 수정하려는 국어 성적 => int korScore
	 * 리턴타입 : 내 정보만 바꾸고 남에게 알려줄게 없기때문에 없음 => void
	 * 메서드명 : setKor
	 */
	public void setKor(int korScore) {
		kor = korScore;
	}
	
	/* 기능 : 영어 성적을 수정하는 메서드
	 * 매개변수 : int Eng
	 * 리턴타입 : 
	 * 메서드명 : setEng
	 */
	public void seteng(int engScore) {
		eng = engScore;
	}
	
	/* 기능 : 수학 성적을 수정하는 메서드
	 * 매개변수 : int Math
	 * 리턴타입 : 
	 * 메서드명 : setMath
	 */
	public void setMath(int mathScore) {
		math = mathScore;
	}

	public Student2(int grade1, int classNum1, int num1, String name1) {
		grade = grade1;
		classNum = classNum1;
		num = num1;
		name = name1;
	}
	
}
