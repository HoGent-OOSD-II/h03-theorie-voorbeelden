package domein;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAccept { 
    public static void main(String args[]) 
    { 
    	// Consumer om een geheel getal te printen
        Consumer<Integer> display = a -> System.out.println(a); // <1>
  
        // Voer accept() uit a.h.v. display (Consumer-instantie)
        display.accept(10); 
        
    	List<Integer> list = new ArrayList<Integer>(); 
        list.add(2); 
        list.add(1); 
        list.add(3); 
              
        // Consumer om een lijst van gehele getallen te printen
        Consumer<List<Integer>> displayList = a -> System.out.println(a);

        // Voer accept() uit a.h.v. displayList (Consumer-instantie)
        displayList.accept(list); 
  
        // Consumer die elk element in een lijst verdubbelt
        Consumer<List<Integer>> multiplyElementsByTwo = a -> { 
            for (int i = 0; i < a.size(); i++) 
                a.set(i, 2 * a.get(i)); 
        }; 
        
        // Samengestelde Consumer: verdubbel elk element in de lijst en 
        // druk elk element af op het scherm
        multiplyElementsByTwo.andThen(displayList).accept(list); // <2>
    } 
} 
