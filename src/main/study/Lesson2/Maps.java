package study.Lesson2;

import java.util.*;


public class Maps {
    public static void main(String[] args) {

        //Объявляем мапу, использця полиморфизм (делаем Map со свойствами его наследника HashMap)
        //В мапе при объявлении указываем типы данных ключа и значения
        Map<Integer, String> map = new HashMap<>();

        //Складываем в мапу значания
        map.put(666, "Котик");
        map.put(null, "Пёсик");
        map.put(3, null);
        map.put(4, "Червячок Кирилл");

        //Узнаём число значений в мапе
        map.size();

        //Достаём значение по ключу
        map.get(4);

        //Кладём новое значение с ключом
        map.put(1488, "Бегемотик Дольф");

        //Удаляем объект по ключу, или по ключу и значению
        map.remove(666);
        map.remove(666, "Котик");

        //Проверяем, есть ли в мапе объект с таким ключом (true/false)
        map.containsKey(1488);

        //Проверяем, есть ли в мапе объект с таким значением (true/false)
        map.containsValue("Пёсик");

        //Чистим мапу
        map.clear();


    }
}
