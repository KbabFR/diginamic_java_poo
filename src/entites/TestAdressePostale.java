package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
	AdressePostale monAdresse = new AdressePostale(20, "rue du Berger", "34000", "Montpellier");
	System.out.println(monAdresse);
	
	AdressePostale diginamic = new AdressePostale(40, "rue Louis L�pine", "34470", "P�rols");
	System.out.println(diginamic);
	}
}
