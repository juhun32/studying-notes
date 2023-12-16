package section03.abstraction;

public class CarRacer {
	/* 메소드를 4가지 다 추가하고 나면 이제 CarRacer가 상호작용할 Car 클래스를 CarRacer는 알고 있어야 한다.*/
	
	private Car car = new Car();
	
	public void startUp() {
		car.startUp();
	}
	
	public void stepAccelator() {
		car.go();
	}
	
	public void stepBreak() {
		car.stop();
	}
	
	public void turnOff() {
		car.turnOff();
	}

}
