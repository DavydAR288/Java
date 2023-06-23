package HW.Hw6;

import java.util.*;

public class Hw6 {
    public static void main(String[] args) {
        Set<Integer> set1 = new Set();
        System.out.println(set1.add(555));
        System.out.println(set1.remove(123));
        System.out.println(set1.size());
        System.out.println(set1.isEmpty());

        System.out.println(set1.toStringg());

        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        };

    }
}


class Set<E>{
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

    public boolean isEmpty(){
        return set.isEmpty();
    }

    public Iterator<E> iterator() {
        return set.keySet().iterator();
    }

    public String toStringg() {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (E i : set.keySet()) {
            sb.append(i.toString());
            sb.append(", ");
        }

        if (set.size() > 0) {
            sb.delete(sb.length() - 2, sb.length()); // удаление последней запятой и пробела
        }
        sb.append("]");
        return sb.toString();
    }



}