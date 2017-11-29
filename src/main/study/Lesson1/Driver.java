package study.Lesson1;

public class Driver {

    //У водителя есть только имя, и оно определено по умолчанию
    private String name = "Maga";

    //Достаём имя
    public String getName() {
        return name;
    }

    //Пишем другое имя
    public void setName(String name) {
        this.name = name;
    }
}
