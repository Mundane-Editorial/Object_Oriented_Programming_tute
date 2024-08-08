package Pillars_of_OOPS.Inheritence.Multilevel_Inheritance;

class A{
    void methodA(){
        System.out.println("Method of A");
    }
}

class B extends A{
    void methodB(){
        System.out.println("Method of B");
    }
}

class C extends B{
    void methodC(){
        System.out.println("Method of C");
    }
}

public class multilevel_example {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
