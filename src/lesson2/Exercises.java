package lesson2;

public class Exercises {
	static int[]	content = {10,22,-3,17,21,14};	// {22,-3,17,21,14, 10} 
	
	public static void main(String[] args) {
		int	avg = 0;
		// TODO Calculate average on content
//		boolean	needContinue;
//		
//		do {
//			needContinue = false;
		
			for (int index = 0; index < content.length-1; index++) {
//				if (content[index] > content[index+1]) {
					content[index] 		^= content[index+1];
					content[index+1] 	^= content[index];
					content[index] 		^= content[index+1];
					
//					needContinue = true;
//				}
			}
//		} while (needContinue);
		
		System.err.println("Avg="+java.util.Arrays.toString(content));
	}
}
