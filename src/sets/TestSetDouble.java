package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		
		Set<Double> doubleSet = new HashSet<>();
		doubleSet.add(1.5);
		doubleSet.add(8.25);
		doubleSet.add(-7.32);
		doubleSet.add(13.3);
		doubleSet.add(-12.45);
		doubleSet.add(48.5);
		doubleSet.add(0.01);
		
		
		Iterator<Double> iter = doubleSet.iterator();
		Double maxNum = Double.MIN_VALUE;
		Double minNum = Double.MAX_VALUE;
		while(iter.hasNext()) {
			Double num = iter.next();
			System.out.println(num);
			if(num > maxNum)
				maxNum = num;
			if(num < minNum)
				minNum = num;
		}
		System.out.println("Plus grande valeur: "+ maxNum);
		System.out.println("Plus petite valeur: "+ minNum);
		doubleSet.remove(minNum);
		System.out.println("Nouveau set");
		iter = doubleSet.iterator();
		while(iter.hasNext()) {
			Double num = iter.next();
			System.out.println(num);
		}
		
	}

}
