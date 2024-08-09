package Pillars_of_OOPS.Inheritence.Multiple_Inheritance;

interface AA{
    public void testrun();
}

interface BB{
    public void testrun();
}

class CC implements AA,BB{
    public void testrun(){    // here, public is mandatory
        System.out.println("C class run method");
    }
}
public class Multiple_inheritance_using_Interfaces {
    public static void main(String[] args) {
        CC obj = new CC();
        obj.testrun();
    }
}
