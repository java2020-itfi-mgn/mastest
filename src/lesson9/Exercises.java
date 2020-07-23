package lesson9;

public class Exercises {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println(sum(new Class1()));
		System.err.println(sum(new Class2()));
	}

	static int sum(final Object obj) {
		// TODO: calculate sum of all int fields in the object
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