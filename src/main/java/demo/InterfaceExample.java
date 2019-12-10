package demo;

interface Actor {
	void act();
	void speak();
	default void comedy()
	{
		System.out.println("i can comedi");	
	}
}

class Hero implements Actor {
	@Override
	public void act() {
		System.out.println("i can act");

	}

	@Override
	public void speak() {
		System.out.println("i can speak");

	}

	public void comedy() {
		System.out.println("i can comedy");
	}
}

class Villian implements Actor {
	@Override
	public void act() {
		System.out.println("i can act");

	}

	@Override
	public void speak() {
		System.out.println("i can speak");

	}

	public void rud() {
		System.out.println("i am rude");
	}

}
public class InterfaceExample {
	public static void main(String[] args) {

	}

}
