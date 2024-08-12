package Pillars_of_OOPS.Polymorphpism;

class Bank{
    void interest(){
        System.out.println("5.25% interest");
    }
}

class SBI extends Bank{
    @Override
    void interest(){
        System.out.println("6.25% interest");
    }
}

class YesBank extends Bank{
    @Override
    void interest(){
        System.out.println("7.25% interest");
    }
}

public class Method_Overriding_polymorphism {
    public static void main(String[] args) {
        Bank obj = new Bank();
        SBI obj1 = new SBI();
        YesBank obj2 = new YesBank();
        obj.interest();
        obj1.interest();
        obj2.interest();
    }
}
