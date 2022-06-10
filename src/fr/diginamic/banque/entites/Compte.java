package fr.diginamic.banque.entites;

public class Compte {
	
	private int numCompte;
	
	private float solde;
	
	// Constructor with fields
	public Compte(int numCompte, float solde) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
	}
	
	// Getters/Setters
	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", solde=" + solde + "]";
	}

	
	
	

}
