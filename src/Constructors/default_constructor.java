package Constructors;

class Students1{
    int id;
    int age;

    Students1(){
        System.out.println("default contructor");
    }
}

public class default_constructor {
    public static void main(String[] args) {
        Students1 obj = new Students1();
    }
}
