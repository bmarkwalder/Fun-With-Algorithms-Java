/**
 * Created by Brandon Markwalder on 4/5/2017.
 * Given an array A[1..n] of distinct positive integers that is not (necessarily) sorted,
 * and a positive integer t, determine whether or not there are three distinct elements
 * x,y,z in A such that x + y + z = t. Solve the problem in O(n^2) time.
 */

public class ThreeSum {

    public static boolean threeSum(int[] array, int i, int j, int target) {
        Sorting.insertionSort(array); //Replace with Merge Sort
        for (i = 0; i < array.length; i++) {

            if (TwoSum.twoSumRec(array, i+1 , array.length-1, (target-array[i])) == true) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] array = {5,3,1,2,4};
        System.out.println(threeSum(array, 0, array.length - 1, 12)); //True test case
        System.out.println(threeSum(array, 0, array.length - 1, 13)); //False test case
    }
}
