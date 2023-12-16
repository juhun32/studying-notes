package section08.initblock;

public class Application01 {

	public static void main(String[] args) {
		
		/* 초기화 블럭과 초기화 순서
		 * 초기화 블럭
		 * 복잡한 초기화를 수행할 수 있는 블럭을 제공하며, 인스턴스 초기화 블럭과 정적 초기화 블럭으로 구분된다.
		 * 
		 * 1. 인스턴스 초기화 블럭
		 * 		: 인스턴가 생성되는 시점에 생성자 호출 이전에 먼저 실행이 된다.
		 * 		   인스턴스를 호출하는 시점마다 호출이 된다.
		 * 		  인스턴스 변수를 초기화 하며 정적 필드에는 실행시점마다 값을 덮어 쓴다.
		 * 
		 * {
		 *     초기화 내용 작성
		 * }
		 * 
		 * 2. 정적 초기화 블럭
		 *   : 클래스가 로드될 때 한 번 동작한다.
		 *     정적 필드를 초기화 하며, 인스턴스변수는 초기화하지 못한다.
		 *     
		 * static{
		 *    초기화 내용 작성
		 * }
		 * */
		System.out.println(Product.brand);
		Product product = new Product();
	
		
		System.out.println(product.toString());
		
		/* 마지막으로 매개 변수 있는 생성자를 통해 다시 인스턴스를 생성 후 값을 출력해 본다.
		 * 매개변수 있는 생성자로 값을 전달하기 위해 호출하는 생성자의 인자로 값을 전달한다.
		 * */
		Product product2 = new Product("대륙폰", 300000, "샤우미");
		System.out.println(product2.toString());
//		
		/* 여기서 알 수 있는 초기화 순서는 
		 * 인스턴스 변수 : 기본값 -> 명시적초기화 -> 인스턴스초기화 블럭 -> 생성자
		 * 클래스 변수 : 기본값 -> 명시적초기값 -> 정적초기화블럭 -> 인스턴스초기화 블럭 -> 생성자
		 * */
		
	}

}
