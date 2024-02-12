package hyo;

public class PrefixIncrementOperator {

	public static void main(String[] args) {

		
	//증감 연산자 예제
	int i = 0;
	System.out.println(i); // 당연히 아무 변화 없이 i를 출력했으므로 변화 없는 0임.
	System.out.println(i++); // ++을 해서 늘어났을거라고 생각하지만 아직 변화 없는 상태임.
	System.out.println(i);	// 위에서 ++ 순서가 i다음에 있으므로 이제 변화 된 상태.
	System.out.println(++i); //++순서가 i 앞에 있으므로 증가된 후 출력됨.
	System.out.println(++i); // 윗 row보다 1 증가된 상태.
	System.out.println(i++); // ++ 순서가 i뒤에 있으므로 이제 다음 상태에서 증가 될 예정.
	System.out.println(i);
	}

}
