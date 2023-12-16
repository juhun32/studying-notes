package section01.polymorphism;

public class Application03 {

	public static void main(String[] args) {
		
		/* 매개변수에도 다형성을 활용할 수 있다.*/
		
		Application03 app3 = new Application03();
		
		Animal animal1 = new Rabbit();
		Animal animal2 = new Tiger();
		
		app3.feed(animal1);
		app3.feed(animal2);
		System.out.println("------1-------");
		
		Rabbit animal3 = new Rabbit();
		Tiger animal4 = new Tiger();
		
		app3.feed(animal3);
		app3.feed((Animal)animal4);
		System.out.println("------2-------");
		
		app3.feed(animal3);
		app3.feed(animal4);
		
		app3.feed(new Rabbit());
		app3.feed(new Tiger());
	}
	
	public void feed(Animal animal) {
		 
		animal.eat();
	}

}
