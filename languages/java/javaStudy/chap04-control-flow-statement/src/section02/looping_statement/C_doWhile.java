package section02.looping_statement;

import java.util.Scanner;

public class C_doWhile {
	
	public void testSipleDoWhileStatement() {
		/* [do-while]
		 * 초기식 : 
		 * do {
		 * 	1회차에는 무조건 실행하고, 이후에는 조건식을 확인하여 조건을 만족하는 경우 수행할 구문(반복할 구문);
		 * 	증감식;
		 * }while(조건식);
		 * */
		do {
			System.out.println("최초 한 번 동작함...");
		}while(false);
		
		System.out.println("반복문 종료 확인");
	}
	
	public void testDowhileExample1() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		do {
			System.out.println("문자열을 입력하세요 : ");
			str = sc.nextLine();
			System.out.println(str);
		}while(!str.equals("exit"));
		
		System.out.println("프로그램을 종료 합니다.");
		sc.close();
	}

}
