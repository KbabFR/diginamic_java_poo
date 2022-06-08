package entites;

public class TestPersonne {

	public static void main(String[] args) {

		Personne thomas = new Personne("Warin", "Thomas", new AdressePostale(20, "rue du Berger", "34000", "Montpellier"));
		System.out.println(thomas);
		thomas.nom = "Boivin";
		System.out.println(thomas);

	}

}
