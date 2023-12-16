package section02.looping_statement;

import java.util.Scanner;

public class B_while {
	
	public void testSimplewhileStatement() {
		/* 반목문의 기본 흐름 테스트 
		 * 
		 * [while문 표현식]
		 * 초기식;
		 * while(조건식){
		 * 	조건식을 만족하는 경우 수행할 구문(반복할 문장);
		 * 	증감식;
		 * }
		 * */
		int i = 1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
	}
	
	public void testWhileExample1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("for문 ");
		for(int i =0; i<str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(i+" : "+ch);
		}
		
		System.out.println("while 문");
		int index =0;
		while(index <str.length()) {
			char ch =  str.charAt(index++);
			System.out.println(index + " : " + ch);
		}
		
		sc.close();
	}
	
	
	public void testWhileExample2() {
		// 정수 하나를 입력 받아 1부터 입력받은 정수까지의 합계를 구한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		while (i<=num) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 입력 받은 정수 " + num + "까지의 합은 "+ sum + "입니다.");
		sc.close();
	}
	
	
	public void testWhileExample3() {
		
		int dan =2;
		
		while(dan<10) {
			int su =1;
			
			while(su<10) {
				System.out.println(dan+" * "+ su + " = " + (dan* su));
				su++;
			}
			
			System.out.println();
			dan++;
		}
	}
}
