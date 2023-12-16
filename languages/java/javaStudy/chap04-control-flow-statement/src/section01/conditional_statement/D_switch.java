package section01.conditional_statement;

import java.util.Scanner;

public class D_switch {
	
	public void testSimpleSwitchStatement() {
		/*	[Switch문 표현식] 
		 * switch(비교할 변수){
		 * 		case 비교값 1 : 비교값1과 일치하는 경우 실행할 구문; break;
		 * 		case 비교값 2 : 비교값2와 일치하는 경우 실행할 구문; break;
		 * 		default : case에 모두 해당하지 않는 경우 실행할 구문;  break;
		 * }
		 * 
		 * 여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은 if-else-if와 유사하다.
		 * 따라서 일부 호환이 가능하다.
		 * 그러나, switch문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값이다.
		 * 실수와 논리는 비교할 수 없다.
		 * 또한 정확하게 일치하는 경우만 비교할 수 있으며 대소비교를 할 수 없다는게 차이점이다.
		 * case절에 변수를 사용하지 못한다.(값만 비교 가능)
		 * 또한, 문자열 비교는 jdk1.7 이상 부터 가능하다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.println("두 번째 정수 입력 : ");
		int second = sc.nextInt();
		System.out.println("연산 기호 입력(+. -, *, /, % ) : ");
		char op = sc.next().charAt(0);
		
		
		int result = 0;
		
		switch(op) {
			case '+' : 
						result = first + second;
						break;
			case '-' : 
						result = first - second;
						break;
			case '*' :
						result = first * second;
						break;
			case '/' : 
						result = first / second;
						break;
			case '%' : 
						result = first % second;
						break;
			default : System.out.println("지원되지 않는 기능..");
		}
		System.out.println(first + " " + op + " " + second + " = " +result);
		sc.close();
	}
	
	public void testSweitchVendingMachine() {
		/* switch문을 이용해서 문자열 값 비교 및 break에 대한 테스트
		 * 1. jdk1.7 이상부터 switch문을 이용하여 문자열을 비교할 수 있다.
		 * 2. break를 사용하지 않으면 멈추지 않고 계속 실행 구문을 동작시킨다.
		 * */
		
		System.out.println("===== 자판기 =====");
		System.out.println("사이다, 콜라, 환타, 바카스, 핫식스");
		System.out.println("================");
		System.out.println("음료를 선택해 주세요 : ");
		
		Scanner sc = new Scanner(System.in);
		String selectedDrink = sc.nextLine();
		int price = 0;
		
		switch(selectedDrink) {
			case "사이다" : System.out.println("사이다를 선택 하셨습니다."); price = 500; break;
			case "콜라" : System.out.println("콜라를 선택 하셨습니다."); price =600;  break;
			case "환타" : System.out.println("환타를 선택 하셨습니다."); price = 2000; break;
			case "바카스": System.out.println("바카스를 선택 하셨습니다."); price = 2000; break;
			case "핫식스" : System.out.println("핫식스를 선택하셨습니다."); price = 10000; break;
			default : System.out.println("해당 음료는 없습니다."); break;
		}
		System.out.println(price + "원을 입력해주세요. ");
		sc.close();
		
	}
}
