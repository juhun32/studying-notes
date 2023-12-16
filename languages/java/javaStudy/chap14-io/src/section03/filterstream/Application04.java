package section03.filterstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Application04 {

	public static void main(String[] args) {
		/* 객체 단위로 입출력을 하기 위한 ObjectInputStream/ObjectOutputStream을 살펴 본다.
		 * 먼저 dto 클래스를 하나 추가한다.
		 * dto 패키지를 하나 추가한 뒤 MemberDTO 클래스를 하나 만들어 본다.
		 * */
		
		MemberDTO[] outputMembers = {
			new MemberDTO("user01", "pass01", "홍길동", "hong777@gmail.com", 25, '남', 1250.7),
			new MemberDTO("user02", "pass02", "김길동", "korea31@gmail.com", 16, '여', 1250.7),
			new MemberDTO("user03", "pass03", "나길동", "leesoons@gmail.com", 22, '남', 1250.7)
		};
		
		ObjectOutputStream objOut = null;
		
		try {
			/* 객체 출력을 기존의 파일에 덮어 스기 할 경우*/
			objOut = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream("src/section03/filterstream/testObjectStream.txt", true)));
			/* 출력 스트림을 열어 저장하게 되면 하나의 header와 data가 같이 저장되게 된다.
			 * 이때 fileOutputStream에 true를 하게 되면 기존 파일이 있는 상태에서 또 다른  header + data가 이어서 누적되게 된다.
			 * 입력 스트림도 마찬가지로 한번 열면 하나의 header + data 타입 단위로 읽게 된다.
			 * 하지만 읽어들이는 입력 스트림은 하나의 header + data 타입을 읽고 다시 header를 만나면 
			 * StreamCorruptedException : invalid Type Code : Ac가 발생하게 된다. 
			 * (이어붙이기 출력 당시 작성 된 이후  header를 만나면서 발생되는 예외)
			 * 
			 * 따라서, 출력 스트림을 통해 이어서 객체들을 저장하고 싶다면 첫 header 이후에는 header없는  들어가야 
			 * 한번의 입력 스트림으로 이어써진 모든 객체들을 예외없이 한번에 불러올 수 있다.데이터들만
			 * 
			 * 따라서 ObjectOutputStream을 상속받는 MyOutputStream을 따로 만들어  header를 생성하지 않는 출력스트림을 만들고 
			 * (오버라이딩을 통한 메소드 재정의)
			 * 기존에 파일이 있다면 한번의 header + data가 들어있을 테니 header를 작성하지 않는 MyOutputStream을 써서 출력하도록 해야 한다.
			 * 
			 * 아래의 if-else를 통해 작성하면 ObjectInputStream을 한 번에 여는 것으로 이어서 작성된 객체들을 한번에 불러올 수 있다.
			 * */
			
			// 객체 출력을 기존의 파일에 이어붙이기 하고 싶다면 
			if(new File("src/section03/filterstream/testObjectStream.txt").exists()/* 파일 존재하는지 검사*/) {
				/*파일이 있을 경우 */
				objOut = new MyOutputStream(
						new BufferedOutputStream( //직렬화 헤더를 저장하지 않게 설정
								new FileOutputStream("src/section03/filterstream/testObjectStream.txt", true)));
			}else {
				//파일이 없을 경우 (최초 입력인 경우)
				objOut = new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream("src/section03/filterstream/testObjectStream.txt")));
			}
			
			for(int i=0; i< outputMembers.length; i++) {
				objOut.writeObject(outputMembers[i]);
			}
			objOut.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(objOut != null) {
				try {
					objOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		/* 실행해보면 NotSerialzableException이 발생할 것이다.
		 * 직렬화 처리를 해주지 않아서 발생하는 에러이다.
		 * 직렬화란 ?
		 * 자바 시스템 내부에서 사용되는 객체 또는 데이터를 외부 에서도 사용할 수 있도록
		 * 바이트(byte)형태로 데이터를 변환하는 기술이다.
		 * 반대로 바이트로 변환된 데이터를 다시 객체로 변환하는 기술을 역직렬화라고 한다.
		 * */
		MemberDTO[] inputMembers = new MemberDTO[3];
		ObjectInputStream objIn = null;
		
		try {
			objIn = new ObjectInputStream(
					new BufferedInputStream(
					new FileInputStream("src/section03/filterstream/testObjectStream.txt")));
			
			while(true) {
				System.out.println((MemberDTO) objIn.readObject());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(objIn != null) {
				try {
					objIn.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		/* 직렬화 대상에서 제외하고 싶은 필드의 경우  transient 키워드를 사용할 수 있다.
		 * MemberDTO 클래스에서 필드에 키워드를 추가하고 다시 실행해 보면 해당 필드는 직렬화 제외된 것을 확인할 수 있다.
		 * */
		
	}

}
