package ArrayList.bag;

import java.util.HashMap;
import java.util.Map;

// mengh
public class bag<E> {
    private Map<E, Integer> map;

    public bag() {
        map = new HashMap<>();
    }

    public void add(E element) {
        Integer count = map.get(element);
        if (count == null) {
            count = 0;
        }
        map.put(element, count + 1);
    }

    public void remove(E element) {
        Integer count = map.get(element);
        if (count == null) {
            return;
        }
        if (count == 1) {
            map.remove(element);
        } else {
            map.put(element, count - 1);
        }
    }

    public int count(E element) {
        Integer count = map.get(element);
        return (count == null) ? 0 : count;
    }

    public boolean contains(E element) {
        return map.containsKey(element);
    }

    public int size() {
        int size = 0;
        for (int count : map.values()) {
            size += count;
        }
        return size;
    }

    public void clear() {
        map.clear();
    }
}