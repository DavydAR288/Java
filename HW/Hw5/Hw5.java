package HW.Hw5;

import java.util.*;

public class Hw5 {

    private Map<String, List<String>> phoneBook;

    public Hw5() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }
        phoneBook.get(name).add(phone);
    }

    public void print() {
        List<Map.Entry<String, List<String>>> list = new ArrayList<>(phoneBook.entrySet());
        list.sort((o1, o2) -> o2.getValue().size() - o1.getValue().size());
        for (Map.Entry<String, List<String>> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


    public static void main(String[] args) {
        Hw5 phoneBook = new Hw5();
        phoneBook.addContact("Иванов", "+7-495-456-7890");
        phoneBook.addContact("Петров", "+7-495-567-8901");
        phoneBook.addContact("Сидоров", "+7-495-678-9012");
        phoneBook.addContact("Егоров", "+7-495-789-0123");
        phoneBook.addContact("Егоров", "+7-495-890-1234");
        phoneBook.addContact("Сидоров", "+7-495-881-1452");
        phoneBook.addContact("Сидоров", "+7-495-000-0015");
        phoneBook.print();

    }
}