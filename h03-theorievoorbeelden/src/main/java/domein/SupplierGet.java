package domein;

import java.util.function.Supplier;

public class SupplierGet { 
    public static void main(String args[]) 
    { 
  
        // Deze Supplier geeft een random getal tussen 0 en 1 terug
        Supplier<Double> randomValue = Math::random;  // OF () -> Math.random(); 
  
        // Print een random waarde m.b.v. get()
        System.out.println(randomValue.get()); 
    } 
} 
