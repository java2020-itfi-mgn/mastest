package lesson2;

import lesson1.HelloWorld;

public class OperatorsTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	x, y;
		
		x = 10;
		y = x;
		x += 10;	// x = x + 10;
		x <<= 2;	// x = x << 2;
		
		++x;	// x = x + 1
		x++;	// x = x + 1
		--y;	// y = y - 1
		y--;	// y = y - 1
		
		
		if (y != 0 && x / y == 5) {
			if (y < 0) {
				
			}
		}
		else {
			
		};
		
		while (x > 0) { 
			x--;
		};
			
		do {
			x++;
		} while (x <= 0);
		
		
		for (x = 10; x < 20; x++) {
			y = x;
			continue;
		}
		
		x = 10;
		while (x < 20) {
			y = x;
			x++; // <- continue
		}
		
		for (;;) {
			/////
			break;	// стр 54
		}
		
l1:		for (;;) {
			for (;;) {
				x = x + y;
				break l1;
			}
		}
		
//		while (true) {
//			/////
//			continue;	// стр 55
//		}

		int		z[] = new int[]{10,20,30};
		int 	sum = 0;

		for (int index = 0; index < z.length; index++) {
			sum += z[index];
		}
		
		for (int item : z) {
			sum += item;
		}
		
		switch (x) {
			case 0: case 2:	y = 10;	break; 
			case 1:		y = 20;	break;
			default : 	y = 30;
		}
		
		HelloWorld.main(args);
		
		return;
	}
}
