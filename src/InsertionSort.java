/**
 * Created by Brandon Markwalder on 4/4/2017.
 * InsertionSort Algorithm from Introduction to Algorithms, 3rd Edition (MIT Press)
 */
public class InsertionSort {

    private int [] array;

    public void sort(int[] arrayIn){
        setArray(arrayIn);
        insertionSort(array);
    }

    private void setArray(int [] arrayIn){
        array = arrayIn;
    }

    private void insertionSort (int[] array) {

        for (int j = 2; j < array.length; j++) {
            int key = array[j];
            int i = j-1;

            while (i > 0 & array[i] > key) {
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = key;
        }
    }

    public static void main(String[] args) {

        int[] array = {1,4,3,2,6};

        InsertionSort is = new InsertionSort();
        is.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
