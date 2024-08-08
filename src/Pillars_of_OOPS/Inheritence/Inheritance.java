package Pillars_of_OOPS.Inheritence;

class Parent_Class{
    void display(){
        System.out.println("Parent class method function");
    }
}

class Child_class extends Parent_Class{
    void show(){
        System.out.println("Child class method");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Child_class child1 = new Child_class();
        child1.display();    // child1 can access the methods and data members of parent class.
        System.out.println();
        child1.show();
    }
}
