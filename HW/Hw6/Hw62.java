package HW.Hw6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hw62 {
    public static void main(String[] args) {

        MyHashSet<Integer> set1 = new MyHashSet<>();

        set1.add(345);
        set1.add(23);
        set1.add(1);
        set1.add(12);
        set1.add(4);

        System.out.println(set1.get(0));
        System.out.println(set1.get(2));

        System.out.println(set1.toString());

        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()) System.out.println(it.next());

    }
}
    class MyHashSet<E> {
        private final List<E> set;

        public MyHashSet() {
            set = new ArrayList<>();
        }

        public void add(E element) {
            if (!set.contains(element)) {
                set.add(element);
            }
        }

        public E get(int index) {
            if (index < 0 || index >= set.size()) {
                throw new IndexOutOfBoundsException();
            }
            return set.get(index);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (E element : set) {
                sb.append(element.toString());
                sb.append(", ");
            }
            if (set.size() > 0) {
                sb.delete(sb.length() - 2, sb.length());
            }
            sb.append("]");
            return sb.toString();
        }

        public Iterator<E> iterator() {
            return set.iterator();
        }
    }

