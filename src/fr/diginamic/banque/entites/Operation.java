package fr.diginamic.banque.entites;

public abstract class Operation {
	
	String dateOperation;
	float montantOperation;
	
	public Operation(String dateOperation, float montantOperation) {
		super();
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}

	public String getDateOperation() {
		return dateOperation;
	}



	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}



	public float getMontantOperation() {
		return montantOperation;
	}



	public void setMontantOperation(float montantOperation) {
		this.montantOperation = montantOperation;
	}



	@Override
	public String toString() {
		return " dateOperation=" + dateOperation + ", montantOperation=" + montantOperation;
	}
	
	public abstract String getType();
	
	
}
