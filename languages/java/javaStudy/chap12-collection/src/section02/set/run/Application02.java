package section02.set.run;

import java.util.*;
public class Application02 {

	public static void main(String[] args) {
		
		/* LinkedHashSet 클래스
		 * HashSet이 가지는 기능을 모두 가지고 있고
		 * 추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
		 * jdk1.4 부터 제공하고 있다.
		 * */
		LinkedHashSet<String> lhset = new LinkedHashSet<>();
		
		lhset.add("java");
		lhset.add("oracle");
		lhset.add("jdbc");
		lhset.add("html");
		lhset.add("css");
		
		System.out.println("lhest : " + lhset);
		lhset.add("java");
		
		/* 오름찬순 정렬을 원하면 같은 클래스 타입일 때에만 가능함
		 * 
		 * 만들어진 링크드해쉬셋을 가지고 트리셋으로 객체를 생상하면
		 * 같은 타입의 객체를 자동으로 비교하여 오름차순으로 정렬한다.
		 * */
		TreeSet<String> tset = new TreeSet<>(lhset);
		System.out.println("tset : " + tset);
		
	}

}
