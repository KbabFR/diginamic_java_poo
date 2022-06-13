package maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		
		List<Pays> listPays = new ArrayList<>();
		Collections.addAll(listPays, new Pays("France", 65, "Europe"), new Pays("Allemagne", 80, "Europe"), new Pays("Belgique", 10, "Europe"),
				new Pays("Russie", 150, "Asie"), new Pays("Chine", 1400, "Asie"),
				new Pays("Indonesie", 220, "Oceanie"), new Pays("Australie", 65000000, "Oceanie"));
		
		HashMap<String, Integer> continents = new HashMap<String, Integer>();
		
		for (Pays pays : listPays) {
			if(!continents.containsKey(pays.getContinent()))
				continents.put(pays.getContinent(), 1);
			else
				continents.replace(pays.getContinent(), continents.get(pays.getContinent()) + 1);
		}
		
		Iterator<String> keysIte = continents.keySet().iterator();
		while(keysIte.hasNext()) {
			String key = keysIte.next();
			System.out.println(key + " est constitué de " + continents.get(key) + " pays");
		}

	}

}
