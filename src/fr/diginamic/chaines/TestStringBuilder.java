package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		long debut = System.currentTimeMillis();
		
		StringBuilder build = new StringBuilder();
		
		for (int i = 1; i < 100001; i++) {
			build.append(i);
		}
		
		long fin = System.currentTimeMillis();
		
		System.out.println(String.format("Temps écoulé en milisecondes en utilisant le StringBuilder : %s \n", fin - debut));
		
		debut = System.currentTimeMillis();
		
		String str = new String();
		
		for (int i = 1; i < 100001; i++) {
			str += i;
		}
		
		fin = System.currentTimeMillis();
		
		System.out.println(String.format("Temps écoulé en milisecondes en utilisant la concaténation \"+\" : %s", fin - debut));

	}

}
