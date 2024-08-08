package Pillars_of_OOPS.Inheritence;

class vehicle{
    double price;
    double milage;
    String color;

    void display(){
        System.out.println("price : " + price);
        System.out.println("milage : " + milage);
        System.out.println("color : " + color);

    }
}

class cars extends vehicle{
    String fuel_type;
    boolean sunroof;
    String brand;

}

class Cars_Inheritance {
    public static void main(String[] args) {
        cars car1 = new cars();
        car1.brand = "tata";
        car1.sunroof = false;
        car1.fuel_type = "petrol";
        car1.price = 750000.0;
        car1.color = "white";
        car1.milage = 16.23;

        car1.display();
        System.out.println("sunroof " + car1.sunroof);
    }
}
