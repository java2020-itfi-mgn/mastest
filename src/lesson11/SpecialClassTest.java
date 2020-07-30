package lesson11;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class SpecialClassTest {
	public static final int	x = 10;
	
	public final int y = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class	cl = InnerClass.class;
		
		Constructor[] c = cl.getConstructors();
		System.err.println("Constructors: "+Arrays.toString(c));
		
		SpecialClassTest	owner = new SpecialClassTest();
		InnerClass			inner = owner.new InnerClass();		// new InnerClass(owner) 
		InnerClass			inner1 = owner.new InnerClass();	// new InnerClass(owner) 
		
		StaticInnerClass	sic = new StaticInnerClass();
		
		inner = null;
		inner1 = null;

		Class	clStatic = StaticInnerClass.class;
		
		Constructor[] cStatic = clStatic.getConstructors();
		System.err.println("Constructors: "+Arrays.toString(cStatic));
		
		Object				obj = new Object() {	// 0.1%
								public void print() {
									//
								}
							};
		Class				clAnon = obj.getClass();
		
		System.err.println("Name="+clAnon.getName());
		System.err.println("MEthods="+Arrays.toString(clAnon.getMethods()));
		
		new Object() {
			public void print() {
				System.err.println("PPPPP");
			}
		}.print();

		final int	abcde = 123;
		
		MyInterface			mi = new MyInterface() {	// 99.9% class SpecialClassTest$3 implements MyInterface
								private static final int zzz = 0;
			
								@Override
								public void print() {
									System.err.println("INTERFACE K:LKL:KL:KL:SDKF"+abcde);
								}
							};
		clAnon = mi.getClass();
		
		System.err.println("Name="+clAnon.getName());
		System.err.println("Constructors="+Arrays.toString(clAnon.getDeclaredConstructors()));
		System.err.println("MEthods="+Arrays.toString(clAnon.getMethods()));
		mi.print();
		
		class InnerMethodClass {
			public void print() {
				System.err.println("INTERFACE K:LKL:KL:KL:SDKF"+abcde);
			}
		}		
	}

	public interface MyInterface {
		public void print();
	}
	
	
	private class InnerClass {						// 15%
		// private final SpecialClassTest this$0;	
		public static final int y = 100;	// ConstValue
	
		public InnerClass(/*SpecialClassTest owner*/) {
			// this$0 = owner;
			System.err.println("Constructor");
		}
		
		public void print() {
			System.err.println("print "+/*this$0.*/y+SpecialClassTest.this.y);
		}
	}

	private static class StaticInnerClass {			// 85%
		public static final int y = (int)(100*Math.random());	// ConstValue
		 
		static {
			 
		}
		
		public StaticInnerClass() {
			System.err.println("Constructor: "+x);
		}
	}
}
