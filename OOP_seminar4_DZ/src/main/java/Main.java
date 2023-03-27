import DynamicArray.DynamicArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = new Integer[] {1, 2, 3, 4};
        DynamicArray<Integer> dynamicIntArray = new DynamicArray<>(intArray);
        System.out.println("Initial dynamicIntArray: " + Arrays.toString(dynamicIntArray.array));

        // Insert new element to the Integer array
        dynamicIntArray.insert(5);
        System.out.println("After insert new element to dynamicIntArray: " + Arrays.toString(dynamicIntArray.array));

        // Delete element from the Integer array
        dynamicIntArray.delete(2);
        System.out.println("After delete element at index 2 from dynamicIntArray: " + Arrays.toString(dynamicIntArray.array));

        // Delete all occurrences of an element from the Integer array
        dynamicIntArray.delete(2);
        System.out.println("After delete all occurrences of 2 from dynamicIntArray: " + Arrays.toString(dynamicIntArray.array));

        // Double array
        Double[] doubleArray = new Double[] {1.1, 2.2, 3.3, 4.4};
        DynamicArray<Double> dynamicDoubleArray = new DynamicArray<>(doubleArray);
        System.out.println("Initial dynamicDoubleArray: " + Arrays.toString(dynamicDoubleArray.array));

        // Insert new element to the Double array
        dynamicDoubleArray.insert(5.5);
        System.out.println("After insert new element to dynamicDoubleArray: " + Arrays.toString(dynamicDoubleArray.array));

        // Delete element from the Double array
        dynamicDoubleArray.delete(2);
        System.out.println("After delete element at index 2 from dynamicDoubleArray: " + Arrays.toString(dynamicDoubleArray.array));

        // Delete all occurrences of an element from the Double array
        dynamicDoubleArray.delete(2.2);
        System.out.println("After delete all occurrences of 2.2 from dynamicDoubleArray: " + Arrays.toString(dynamicDoubleArray.array));
    }
}
