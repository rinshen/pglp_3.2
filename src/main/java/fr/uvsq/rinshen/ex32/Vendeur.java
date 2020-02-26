package fr.uvsq.rinshen.ex32;

public class Vendeur extends Employe {
	private int commission;
	
	public Vendeur() {
		super();
		commission=50;
	}
	
	public int calcul_salaire_vendeur( ){ 
		return calcul_salaire_base()+commission;
	}
}
