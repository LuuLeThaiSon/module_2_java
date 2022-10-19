package array_list.demo;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public Object[] getElements() {
        return elements;
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size] = e;
        size++;
    }

    public E get(int index) {
        E element = null;
        if (index > 0 && index < elements.length) {
            element = (E) elements[index];
        }
        return element;
    }


}
