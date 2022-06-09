package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String dateOperation, float montantOperation) {
		super(dateOperation, montantOperation);
	}

	@Override
	public String getType() {
		return "DEBIT";
	}
	
	@Override
	public String toString() {
		return getType() + super.toString();
	}
	
}
