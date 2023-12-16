package section02.demensional_array;

public class Application04 {

	public static void main(String[] args) {
		/* 2차원 배열도 할당과 동시에 jvm 기본값 외의 값으로 초기화 하고 싶은 경우 리터럴을 이용할 수 있다.
		 * 선언과 할당을 하며 초기화
		 * */
		int[][] iarr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15,16}};
		
		for(int i =0; i<iarr.length; i++) {
			for(int j =0; j<iarr[i].length;j++) {
				System.out.print(iarr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-===== 정변배열 ======");
		// 정변배열 초기화
		int[][] iarr1 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		for(int i=0; i<iarr1.length; i++) {
			for(int x=0; x<iarr1[i].length; x++) {
				System.out.print(iarr1[i][x]+ " ");
			}
			System.out.println();
		}
		
		int[] arr1= {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		
		System.out.println("=== 배열을 이용한 초기화 ===");
		int[][] iarr2 = {arr1, arr2};
		for(int i =0; i<iarr2.length; i++) {
			for(int x = 0; x<iarr2[i].length; x++) {
				System.out.print(iarr2[i][x] + " ");
			}
			System.out.println();
		}
	}

}
