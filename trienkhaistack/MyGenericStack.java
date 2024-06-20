package trienkhaistack;

import java.util.LinkedList;

public class MyGenericStack<T> {
    public LinkedList<T> stack;
    public MyGenericStack() {
        stack = new LinkedList<>();
    }
    public void push(T t) {
        stack.addFirst(t);
    }
    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.removeFirst();
    }
    public int size() {
        return stack.size();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }

}
