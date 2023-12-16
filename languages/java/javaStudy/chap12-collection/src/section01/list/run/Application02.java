package section01.list.run;

import java.util.*;

import section01.list.comparator.AscendingPrice;
import section01.list.dto.BookDTO;

public class Application02 {

	public static void main(String[] args) {
		
		/* ArrayList의 용법과 정렬에 대해 조금 더 살펴 볼 것이다.
		 * DTO 패키지를 추가하고 BookDTO  클래스를 하나 추가한다.
		 * */
		
		List<BookDTO> bookList = new ArrayList<>();
		
		bookList.add(new BookDTO(1,"홍길동전", "허균", 50000));
		bookList.add(new BookDTO(2,"목민심서", "정약용", 30000));
		bookList.add(new BookDTO(3,"동의보감", "허준", 40000));
		bookList.add(new BookDTO(4,"삼국유사", "일연", 50000));
		
		BookDTO[] bookArray = new BookDTO[4];
		bookArray[0] = new BookDTO(1,"홍길동전", "허균", 50000);
		bookArray[1] = new BookDTO(2,"목민심서", "정약용", 30000);
		bookArray[2] = new BookDTO(3,"동의보감", "허준", 40000);
		bookArray[3] = new BookDTO(4,"삼국유사", "일연", 50000);
		
		/* 제네릭의 타입 제한에 의해 comparable 타입을 가지고 있는 경우에만 sort가 사용가능하다.*/
//		Collections.sort(bookList);
		
		/*우리가 만든 DTO의 경우 이러한 방식으로 정렬하지 못하기 때문에 다른 방법을 사용해야 한다.*/
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		/* 가격 순으로 오름차순 정렬을 해 볼 것이다.
		 * compare 패키지를 추가하여 Comparator 인터페이스를 상속받은 클래스를 하나 추가한다.
		 *  
		 * Comparator 인터페이스를 상속받아 정렬의 기준을 정해준 뒤 List의 default 메소드인 sort() 메소드의 인자로
		 * 정렬 기준이 되는 인스턴스를 넣어주게 되면 내부적으로 우리가 오러라이딩 한 메소드가 동작하게 되며
		 * 그것을 정렬의 기준으로 삼는다.
		 * */
		
		bookList.sort(new AscendingPrice());
		
		System.out.println("가격 오름차순 정렬");
		
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* 인터페이스를 구현한 클래스를 재사용 하는 경우 AscendingPrice 클래스 처럼 작성하면 되지만
		 * 한 번만 사용하기 위해서는 조금 더 간편한 방법을 이용할 수 있다.
		 * 익명클래스(Anoymous)를 이용할 수 있다.
		 * */
		
		// 인터페이스 이기에 바로 인스턴스를 생성할 수 없다.
//		bookList.sort(new Comparator<BookDTO>());
		
		/* 익명클래스는 뒤에 {}를 만들어 마치 Comparator 인터페이스를 상속받은 클래스인데
		 * 이름이 없다고 생각하고 사용하는 것이다.*/
		bookList.sort(new Comparator<BookDTO>() {
			/* 여기서 내림차순 정렬 조건을 넣어주면 된다.
			 * 아까와는 반대로 오름차순 정렬 된 상태인 경우 순서를 바꿔야 한다.
			 * 양수를 반환해서 순서를 바구라는 플래그로 이용하였다.
			 * */
			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				return o1.getPrice() >= o2.getPrice()? -1:1;
			}
		});
		
		System.out.println("책 제목 오름차순 정렬 ---------------");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* 이번에는 제목 순 내림차순으로 정렬할 것이다.
		 * 이 것을 람다식이라고 부르는데, 자바 후반부에 람다식을 배울 것이다.
		 * */
		System.out.println("람다식");
		bookList.sort((BookDTO b1, BookDTO b2) ->  b2.getTitle().compareTo(b1.getTitle()));
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
	}

}
