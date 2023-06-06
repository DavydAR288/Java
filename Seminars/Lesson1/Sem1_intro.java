package Seminars.Lesson1;

import java.util.Random;
import java.util.Scanner;

public class Sem1_intro {

    public static void main(String[] args) { // psvm сокращение, либо main

        // примитивные типы - 1 число, без инициализации равны 0

        int i = 875;
        int k = 't'; // хранит число индекса буквы
        float f = .543f;
        long l;
        double d;
        short sh;
        byte b;
        char ch = 'g'; // хранит индекс буквы
        boolean b1 = false;

        // ссылочные типы

        int[] ints = new int[12]; // массив самая быстрая структура хранения данных
        Random random = new Random(); //конструктор
        for (int j = 0; j < ints.length; j++) {
            ints[j] = random.nextInt(0, 2000); // от 0 до 1999
        }

        int[] tmp = new int[ints.length + 3];
        for (int j = 0; j < ints.length; j++) tmp[j] = ints[j];
        ints = tmp; // создаем ссылку на объем памяти tmp
        // мусорщик удаляет объекты в памяти без ссылок

        i = 0;
        for (int j = 0, tm = 12; j < 12; j++, tm -= 23, i += j) ;  // | или || ускоренное или, с & && аналогично
        System.out.println(i);

        if (b1) System.out.println(b1);

        String str = "Привет Мир!"; // стринг имутабельный - неизменяемый, строку изменить нельзя
        str += "?"; // создание новой строки со старой ссылкой на объем памяти
        System.out.println(str.toLowerCase()); // метод возвращает новую строку, не изменяя исходную
        System.out.println(str);
        System.out.println(str.substring(1, str.length() - 1));
        System.out.println(
                "HI!"
                        .toLowerCase()
                        .repeat(3)
                        .length());
        Scanner scanner = new Scanner(System.in); // ввод с консоли
        String s;
        do {
            s = scanner.nextLine();
            System.out.println(s);
        } while (!s.equals("q"));

    } // ctrl+alt+l форматирование кода


}
