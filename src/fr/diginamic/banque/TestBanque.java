package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;

public class TestBanque {

	public static void main(String[] args) {

		Compte[] tabCompte = new Compte[2];
		tabCompte[0] = new Compte(123, 30F);
		tabCompte[1] = new CompteTaux(456, 5000000.99F, 50.00F);

		for(int i = 0; i < tabCompte.length; i++) {
			System.out.println(tabCompte[i].toString());
		}
		
		System.out.println(tabCompte[0].getNumCompte());
		
	}

}
