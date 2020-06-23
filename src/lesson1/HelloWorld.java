package lesson1;

import lesson1a.AnotherWorld;

public class HelloWorld extends AnotherWorld { // lesson1.HelloWorld

//	public - общедоступный 
//	protected = private + соседи по пакету + дочерние классы
	
//	private - 

	public static int	x = 10;	// примитивные типы (встроенные типы)
	public static int	y[] = new int[]{10,20};
	public static HelloWorld	t = null;
	
	// группа целых чисел
	//	- byte    -128..+127		// signed char		1
	//  - short   -32768..32767		// signed short		1
	//  - int     -2^31..2^31		// signed int		1
	//  - long    -2^63..2^63		// signed long		2
	//  - char    -0..65536			// unsigned short	1
	// группа вещественных чисел
	//  - float		1e-38..1e+38 точность 6 цифр		IEEE754		1
	//  - double	1e-307..1e+307 точность 15 цифр					2
	// Особый тип
	//  - boolean	false true		1
	
	public static void main(String[] args) {
		System.err.println("Hello world");
		System.err.println(AnotherWorld.z);
		
		HelloWorld	hw = new HelloWorld();	// HelloWorld	&hw = new HelloWorld(); 
	}
}
