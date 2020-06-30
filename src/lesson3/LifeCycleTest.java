package lesson3;

public class LifeCycleTest extends java.lang.Object {
	public static final int 	x = 10;	// java.lang.String 
	public static final double 	y = Math.sqrt(2);

	static {
		System.err.println("Loading class...");
	}
	
	static {
		System.err.println("Loading class2...");	
	}
	
//	private static final void <clinit>() {
//		y = Math.sqrt(2);
//		System.err.println("Loading class...");
//		System.err.println("Loading class2...");
//	}
	
	public int z = 20;
	public double t = Math.exp(2);
	
	{
		System.err.println("URA@!!!!!!!!");
	}
	
	
	private LifeCycleTest() {	//public void <init>() {	<init>()V
		// super();		// java.lang.Object.<init>()
		// z = 20;
		// t = Math.exp(2);
		// System.err.println("URA@!!!!!!!!");
		this(0);	// <init>(0)	
		System.err.println("COnstructor 1"+this.z);
	}

	public LifeCycleTest(int zzz) {	//public void <init>(int zzz) {	// <init>(I)V
//		super();		// java.lang.Object.<init>()
		// z = 20;
		// t = Math.exp(2);
		// System.err.println("URA@!!!!!!!!");
		System.err.println("COnstructor 2");
						// static 
						// private
	}	

	static void staticPrint() {
		System.err.println("Static print "+x);
	}
	
	void print() {	// this
		System.err.println("Print "+z);	// +this.z 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Start life cycle");
		
		LifeCycleTest lct = new LifeCycleTest(), lct1 = new LifeCycleTest(1);
		
		lct1.z = 2222;
		lct1.print();	// LifeCycleTest.print(lct1)
		
		
		lct.print();	// LifeCycleTest.print(lct)
		lct.staticPrint();	// LifeCycleTest.staticPrint();
		
		lct = null;
	}
	
	// invokestatic     // не исп VMT
	// invokevirtual	// исп VMT
	// invokespecial	// должна быть VMT, но пользоваться нельзя
	// invokeinterface	// заранее неизвестная VMT
	// invokedynamic
	
}
