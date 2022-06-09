package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;

public class TestOperation {

	public static void main(String[] args) {
		Operation[] tabOperation = new Operation[4];
		tabOperation[0] = new Debit("5 juin", 38.87F);
		tabOperation[1] = new Debit("hier", 20.5F);
		tabOperation[2] = new Credit("demain", 1269);
		tabOperation[3] = new Debit("tu sais quand", 1000000);
		float montant = 0;
		
		for(int i = 0; i < tabOperation.length; i++) {
			System.out.println(tabOperation[i].toString());
			if("DEBIT".equals(tabOperation[i].getType()))
				montant -= tabOperation[i].getMontantOperation();
			else if("CREDIT".equals(tabOperation[i].getType()))
				montant += tabOperation[i].getMontantOperation();
			else
				System.err.print("Pas le bon type pour cette Operation" + tabOperation[i]);
		}
		System.out.println("le montant totale est de : " + montant);
		
	}

}
