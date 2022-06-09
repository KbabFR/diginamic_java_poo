package geometrie;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		// Cr�ation du tableau
		ObjetGeometrique[] tabObjGeo = new ObjetGeometrique[2];
		tabObjGeo[0] = new Cercle(5);
		tabObjGeo[1] = new Rectangle(4, 3);
		
		// Pour chaque forme dans le tableau d'ObjetGeometrique, afficher le toString
		for(ObjetGeometrique forme : tabObjGeo) {
			System.out.println(forme.toString());
		}
	}

}
