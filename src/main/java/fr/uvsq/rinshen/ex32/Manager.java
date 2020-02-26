package fr.uvsq.rinshen.ex32;

public class Manager extends Employe {
	int nb_employes;
	
	public Manager() {
		super();
		nb_employes=0;
	}

	public int calcul_salaire_manager( ){ 
		return calcul_salaire_base()+nb_employes*100;
	}
}
