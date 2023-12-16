package section01.conditional_statement;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		1. 바구니 크기를 입력받는다.
		int N = sc.nextInt(); // 바구니의 크기 == 배열의 길이
//		2. 바구니 배열을 생성함
		int[] arr = new int[N]; // N만큼의 배열이 생성됨 0,1,2,3,4
		
// 		공을 넣어줌
		for(int i=1; i<= arr.length; i++) {
			arr[i-1] = i;
		}
			
//		3. 몇번 교환할 것인지 입력받음 M
		int M = sc.nextInt(); // M == 교환 횟수
		
//		4. 반복 for(int i=0; i<=M; i++)
		for(int x=0; x<M; x++) {
//			4-1. 교환 대상 i와 j를 입력받는다.
			int i = sc.nextInt(); // 첫 번째 교환 대상
			int j = sc.nextInt(); // 두 번째 교환 대상
//			4-2.  값을 교환한다. 
			int temp = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = temp;
		}
		
//		5. 값 출력 (출력 대상 N)
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	
	}

}
