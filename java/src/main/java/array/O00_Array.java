package array;

public class O00_Array {

    public int length;
    public int size;
    public int[] array;

    public O00_Array(int size) {
        array = new int[size];
        length = 0;
        this.size = size;
    }

    public void insert(int element) {
        if (length < size) {
            array[length] = element;
            length++;
        }
    }

    /***
     * Insert an element at given position
     * Here parameter position is zero indexed
     * @param element
     * @param position
     */
    public void insert(int element, int position) {
        if (length < size && position < size) {
            for (int i = length; i >= position; i--) {
                array[i] = array[i - 1];
            }
            array[position] = element;
            length++;
        }

    }

    public int search(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void delete(int element) {
        int position = search(element);
        if (position != -1) {
            int i;
            for (i = position + 1; i < length; i++) {
                array[i - 1] = array[i];
            }
            array[i - 1] = 0;
            length--;
        }
    }

    public boolean isSorted() {
        for (int i = 1; i < length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    public void traverse() {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
