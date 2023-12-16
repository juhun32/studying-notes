package section01.polymorphism;

public class Application01 {

	public static void main(String[] args) {
		
		/* 다형성
		 * 다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있는 것을 의미한다.
		 * 그렇기 때문에 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있기도 하고,
		 * 하나의 메소드 호출로 객체별로 각기 다른 방법으로 동작하게 할 수도 있다.
		 * 
		 * 다형성은 객체지향 프로그램밍의 3대 특징(캡슐화, 상속, 다형성) 중 하나이며,
		 * 객체지향 프로그램의 꽃이라고 불리울 정도의 활용성이 높고 장점이 많다.
		 * 하지만 학습하기 어렵다는 단점을 가지고 있다.
		 * 
		 * 다형성의 장점
		 * 1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있기 대문에 유지보수성과 생산성이 증가하게 된다.
		 * 2. 상속을 기반으로 한 기술이기 때문에 상속관계에 있는 모든 객체는 동일한 메세지를 수신할 수 있다.
		 *    이러한 동일한 메세지를 수신받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점을 가지고 있다.
		 *    (다양한 기능을 사용하는데 있어서 관리해야 할 메세지 종류가 줄어들게 된다)
		 *    하나의 호출로 여러 가지 동작을 수행할 수 있다는 측면에서 오버로딩을 다형성으로 보기도 한다.
		 *    다형성을 이해하기 쉬운 가장 좋은 예 이기도 하다.
		 *    하지만 이 부분은 이견이 많이 존재하기 때문에 다형성을 이해하는데 참고로만 활용하자
		 * 3. 확장성이 좋은 코드를 작성할 수 있다.
		 * 4. 결합도를 낮춰서 유지보수성을 증가시킬 수 있다.
		 * 
		 * 하지만 다형성은 장점이 잘 와닿지도 않고 개념도 정말 많이 어렵다.
		 * 철학 적인 부분과 설계적인 부분보다 우선 다형성의 문법적이 특징에 집중해서 학습을 한다.
		 * 
		 * 우선적으로 살펴볼 것은 다형성이란 ㄱ서로 다른 형태를 가지고 있는 성질을 의미한다는 것이다.
		 * 다형성은 상속을 기반으로 한 기술이다.
		 * 상속은 부모클래스가 가지는 속성과 기능(필드와 메소드)를 물려받아 자신의 것 처럼 사용하며
		 * 확장도 가능한 개념이라고 했다.
		 * 하지만 이 때 물려받는 것이 한 가지 더있다. 바로 타입이다.
		 * 클래스는 사용자 정의의 타입이다. 이렇게 사용자가 정의한 타입 또한 함께 물려받는 것이 
		 * 다형성이 서로 다른 여러 형태를 가지고 있다는 개념이다.
		 * 
		 * car와 fireCar, RacingCar를 기억하는가?
		 * fireCar는 fireCar이면서 car이기도 하다.
		 * Racingcar 역시 RacingCar이면서 Car이기도 하다.
		 * fireCar와 RacingCar로 생성한 인스턴스는 각각 fireCar, RacingCar 타입이라고 볼 수 있다.
		 * 하지만 fireCar와 RacingCar 모두 Car라는 타입도 함께 가지고 있다.
		 * 
		 * 이것이 서로 다른 타입을 여러 개 가지고 있다는 의미이다.
		 * */
		
		System.out.println("Animal 생성 ------------");
		Animal animal = new Animal();
		animal.eat();
		animal.run();
		animal.cry();
		
		System.out.println("Rabbit 생성 -------------");
		
		Rabbit rabbit = new Rabbit();
		rabbit.eat();
		rabbit.run();
		rabbit.cry();
		rabbit.jump();
		
		System.out.println("Tiger 생성 -------------");
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.run();
		tiger.cry();
		tiger.bite();
		
		Animal a1 = new Rabbit();
		Animal a2 = new Tiger();
		
//		Tiger a3 = new Animal();
		
		System.out.println();
		System.out.println("동적 바인딩~~~~~");
		a1.cry();
		a2.cry();
		
		System.out.println("클래스타입 형변환 확인~~~~~~~~~~~~~~~");
		/* 객체별로 고유한 기능을 동작시키기 위해서는 레퍼런스 변수를 형변환하여 Rabbit과 Tiger로 변경해야 
		 * 메소드 호출이 가능하다.
		 * class type cating : 클래스 형변환
		 * 타입 형변환 시 실제 인스턴스와 타입이 일치하지 않는 경우
		 * ClassCastException이 발생된다.
		 * */
		((Rabbit)a1).jump();
//		((Tiger)a1).bite();
		((Tiger)a2).bite();
		
		System.out.println("instanceof 확인 -----------");
		System.out.println("a1이 Tiger 타입인지 확인  : " + (a1 instanceof Tiger));
		System.out.println("a1이 Tiger 타입인지 확인  : " + (a1 instanceof Rabbit));
		System.out.println("a1이 Tiger 타입인지 확인  : " + (a1 instanceof Animal));
		System.out.println("a1이 Tiger 타입인지 확인  : " + (a1 instanceof Object));
		
		if(a1 instanceof Rabbit) {
			((Rabbit)a1).jump();
		}
		
		if(a2 instanceof Tiger) {
			((Tiger)a2).bite();
		}
		
		Animal animal1 = (Animal) new Rabbit(); //up-casting 명시적 형변환
		Animal animal2 = new Rabbit(); // up-casting 묵시적 형변환
		
		Rabbit rabbit1 = (Rabbit) animal1;
//		Rabbit rabbit2 = animal2;
//		Rabbit rabbot3 = new Animal();
	
		
	}
}
