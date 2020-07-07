package lesson4;

public class Exercises {
	public static void main(String[] args) {
		exercise1();
		exercise2();
//		exercise3();
//		exercise4();
	}

	static void exercise1() {
		for (E1Animal animal : new E1Animal[]{new E1Cat(), new E1Dog(), new E1Monkey()}) {
			if (animal.want2Eat()) {
				animal.putFood(100);
			}
			animal.voice();
		}
	}

	static void exercise2() {
		for (int index = 0; index < 10; index++) {
			final Factorial	f = Factorial.getFactorial(index);
			
			System.err.println("Factorial("+f.getArgument()+")="+f.getValue());
		}
	}

	static void exercise3() {
		// (10 + 5) * 3 --> 10, 5, + , 3, *
		System.err.println("Value="+new Calculator(10).load(5).add().load(3).multiply().get());
	}

	static void exercise4() {
		System.err.println("Random sum="+RandomKeeper.getRandomSum());
		System.err.println("Random average="+RandomKeeper.getRandomAvg());
		System.err.println("Random product="+RandomKeeper.getRandomProduct());
	}

	static void exercise5() {
		// TODO:
	}
}

//
//	Exercise 1
//

class E1Animal {
	void voice() {}
	boolean want2Eat() {return true;}
	void putFood(int foodAmount) {}
}

class E1Cat extends E1Animal {
	@Override
	void voice() {
		// TODO: implement body
	}
	
	@Override
	boolean want2Eat() {
		// TODO: implement body
	}

	@Override
	void putFood(int foodAmount) {
		// TODO: implement body
	}
}

class E1Dog extends E1Animal {
	@Override
	void voice() {
		// TODO: implement body
	}
	
	@Override
	boolean want2Eat() {
		// TODO: implement body
	}

	@Override
	void putFood(int foodAmount) {
		// TODO: implement body
	}
}

class E1Monkey extends E1Animal {
	@Override
	void voice() {
		// TODO: implement body
	}
	
	@Override
	boolean want2Eat() {
		// TODO: implement body
	}

	@Override
	void putFood(int foodAmount) {
		// TODO: implement body
	}
}

//
//	Exercise 2
//

class Factorial {
	private final int argument, value;
	
	private Factorial(int argument, int value) {
		this.argument = argument;
		this.value = value;
	}

	public int getArgument() {
		return argument;
	}
	
	public int getValue() {
		return value;
	}
	
	public static Factorial getFactorial(int argument) { // Factory
		// TODO: implement body (return argument! value)
		
	}
}

//
//	Exercise 3
//

class Calculator {
	// TODO: implement fields
	
	public Calculator(final int initialValue) {
		// TODO: implement body
	}
	
	public Calculator load(final int value) {
		// TODO: implement body
		return this;
	}
	
	public Calculator add() {
		// TODO: implement body
		return this;
	}

	public Calculator subtract() {
		// TODO: implement body
		return this;
	}

	public Calculator multiply() {
		// TODO: implement body
		return this;
	}

	public Calculator divide() {
		// TODO: implement body
		return this;
	}
	
	public int get() {
		// TODO: implement body
	}
}

//
//	Exercise 4
//

class RandomKeeper {
	private static final int[]	randoms;
	
	static {
		randoms = new int[(int) (1000 + 1000 * Math.random())];
		
		for (int index = 0; index < randoms.length; index++) {
			randoms[index] = (int) (1000 * Math.random());
		}
	}
	
	public static double getRandomSum() {
		// TODO: implement body
	}

	public static double getRandomAvg() {
		// TODO: implement body
	}
	
	public static double getRandomProduct() {
		// TODO: implement body
	}
}
