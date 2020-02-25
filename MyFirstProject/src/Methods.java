
public class Methods {
   public static void main(String[] args) {
	sayHelloWorld();
	sayHelloWorld2("Alekhya");
	int x = returnType();
	System.out.println(x);
	
	int result = square(x);
	System.out.println(result);
	// f(x) = x + x
}
   
   static int square(int x) {
	   return x * x;
   } // returns a value and takes data in
   
   static int returnType() {
	   return 5;
   } //returns int type with value 5
    
   static void sayHelloWorld2(String name) {
	   System.out.println("Hello " + name);
   } // says hello to whatever name is passed when called
   
   static void sayHelloWorld() {
	   System.out.println("Hello World");
   } // simply says "Hello World"
   
}
