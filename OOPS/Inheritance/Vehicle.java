class Main {
    public static void main(String[] args){
        Car c= new Car();
        System.out.println(c.brand);
        System.out.println(c.model);
        c.start();
        c.drive();
     
    } 
}

class Vehicle{
    String brand="Car's brand is maruti suzuki";

    void start(){
        System.out.println("Vehicle started");
    }    
}

class Car extends Vehicle{
    String model= "Car's Model is dzire";

    void drive(){
        System.out.println("Car is driving");
    }
}