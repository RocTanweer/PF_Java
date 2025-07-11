package ds.array;

public class ArrayOps {
    private final int[] array;
    private int currentSize;

    public ArrayOps(int arraySize, int[] initialValue) {
        currentSize = initialValue.length;

        if (currentSize > arraySize) {
            throw new IllegalArgumentException("Initial array exceeds given array size");
        }

        array = new int[arraySize];

        copyArray(initialValue, 0, array, 0, currentSize);
    }

    public void print() {
        System.out.print("[");

        for (int i = 0; i < currentSize; i++) {
            if (i == currentSize - 1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public void insert(int value, int pos) {
        if (currentSize == array.length) {
            System.out.println("Array is full");
            return;
        }

        if (pos < 0 || pos > currentSize) {
            throw new IllegalArgumentException("Invalid position");
        }

        for (int i = currentSize; i > pos; i--) {
            array[i] = array[i - 1];
        }

        array[pos] = value;

        currentSize++;
    }

    public void delete(int pos) {
        if (currentSize == 0) {
            System.out.println("Array is empty");
            return;
        }

        if (pos < 0 || pos >= currentSize) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }

        for (int i = pos; i < currentSize - 1; i++) {
            array[pos] = array[pos + 1];
        }

        currentSize--;
    }

    private static void copyArray(int[] srcArr, int srcPos, int[] destArr, int destPos, int length) {
        if (srcArr == null || destArr == null) {
            throw new NullPointerException();
        }

        if (srcPos < 0 || destPos < 0) {
            throw new IndexOutOfBoundsException();
        }

        if ((srcPos + length > srcArr.length) || (destPos + length > destArr.length)) {
            throw new IndexOutOfBoundsException();
        }

        if (length == 0) {
            return;
        }

        if (length < 0) {
            throw new IllegalArgumentException();
        }

        if (srcArr == destArr && srcPos < destPos && srcPos + length > destPos) {
            // copy backward
            for (int i = srcPos + length - 1; i >= srcPos; i--) {
                destArr[destPos + (i - srcPos)] = srcArr[i];
            }
        } else {
            // copy forward
            for (int i = srcPos; i < srcPos + length; i++) {
                destArr[destPos++] = srcArr[i];
            }
        }
    }

    public void printAllSubArrays() {
        for (int i = 0; i < currentSize; i++) {

            for (int j = i; j < currentSize; j++) {

                System.out.print("[");

                for (int k = i; k <= j; k++) {
                    if (k != j) {
                        System.out.print(array[k] + ", ");
                    } else {
                        System.out.print(array[k] + "]");
                    }
                }

                System.out.println("\n");
            }

        }
    }

}
