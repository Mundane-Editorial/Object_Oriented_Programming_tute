package Super_keyword;

class animal2{
    animal2(){
        System.out.println("animal2 class constructor");
    }
}

class dog2 extends animal2{
    dog2(){
        super();
        System.out.println("dogs2 is created");
    }
}

public class super_keyword_parentclass_constructor_invocation {
    public static void main(String[] args) {
        dog2 obj = new dog2();
    }
}
