package section06.singleton;

public class LazySingleton {

	private static LazySingleton lazy;
	
	private LazySingleton() {}
	
	public static LazySingleton getInstace() {
		
		if(lazy == null) {
			
			/*인스턴스를 생성한 적이 없는 경우 새로운 인스턴스를 생성함*/
			lazy = new LazySingleton();
		}
		return lazy;
	}
}
