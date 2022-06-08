package entites;

public class Personne {

	String nom;
	String prenom;
	AdressePostale domicile;
	
	public Personne(String nom, String prenom, AdressePostale domicile) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.domicile = domicile;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", domicile=" + domicile + "]";
	}
	
	
	
	
	
}
