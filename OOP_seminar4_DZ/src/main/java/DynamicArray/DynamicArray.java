package DynamicArray;

import java.util.Arrays;


public class DynamicArray<T> {
    public T[] array;
    private int length;

    // Constructors
    public DynamicArray() {
        this.length = 0;
        this.array = (T[]) new Object[0];
    }


    public DynamicArray(T[] array) {
        this.length = array.length;
        this.array = Arrays.copyOf(array, length);
    }

    // Public methods
    public void insert(T element) {
        this.length++;
        this.array = Arrays.copyOf(this.array, this.length);
        this.array[this.length - 1] = element;
    }

    public void delete(int index) {
        if (index < 0 || index >= this.length) {
            throw new IndexOutOfBoundsException("Index is out of range.");
        }
        this.length--;
        T[] newArray = Arrays.copyOf(this.array, this.length);
        System.arraycopy(this.array, 0, newArray, 0, index);
        System.arraycopy(this.array, index + 1, newArray, index, this.length - index);
        this.array = newArray;
    }

    public void delete(T element) {
        int index = indexOf(element);
        while (index != -1) {
            delete(index);
            index = indexOf(element);
        }
    }

    public Number getMin() {
        if (this.length == 0) {
            throw new IllegalStateException("The array is empty.");
        }
        T min = this.array[0];
        for (int i = 1; i < this.length; i++) {
            if (((Comparable<T>) this.array[i]).compareTo(min) < 0) {
                min = this.array[i];
            }
        }
        return (Number) min;
    }

    public Number getMax() {
        if (this.length == 0) {
            throw new IllegalStateException("The array is empty.");
        }
        T max = this.array[0];
        for (int i = 1; i < this.length; i++) {
            if (((Comparable<T>) this.array[i]).compareTo(max) > 0) {
                max = this.array[i];
            }
        }
        return (Number) max;
    }

    public Number getSum() {
        if (this.length == 0) {
            throw new IllegalStateException("The array is empty.");
        }
        Number sum = (Number) this.array[0];
        for (int i = 1; i < this.length; i++) {
            sum = sum.doubleValue() + ((Number) this.array[i]).doubleValue();
        }
        return sum;
    }

    public Number getProduct() {
        if (this.length == 0) {
            throw new IllegalStateException("The array is empty.");
        }
        Number product = (Number) this.array[0];
        for (int i = 1; i < this.length; i++) {
            product = product.doubleValue() * ((Number) this.array[i]).doubleValue();
        }
        return product;
    }

    public int indexOf(T element) {
        for (int i = 0; i < this.length; i++) {
            if (this.array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
}