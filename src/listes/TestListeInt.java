package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args){
		
		// Instanciation du tableau
		List<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);
		
		// affiche tous les element de la liste
		System.out.print("Voici tous les nombre de la liste : ");
		list.forEach(num ->System.out.print(num + " "));
		// je rajoute un println pour retourner a la ligne que je rempli d'un "\n" qui fait un retour a la ligne lui aussi afin de créer un espace
		System.out.println("\n");
		
		// affiche la taille de la liste avec .size() qui retourne le nombre d'élément dans la liste
		System.out.println("Voici la taille de la liste : " + list.size() + "\n");

		// affiche la plus grande valeur de la liste
		System.out.println("Voici la plus gande valeur de la liste : " + Collections.max(list) + "\n");
		
		// affiche et supprime la plus petite valeur de la liste
		// on pourrait utiliser Collections.min(list) pour afficher comme au dessus mais comme
		// nous voulont aussi la supprimer nous allons voir autrement
		int minIndex = 0; // index de la plus petite valeur qu'on initialise a 0
		// puis on va comparer chaque element de la liste et
		// si l'element actuel est plus petit on retien son index dans la liste
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i) < list.get(minIndex))
				minIndex = i;
		}
		// On affiche la plus petite valeur en la retrouvant avec son index
		System.out.println("Voici la plus petite valeur de la liste : " + list.get(minIndex) + "\n");
		// puis on le supprime a l'aide de son index
		list.remove(minIndex);
		
		
		
		list.forEach(num -> num = Math.abs(num));// num devient sa valeur absolue ex. valeur absolu |-4| = 4; |-99| = 99, |2| = 2
		
		// affiche tous les element de la liste
		System.out.print("Voici tous les nombre de la liste : ");
		list.forEach(num ->System.out.print(num + " "));
		
	}
}
