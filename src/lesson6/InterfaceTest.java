package lesson6;

import java.io.Serializable;

public class InterfaceTest implements MyInterface {
	private static int	zzz = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface	it = new ExTest();
		Cloneable 	c = new ExTest();

		test(new MyClass());
	}

	public void newABCDE() {
		
	}
	
	public static void test(MyInterface var) {
		var.print();		// invokeinterface	// invokevirtual
		var.print(var.getSequentialNumber());
		
		System.err.println(MyInterface.x);
	}
	
	public void myCall() {
	}
	
	public void print() {
		System.err.println("Empty print");
	}

	public void print(int x) {
		System.err.println("X="+x);
	}
	
	public int getSequentialNumber() {
		return zzz++;
	}

	public int newMethod() {	// Java 1.8
		return 0;
	}
	
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}

class ExTest extends InterfaceTest implements MyInterface {
}


class MyClass implements MyInterface {

	@Override
	public int getSequentialNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print(int arg0) {
		// TODO Auto-generated method stub
		
	}

	public int newMethod() {	// Java 1.8
		return 0;
	}
	
	public void aaaaa() {
	}
	
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
}

interface MyInterface extends Cloneable, AutoCloseable, Serializable {		// abstract interface MyInterface 
	int	x = (int) (10*Math.random());				// public static final int x = 10;
	
	void print();			// public abstract void print();
	void print(int x);		// public abstract void print(int x);
	int getSequentialNumber();	// public abstract int getSequentialNumber(); 
	
	default int newMethod() {	// Java 1.8
		//	this - Object
		//	this - MyInterface
		as();
		return 0;
	}
	
	static void assa() {	// Java 1.8
		System.err.println();
	}
	
	private void as() {		// Java 1.9
		
	}
}

