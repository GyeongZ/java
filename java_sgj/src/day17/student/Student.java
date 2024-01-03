package day17.student;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //@Getter, @Setter, @ToString, @HashcodeAndEquals 등 다 합쳐진게 Data 입니다
@AllArgsConstructor //모든 멤버들을 메개변수로 갖는 생성자로 만들어 주는 것

public class Student implements Serializable {
	
	private static final long serialVersionUID = -4820658622162344196L;
	
	private int grade, ClassNum, num;
	private String name;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return ClassNum == other.ClassNum && grade == other.grade && num == other.num;
	}
	@Override //오버라이드 한것은 우클릭, 소스, 제너레이트 해쉬코드앤이퀄스인데 학년,반,번호만 같으면 같은 인스턴스로 볼수있도록 해주는것
	public int hashCode() {
		return Objects.hash(ClassNum, grade, num);
	}
	@Override //오버라이드 한것은 우클릭, 소스, 제너레이트, 투스트링
	public String toString() {
		return "[" + grade + "학년" + ClassNum + "반" + num + "번" + name + "]" ;
	}
	
}
