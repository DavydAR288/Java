package HW.Hw3;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                numbers.add(i);
            }

            numbers.removeIf(n -> n % 2 == 0); // удаление четных чисел

            int min = numbers.get(0);
            int max = numbers.get(0);
            int sum = 0;
            for (Integer num : numbers) {
                if (num < min)
                    min = num;
                if (num > max)
                    max = num;
                sum += num;
            }

            double average = (double) sum / numbers.size(); // нахождение среднего значения

            System.out.println("Список без четных чисел: " + numbers);
            System.out.println("Минимальное значение: " + min);
            System.out.println("Максимальное значение: " + max);
            System.out.println("Среднее значение: " + average);
    }
}
