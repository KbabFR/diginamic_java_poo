package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CreationetManipulationMap {

	public static void main(String[] args) {

		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(69, "Lyon");
		mapVilles.put(59, "Lilles");
		mapVilles.put(33, "Bordeaux");

		Set<Integer> departements = mapVilles.keySet();
		for(Integer departement : departements) {
			System.out.println(departement);
		}
		
		Iterator<String> valuesIte = mapVilles.values().iterator();
		while(valuesIte.hasNext()) {
			String value = valuesIte.next();
			System.out.println(value);
		}
		
		System.out.println("la taille de la map est : " + mapVilles.size());
	}

}
