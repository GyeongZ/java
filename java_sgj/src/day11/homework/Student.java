package day11.homework;

public class Student {
	//학년, 반, 번호, 이름
	private int grade, classNum, num;
	private String name;

	
	//성적 여러개
	private Subject[] subjects;
	private int count = 0; //등록된 과목수 정의

	//getter, setter (숨겨놨음)
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject[] getSubjects() {
		return subjects;
	}
	public void setSubjects(Subject[] subjects) {
		this.subjects = subjects;
	}
	
	//메서드
	//과목 추가하는 메서드
	public boolean insertSubject(String title, int score) {
		
		//모든 과목 조회
		for(Subject tmp : subjects) {
			//과목 인스턴스가 있고, 과목의 제목과 추가하려는 제목이 같으면 진행 안됨
			if(tmp != null && tmp.equals(title)) {
				return false;
			}
		}
		//과목을 등록한다
		subjects[count] = new Subject(title, score);
		count++;
		
		//과목 수가 다 차면 늘려주는 메서드
		expandSubject();
		
		return true;
	}
	private void expandSubject() {
		
		if(subjects.length > count) {
			return;
		}
		Subject[]tmpList = new Subject[subjects.length + 5];
		System.arraycopy(subjects, 0, tmpList, 0, subjects.length);
	}
	
	//과목 삭제하는 메서드
	public boolean deleteSubject(String title) {
		
		//삭제할 과목이 어디있는지 확인하기 위한 변수로, 배열 번지이기 때문에 -1이면 없음처리, 0이상이면 있음 처리
		int index = -1;
		//삭제할 과목이 어디있는지 확인
		for(int i = 0; i < count; i++) {
			if(subjects[i].equals(title)) {
				index = i;
			}
		}
		
		//그 과목이 없으면
		if(index == -1) {
			return false;
		}
		
		//과목이 있으면 삭제될 예정이기 때문에 전체 개수에서 하나를 뺀다.
		count--;
		
		//삭제된 항목이 마지막 항목이면
		if(index == count-1) {
			//추가할 때 향상된 for문을 쓰기때문에 삭제된 항목을 null로 수정해야함
			subjects[index] = null;
			return true;
		}
		Subject [] tmpList = new Subject[subjects.length];
		//기존 과목 전체 복사
		System.arraycopy(subjects, 0, tmpList, 0, subjects.length);
		//앞으로 당겨주는 작업
		System.arraycopy(tmpList, index + 1,subjects, index, count - index);
		subjects[index] = null;
		return true;
	}
	
	//성적 수정하는 메서드
	public boolean updateSubject(String title, int score) {
		for(Subject tmp : subjects) {
			if(tmp != null && tmp.equals(title)) {
			tmp.updateScore(score);
			return true;
			}
		}
		return false;
	}
	
	//학생정보 출력하는 메서드
	public void print() {
		System.out.println(grade + "학년 " + classNum + "반 " + num + "번 " + name);
		for(Subject tmp : subjects) {
			if(tmp != null) {
				tmp.print();
			}
		}
	}
	public Student(int grade, int classNum, int num, String name) {
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
		subjects = new Subject[5];
		
	}
	
	
}
