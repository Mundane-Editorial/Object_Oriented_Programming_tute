package Constructors;

class Students2 {
    String name;
    int age;
    int id;

    // Parameterized constructor
    Students2(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Copy constructor
    Students2(Students2 copied) {
        this.name = copied.name;
        this.age = copied.age;
        this.id = copied.id;
    }
}

class copy_constructor {
    public static void main(String[] args) {
        // Create an object using the parameterized constructor
        Students2 original = new Students2("Sonu", 21, 4024);

        // Create a copy of the original object using the copy constructor
        Students2 copied = new Students2(original);

        // Print values of the copied object
        System.out.println("Copied Student Name: " + copied.name);
        System.out.println("Copied Student Age: " + copied.age);
        System.out.println("Copied Student ID: " + copied.id);
    }
}
