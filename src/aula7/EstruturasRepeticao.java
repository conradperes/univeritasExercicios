package aula7;

public class EstruturasRepeticao {
	
	public void executaFor() {
		System.out.println("For");
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
	public void executaWhile() {
		System.out.println("While");
		int i=0;	
		while(i<10) {
			System.out.println(i);
			i++;
		}
	}
	public void executaDoWhile() {
		System.out.println("Do While");
		int i=0;
		do {
			System.out.println(i);
			i++;
		
		}while(i<10);
	}

	public static void main(String[] args) {
		EstruturasRepeticao estruturasRepeticao = new EstruturasRepeticao();
		estruturasRepeticao.executaFor();
		estruturasRepeticao.executaWhile();
		estruturasRepeticao.executaDoWhile();

	}

}
