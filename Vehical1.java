abstract  class Vehical1{
    int tires;
     abstract void run();

}
class Car extends Vehical1
{
    void run(){
        System.out.println("Car is run");
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.run();
        Bike b1 = new Bike();
        b1.run();
    }
}
class Bike extends Vehical1
{
    void run(){
        System.out.println("Bike is run");
    }
}