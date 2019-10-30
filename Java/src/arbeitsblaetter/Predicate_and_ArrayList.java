package arbeitsblaetter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;



public class Predicate_and_ArrayList {
static class IsNegative implements Predicate<Integer>{
	public boolean test(Integer x) {
		return x < 0;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> list = new ArrayList<>();

		 	list.add(12);
	        list.add(-3);
	        list.add(55);
	        list.add(-17);
	        list.add(100);
	       
	       
	        System.out.println("list: " + list);
	        
	        List<Integer> listCopy = new ArrayList<>(list);
	       
	        Predicate<Integer> filter = new IsNegative();
			
	        listCopy.removeIf(filter);
	        System.out.println("Negative entfernt: " + listCopy);
	       
	        listCopy = new ArrayList<>(list);
			listCopy.removeIf(x -> x > 0);
			System.out.println("Positive entfernt: " + listCopy);
			
			System.out.println("--------------------");
			
			Predicate<Integer> isGerade = x -> x%2 ==0;
			Predicate<Integer> isUngeradeA = x -> !isGerade.test(x);
			Predicate<Integer> isUngeradeB = isGerade.negate();
						
			System.out.println("ist 12 gerade:" + isGerade.test(12));
			System.out.println("ist 12 ungerade:" + isUngeradeA.test(12));
			System.out.println("ist 12 ungerade:" + isUngeradeB.test(12));
			System.out.println("ist 12 ungerade:" +  isGerade.negate().test(12));	
			
			
			
			
	}

}
