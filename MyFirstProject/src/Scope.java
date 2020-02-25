
public class Scope {
	
	static int x;  // As x is declared out of the method, it is in scope to all methods
	                // i.e., any method can access x
	
    public static void main(String[] args) {
		x = 5;
		System.out.println(x);
		
		doSome();
		
		System.out.println(x);
		
	}
    
    
    static void doSome() {
    	x = 10;
    }
    static void doSomeLocally() {
    	int y = 100; // int declared inside method, it is local to this method
    }
}
