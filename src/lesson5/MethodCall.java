package lesson5;

public class MethodCall {
	static int	x = 20;		// ConstValue

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	x[] = new int[] {123};
		staticPrint(x);	// invokestatic		lesson5.MethodCall.staticPrint([I)V
		System.err.println("After="+x[0]);
		
		C cl = new C();
		cl.x = 123;
		staticPrint(cl);	// invokestatic		lesson5.MethodCall.staticPrint(Llesson5/C;)V
		System.err.println("After="+cl.x);
		
		MethodCall	mc = new MethodCall();	// invokevirtual lesson5.MethodCall.print()V
		mc.print();
	}

	static void staticPrint() {
		int	x = 10;
		
		System.err.println("x="+x);
	}

	static void staticPrint(int x[]) {	// stack frame: // x:1=123,2:1
		System.err.println("x="+x[0]);
		x[0] = 456;
	}
	
	static void staticPrint(C val) {	// stack frame: // x:1=123,2:1
		System.err.println("x="+val.x);
		val.x = 456;
	}
	
	void print() {		// stack frame: // this:1,x:1=123,2:1
		int	x = 100;
		
		System.err.println("x="+x);
	}

	public final int y;

	MethodCall() {
		if (x > 0) {
			y = 100;
		}
		else {
			y = 200;
		}
	}
	
	public void print(final int x) {	// stack frame: // this:1,x:1=123,2:1
		int	yy = y;
		
		System.err.println("x="+x);						// iload
		System.err.println("Class x="+MethodCall.x);	// getstatic lesson5.MethodCall.x
		System.err.println("y="+this.y);				// getfield lesson5.MethodCall.y
	}
}


class C {
	int	x;
}