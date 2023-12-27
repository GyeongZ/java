package day12;


public class PolymorphismEx1 {

	public static void main(String[] args) {
		/* 다형성 예제
		 * 1. 매개변수의 다형성
		 */
		Remocon r  = new Remocon();
		Tv tv = new Tv();
		AirCon aircon = new AirCon();
		Projector projector = new Projector();
		r.turnOn(tv);
		r.turnOn(aircon);
		r.turnOn(projector);
	}

}

//리모컨 : Tv나 에어컨등을 켜는 기기
class Remocon{
	/*
	void turnOn(Tv target) {
		System.out.println("Tv 제품이 켜졌습니다.");
	}
	void turnOn(AirCon target) {
		System.out.println("에어컨 제품이 켜졌습니다.");
	}
	*/
	//매개변수의 다형성을 이용하여 turnOn 메서드를 1개만 생성
	void turnOn(ElectronicProduct target) {
		if(target instanceof Tv) {
			System.out.println("Tv");
		}else if(target instanceof AirCon) {
			System.out.println("에어컨");
		}else if(target instanceof Projector) {
			System.out.println("빔 프로젝터");
		}else {
			System.out.println("전자 ");
		}
		System.out.println("제품이 켜졌습니다.");
	}
}

class ElectronicProduct{
	
}
class Tv extends ElectronicProduct{
	
}

class AirCon extends ElectronicProduct{
	
}

class Projector extends ElectronicProduct{
	
}
	
	
