package lesson10;

import java.lang.reflect.Array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object	obj = new int[] {1,2,3,4,5};
		
		if (obj.getClass().isArray()) {
			System.err.println("arr[3]="+Array.get(obj,3));
			
			Array.setInt(obj,3,2345676);
			System.err.println("arr[3]="+Array.get(obj,3));
			
			System.err.println("Length: "+Array.getLength(obj));
			
			String[]	s = (String[])Array.newInstance(String.class,15);
			System.err.println("S.length="+s.length);
		}
	}

}
