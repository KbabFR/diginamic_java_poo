package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTri {

	public static void main(String[] args) {
		
		// Instatiation of listCity
		List<Ville> listVille = new ArrayList<>();
		//ajout de toutes les villes
		Collections.addAll(listVille, new Ville("Nice", 343000), new Ville("Carcasonne", 47800), new Ville("Narbonne", 53400), new Ville("Lyon", 484000), new Ville("Foix", 9700), new Ville("Pau", 77200), new Ville("Marseille", 850700), new Ville("Tarbes", 40600));
		System.out.println("Villes triée par ordre d'habitant croissant :");
		Collections.sort(listVille, new ComparatorHabitant());
		listVille.forEach(ville -> System.out.println(ville.toString()));
		System.out.println("\n Villes triée par ordre alphabétique :");
		Collections.sort(listVille, new ComparatorNom());
		listVille.forEach(ville -> System.out.println(ville.toString()));

	}

}
