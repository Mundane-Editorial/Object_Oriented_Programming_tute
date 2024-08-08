package Pillars_of_OOPS.Inheritence.Single_Inheritance;

class Employee{
    void salary(){
        System.out.println("salary = 80000");

    }
}

class hr extends Employee{
    void bonus(){
        System.out.println("Bonus = 8000");
    }
}

public class Company_Inheritance {
    public static void main(String[] args) {
        hr obj = new hr();
        obj.bonus();
        obj.salary();
    }
}
