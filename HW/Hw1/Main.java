package HW.Hw1;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int i = new Random().nextInt(2001);

        int n = countBit(i);

        int[] m1 = findMultiples(n, i, Short.MAX_VALUE);
        System.out.println("m1 = " + Arrays.toString(IntStream.of(m1).boxed().toArray()));

        int[] m2 = findNonMultiples(n, Short.MIN_VALUE, i);
        System.out.println("m2 = " + Arrays.toString(IntStream.of(m2).boxed().toArray()));
    }

    private static int countBit(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number >>= 1;
        }
        return count;
    }

    private static int[] findMultiples(int n, int start, int end) {
        int[] result = new int[(end - start) / n + 1];
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (i % n == 0) {
                result[index++] = i;
            }
        }
        return Arrays.copyOf(result, index);
    }

    private static int[] findNonMultiples(int n, int start, int end) {
        int[] result = new int[Math.abs(Short.MIN_VALUE) / n + Math.abs(end) / n];
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (i % n != 0) {
                result[index++] = i;
            }
        }
        return Arrays.copyOf(result, index);
    }
}