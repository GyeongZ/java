package day14;

import lombok.Data;

public class GenericEx1 {

	public static void main(String[] args) {
		Array1<Integer> array = new Array1<Integer>(5);
		
		for(int i = 0; i<5; i++) {
			array.add(i, i++);
			
		}for(int i = 0; i<5, i++) {
			System.out.println(array.get(i) + " ");
		}

}
//배열 클래스
@Data
class Array1<T /*extends Number*/>{
	private T array;
	
	public Array1() {
		this(10);
		
	}
	public Array1(int i) {
		array = (T[])new Object[size];
	}
	

	
//index번지에 요소를 추가하는 메서드
	public boolean add(int index, T t) {
		if(array.length <= index) {
			return false;
		}
		array[index] = t;
			return ture;
		
	}
}