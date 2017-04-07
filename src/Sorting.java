/**
 * Created by Brandon Markwalder on 4/4/2017.
 * Various Sorting Algorithms from Introduction to Algorithms, 3rd Edition (MIT Press)
 */
public class Sorting {

    public static void insertionSort (int[] array) {

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
        insertionSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
