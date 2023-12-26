package day11.homework;

/*이 과목 클래스를 만든 이유
 * : 고정된 과목이 아니라 내가 직접 다양한 과목을 등록하고 활용하기 위해서
 */
public class Subject {
	
	//과목명, 총점
	private String title;
	private int score;
	
	//getter, setter 만들기
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	//총점을 수정하는 메서드 : setScore과 같은 기능
	public void updateScore(int score) {
		setScore(score);
	}
	
	//과목 정보를 출력하는 메서드
	public void print() {
		System.out.println("과목명 : " + title + ", 점수 : " + score);
	}
	
	public boolean equals(String title) {
		if(this.title == null) {
			return false;
		}
		return this.title.equals(title);
	}
	
	//과목명, 성적이 주어진 생성자, 과목명만 주어진 생성자
	public Subject(String title, int score) {
		this.title = title;
		this.score = score;
	}
	public Subject(String title) {
		this.title = title;
	}
}

