package Method_overloading;

public class overloading {

    int sum(int a, int b){      //changing number of arguments
        return a+b;
    }

    int sum(int a, int b, int c){  //changing number of arguments
        return a+b+c;
    }

    String sum(String a, String b){  //changing datatypes of arguments
        return a+b;
    }

    public static void main(String[] args) {
        overloading obj = new overloading();

        System.out.println(obj.sum(5,9));
        System.out.println(obj.sum(4,6,8));
        System.out.println(obj.sum("hello ", "world"));
    }
}
