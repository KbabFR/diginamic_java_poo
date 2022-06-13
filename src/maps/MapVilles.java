package maps;

import java.util.HashMap;
import java.util.Iterator;


public class MapVilles {

	public static void main(String[] args) {

		HashMap<String, Integer> villes = new HashMap<String, Integer>();
		villes.put("Nice", 343000);
		villes.put("Carcasonne", 47800);
		villes.put("Narbonne", 53400);
		villes.put("Lyon", 484000);
		villes.put("Foix", 9700);
		villes.put("Pau", 77200);
		villes.put("Marseille", 850700);
		villes.put("Tarbes", 40600);
		
		String villeMin = "";
		Integer minHab = Integer.MAX_VALUE;
		Iterator<String> keysIte = villes.keySet().iterator();
		while(keysIte.hasNext()) {
			String key = keysIte.next();
			if(villes.get(key) < minHab)
				villeMin = key;
		}
		villes.remove(villeMin);
		
		keysIte = villes.keySet().iterator();
		while(keysIte.hasNext()) {
			String key = keysIte.next();
			System.out.println(key);
		}
		
	}

}
