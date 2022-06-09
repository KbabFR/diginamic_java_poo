package fr.diginamic.banque.entites;

public abstract class Operation {
	
	String dateOperation;
	float montantOperation;
	
	// Constructeur
	public Operation(String dateOperation, float montantOperation) {
		super();
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}

	
	//---------------Getters/Setters-------------
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
	//-------------------------------------------


	@Override
	public String toString() {
		return " dateOperation=" + dateOperation + ", montantOperation=" + montantOperation;
	}
	
	//Methode abstraite
	public abstract String getType();
	
	
}
