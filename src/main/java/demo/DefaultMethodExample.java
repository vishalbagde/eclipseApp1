package demo;

interface Demo {
	void abc();

	default void print() {
		System.out.println("in print");
	}
}

interface Demo1 extends Demo {
	@Override
	default void abc() {
		// TODO Auto-generated method stub
	}

	default void show() {
		System.out.println("in show");
	}

	@Override
	default void print() {
		// TODO Auto-generated method stub
		System.out.println("in Test show");
	}
}

interface Method {
	static void print() {
		System.out.println("in Method print");
	}

}

public class DefaultMethodExample {

	public static void main(String[] args) {
		Demo d = new Demo() {
			@Override
			public void abc() {
				System.out.println("test");
			}
		};
		d.print();

		Demo1 d1 = new Demo1() {
		};
		d1.print();
		
		Method.print();

	}
}
