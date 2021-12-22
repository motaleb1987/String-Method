package oop;

public class WrapperClass {
    /*
    * Wrapper class
    * Autoboxing
    * Unboxing
    **/

    public static void main(String[] args) {
        // Primitive -> Object

        int x=35;
        Integer y= Integer.valueOf(x);
        System.out.println("Y="+y);


        Integer z=x; // Integer.valueOf(x); [Autoboxing]
        System.out.println("Z="+z);

        System.out.println();

        // Object-> Primitive

        Integer p=new Integer("40");
        System.out.println("P="+p);

        int s=p.intValue();
        System.out.println("S="+s);

        int q=p; // p.intValue() [Unboxing]
        System.out.println("Q="+q);

    }
}
