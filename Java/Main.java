package Java;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car car= new Car("AMQ123", new Account("Andres","1234567890"));

        
        System.out.println(car.passenger);
        car.printData();
       
        
        

 }

   
}