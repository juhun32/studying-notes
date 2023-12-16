package section02.looping_statement;

import java.util.Scanner;

public class A_nestedFor {
	
	public void printGugudanFromTwoToNine() {
		/* for 문안에서 for 문을 이용할 수 있다.
		 * 2단부터 단을 1씩 증가시키는 반복문*/
		
		for(int dan =2; dan<10; dan++) { //1
			
			for(int su = 1; su<10; su++) { //2
				System.out.println(dan+"*"+su+" = " + (dan*su));
			}
			System.out.println(" "); //3
		}
		
		return;
	}
	
	
	public void printUgradeGugudanFromTwotoNine() {
		
		for(int i =2; i<10; i++) {
			// 한 단씩 구구단을 출력하는 메소드를 호출하여 인자로 단을 전달한다.
			printGugudanOf(i);
			System.out.println();
		}
	}
	
	public void printGugudanOf(int dan) {
		
		for(int su =1; su<10; su++) {
			System.out.println(dan+" * " + su+ " = " + (dan*su));
		}
	}
	
	public void printStarInputRowTimes() {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 행 수 를 입력하세요 : ");
		int row = sc.nextInt();
		
		for(int i=1; i<= row; i++) {
			printStar(i);
			System.out.println();
		}
		
		sc.close();
	}
	
	
	public void printStar(int times) {
		for(int i =1; i<= times; i++) {
			System.out.println("*");
		}
	}
	
	public void printTriangleStars() {
		System.out.println("출력할 줄 수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		for(int i =1; i <= row; i++) {
			printStar(i);
			System.out.println();
		}
		sc.close();
	}

}
