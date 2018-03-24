package exerciocios;

public class PopulaArray {

	public Cerveja[] populaArray() {
		Cerveja[] cervejas = { new Cerveja("Golde Caroulus Van den Kayse BLeu", "Black Ale", 70, 79, "Belga"),
				new Cerveja("Antartica", "Pilsen", 10, 79, "Brasileira"),
				new Cerveja("Boehmia", "Pilsen", 10, 79, "Brasileira"),
				new Cerveja("Duvel", "Golden Ale", 10, 79, "Holandesa"),
				new Cerveja("Walls", "Quadrupel", 30, 79, "Brasileira"),
				new Cerveja("Colorado", "Golden Ale", 10, 79, "Brasileira"),
				new Cerveja("Hoegarden", "Golden Ale", 10, 79, "Belga"), new Cerveja("Cerpa", "Pilsen", 10, 79, ""),
				new Cerveja("Amstel", "Pilsen", 10, 79, "Holandesa"),
				new Cerveja("Heineken", "Pilsen", 10, 59, "Holandesa") };
		return cervejas;
	}

	public Cerveja[] buscaCervejaTipoPilsen(Cerveja[] cervejas) {
		Cerveja[] cervejasTemp = new Cerveja[cervejas.length];
		for (int i = 0; i < cervejas.length; i++) {
			if (cervejas[i].getTipo().contains("Pilsen"))
				cervejasTemp[i] = cervejas[i];
		}
		return cervejasTemp;
	}
	public int contaCervejasBelgas(Cerveja[] belgas) {
		int count=0;
		for (Cerveja cerveja : belgas) {
			if(cerveja.getNacionalidade().equalsIgnoreCase("Belga"))
				count++;
		}
		return count;
	}
	public double calculoTotalCervejasCompraMes(Cerveja[] cervejas) {
		double valorTotal=0;
		for (Cerveja cerveja : cervejas) {
				valorTotal+=cerveja.getValor();
		}
		return valorTotal;
	}

}
