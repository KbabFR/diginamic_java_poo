package listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {

	public static void main(String[] args) {

		// Instanciation de la liste list
		List<Integer> list = new ArrayList<>();
		
		// remplissage de la liste par les nombres de 1 à 100
		for(int i = 1; i < 101; i++) {
			list.add(i);
		}
		
		// Affiche le nombre d'élément dansla liste list
		System.out.println(list.size());

	}

}
