package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        System.out.println(random.nextInt(100));

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

        List<String> myList = new ArrayList<>();
        myList.add("Котик");
        myList.add("Пёсик");
        myList.add("Червячок Кирилл");
        myList.add("Капибара");

        myList.add(1, "Слоник");

        myList.set(4, "Улиточка Даниил");

        //code


        System.out.println(myList);

//        System.out.println(myList.size());
//
//
//        System.out.println(myList);


    }

}
