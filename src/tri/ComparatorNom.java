package tri;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville>{

	@Override
	public int compare(Ville ville1, Ville ville2) {
		return ville1.getName().compareTo(ville2.getName());
	}

}
