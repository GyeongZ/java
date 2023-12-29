package day15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		//제네릭 클래스임 <>이거를 사용함
		//아이디와 비번을 저장하는 걸 만들겠음
		//map은 2개를 이용하기 때문에 앞에 String은 Key 뒤에 스트링은 Value 
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("abc123","passward123");
		map.put("def456", "passward123"); //비번이 중복되는데 => value가 중복되었기 때문에 가능
		map.put("abc123","qwe123");//아이디 중복 => key가 중복되어서 => 추가가 안됨, value가 변경
		
		map.put("admin", "admin");
		map.put("def", "def");
		
		System.out.println(map.remove("abc123")); //삭제할때 value의 값을 리턴해줌
		System.out.println(map);
		
		//keySet을 이용한 반복문 예제(map에선 반복문 직접 못하니까  keySet을 사용해서 가져와서 for문 사용)
		Set<String> keySet = map.keySet();
		for(String tmp : keySet) {
			String value = map.get(tmp);
			System.out.println(value);
			System.out.println("["+ tmp + " , " + value + "]");
			
		//entrySet을 이용한 반복문 예제(entrySet클래스에서 가져와서 사용하는 것)
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		
		for(Map.Entry<String, String> tmpEntry : entrySet) {
			System.out.println("["+ tmpEntry.getKey() + " , " + tmpEntry.getValue() + "]");
		}
		/*class Entry1<K,V>{
			K = key;
			V = value;
		} Map.Entry 클래스라는 걸 만들어서 저장해서 불러오는 것임(map내부에 내부클래스를 만듬)
		Entry 인스턴스로 여러 개 만들어서 set으로 불러왔기 때문에 반복문이 사용 가능해진 것이다.
		*/ 
		
		
		}
		
		
	}

}


