package section04.array_sort;

public class Application05 {

	public static void main(String[] args) {
		/* 삽입정렬(insert sort)
		 * 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열과 비교하여 자신의 위치에 삽입하여
		 * 정렬 배열의 두번째 데이터부터 연산을 시작한다. 
		 * 버블정렬의 비교횟수가 많은 단점을 개선하기 위해 고안된 정렬 방식이다.
		 * */
		
		int[] iarr = {2,5,4,6,1,3};
		int temp;
		int j=0;
		
		for(int i=1; i<iarr.length; i++) {
			temp = iarr[i]; //2 : 4
			
			// i = 1
			for(j=i-1;/*1*/ j>=0 && temp<iarr[j]; j--) {
				iarr[j+1]/*2 : 4*/ = iarr[j]/*5*/; // {2,4,4}
				System.out.println("j : " + j);
			}
			
			iarr[j+1] =temp; // 5
		}
		
		
		for(int i=0; i< iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
	}

}
