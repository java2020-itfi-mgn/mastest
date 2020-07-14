package lesson7;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	s = "vassya";	//
		s = "sdsd";
		
		char[]	c = new char[] {'a','b','c'};
		
		StringBuilder	sbb = new StringBuilder();
		
		String 	a = sbb.append("x=").append(10).append(',').append(22.3).append(false).toString();
		String	b = a.toUpperCase();
		
		System.err.println("x="+s);	
		// System.err.println(new StringBuilder().append("x=").append(s).toString());
		
		System.err.println("len="+s.length());
		System.err.println("is empty="+s.isEmpty());
		System.err.println("char at="+s.charAt(2));
		
		System.err.println("Index="+s.indexOf('s'));
		System.err.println("Last index="+s.lastIndexOf('s'));
		System.err.println("Index from 1="+s.indexOf('s',1));	// -1 - no substring

		System.err.println("Index="+s.indexOf("ds"));
		
		System.err.println("Starts ? "+s.startsWith("sd"));
		System.err.println("Ends ? "+s.endsWith("sd"));
		System.err.println("Contains ? "+s.contains("ds"));
		
		System.err.println("Equals ? "+s.equals("sd"));
		System.err.println("Equals ? "+s.equals("sdsd"));
		System.err.println("Equals ignore case ? "+s.equalsIgnoreCase("Sdsd"));
		

		System.err.println("Compare to ? "+s.compareTo("sd"));				// <0, ==0, >0
		System.err.println("Compare to ? "+s.compareToIgnoreCase("sd"));	// <0, ==0, >0
		
		System.err.println("Hash: "+s.hashCode());

		switch (s) {		// switch (s.hashCode())
			case "sdsd" :	//	case "sdsd".hashCode() :
							//		if (s.equals("sdsd")) {
			// BODY ----------------------------------------------					
							//		}
			case "assam" :
			default:
		}

		// mutable methods
		
		System.err.println("Substr: "+s.substring(1,3));
		System.err.println("Replace: "+s.replace('s','S')+" "+s);
		System.err.println("Replace: "+s.replace("s","")+" "+s);
		System.err.println("Upper: "+s.toUpperCase());
		System.err.println("Lower: "+s.toLowerCase());
		System.err.println("Split"+Arrays.toString("1,2,3,4,5".split("\\,")));
	
		System.err.println("Arr:"+Arrays.toString(s.toCharArray()));
		System.err.println("Str:"+new String(new char[] {'a','b','c','d','e'}));
		
		// Character ;
	}
}
