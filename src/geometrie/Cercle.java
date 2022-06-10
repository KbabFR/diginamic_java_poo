package geometrie;

public class Cercle implements ObjetGeometrique {
	
	double rayon;
	
	// Constructeur
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	@Override
	public double perimetre() {
		return rayon*2*Math.PI;
	}

	@Override
	public double surface() {
		return rayon*rayon*Math.PI;
	}

	
	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + ", perimetre()=" + perimetre() + ", surface()=" + surface() + "]";
	}
	

}
