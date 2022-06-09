package fr.diginamic.banque.entites;

public class Credit extends Operation {

	// Constructeur
	public Credit(String dateOperation, float montantOperation) {
		super(dateOperation, montantOperation);
	}

	@Override
	public String getType() {
		return "CREDIT";
	}

	@Override
	public String toString() {
		return getType() + super.toString();
	}

	
	
	
}
