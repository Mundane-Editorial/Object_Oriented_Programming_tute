package Pillars_of_OOPS.Inheritence.Hierarchical_Inheritance;

class A{
    public void print(){
        System.out.println("Class A method");
    }
}

class B extends A{
    public void printb(){
        System.out.println("Class B method");
    }
}

class C extends A{
    public void printc(){
        System.out.println("Class C method");
    }
}



public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.print();

        C obj1 =  new C();
        obj1.print();
    }
}
