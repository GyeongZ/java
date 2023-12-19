package day08;

public class Car {
	//-정보 : 멤버변수
	//-무게(단위는 톤으로), 브랜드, 분류, 색상, 바퀴, 차명, 년식
	double weight;
	String brand;
	//0:소형, 1:중형, 2:대형, 3:화물, 등등 정수로 나타낼수있다. ex)네이버 뉴스 url 분류
	String category;
	//색상 표현을 정수로 한다면
	//int color;
	//String color;
	//0xff0000 16진수로 색상 표현할때
	String [] tires; //타이어는 4짝
	String carname;
	int year;
	boolean power;//시동
	int speed;//현재 속력
	boolean leftLight;//좌측 깜빡이
	boolean rightLight;//우측 깜빡이
	// *****즉 추상화 할때 내 맘대로 정할 수 있다 고민해보고 잘 정해서 하기
	
	
	//-기능 : 메서드
	//-시동을 켜기/끄기, 가속(엑셀을 밟음), 감속(브레이크를 밟음), 좌측,우측 지시등 켜기/끄기
	
	//시동을 켜기/끄기
	//시동이 꺼져있으면 켜짐, 켜져있으면 꺼짐
	//(기본 문법)public 리턴타입 메서드명(매개변수) {
		
	//}
	public void turn() { //위에 블리언 파워라는 걸 사전에 알고있기때문에 매개변수 없어도 됨
		power = !power;
		if(power) {
			System.out.println("시동이 켜졌습니다.");
		}else {
			System.out.println("시동이 꺼졌습니다.");
		}
	}
	
	//가속
	public void speedUp() {
		speed++;
	}
	//감속
	public void speedDown() {
		speed--;
	}
	
	//좌측/우측 지시등 켜기/끄기, 위:우측1, 가운데0, 아래:좌측-1
	public void turnLight(int direction) {
		switch(direction) {
		case 1: rightLight = true; leftLight = false;
			break;
		case -1 :rightLight = false; leftLight = true;
			break;
		case 0: rightLight = false; leftLight = false;
			break;
			
		}
	}
	
	//자동차 현재 상태를 출력하는 메서드
	public void print() {
		System.out.println("-------------");
		System.out.println("시동 : " + power);
		System.out.println("속력 : " + speed);
		System.out.println("좌측깜 : " + leftLight);
		System.out.println("우측깜 : " + rightLight);
	}
}
