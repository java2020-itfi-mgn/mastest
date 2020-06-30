package lesson3;

public class ChildLifeTest extends LifeCycleTest {
	public static final int 	x = 20;	// java.lang.String 
	public static final double 	y = Math.sqrt(5);

	static {
		System.err.println("Child Loading class...");
	}
	
	static {
		System.err.println("Child Loading class2...");	
	}
	
//	private static final void <clinit>() {
//	y = Math.sqrt(5);
//	System.err.println("Child Loading class...");
//	System.err.println("Child Loading class2...");
//}
	
	public int z = 200;
	public double t = Math.exp(1);
	
	{
		System.err.println("ZZZZZ");
	}
	
	public ChildLifeTest() {
		super(10);	// LifeCycleTest.<init>((int)10) 
		//super.<init>();
		// z = 200; 
		// t = Math.exp(1);
		// System.err.println("ZZZZZ");
		System.err.println("sdjj");
	}

	static void staticPrint() {
		System.err.println("Child Static print "+x);
	}
	
	@Override
	void print() {	// this
		System.err.println("Child Print "+z);	// +this.z 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Child start: "+ChildLifeTest.x);
		
		LifeCycleTest clt = new ChildLifeTest();

		clt.print();		// Virtual method table (VMT)
		clt.staticPrint();	// LifeCycleTest.staticPrint();
		
		clt = null;
	}

}
