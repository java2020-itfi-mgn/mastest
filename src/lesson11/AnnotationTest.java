package lesson11;

@MyAnnotation(item = MyEnum.MY_FIRST, myClass = MyEnum.class, text = "sdfkljsdkljklsdjfkljsdfklj")
public class AnnotationTest {
	static int x;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class	cl = AnnotationTest.class;
		
		System.err.println("Value: "+cl.getAnnotation(MyAnnotation.class));
		MyAnnotation	an = (MyAnnotation) cl.getAnnotation(MyAnnotation.class);
		
		if (an.length() > 0) {
			System.err.println("sklklasjdkljasdklj");
		}
		else {
			System.err.println("0-450-9");
		}
	}
}
