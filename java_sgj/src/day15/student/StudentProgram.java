package day15.student;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentProgram implements Program {

	private Scanner scan = new Scanner(System.in);
	private final int EXIT = 4;
	private List<Student> list = new ArrayList<Student>();
	
	@Override
	public void run() {
		//반복
		int menu = 0;
		do {
			//메뉴 출력
			printMenu();
			try {
				//메뉴 선택
				menu = scan.nextInt();
				
				//메뉴 실행
				runMenu(menu);
			}catch(InputMismatchException e) {
				System.out.println("잘못된 메뉴입니다.");
				scan.nextLine();
			}
		}while(menu != EXIT);
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			studentManager();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			System.out.println("프로그램 종료.");
			break;
		default:
			throw new InputMismatchException();
		}
	}

	private void studentManager() {
		//학생 관리 메뉴를 출력합니다.
		printStudentMenu();
		//학생 관리 메뉴를 선택합니다.
		int menu = scan.nextInt();
		//학생 관리 메뉴를 실행합니다.
		runStudentMenu(menu);
	}

	private void printStudentMenu() {
		System.out.println("----학생 관리----");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 수정");
		System.out.println("3. 학생 삭제");
		System.out.println("---------------");
		System.out.print("메뉴 선택 : ");
	}

	private void runStudentMenu(int menu) {
		switch(menu) {
		case 1:
			insertStudent();
			break;
		case 2:
			updateStudent();
			break;
		case 3:
			deleteStudent();
			break;
		default:
			throw new InputMismatchException();
		}
	}

	private void updateStudent() {
		//기존 학년, 반, 번호를 입력
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print("반 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 : ");
		int num = scan.nextInt();
		System.out.print("이름 : ");
		scan.nextLine(); //아래 nextlint썼는데 엔터 처리를 위하여 필요함
		String name = scan.nextLine(); 
		
		Student std = new Student(grade, classNum, num, name);
		
		//기존 학년, 반, 번호와 일치하는 학생 인스턴스를 가져옴
		int index = list.indexOf(std);
		
		//없으면 없다고 하고 종료
		if(index == -1) {
			System.out.println("등록되지 않은 학생입니다.");
			return;
		}
		
		std = list.get(index);//기존 학생 정보 
		
		
		//수정할 학년, 반, 번호, 이름을 입력
		System.out.print("수정할 학년 : ");
		grade = scan.nextInt();
		System.out.print("수정할 반 : ");
		classNum = scan.nextInt();
		System.out.print("수정할 번호 : ");
		num = scan.nextInt();
		System.out.print("수정할 이름 : ");
		scan.nextLine(); //아래 nextlint썼는데 엔터 처리를 위하여 필요함
		name = scan.nextLine(); 
		
		//수정할 학생 인스턴스를 생성
		Student newStd = new Student(grade, classNum, num, name);
		
		//수정할 학생 정보가 등록됐는지 확인해서 있으면 알림 후 종료
		if(list.contains(newStd)) {
			System.out.println("이미 등록된 학생 정보라서 수정할 수 없습니다.");
			return;
		}
		
		//수정할 학생 인스턴스에 기존 학생 성적들을 업데이트하고
		newStd.setKor(std.getKor());
		newStd.setEng(std.getEng());
		newStd.setMath(std.getMath());
		
		//기존 학생 정보를 삭제
		list.remove(index);
		
		//수정할 학생 정보를 리스트에 추가
		list.add(newStd);
		
		//정렬 (잘 모르겠음)
		/*list.sort(o1,o2)->{
			if(o1.getGrade() != o2.getGrade()) {
				return o1.getGrade() - o2.getGrade();
			}
			if(o1.getClassNum() != o2.getClassNum()) {
				return o1.getClassNum() - o2.getClassNum();
			}
			return o1.getNum() - o2.getNum();
		}); 
		
		*/
		
		System.out.println("학생 정보가 수정되었습니다.");
		System.out.println(list);
	}
	

	private void deleteStudent() {
	
	}

	private void insertStudent() {
		//이미 등록된 학생은 추가하지 않을것이다.(학년, 반, 번호가 같은 경우 중복X)
		//학년, 반, 번호, 이름을 입력
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print("반 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 : ");
		int num = scan.nextInt();
		System.out.print("이름 : ");
		scan.nextLine(); //아래 nextlint썼는데 엔터 처리를 위하여 필요함
		String name = scan.nextLine(); 
		
		//입력받은 정보로 인스턴스를 생성 std
		Student std = new Student(grade, classNum, num, name);
		
		//std가 리스트에 있는지 확인해서 없으면 추가
		//contains는 Objects.equals(a,b)를 호출하는거라서 a와 b의 클래스가 같으면
		//a.equals(b)를 이용하여 있는지 없는지 확인
		if(!list.contains(std)) {
			list.add(std);
			System.out.println("학생을 등록했습니다.");
			return;
		}
		//있으면 이미 등록됐다고 알림
		System.out.println("이미 등록된 학생입니다.");
	}

	@Override
	public void printMenu() {
		System.out.println("-----메뉴-----");
		System.out.println("1. 학생 관리");
		System.out.println("2. 성적 관리");
		System.out.println("3. 조회");
		System.out.println("4. 종료");
		System.out.println("-------------");
		System.out.print("메뉴 선택 : ");
	}

}
