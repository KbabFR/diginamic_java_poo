package listes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestListString {

	public static void main(String[] args) {
		
		List<String> villes = Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");
		
		String villeMax = "";
		for (String ville : villes) {
			if(ville.length() > villeMax.length())
				villeMax = ville;
		}
		System.out.println("La ville avec le plus grand nombre de caractère est : " + villeMax);
		
			
	}

}
