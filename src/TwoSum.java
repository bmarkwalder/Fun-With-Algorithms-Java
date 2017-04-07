/**
 * Created by Brandon Markwalder on 4/4/2017.
 * Assuming an array is sorted, show that in O(n) time it can be decided if the array
 * contains two distinct elements x and y such that x + y = target
 */

public class TwoSum {

    public static boolean twoSumRec (int[] array, int i, int j, int target) {

        if (i < j) {
            if (array[i] + array[j] == target) {
                return true;
            }
            else if (array[i] + array[j] < target) {
                return twoSumRec(array, i+1, j, target);
            }
            else {
                return twoSumRec(array, i, j-1, target);
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        System.out.println(twoSumRec(array, 0, array.length-1, 7)); //True test case
        System.out.println(twoSumRec(array, 0, array.length-1, 10)); //False test case

    }
}
