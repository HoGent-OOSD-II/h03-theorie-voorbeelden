package domein;

public class HelloWorldLocalClass {
  
	@FunctionalInterface
    private interface HelloWorld { // <1>
        public void greetSomeone(String someone);
    }
  
    public void sayHello() {
        // Local class
        class EnglishGreeting implements HelloWorld { // <2>
        	@Override
            public void greetSomeone(String someone) {
                System.out.println("Hello " + someone);
            }
        }
      
        HelloWorld englishGreeting = new EnglishGreeting(); // <3>

        // Anonymous class
        HelloWorld frenchGreeting = new HelloWorld() { // <4> 
        	@Override
            public void greetSomeone(String someone) {
                System.out.println("Salut " + someone);
            }
        };

        englishGreeting.greetSomeone("world"); // <5>
        frenchGreeting.greetSomeone("Fred");
    }

    public static void main(String[] args) {
        HelloWorldLocalClass myApp = new HelloWorldLocalClass();
        myApp.sayHello();
    }            
}
