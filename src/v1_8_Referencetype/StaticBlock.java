package v1_8_Referencetype;

public class StaticBlock {
    static int data = 1;
    public StaticBlock(){
        System.out.println("Static Constructor.");
    }

    static {
        System.out.println("*** First static block. ***");
        data = 3;
    }

    static {
        System.out.println("*** Second static block ***");
        data = 5;
    }

    public static int getData(){
        return data;
    }
}
