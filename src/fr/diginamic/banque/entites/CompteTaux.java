package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

	float tauxRemuneration;

	public CompteTaux(int numCompte, float solde, float tauxRemuneration) {
		super(numCompte, solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	public float getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(float tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public String toString() {
		return super.toString() + " CompteTaux [tauxRemuneration=" + tauxRemuneration + "]";
	}
	
	
	
}
