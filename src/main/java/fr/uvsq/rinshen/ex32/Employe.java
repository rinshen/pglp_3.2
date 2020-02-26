package fr.uvsq.rinshen.ex32;

class Employe {
	private int base;
	private int age;
	
	public Employe() {
		base=1500;
		age=0;
	}

	public int calcul_salaire_base( ){ 
		return base+20*age;
	}
}

