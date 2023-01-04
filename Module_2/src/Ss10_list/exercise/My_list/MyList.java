package Ss10_list.exercise.My_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object data[];

    public MyList() {
        data = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        data = new Object[capacity];
    }
    public void add(int index, E e) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) data[i + 1] = data[i];
        data[index] = e;
        size++;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    public void clear() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    public int getSize() {
        return size;
    }
    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i]))
                return true;
        return false;
    }

    public E get(int index) {
        checkIndex(index);
        return (E) data[index];


    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }

   public int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i])) return i;
        return -1;
    }
    public E remove(int index) {
        checkIndex(index);

        E e = (E) data[index];

        // Shift data to the left
        for (int j = index; j < size - 1; j++)
            data[j] = data[j + 1];

        data[size - 1] = null; // This element is now null

        // Decrement size
        size--;
        return e;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1) result.append(", ");
        }

        return result.toString() + "]";
    }
    public java.util.Iterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements java.util.Iterator {
        private int current = 0; // Current index

        public boolean hasNext() {
            return (current < size);
        }

        public E next() {
            return (E) data[current++];
        }

        public void remove() {
            MyList.this.remove(current);
        }
        public int size() {
            return size;
        }
    }
}
