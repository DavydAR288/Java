package Seminars.Lesson6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Objects;

public class Sem6 {
    public static void main(String[] args) {
        Set<Integer> set1 = new Set();
        set1.add(555);
        set1.remove(123);
        set1.size();
        set1.isEmpty();

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


}