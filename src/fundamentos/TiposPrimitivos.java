package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		boolean bo1 = false;
		boolean bo2 = true;
		System.out.printf("%b %b \n", bo1, bo2);
		
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050';
		System.out.printf("%c %c %c \n", c1, c2, c3);
		
		byte b1 = 127;
		byte b2 = -127;
		short s1 = 32767;
		short s2 = -32767;
		int i1 = 2_100_000;
		int i2 = -2_100_000;
		long l1 = 9_000_000_000_000_000L;
		long l2 = -9_000_000_000_000_000L;
		System.out.printf("%d %d %d %d \n", b1, s1, i1, l1);
		System.out.println(Integer.toBinaryString(b1));
		System.out.println(Integer.toBinaryString(s1));
		System.out.println(Integer.toBinaryString(i1));
		System.out.println(Long.toBinaryString(l1));
		
		float f = 3.1416f;
		double d = 2.45;
		System.out.printf("%f %.2f", f, d);
	}

}
