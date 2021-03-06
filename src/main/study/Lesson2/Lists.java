package study.Lesson2;

import java.util.*;


public class Lists {

    public static void main(String[] args) {

//        Объявляем коллекцию, использця полиморфизм (делаем List стрингов со свойствами его наследника ArrayList)
//        При объявлении указываем тип объектов коллекции
        List<String> myList = new ArrayList<>();

        //Объявляем LinkedList
        List<String> myLinkedList = new LinkedList<>();

        //Добавляем в лист элементы по имени
        myList.add("Котик");
        myList.add("Пёсик");
        myList.add("Червячок Кирилл");
        myList.add("Капибара");

        //Используем реоегруженный метод add() — делаем вставку по индексу в конкретное место
        // (вставляем значение на место второго элемента, у всех последующих элементов увеличивается индекс)
        myList.add(1, "Зелёный слоник");

        //заменяем элемент с указанным индексом
        myList.set(4, "Улиточка Даниил");

        //Достаём элемент по индексу
        myList.get(3);

        //Достаём индекс элемента
        myList.indexOf("Червячок Кирилл");

        //Проверяем, есть ли в списке значение (true/false)
        myList.contains("Зелёный слоник");

        //Узнаём размер списка
        myList.size();

        //Очищаем лист
        myList.clear();


    }

}
