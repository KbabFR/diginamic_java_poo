package geometrie;

public class Rectangle implements ObjetGeometrique {
	
	double longueur;
	double largeur;

	// Constructeur
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double perimetre() {
		return longueur*2 + largeur*2;
	}

	@Override
	public double surface() {
		return longueur*largeur;
	}

	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + ", perimetre()=" + perimetre()
				+ ", surface()=" + surface() + "]";
	}
	

}
