package study;


public class Car {
    private int maxSpeed;

    private String model;

    private Driver carDriver = new Driver();

    public void ride(){
        System.out.println("Вжжжж");
    }

    public String getDriverName() {

        String name;
        if (carDriver.getName() != null)
            name = carDriver.getName();
        else throw new RuntimeException ("Name is null");
        return name;
    }

    public Driver getCarDriverDone() {
        return carDriver;
    }

    public void setCarDriverDone(Driver driverDone) {
        this.carDriver = driverDone;
    }

}
