package Tema7.Ex2;

class SortedArray extends Array {
    public SortedArray() {
        super();
    }

    public void addElement(Integer x) {
        int index = 0;
        while (index < getSize() && get(index) < x) {
            index++;
        }
        super.addElement(x, index);
    }
}