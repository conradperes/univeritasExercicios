package exerciocios;

public class Main {

	public static void main(String[] args) {
		PopulaArray popula= new PopulaArray();
		Cerveja[] cervejas = popula.populaArray();
		Cerveja[] buscaCervejaTipoPilsen = popula.buscaCervejaTipoPilsen(cervejas);
		for (Cerveja cerveja : buscaCervejaTipoPilsen) {
			if(cerveja!=null)
				System.out.println("Cervejas Pilsen= "+cerveja.getNome());
		}
		
		System.out.println("Conta cervejas belgas:"+popula.contaCervejasBelgas(cervejas));
		System.out.println("Total de cachaça gasto:"+popula.calculoTotalCervejasCompraMes(cervejas));
	}

}
