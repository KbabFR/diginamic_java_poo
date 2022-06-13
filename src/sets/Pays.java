package sets;

public class Pays {

	private String name;
	private int nbPeople;
	private float pibHab;
	
	public Pays(String name, int nbPeople, float pibHab) {
		super();
		this.name = name;
		this.nbPeople = nbPeople;
		this.pibHab = pibHab;
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
	

	public float getPibHab() {
		return pibHab;
	}
	
	
}
