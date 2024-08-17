package Modifier_in_java;

class student{
    String name;
    private int age;  //  this variable can be used within the class only
    protected int roll_no;   // this variable can't be access outside this package


    void info(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll_no);
    }
}

public class access_modifiers {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Rahul";
//        s1.age = 20;  can't be accessed as it is set to private
        s1.roll_no = 4521;

        s1.info();
    }
}
