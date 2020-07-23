package lesson9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ClassTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		final Object	obj = "vassya";
		
		final Class		cl = obj.getClass();
		
		System.err.println("Name="+cl.getName());
		System.err.println("Fields="+Arrays.toString(cl.getFields()));
		System.err.println("Fields="+Arrays.toString(cl.getDeclaredFields()));
		System.err.println("Super="+cl.getSuperclass());
		
		Field	f = cl.getDeclaredField("value");
		System.err.println("Field name: "+f.getName());
		System.err.println("Field type: "+f.getType());
		
		f.setAccessible(true);
		byte[]	result = (byte[])f.get(obj);

		f.set(obj,"hello world".getBytes());
		
		System.err.println("Array: "+Arrays.toString(result));
		System.err.println("Content: "+obj);
		
		switch (obj.toString()) {
			case "vassya" :  System.err.println("VASS!!!!"); break;
			case "hello world" :  System.err.println("HELLO!!!!"); break;
		}
		
		System.err.println("MEthods: "+Arrays.toString(cl.getMethods()));
		System.err.println("Declared MEthods: "+Arrays.toString(cl.getDeclaredMethods()));
	
		Class	intClass = int.class;
		
		System.err.println("INT NAME: "+intClass.getName());
		System.err.println("Is primitive? "+intClass.isPrimitive());
		System.err.println("Is primitive? "+cl.isPrimitive());
		
		System.err.println("Sum: "+sum(10,7,-2,11));
		
		Method	m = cl.getMethod("substring",int.class,int.class);	// substring(int,int)
		
		System.err.println("Method name: "+m.getName());
		System.err.println("Method return type: "+m.getReturnType());
		System.err.println("Method parameters: "+Arrays.toString(m.getParameters()));
		
		m.setAccessible(true);
		System.err.println("Substr: "+m.invoke(obj,2,5));
		
		System.err.println("Constructors: "+Arrays.toString(cl.getConstructors()));
		
		Constructor	c = cl.getConstructor(char[].class);
		
		Object	temp = c.newInstance(new char[] {'a','b','c','d','e'});
				
		System.err.println("TEMP: "+temp);
		
		System.err.println("is public: "+Modifier.isPublic(cl.getModifiers()));
		
//		cl.isArray()/cl.getComponentType()
	}
	
	static int sum(int... item) {	// varargs
		int sum = 0;
		
		for (int val : item) {
			sum += val;
		}
		return sum;
	}

//	static int sum(int[] item) {	
//		int sum = 0;
//		
//		for (int val : item) {
//			sum += val;
//		}
//		return sum;
//	}

}
