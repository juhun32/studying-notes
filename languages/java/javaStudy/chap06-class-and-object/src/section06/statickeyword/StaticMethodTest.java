package section06.statickeyword;

public class StaticMethodTest {
	
	private int count;
	private static int count2;
	
	public void nonStaticMethod() {
		this.count++;
		
		System.out.println("nonStaticMethod 호출됨...");
	}
	
	public static void staticMethod() {
		StaticMethodTest.count2++;
		System.out.println("static method 호출됨....");
	}
}
