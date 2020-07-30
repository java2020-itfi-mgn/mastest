package lesson12;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		call(new MyInterface() {
			@Override
			public void print() {
				System.err.println("Anon class");
			}
		});
		
		call(()->System.err.println("Lambda"));	// class ZZZZZ implements MyInterface 
	}

	static void call(MyInterface mi) {
		mi.print();
	}
}

interface MyInterface {
	void print();
}