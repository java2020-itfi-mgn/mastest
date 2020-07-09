package lesson6;

public class Exercises {

	public static void main(String[] args) {
		exercise1();
		exercise2(/* ..... */);
	}

	static void exercise1() {
		for (Animal animal : new Animal[]{new Cat(), new Dog(), new Monkey()}) {
			if (animal.want2Eat()) {
				animal.putFood(100);
			}
			animal.voice();
		}
	}
	
	static void exercise2(Calculator calc) {
		// (10 + 5) * 3 --> 10, 5, + , 3, *
		System.err.println("Value="+calc.load(10).load(5).add().load(3).multiply().get());
	}
	
}

interface Animal {
	void voice();
	default boolean want2Eat() {return true;}
	void putFood(int foodAmount);
}

interface Calculator {
	Calculator load(int val);
	Calculator add();
	Calculator subtract();
	Calculator multiply();
	Calculator divide();
	int get();
}
