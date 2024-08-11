// to use the variable of a parent class

package Super_keyword;

class animal{
    String color = "white";
}

class dog extends animal{
    String color = "black";
    void printcolor(){
        System.out.println(color);  //prints the color of dog class
        System.out.println(super.color);  // prints the color of parent class i.e, animal class
    }
}

public class super_keyword_variable{
    public static void main(String[] args) {
        dog obj = new dog();
        obj.printcolor();
    }
}

