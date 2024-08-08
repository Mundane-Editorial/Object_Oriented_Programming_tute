package Pillars_of_OOPS.Inheritence.Multiple_Inheritance;

class A{
    void show(){
        System.out.println("Class A show");
    }
}

class B extends A{
    void show(){
        System.out.println("Class B show");
    }
}

class C extends B{
    void show(){
        System.out.println("Class C show");
    }
}

//class D extends B, C{            // error : cannot extend multiple classes
//    void show(){
//        System.out.println("Class D show");
//    }
//}

public class Multiple_Inheritance {
    public static void main(String[] args) {
//        D obj = new D();
//        obj.show(); //here's the ambiguity : now the compiler is confused that which show() of a class will be executed
    }
}


 //   >>>>>>>>   THIS PROGRAM IS AN EXAMPLE OF MULTIPLE INHERITANCE THEREFORE, THIS CODE HAS ERRORS    <<<<<<<<<<

// ALTHOUGH, THIS AMBIGUITY CAN BE FIXED USING INTERFACES.