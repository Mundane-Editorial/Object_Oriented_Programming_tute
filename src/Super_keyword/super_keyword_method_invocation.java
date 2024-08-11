package Super_keyword;

class animals{
    void eat(){
        System.out.println("eating : animal");
    }
}

class dogs extends animals{
    void eat(){
        System.out.println("eating : animal = dog");
    }

    void bark(){
        System.out.println("barking dog");
    }

    void work(){
        super.eat();
        bark();
    }
}

public class super_keyword_method_invocation {
    public static void main(String[] args) {
        dogs obj = new dogs();
        obj.work();
    }
}
