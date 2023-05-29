package Tema7.Ex2;

public class Main {
    public static void main(String[] args) {
        SortedArray sortedArray = new SortedArray();
        sortedArray.addElement(5);
        sortedArray.addElement(3);
        sortedArray.addElement(8);
        System.out.println("Sorted Array: " + sortedArray);

        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Popped element: " + stack.pop());
    }
}