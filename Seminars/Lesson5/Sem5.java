package Seminars.Lesson5;

import java.util.*;

public class Sem5 {


    public static void main(String[] args) {


//    1.Создать словарь, ключи индекс а значение случайное число. Вывести пары ключ -  значение в консолью

//        Map<Integer,Integer> dict = new HashMap<>();
//        Random random=new Random();
//        for (int i = 0; i < 9; i++) {
//            dict.put(i,random.nextInt(0,100));
//        }
//        System.out.println(dict);


//    2.Создать словарь, ключи индекс а значение случайное число. Вывести в консоль ключ -  значение тех пар у которых значение кратно трём

        Map<Integer,Integer> dict = new HashMap<>();
        Random random=new Random();
        for (int i = 0; i < 25; i++) {
            dict.put(i,random.nextInt(0,100));
        }
        System.out.println(dict);
//        get() - получение значения по указанному ключу
        for (int i = 0; i < dict.size(); i++) {
            if (dict.get(i)%3==0) System.out.println(dict.get(i));
        }


        for (int i: dict.keySet()) if (dict.get(i)%3==0) System.out.println(i+" - "+dict.get(i));

//     3.Создать два словаря, ключи обеих словарей случайное число, значения первого словаря мужские имена а второго женские.
//     Вывести сумму значений тех пар словарей у которых совпал ключ.

        Map<Integer,String> dict1 = new HashMap<>();
        Map<Integer,String> dict2 = new HashMap<>();

        dict1.put(random.nextInt(0, 10), "Евгений");
        dict1.put(random.nextInt(0, 10), "Петр");
        dict1.put(random.nextInt(0, 10), "Алексей");
        dict1.put(random.nextInt(0, 10), "Андрей");
        dict1.put(random.nextInt(0, 10), "Александр");
        System.out.println(dict1);

        dict2.put(random.nextInt(0, 10), "Евгения");
        dict2.put(random.nextInt(0, 10), "Анастасия");
        dict2.put(random.nextInt(0, 10), "Елизавета");
        dict2.put(random.nextInt(0, 10), "Мария");
        dict2.put(random.nextInt(0, 10), "Екатерина");
        System.out.println(dict2);

        for (int i: dict1.keySet()) {

            if(dict2.containsKey(i)){
                System.out.println(dict1.get(i)+" "+dict2.get(i));
            }
        }


//        4.Создать словарь, ключ индекс а значение это случайное число. Вывести пары ключ и квадрат значения

        Map<Integer,Integer> dict4 = new HashMap<>();
        Random random4=new Random();
        for (int i = 0; i < 9; i++) {
            dict4.put(i,random4.nextInt(0,10));
        }
        System.out.println(dict4);
        for (int i: dict4.keySet()
             ) {
            System.out.println(i+" >> "+dict4.get(i)*dict4.get(i));
        }

//        5.Реализовать предыдущие задание без использования цылов!))
        Map<Integer,Integer> dict5 = new HashMap<>();
        Random random5=new Random();
        for (int i = 0; i < 9; i++) {
            dict5.put(i,random5.nextInt(0,10));
        }
        System.out.println(dict5);

        dict5.forEach((key,value) -> System.out.println(key+"="+value*value));

//        6.Реализовать предыдущие задание без использования цклов и forEach!))
        Map<Integer,Integer> dict6 = new HashMap<>();
        Random random6=new Random();
        for (int i = 0; i < 9; i++) {
            dict6.put(i,random6.nextInt(0,10));
        }
        System.out.println(dict6);
        dict6.replaceAll((key,value) -> value*value);
        System.out.println(dict6);
        dict6.compute(1,(key,value) -> value!=null ? value+1:0);
        System.out.println(dict6);
        dict6.computeIfAbsent(10,  value -> value+100);
        System.out.println(dict6);
        dict6.merge(1, 10, (old, newV) -> old+newV);
        System.out.println(dict6);
    }
}
