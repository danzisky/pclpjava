package Tema7.Ex3;

import java.util.Hashtable;

class HSet extends Hashtable<Object, Object> {
    @Override
    public synchronized boolean add(Object value) {
        if (containsKey(value)) {
            return false;
        } else {
            put(value, value);
            return true;
        }
    }

    @Override
    public synchronized Object remove(Object key) {
        return super.remove(key);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        boolean first = true;
        for (Object key : keySet()) {
            if (!first) {
                result.append(", ");
            }
            result.append(key);
            first = false;
        }
        result.append("}");
        return result.toString();
    }
}
