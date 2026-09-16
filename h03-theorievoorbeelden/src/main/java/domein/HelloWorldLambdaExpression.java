package domein;

import java.util.function.Function;

public class HelloWorldLambdaExpression {
  
	@FunctionalInterface // <1>
    interface HelloWorld {
		public void greetSomeone(String someone);
    }
  
    public void sayHello() {
        
        HelloWorld dutchGreeting = (String someone) -> { // <2>
        	System.out.println("Hallo " + someone); 
        };
        
        dutchGreeting.greetSomeone("Pete");
    }

    public static void main(String[] args) {
        HelloWorldLambdaExpression myApp = new HelloWorldLambdaExpression();
        myApp.sayHello();
    }            
}
