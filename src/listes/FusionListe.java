package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		
		// listes donné dans le TP
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		// remettre <String> entre les diamant(<>) n'est pas obligatoire du moment qu'il y est a la déclaration
		List<String> liste3 = new ArrayList<>();
		
		// Utilisation de ForEach intégré au List
		// On peut le traduire de cette manière:
		// Dans liste1, pour chaque couleur -> je fais: dans liste3 j'ajoute la couleur.
		liste1.forEach(couleur -> liste3.add(couleur));
		// Exactement la meme chose avec liste2
		liste2.forEach(couleur -> liste3.add(couleur));
		
		
		System.out.println("NOUS SOMMES LES POWER-RANGERS !");
		// on utilise la même méthode pour écrire les couleurs
		liste3.forEach(couleur -> System.out.println("FORCE " + couleur + " !!!"));

	}

}
