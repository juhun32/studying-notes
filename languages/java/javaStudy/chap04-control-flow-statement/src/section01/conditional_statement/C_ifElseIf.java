package section01.conditional_statement;

import java.util.Scanner;

public class C_ifElseIf {
	
	public void testSimpleIfElseIfSatement() {
		/* [if-else-if 문 표현식]
		 * if(조건식1){
		 * 	조건식 1이 참인경우
		 * }else if(조건식 2){
		 *  조건식 1이 거짓이고 조건식 2의 결과가 참인 경우
		 * }else{
		 * 	조건식이 모두 거짓인 경우
		 * }
		 * 
		 * if-else-if문은 조건식1의 결과 값이 참(true)이면 if{}안에 있는 코드를 실행하고,
		 * 조건식1이 false이면 조건식2를 확인하여 참(true)이면 else if{}안에 있는 코드를 실행한다.
		 * 조건식1, 2의 결과 값이 모두 거짓(false)이면 else{} 안에 있는 코드를 실행한다.
		 * 
		 * 여러 개의 조건을 제시하여 그 중 한가지를 반드시 실행시키고 싶은 경우 사용한다.
		 * 
		 * 금도끼 은도끼 동화에서 산신령이 어떤 도끼가 나무꾼의 도끼인지를 물어보는 시나리오 대로 코드를 작성한다.
		 * */
		
		System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다. "
				+ "\n 연못에서 산신령이 나타나 금도끼, 은도끼 쇠도끼를 들고 나타났다. "
				+ "\n 나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");
		
		System.out.print("어느 도끼가 너의 도기이냐? (1. 금도끼, 2. 은도끼, 3. 쇠도끼) : ");
		Scanner sc = new Scanner(System.in);
		
		int answer= sc.nextInt();
		
		if(answer == 1) {
			System.out.println("이런 거짓말 쟁이!! 너에게는 아무런 도끼도 줄 수 없다.");
		}else if(answer == 2){
			System.out.println("욕심이 과하지는 않지만 그래도 넌 거짓말을 하고 있구나");
		}else {
			System.out.println("오호 정직하구나 여기 있는 금도끼, 은도끼, 쇠도끼를 다 가져가거라");
			
		}
		System.out.println("그렇게 산신령은 다시 연못으로 사라지고 말았다...");
		sc.close();
		
	}
}
