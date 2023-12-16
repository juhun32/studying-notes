package section06.statickeyword;

public class StaticFiledTest {

	private int nonStatiConut;
	private static int staticCount;
	
	public StaticFiledTest() {}
	
	public int getNonStatiCount() {
		return this.nonStatiConut;
	}
	
	public int getStaticCount() {
		/* static 필드에 접근하기 위해서 클래스명.필드명 으로 접근한다.
		 * this.으로 접근은 가능하지만 this를 사용하지 않는 것이 좋다.*/
		return StaticFiledTest.staticCount;
	}
	
	public void increaseNonStatiCount() {
		this.nonStatiConut++;
	}
	
	public void increaseStatiCount() {
		StaticFiledTest.staticCount++;
	}
}
