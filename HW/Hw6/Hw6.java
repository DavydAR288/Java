package HW.Hw6;

import java.util.HashMap;
import java.util.Iterator;

public class Hw6 {
    public static void main(String[] args) {
        Set<Integer> set1 = new Set();
        System.out.println(set1.add(555));
        System.out.println(set1.add(14));
        System.out.println(set1.add(5));
        System.out.println(set1.add(123));
        System.out.println(set1.remove(123));
        System.out.println(set1.size());
        System.out.println(set1.isEmpty());

        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        };

        System.out.println(set1.toString());

        System.out.println(set1.get(0));
        System.out.println(set1.get(2));

    }
}


class Set<E> {
    private HashMap<E, Object> set = new HashMap<>();


    private static final Object VALL = new Object();

    public boolean add(E tell) {
        return set.put(tell, VALL) == null;
    }

    public boolean remove(E tell) {
        return set.remove(tell) == VALL;
    }

    public int size() {
        return set.size();
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public Iterator<E> iterator() {
        return set.keySet().iterator();
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (E i : set.keySet()) {
            sb.append(i.toString());
            sb.append(", ");
        }

        if (set.size() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append("]");
        return sb.toString();
    }

    public E get(int index) {
        if (index < 0 || index >= set.size()) {
            throw new IndexOutOfBoundsException();
        }
        return (E) set.get(index);
    }
}