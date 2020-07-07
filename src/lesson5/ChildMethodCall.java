package lesson5;

public class ChildMethodCall extends MethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildMethodCall	cmc = new ChildMethodCall();
		
		cmc.print(123);	// invokevirtual lesson5.ChildMethodCall.print(I)V
	}

	@Override
	public void print(int x) {	// stack frame: // this:1,x:1=123,2:1
		System.err.println("x="+x);
		super.print(456);	// invokespecial	lesson5.MethodCall.print(I)V
	}
	
	
}
