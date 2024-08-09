package Interface;

interface Car{
    void start();
}

class ElectricCar implements Car{
    public void start(){
        System.out.println("Electric car start function");
    }
}

class DieselCar implements Car{
    public void start(){
        System.out.println("Diesel car start function");
    }
}

public class Interface_tute {
    public static void main(String[] args) {
        Car tesla = new ElectricCar();  // object making rule for electric class : Interface_name Obj_name = new Class_name();
        Car SUV = new DieselCar();
        tesla.start();
        SUV.start();
    }
}
