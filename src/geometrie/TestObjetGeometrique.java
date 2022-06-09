package geometrie;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		ObjetGeometrique[] tabObjGeo = new ObjetGeometrique[2];
		tabObjGeo[0] = new Cercle(5);
		tabObjGeo[1] = new Rectangle(4, 3);
		
		for(ObjetGeometrique forme : tabObjGeo) {
			System.out.println(forme.toString());
		}
	}

}
