package day13;

public class StringEx1 {

	public static void main(String[] args) {
		String str = "abcde";
		
		System.out.println("----------1.");
		//0번지에 있는 글자는 무엇인지를 반환
		System.out.println(str.charAt(0)); 
		
		System.out.println("----------2.");
		//두 문자열이 같은지를 반환
		System.out.println(str.equals("abcded")); //(거짓)
		System.out.println(str.equals("abcde")); //(참)
		
		System.out.println("----------3.");
		//입력한 문자가 있으면 시작번지부터를 반환
		System.out.println(str.indexOf("cd"));
		
		System.out.println("----------4.");
		//입력한 문자가 있으면 있다, 없으면 없다 로 반환
		System.out.println(str.contains("cdf"));
		
		System.out.println("----------5.");
		//문자열의 길이를 알려주는 반환
		System.out.println(str.length());
		
		System.out.println("----------6.");
		//문자열을 바꿔서 새 문자열을 반환
		String str2 = str.replace("cd", "aa");
		//기존 문자열은 안바뀌고 새로운 문자를 만드는것임 (왜냐 string클래스는 상수라서 안바꾸고 새로 만들어서 보여주는 것임)
		System.out.println(str);
		System.out.println(str2);
		
		System.out.println("----------7.");
		//부분 문자열을 보여주도록 반환 ()괄호안에 있는 번지를 보여주는 것
		String str3 = str.substring(1);
		//기존 문자열 str은 안 바뀜 (위와 같은 이유)
		System.out.println(str);
		System.out.println(str3);
		
		System.out.println("----------8.");
		//부분 문자열을 반환
		String str33 = str.substring(1, 3);
		//기존 문자열 str은 안 바뀜 (위와 같은 이유)
		System.out.println(str);
		System.out.println(str33);
		
		System.out.println("----------9.");
		//대문자로 보여줌
		String str4 = str.toUpperCase();
		System.out.println(str4);
		
		System.out.println("----------10.");
		//소문자로 보여줌
		String str5 = str4.toLowerCase();
		System.out.println(str4);
		System.out.println(str5);
		
		System.out.println("----------11.");
		//시작문자 앞의 공백을 제거, 마지막 문자 뒤의 공백을 제거
		String str6 = "\n\nabc\tdef\t\t";
		System.out.println(str6);
		String str7 = str6.trim();
		System.out.println(str7);
		
		System.out.println("----------12.");
		//문자열에서 문자열들을 추출해서 배열로 만들어줌
		String fruits = "사과, 배, 오렌지";
		String []fruitArray = fruits.split(", ");
		System.out.println(fruits);
		for(String tmp : fruitArray) {
			System.out.println(tmp);
		}
	}

}
