package HW.Hw4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> userList = new ArrayList<>();

        while (true) {
            System.out.println("Введите ФИО или введите ПРОБЕЛ для выхода:");
            String name = scanner.nextLine();

            if (name.equals(" ")) {
                break;
            }

            System.out.println("Введите возраст:");
            int age = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            System.out.println("Введите пол (м/ж):");
            String gender = scanner.nextLine();

            User user = new User(name, age, gender);
            userList.add(user);
        }

        System.out.println("Вывод данных:");
        for (User user : userList) {
            System.out.println(user);
        }

        System.out.println("Введите 1 для сортировки по возрасту,");
        System.out.println("введите 2 для сортировки по возрасту и полу:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            sortAge(userList);
        } else if (choice == 2) {
            sortAgeGender(userList);
        }

        System.out.println("Вывод отсортированного списка:");
        for (User user : userList) {
            System.out.println(user);
        }

        scanner.close();
    }

    public static void sortAge(List<User> userList) {
        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return Integer.compare(u1.getAge(), u2.getAge());
            }
        });
    }

    public static void sortAgeGender(List<User> userList) {
        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                int ageCompare = Integer.compare(u1.getAge(), u2.getAge());
                if (ageCompare == 0) {
                    return u1.getGender().compareTo(u2.getGender());
                } else {
                    return ageCompare;
                }
            }
        });
    }
}