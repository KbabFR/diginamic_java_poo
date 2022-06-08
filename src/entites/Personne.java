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
	
	public void afficherNom() {
		System.out.println(nom.toUpperCase() + " " + prenom);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public AdressePostale getDomicile() {
		return domicile;
	}

	public void setDomicile(AdressePostale domicile) {
		this.domicile = domicile;
	}
	
	
	
	
	
}
