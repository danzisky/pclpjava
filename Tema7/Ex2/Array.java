package Tema7.Ex2;

import java.util.Collections;
import java.util.Vector;

class Array {
    private Vector<Integer> vector;

    public Array() {
        vector = new Vector<>();
    }

    public void addElement(Integer x) {
        vector.add(x);
    }

    public void addElement(Integer x, int pos) {
        if (pos >= 0 && pos <= vector.size()) {
            vector.add(pos, x);
        }
    }

    public int get(int pos) {
        if (pos >= 0 && pos < vector.size()) {
            return vector.get(pos);
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public int getSize() {
        return vector.size();
    }

    public boolean remove(Integer x) {
        return vector.remove(x);
    }

    public Integer remove(int pos) {
        return vector.remove(pos);
    }

    public String toString() {
        String result = "{";
        for (int i = 0; i < vector.size(); i++) {
            result += get(i) + ", ";
        }
        result += "}";
        return result;
    }

    public void sort() {
        Collections.sort(vector);
    }
}
