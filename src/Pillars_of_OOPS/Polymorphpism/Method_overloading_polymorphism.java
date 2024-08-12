package Pillars_of_OOPS.Polymorphpism;

class Overloading_Polymorphism{
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void sum(String a, String b){
        System.out.println(a+b);
    }
}

public class Method_overloading_polymorphism {
    public static void main(String[] args) {
        Overloading_Polymorphism obj = new Overloading_Polymorphism();
        obj.sum(5,6);
        obj.sum(0,9,7);
        obj.sum("Hello ", "world!!!");
    }
}
