package geometrie;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		// Création du tableau
		ObjetGeometrique[] tabObjGeo = new ObjetGeometrique[3];
		tabObjGeo[0] = new Cercle(5);
		tabObjGeo[1] = new Rectangle(4, 3);
		tabObjGeo[2] = new Carre(2);
		
		// Pour chaque forme dans le tableau d'ObjetGeometrique, afficher le toString
		for(ObjetGeometrique forme : tabObjGeo) {
			System.out.println(forme.toString());
		}
	}

}
