package domein;

import java.util.function.Predicate;

public class PredicateTest { 
	public static void pred(int number, Predicate<Integer> predicate) 
    { 
		// Voer de Predicate uit op het eerste argument number
		if (predicate.test(number)) { 
			System.out.printf("De voorwaarde op nummer %d is waar.%n", number);
        } else {
        	System.out.printf("De voorwaarde op nummer %d is fout.%n", number);
        }
    } 
	
    public static void main(String[] args) 
    { 
        // Predicate met voorwaarde "< 18"
        Predicate<Integer> lessThan18 = i -> (i < 18);	// <1>
  
        // Test de voorwaarde  
        System.out.println(lessThan18.test(10)); //output: true
        
        // Predicate met voorwaarde "> 12"
        Predicate<Integer> greaterThan12 = (i) -> i > 12;
        
        // Test de voorwaarde  
        System.out.println(greaterThan12.test(10)); //output: false
        
        // Samengestelde predicate met AND
        Predicate<Integer> lessThan18AndGreaterThan12 = lessThan18.and(greaterThan12);
       
        boolean result = lessThan18AndGreaterThan12.test(16); // <2>
        System.out.println(result);  //output: true
  
        // Negatie van een Predicate
        boolean result2 = lessThan18AndGreaterThan12.negate().test(16); // <3>
        System.out.println(result2); //output: false
        
        //een Predicate doorgeven als argument aan een functie
        pred(10, (i) -> i > 7);
        //output: De voorwaarde op nummer 10 is waar.
        
        // Samengestelde predicate met OR
        Predicate<String> longerThan10 = t -> t.length() > 10;
        Predicate<String> containsLetterA = p -> p.contains("A"); 
        String containsA = "And"; 
        
        boolean outcome = longerThan10.or(containsLetterA).test(containsA); // <4>
        System.out.println(outcome); //output: true
    } 
} 
