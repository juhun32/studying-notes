package section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		/* 위에서 배운 예외처리를 가장 많이 활용하는 것이 io(input/ouput) 패키지 이다.
		 * 아직 io는 배우지 않았으나 io 문법보다는 try-catch블럭의 실제 사용과 흐름에 집중해본다.
		 * */
		
		BufferedReader in = null;
		
		try {
			/* FileReader라는 클래스의 생성자에 예외를 thorws해 놓았따.
			 * 사용하는 쪽에서 반드시 예외처리를 해야 하기 때문에 try-catch블럭 안에서 생성자를 호출하여
			 * 인스턴스를 생성해야 한다.
			 * */
			in = new BufferedReader(new FileReader("test.dat"));
			String s;
			while((s = in.readLine()) != null) {
				System.out.println(s);
			}
			
		} catch (FileNotFoundException /* | EOFExcetion*/ e) {
			/* FileNouFoundException과 EOFException을 동시에 처리할 수 있다.
			 * 같은 레벨의 자손을 한번에 처리할 수 있는 것이다.
			 * 
			 * catch 블럭은 여려개를 작성할 시 상위 타입이 하단에 오고 후손 타입이 먼저 작성되어야 한다.
			 * 바꿔보면 에러가 발생된다.
			 * 예외클래스의 계층구조를 api에서 찾아본다.
			 * */
			e.printStackTrace();
		} catch (IOException e) {
			/* 입출력에 관한 추상화된 예외클래스이다.\
			 * FileNotFoundException은 IOException의 후손이다.
			 * */
			e.printStackTrace();
		}
		finally {
			/* 예외 처리 구문과 상관 없이 반드시 수행해야 하는 경우 작성하며
			 * 보통 사용한 자원을 반납할 목적으로 사용하게 된다.*/
			try {
				/* 실행하면 NullPointerException이 발생한다.
				 * 파일을 찾지 못해 객체를 생성하지 못하고 레퍼런스 변수에는 null 값을 가지고 있는데
				 * null을 참조하는 상태에서 참조연산자 사용 시 발생하는 예외이다.
				 * NullPointerException은 uncheckd Exception으로 try-catch로 처리하기 보다는 
				 * 보통 if - else 구문으로 해결이 가능하다.
				 * */
				
				if(in != null) {
					in.close();
					/* 입출력에 사용한 스트림을 닫아 주는 메소드이다.
					 * API에서 확인해보면 IOException을 위임한 메소드이기 때문애ㅔ
					 * finally 블럭 안이라도 또 예외 처리를 중첩으로 해 주어야 한다.
					 * try 블럭과 finally 블럭은 별개 이다.
					 * */
				}
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
