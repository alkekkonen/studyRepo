package study;

import java.util.*;


public class Study {

    public static void main(String[] args) {

        //Объявляем массив, использця полиморфизм (делаем List стрингов с атрибутами его наследника ArrayList)
        List<String> myList = new ArrayList<>();

        //Добавляем в лист элементы по имени
        myList.add("Котик");
        myList.add("Пёсик");
        myList.add("Червячок Кирилл");
        myList.add("Капибара");

        //Используем реоегруженный метод add() — делаем вставку по индексу в конкретное место
        // (вставляем значение на место второго элемента, у всех последующих элементов увеличивается индекс)
        myList.add(1, "Слоник");

        //заменяем элемент с указанным индексом
        myList.set(4, "Улиточка Даниил");

        //Достаём элемент по индексу
        myList.get(3);

        //Проверяем, есть ли в списке значение (true/false)
        myList.contains("Слоник");


        //Очищаем список
        myList.clear();

        System.out.println(myList);

//
//        Random random = new Random();
//
//        System.out.println(random.nextInt(100));

//        Map<Integer, String> map = new TreeMap<>();
////        map.put(random.nextInt(100), "Котик");
////        map.put(null, "Пёсик");
////        map.put(3, null);
////        map.put(4, "Червячок Кирилл");
//        map.get(random.nextInt(20));
//
//        System.out.println(map.size());

//        System.out.println(map.containsKey(4));


//        System.out.println(map);


//        System.out.println(myList.size());
//
//
//        System.out.println(myList);


    }

}
