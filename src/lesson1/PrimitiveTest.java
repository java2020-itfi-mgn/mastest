package lesson1;

public class PrimitiveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte	b1 = 10, b2 = 20, b3 = (byte) (b1 + b2);
		long	L1 = 10, L2 = 20, L3 = 12_345_678_90_12_34L;
		float	f1 = 10.0f;
		double	d1 = 10.0D;
		char	c1 = 10, c2 = '\020', c3 = '\n', c4 = '\u2340';
		int		i1 = 0x24FF, i2 = 0b110111, i3 = 077;
		
		boolean	bool1 = true, bool2 = false;

		// < <= > >= == !=
		System.err.println(f1 > 0 ? ">" : "<");
	}
}
