package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {

		Set<String> stringSet = new HashSet<>();
		stringSet.add("USA");
		stringSet.add("France");
		stringSet.add("Allemagne");
		stringSet.add("UK");
		stringSet.add("Italie");
		stringSet.add("Japon");
		stringSet.add("Chine");
		stringSet.add("Russie");
		stringSet.add("Inde");
		
		String paysMax = "";
		Iterator<String> iter = stringSet.iterator();
		while(iter.hasNext()) {
			String pays = iter.next();
			if(pays.length() > paysMax.length())
				paysMax = pays;
		}
		stringSet.remove(paysMax);
		
		iter = stringSet.iterator();
		while(iter.hasNext()) {
			String pays = iter.next();
			System.out.println(pays);
		}
		
	}

}
