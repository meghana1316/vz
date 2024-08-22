public class StatMeth {

    
    static int count = 0;

    
    static void incrementCount() {
        count++;
        System.out.println("Count is now: " + count);
    }

   
    static void displayCount() {
        System.out.println("Current count: " + count);
    }

    
    void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        
        StatMeth.incrementCount();
        StatMeth.incrementCount();
        StatMeth.displayCount();
        
        
        StatMeth demo = new StatMeth();
        demo.instanceMethod(); 
    }
}
