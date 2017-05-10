/**
 * Created by Brandon Markwalder on 5/8/2017.
 * MergeSort Algorithm from Introduction to Algorithms, 3rd Edition (MIT Press)
 */
public class MergeSort {

    private int [] array;
    private int infinity = Integer.MAX_VALUE;

    public void sort(int[] arrayIn){
        setArray(arrayIn);
        mergeSort(array, 0, array.length-1);
    }

    private void mergeSort(int [] array, int first, int last) {
        if (first < last){
            int middle = (first + last) / 2;
            mergeSort(array, first, middle);
            mergeSort(array, (middle+1), last);
            merge(array, first, middle, last);
        }
    }

    private void merge(int[] array, int first, int middle, int last) {
        int n1 = middle - first + 1;
        int n2 = last - middle;
        int[] left = new int[n1+1];
        int[] right = new int[n2+1];

        for (int i = 0; i < n1; i++){
            left[i] = array[first+i];
        }

        for (int j = 0; j < n2; j++){
            right[j] = array[middle+j+1];
        }

        left[n1] = infinity;
        right[n2] = infinity;

        for (int i = 0, j = 0, k = first; k <= last; k++){
            if (left[i] <= right[j]) {
                array[k] = left[i++];
            }
            else{
                array[k] = right[j++];
            }
        }
    }

    private void setArray(int [] arrayIn){
        array = arrayIn;
    }

    public static void main(String[] args) {

        int[] array = {1,4,3,2,6};
        MergeSort ms = new MergeSort();
        ms.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
