package aula7;

public class TiposPrimitivosTest {

	public static void main(String[] args) {
		byte b = (byte) 777;
		System.out.println("byte=" + b);
		short s = 777;
		System.out.println("short=" + s);
		int i = 777;
		System.out.println("int=" + i);
		long l = 777999999999999999l;
		System.out.println("" + l);
		float f = 777.77777f;
		System.out.println("float=" + f);
		double d = 77789374837.38473847d;
		System.out.println("double=" + d);
		char c = 'C';
		System.out.println("char=" + c);
		boolean verdade = true;
		if (verdade) {
			String teste2 = "2";
			System.out.println(Integer.parseInt(teste2));
			f=(float)d;
			System.out.println(f);
			String teste = "c";
			Integer.parseInt(teste);
		}

	}

}
