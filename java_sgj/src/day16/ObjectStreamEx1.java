package day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

public class ObjectStreamEx1 {

	public static void main(String[] args) {
		// 직렬화, 역직렬화를 이용한 객체를 쓰고 읽는 예제
		Board board = new Board(1, " 제목", "내용");
		String fileName = "src/day16/objectStreamEx1.txt";
		//게시글을 파일에 저장
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
		} 
		//저장된 파일에서 게시글을 읽어옴
		try(FileInputStream fis = new FileInputStream(fileName);
			
	
	}

}

@Data
@AllArgsConstructor
class Board implements Serializable{
	//같은 클래스이어도 serialBersionUID가 다르면 읽어오지 못함
	private static final long serialversionUID = 
	int num;
	String tittle, contents;
}