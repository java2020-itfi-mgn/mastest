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
	
	
	public LifeCycleTest() {	//public void <init>() {	<init>()V
		// super();		// java.lang.Object.<init>()
		// z = 20;
		// t = Math.exp(2);
		// System.err.println("URA@!!!!!!!!");
		System.err.println("COnstructor 1");
	}

	public LifeCycleTest(int zzz) {	//public void <init>(int zzz) {	// <init>(I)V
//		super();		// java.lang.Object.<init>()
		// z = 20;
		// t = Math.exp(2);
		// System.err.println("URA@!!!!!!!!");
		System.err.println("COnstructor 2");
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Start life cycle");
		
		LifeCycleTest lct = new LifeCycleTest();
		
		lct = null;
	}
}
