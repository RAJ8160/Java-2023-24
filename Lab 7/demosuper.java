class Vehical{
    int no_of_sites;
    double average;
    public Vehical(){
        System.out.println("This is vehical's defualt consructer");
    }
    public Vehical(int i){
        System.out.println("This is vehical's peramiteraised consructer");
    }
}
class Car extends Vehical{
    public Car(){
        super();
        System.out.println("This is Casr's default Constructer");
    }
    public Car(int i){
        super(2);
        System.out.println("This is Casr's perametarised Constructer");
    }
}
class Bike extends Vehical{
    public Bike(){
        super();
        System.out.println("This is Bike's default Constructer");
    }
    public Bike(int i){
        super(3);
        System.out.println("This is Bike's perametarised Constructer");
    }
}
public class demosuper {
    public static void main(String[] args) {
        Vehical v1=new Vehical(2);
        Car c1=new Car();
        Bike b1=new Bike();
    }
}