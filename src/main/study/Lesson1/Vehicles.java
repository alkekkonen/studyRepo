package study.Lesson1;

public class Vehicles {
    public static void main(String[] args) {

        //Создаём объекты (экземпляры класса Car)
        Car lada = new Car();
        Car audi = new Car();
        Car fiat = new Car();

        //Создаём экземпляр водителя и даём ему новое имя
        Driver vasya = new Driver();
        vasya.setName("Вася");

        //Выводим имя дефолтного водителя
        System.out.println(lada.getDriverName());

        //Прикручиваем нового водителя
        lada.setCarDriver(vasya);

        //Проверяем, что у нам новый водитель
        System.out.println(lada.getDriverName());
    }
}
