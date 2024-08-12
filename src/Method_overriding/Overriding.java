package Method_overriding;

class Bank{
    public void interest(){
        System.out.println("6.50");
    }
}

class SBI extends Bank{
    @Override
    public void interest(){
        System.out.println("6.25");
    }
}

class PNB extends Bank{
    @Override
    public void interest(){
        System.out.println("7.35");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Bank obj = new Bank();
        SBI obj1 = new SBI();
        PNB obj2 = new PNB();
        obj.interest();
        obj1.interest();
        obj2.interest();
    }
}
