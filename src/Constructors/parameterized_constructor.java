package Constructors;

class Students{
    int id ;
    int age ;

    Students(int id, int age){
        this.id = id;
        this.age = age;
        System.out.println("constructor called");
    }
}

public class parameterized_constructor {
    public static void main(String[] args) {
        Students obj = new Students(5,19);
    }
}
