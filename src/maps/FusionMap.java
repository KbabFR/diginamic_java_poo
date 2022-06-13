package maps;

import java.util.HashMap;
import java.util.Iterator;

public class FusionMap {

	public static void main(String[] args) {
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		
		// Création map3
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		Iterator<Integer> keysIte = map1.keySet().iterator();
		while(keysIte.hasNext()) {
			Integer key = keysIte.next();
			map3.put(key, map1.get(key));
		}
		
		keysIte = map2.keySet().iterator();
		while(keysIte.hasNext()) {
			Integer key = keysIte.next();
			map3.put(key, map2.get(key));
		}
		
		keysIte = map3.keySet().iterator();
		while(keysIte.hasNext()) {
			Integer key = keysIte.next();
			System.out.println(map3.get(key));
		}
	}

}
