package lesson7;

public class Exercises {
	public static final String	step1 = "abcde";
	public static final String	step2 = "12345";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Make "AbCdE" from step1;
		
		String	result = "";
		
		for (int index = 0; index < step1.length(); index++) {
			result += (index % 2 == 0) 
					? step1.substring(index,index+1).toUpperCase() 
					: step1.substring(index,index+1).toLowerCase();
		}
		System.err.println("result="+result);
		
		StringBuilder	sb = new StringBuilder();
		
		for (int index = 0, maxIndex = step1.length(); index < maxIndex; index++) {
			sb.append((index % 2 == 0) 
					? Character.toUpperCase(step1.charAt(index)) 
					: Character.toLowerCase(step1.charAt(index))
			);
		}
		System.err.println("result="+sb.toString());

		char[]			temp = step1.toCharArray();
		
		for (int index = 0, maxIndex = temp.length; index < maxIndex; index++) {
			temp[index] = (index % 2 == 0) 
					? Character.toUpperCase(temp[index]) 
					: Character.toLowerCase(temp[index]);
		}
		System.err.println("result="+new String(temp));
		
		// 2. Make "54321" from step2;
		System.err.println("result="+new StringBuilder(step2).reverse());
	}

}
