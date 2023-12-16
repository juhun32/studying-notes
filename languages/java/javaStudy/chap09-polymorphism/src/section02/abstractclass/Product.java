package section02.abstractclass;

public abstract class Product {
	
	private int nonStaticField;
	private static int staticFiled;
	
	public Product() {}
	
	public void nonStaticMethod() {
		System.out.println("Product 클래스의 nonstaticMethod 호출함");
	}

	public static void staticMethod() {
		System.out.println("Product 클래스의 staticMethod 호출함..");
	}
	
	
	public abstract void abstMethod(); // 추상메서드
	
}
