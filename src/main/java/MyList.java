import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }


    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        for (int i = size + 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            elements[i] = elements[i+1];
        }
        size--;
    }

    public int getSize() {
        return this.size;
    }

//    @Override
//    public E clone() {
//
//    }

    public boolean contains(E element) {
        for (int i=0;i< size;i++) {
            if (element.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E element) {
        for (int i=0; i < size;i++) {
            if (element.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E element) {
        return contains(element);
    }

    public E get(int i) {
            if (i < 0 || i >= size) {
                throw new IndexOutOfBoundsException("index " + i + " out of bounds");
            }
            return (E) elements[i];
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

}

