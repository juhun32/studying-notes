package section02.looping_statement;

import java.util.Scanner;

public class A_for {
	
	public void testSimpleForStatement() {
		/* 반복문의 기본 흐름 테스트*/
		
		/* [for문 표현식] 
		 * for(초기식; 조건식; 증강식){
		 * 	조건을 만족할 때 수행할 구문(반복);
		 * }
		 * */
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	public void testForExample1() {
		/* 무엇을 반복하는지를 확인하고, 반복문으로 아래의 코드를 개선하본다.*/
		// 10명의 학생 이름을 입력받아 이름을 출력해본다.
		// 반복해야 할 내용이 무엇인지와 몇 번 반복해야 하는지를 확인해본다.
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("1번재 학생의 이름을 입력해주세요 : ");
//		String studnet1 = sc.nextLine();
//		System.out.println("1번째 학생의 이름은 : " + studnet1);
//		
//		System.out.println("2번재 학생의 이름을 입력해주세요 : ");
//		String studnet2 = sc.nextLine();
//		System.out.println("2번째 학생의 이름은 : " + studnet2);
//		
//		System.out.println("3번재 학생의 이름을 입력해주세요 : ");
//		String studnet3 = sc.nextLine();
//		System.out.println("3번째 학생의 이름은 : " + studnet3);
//		
//		System.out.println("4번재 학생의 이름을 입력해주세요 : ");
//		String studnet4 = sc.nextLine();
//		System.out.println("4번째 학생의 이름은 : " + studnet4);
//		
//		System.out.println("5번재 학생의 이름을 입력해주세요 : ");
//		String studnet5 = sc.nextLine();
//		System.out.println("5번째 학생의 이름은 : " + studnet5);
//		
//		System.out.println("6번재 학생의 이름을 입력해주세요 : ");
//		String studnet6 = sc.nextLine();
//		System.out.println("6번째 학생의 이름은 : " + studnet6);
//		
//		System.out.println("7번재 학생의 이름을 입력해주세요 : ");
//		String studnet7 = sc.nextLine();
//		System.out.println("7번째 학생의 이름은 : " + studnet7);
//		
//		System.out.println("8번재 학생의 이름을 입력해주세요 : ");
//		String studnet8 = sc.nextLine();
//		System.out.println("8번째 학생의 이름은 : " + studnet8);
//		
//		System.out.println("9번재 학생의 이름을 입력해주세요 : ");
//		String studnet9 = sc.nextLine();
//		System.out.println("9번째 학생의 이름은 : " + studnet9);
//		
//		System.out.println("10번재 학생의 이름을 입력해주세요 : ");
//		String studnet10 = sc.nextLine();
//		System.out.println("10번째 학생의 이름은 : " + studnet10);
//	
//		System.out.println("10명의 학생의 이름을 입력 받고 출력하는 기능을 완료했습니다.");
		
		for(int i = 10; i>=1; i--) {
			System.out.print(i + "번째 학생의 이름을 입력해주세요 : ");
			String name = sc.nextLine();
			System.out.println(i+"번째 학생의 이름은 : " + name);
		}
		
	}

	public void testForExample2() {
		/* 1 ~ 10까지의 합계를 구하시오 */
		
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;
		int num7 = 7;
		int num8 = 8;
		int num9 = 9;
		int num10 = 10;
		
		int sum = 0;
		
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		sum += num6;
		sum += num7;
		sum += num8;
		sum += num9;
		sum += num10;
		
		System.out.println("sum의 결과는 : " + sum);
		
		int sum2 = 0;
		for(int i = 1; i <=10; i++) {
			sum2 += i;
		}
		System.out.println("sum2 : " + sum2);
	}
	
	public void testForExample3() {
		/* 5 ~ 10 사이의 난수를 발생시켜서 
		 * 1부터 발생한 난수까지의 합계 구해보자
		 * */
		int random = (int) (Math.random()*6)+5; // 5 ~ 10 사이의 난수가
		System.out.println("random : " + random);
		
		int sum = 0;
		
		if(random == 5) {
			sum += 1;
			sum += 2;
			sum += 3;
			sum += 4;
			sum += 5;
		}else if(random == 6) {
			sum += 1;
			sum += 2;
			sum += 3;
			sum += 4;
			sum += 5;
			sum += 6;
		}else if(random ==7) {
			sum += 1;
			sum += 2;
			sum += 3;
			sum += 4;
			sum += 5;
			sum += 6;
			sum += 7;
		}else if(random == 8) {
			sum += 1;
			sum += 2;
			sum += 3;
			sum += 4;
			sum += 5;
			sum += 6;
			sum += 7;
			sum += 8;
		}else if(random ==9) {
			sum += 1;
			sum += 2;
			sum += 3;
			sum += 4;
			sum += 5;
			sum += 6;
			sum += 7;
			sum += 8;
			sum += 9;
		}else {
			sum += 1;
			sum += 2;
			sum += 3;
			sum += 4;
			sum += 5;
			sum += 6;
			sum += 7;
			sum += 8;
			sum += 9;
			sum += 10;
		}
		
		System.out.println("1부터 " + random + "까지의 합은 : "+ sum);
		
		int num2 = 0;
		for(int i = 1; i <= random; i++) {
			num2 += i;
		}
		System.out.println(num2);
	}
	
	public void testForExample4() {
		/* 숫자 두 개를 입력 받아 작은 수에서 큰 수까지의 합계를 구하세요
		 * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결해본다.
		 * */
		/* 1. 숫자 두 개를 입력 받는다. 
		 * 2. 작은 수와 큰수를 구분한다.
		 * 3. 작은 수에서 큰수 까지 합계를 구한다.
		 * ※ 두 숫자가 같지 않다고 가정을 한다.
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력해주세요 : ");
		int first = sc.nextInt();
		System.out.println("두 번째 정수를 입력해주세요 : ");
		int second = sc.nextInt();
		
		int sum = 0;
		
		if(first >second) {
			System.out.println("first 큰 경우");
			for(; second <= first; second++) {
				sum += second;
			}
		}else {
			System.out.println("second 큰 경우");
			for(int i = first; i<= second; i++) {
				sum += i;
			}
		}
		System.out.println("sum : " + sum);
		
	}
	
	public void testExample5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력해주세요 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수를 입력해주세요 :" );
		int second = sc.nextInt();
		
		int max, min;
		
		if(first > second) {
			max = first;
			min = second;
		}else {
			max = second;
			min = first;
		}
		
		int sum2 =0;
		
		for(int i = min; i<=max; i++) {
			sum2 +=i;
		}
		
		System.out.println("sum2 의 값은 : " + sum2);
	}
	
	public void printSimpleGugudan() {
		/* 1 ~ 9 사이의 값을 입력 받아 
		 * 1 ~ 9까지의 출력을 한다.
		 * ex ) N * 1 = n1;
		 * N * 2 = n2; .... N * 9 = n9;
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 구구단의 단 수를 입력하세요");
		int num = sc.nextInt();
		
		if((num>=1)&&(num<10)) {
			for(int i= 1; i<10; i++) {
				System.out.println(num + "*" + i + "=" + (num*i));
			}
		}else {
			System.out.println("1~ 9 사이의 수만 입력이 가능합니다.");
		}
		System.out.println("프로그램이 종료 되었습니다.");
		sc.close();
	}
}
