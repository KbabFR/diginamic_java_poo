package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {

	public static void main(String[] args) {
		
		Map<String, Integer> mapSalaires = new HashMap<>();
		mapSalaires.put("Paul", 1750);
		mapSalaires.put("Hicham", 1825);
		mapSalaires.put("Yu", 2250);
		mapSalaires.put("Ingrid", 1750);
		mapSalaires.put("Chantal", 1750);
		
		System.out.println("la taille de la map est : " + mapSalaires.size());

	}

}
