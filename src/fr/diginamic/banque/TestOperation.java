package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;

public class TestOperation {

	public static void main(String[] args) {
		
		// Création du tableau
		Operation[] tabOperation = new Operation[4];
		tabOperation[0] = new Debit("5 juin", 38.87F);
		tabOperation[1] = new Debit("hier", 20.5F);
		tabOperation[2] = new Credit("demain", 1269);
		tabOperation[3] = new Debit("tu sais quand", 1000000);
		//montant du solde
		float montant = 0;
		
		// pour chaque operation dans le tableau tabOperation
		for(Operation operation : tabOperation) {
			// afficher l'operation
			System.out.println(operation.toString());
			
			// Si l'operation est un débit
			if(operation.getType().equals("DEBIT"))
				montant -= operation.getMontantOperation(); // on soustrait le debit
			
			// Sinon si l'operation est un Crédit
			else if(operation.getType().equals("CREDIT"))
				montant += operation.getMontantOperation(); // on ajoute le credit
			
			// OPTIONNEL Sinon il y a une erreur car l'operation n'est pas reconu comme un debit ou credit
			else
				System.err.print("Pas le bon type pour cette Operation" + operation); // erreur
		}
		// affichage du solde
		System.out.println("le montant totale est de : " + montant);
		
	}

}
