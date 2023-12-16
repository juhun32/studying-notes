package section01.conditional_statement;

import java.util.Scanner;

public class A_if {
	
	public void testSimpleIfSatement() {
		/* [if 문 표현식]
		 * if(조건식){
		 * 	조건식이 true일 때 실행할 명령문
		 * }
		 * 
		 *  조건식 : true of false가 나오는 연산식을 조건식이라고 한다.
		 *  
		 *  if문은 조건식의 결과 값이 참(true)이면 {}안에 있는 코드를 실행하고 
		 *  조건식의 결과 값이 거짓(false)이면 {}안에 있는 코드를 무시하고 넘어감
		 *  
		 *  조건문을 만족하는 경우에만 추가적인 명령을 실행시키고자 할 때 주로 사용한다.
		 *  
		 *  정수 한 개를 입력 받아 구 수가 짝수이면 "입력하신 숫자는 짝수 입니다." 라는 멘트를 출력하고
		 *  짝수가 아니면 출력하지 않는 구문을 작성해 본다.
		 *  단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다. "를 출력한다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		/* 짝수인지 물어보는 조건을 기술함
		 * 짝수는 어떤 수를 2로 나누었을 때 나머지가 0이되는 수이다. 즉 2의 배수이다.
		 * */
		
		if((num%2) == 0 ) {
			/* 조건식 부문에 작성한 내용이 true일 때는 해당 내용을 실행한다.
			 * 하지만 false인 경우 if 블럭 전체를 무시하고 건너 뛰며 실행하게 된다.
			 * */
			System.out.printf("입력하신 수 %d는 짝수입니다. ", num);
			System.out.println();
		}
		// 조건문과 상관없이 프로그램을 종료할 때 "프로그램을 종료합니다."라는 요구사항을 반영
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}
