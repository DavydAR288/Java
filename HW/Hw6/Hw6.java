package HW.Hw6;

import java.util.*;

public class Hw6 {
    private HashMap<String, Set<String>> phoneBook;

    public Hw6() {
        phoneBook = new HashMap<>();
    }

    public void add(String name, String phone) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new HashSet<>());
        }
        phoneBook.get(name).add(phone);
    }

    public void print() {
        List<Map.Entry<String, Set<String>>> list =
                new ArrayList<>(phoneBook.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue().size() - o1.getValue().size());
        for (Map.Entry<String, Set<String>> entry : list) {
            System.out.printf("%s: %s%n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        Hw6 phoneBook = new Hw6();
        phoneBook.add("Дмитрий", "+7-495-655-08-97");
        phoneBook.add("Мария", "+7-499-612-33-77");
        phoneBook.add("Дмитрий", "+7-999-945-00-75");
        phoneBook.add("Мария", "+7-495-655-08-97");
        phoneBook.add("Дмитрий", "+7-909-012-88-66");
        phoneBook.add("Татьяна", "+7-999-123-23-32");
        phoneBook.add("Тимур", "+7-495-122-45-11");
        phoneBook.print();
    }
}