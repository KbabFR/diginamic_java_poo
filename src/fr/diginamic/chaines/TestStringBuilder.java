package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		System.out.println("d�but du test StringBuilder");
		
		long debut = System.currentTimeMillis();
		
		StringBuilder build = new StringBuilder();
		
		for (int i = 1; i < 100001; i++) {
			build.append(i);
		}
		String sb = build.toString();
		
		long fin = System.currentTimeMillis();
		
		System.out.println(String.format("Temps �coul� en milisecondes en utilisant le StringBuilder : %s \n", fin - debut));
		
		System.out.println("d�but du test avec +");
		debut = System.currentTimeMillis();
		
		String str = new String();
		
		for (int i = 1; i < 100001; i++) {
			str += i;
		}
		
		fin = System.currentTimeMillis();
		
		System.out.println(String.format("Temps �coul� en milisecondes en utilisant la concat�nation + : %s", fin - debut));

	}

}
