package Tema7.Ex2;

class MyStack {
    private Array stack;

    public MyStack() {
        stack = new Array();
    }

    public void push(Integer x) {
        stack.addElement(x);
    }

    public Integer pop() {
        if (stack.getSize() > 0) {
            return stack.remove(stack.getSize() - 1);
        } else {
            return null;
        }
    }
}