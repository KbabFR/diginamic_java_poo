package geometrie;

public class Carre implements ObjetGeometrique {
	
	float longueur;

	public Carre(float longueur) {
		super();
		this.longueur = longueur;
	}

	@Override
	public double perimetre() {
		return longueur * 4;
	}

	@Override
	public double surface() {
		return longueur * longueur;
	}

	@Override
	public String toString() {
		return "Carre [longueur=" + longueur + ", perimetre()=" + perimetre() + ", surface()=" + surface() + "]";
	}
	
	

}
