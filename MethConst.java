public class MethConst {
    
    
    static int staticCount = 0;
    
    
    int instanceCount = 0;

   
    static void staticMethod() {
        staticCount++;
        System.out.println("Static Method called");
        System.out.println("Static Count: " + staticCount);
       
    }

    
    void instanceMethod() {
        instanceCount++;
        System.out.println("Instance Method called");
        System.out.println("Instance Count: " + instanceCount);
        
        staticCount++;
        staticMethod();
    }

    
    MethConst() {
        System.out.println("Constructor called");
        
        instanceCount++;
    }

    public static void main(String[] args) {
        
        MethConst.staticMethod();

        
        MethConst demo1 = new MethConst();
        demo1.instanceMethod();
        
        MethConst demo2 = new MethConst();
        demo2.instanceMethod(); 
    }
}
