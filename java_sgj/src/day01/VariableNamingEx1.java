package day01;

public class VariableNamingEx1 {
	
	//변수명 작성 규칙(*필수)과 관례(선택이지만 추천)
	public static void main(String[] args) {
		//1. 대소문자를 구분한다.
		int num;
		int NUM;
		int Num;
		int nuM;
		
		//2. 예약어 사용 불가능 (색깔 진한것들)
		//int int;
		//int public;
		//int class;
		
		//3. 숫자로 시작 불가능
		//int 2num; (이런거 불가능)
		int num2; //(이런건 가능)
		
		//4. 특수문자는 _와 $만 가능
		int _num; //(가능)
		//int #num; //(불가능)
		//int n um; //(띄어쓰기 불가능)
		int num$; //(가능)
		
		//5. 중복 선언 불가능
		//int num; (위에서 이미 해서 불가능)

	}

}
