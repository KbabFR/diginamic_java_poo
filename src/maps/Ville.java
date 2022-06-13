package maps;


public class Ville implements Comparable<Ville>{

	private String name;
	private int nbPeople;
	
	
	public Ville(String name, int nbPeople) {
		super();
		this.name = name;
		this.nbPeople = nbPeople;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNbPeople() {
		return nbPeople;
	}


	public void setNbPeople(int nbPeople) {
		this.nbPeople = nbPeople;
	}

	@Override
	public int compareTo(Ville ville) {
		return this.nbPeople - ville.nbPeople;
	}

	@Override
	public String toString() {
		return name + " possède " + nbPeople + "habitants.";
	}
	
	
	
	
}
