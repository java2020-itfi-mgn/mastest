package lesson12;

public class ClassLoaderTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Object	obj = new Object();
		
		System.err.println("Obj loader:"+obj.getClass().getClassLoader()); 
		System.err.println("My class loader:"+ClassLoaderTest.class.getClassLoader());
		
		MyLoader	ldr = new MyLoader(ClassLoaderTest.class.getClassLoader());
		MyLoader	ldr2 = new MyLoader(ldr);
		
		Class	cc = ldr.loadClass("lesson12.ClassLoaderTest");
		
		System.err.println("My cc loader:"+cc.getClassLoader());

		Class	ccZ = ldr.loadClass("lesson12.ZZZ");
		
		System.err.println("My ZZZ loader:"+ccZ.getClassLoader());

		ZZZ	z1 = new ZZZ();
		
		ZZZ	z2 = (ZZZ) ccZ.newInstance();
	}

	public static void print() {
		System.err.println("Call print");
	}
}