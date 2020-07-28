package lesson10;

public class ExceptionTest {
	static void test(int code) throws Exception, Throwable {
//		Throwable
//			Error - unchecked exceptions
//				-
//				-
//				-
//				-
//			Exception
//				-
//				-
//				- RuntimeException - unchecked exceptions 
//					- NullPointerException
//					- IllegalArgumentException
//					- IllegalStateException
//					- UnsupportedOperationException
//				-
		switch (code) {
			case 0: throw new RuntimeException("Runtime"); 
			case 1: throw new Exception("My super exception"); 
			case 2: throw new Throwable("Runtime");
			default : return;
		}
	}

	static void nestedTest(int code) throws Throwable {
		try{test(code);
		} catch (Exception exc) {
//			System.err.println("nested Exception: "+exc.getMessage());
		} finally {
			System.err.println("NESTED Finally!!!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwable	t = new Throwable("Message text");
		
		t.printStackTrace();
		
		for (int index = 0; index <= 3; index++) {
			try {
				nestedTest(index);
				System.err.println("Success!");
//			} catch(NullPointerException | IllegalArgumentException exc) {
//				System.err.println("???: "+exc.getMessage());
			} catch(RuntimeException exc) {
				System.err.println("RTE: "+exc.getMessage());
			} catch(Exception exc) {
				System.err.println("Exception: "+exc.getMessage());
			} catch(Throwable exc) {
				System.err.println("Throwable: "+exc.getMessage());
				System.err.println("Cause: "+exc.getCause());
			} finally {
				System.err.println("Finally!!!");
			}
		}
	}
}
