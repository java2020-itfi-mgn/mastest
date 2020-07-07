package lesson5;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object		obj = "vassya", obj1 = obj;
		
		if (obj instanceof String) {
			obj = obj.toString() + '!';				
					// new StringBuilder().append(obj.toString).append('!').toString();
		}
		
		obj = 5;	// Integer.valueOf(5);
		
		if (obj instanceof Integer) {
			obj = ((Integer)obj).intValue() + 5;	// Integer.valueOf(((Integer)obj).intValue() + 5);
		}
		
		Byte		b = Byte.valueOf((byte)100);	// new Byte((byte)100);	// byte	
		Short		s = Short.valueOf((short)100);	// new Short((short)100);	// short
		Integer		i = new Integer(100);		// int
		Long		l = new Long(100);			// long
		Float		f = new Float(120.0f);		// float
		Double		d = new Double(120.0);		// double
		Number		n = d;	
		
		Character	c = new Character('?');		// char
		Boolean		bb = Boolean.valueOf(true);	// new Boolean(true);		// boolean
		
		Integer		iii = 10,			// Integer.valueOf(10) 
					jjj = 20, 			// Integer.valueOf(20)
					kkk = iii + jjj;	// Integer.valueOf(iii.intValue() + jjj.intValue())
		
		System.err.println(obj.getClass());
		
	}
}
