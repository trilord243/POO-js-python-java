package Java;

 class Car {
    Integer id;
    String plate;
    Account driver;
    Integer passenger;
    String license;
    public Car(String license,Account driver){
        this.license=license;
        this.driver=driver;

    }

    void printData(){
        System.out.println("driver: "+driver);
        System.out.println("passenger: "+passenger);
    }

    
}
