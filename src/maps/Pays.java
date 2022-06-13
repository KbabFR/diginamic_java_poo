package maps;

public class Pays {
	
	private String name;
	private int nbPeople;
	private String continent;
	
	public Pays(String name, int nbPeople, String continent) {
		super();
		this.name = name;
		this.nbPeople = nbPeople;
		this.continent = continent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNbPeople() {
		return nbPeople * 1000000;
	}

	public void setNbPeople(int nbPeople) {
		this.nbPeople = nbPeople;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	

}
