package lesson12;

import java.util.Arrays;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		call(new MyInterface() {
			@Override
			public void print() {
				System.err.println("Anon class");
			}
		});

		call(/*new MyInterface() {
			@Override
			public void print*/() -> {
				System.err.println("Anon class");
			}
		/*}*/);
		
		call(()->System.err.println("Lambda"));	// class ZZZZZ implements MyInterface
		
		call(new MyComplexInterface() {
			@Override
			public void print(String value, int index) {
				System.err.println("Complex: "+value+" "+index);
				System.err.println("Anon this: "+this.getClass());
			}
		});

		final int	zz = 0;
		
		call(/*new MyComplexInterface() {		// MethodHandle		// invokedynamic
			@Override
			public void print*/(/*String*/ value, /*int*/ index) -> {
				// ZZZZZZZZZZZ(zz,value,index)
				System.err.println("Complex: "+value+" "+index+" "+zz);
//				System.err.println("Lambda this: "+this.getClass());
			}
		/*}*/);

		call(LambdaTest::ZZZZZZZZZZZZ);
		
		MyComplexInterface	myVar = LambdaTest::ZZZZZZZZZZZZ;	// ????? implements MyComplexInterface
		
		
		Class	cl = LambdaTest.class;
		
		System.err.println("Methods: "+Arrays.toString(cl.getDeclaredMethods()));
	}

	static void call(MyInterface mi) {
		mi.print();
	}

	static void call(MyComplexInterface mi) {
		mi.print("sdsd",0);
	}
	
	private static void ZZZZZZZZZZZZ(String value, int index) {
		System.err.println("Complex: sdkljfsdklfklsdfjkl "+value+" "+index);
	}

	void call2(MyComplexInterface mi) {
		mi.print("sdsd",0);
	}

}

@FunctionalInterface
interface MyInterface {
	void print();
}

//	typedef void (*call)(String,int)

@FunctionalInterface
interface MyComplexInterface {
	void print(String value, int index);

	default void zzz() {
	}
}