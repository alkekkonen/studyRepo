package study.Lesson1;


public class Car {

    //Создаём поля класса
    private int maxSpeed;

    private String model;

    //Полем класса может быть другой класс
    private Driver carDriver = new Driver();

    //Создаём методы класса

    //Едем
    public void ride(){
        System.out.println("Вжжжж");
    }

    //Достаём имя водителя, если оно есть
    public String getDriverName() {

        String name;
        if (carDriver.getName() != null)
            name = carDriver.getName();
        else throw new RuntimeException ("Name is null");
        return name;
    }

    //Достаём самого водителя целиком
    public Driver getCarDriver() {
        return carDriver;
    }

    //Сажаем нового водителя
    public void setCarDriver(Driver driver) {
        this.carDriver = driver;
    }

}
