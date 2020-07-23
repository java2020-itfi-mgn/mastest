package lesson9;

import java.lang.reflect.Field;

public class Exercises {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		System.err.println(sum(new Class1()));
		System.err.println(sum(new Class2()));
	}

	static int sum(final Object obj) throws IllegalArgumentException, IllegalAccessException {
		// TODO: calculate sum of all int fields in the object
		Class	cl = obj.getClass();
		int		sum = 0;

		do {
			for (Field f : cl.getDeclaredFields()) {
				if (f.getType() == int.class) {
					sum += f.getInt(obj);
				}
			}
		} while ((cl = cl.getSuperclass()) != null);
		
		return sum;
	}
	
}

class Class1 {
	public int	x = 10;
	public static int y = 20;
}

class Class2 {
	int	x = 30;
	static int y = 40;
}