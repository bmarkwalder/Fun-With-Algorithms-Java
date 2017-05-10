/**
 * Created by Brandon Markwalder on 4/5/2017.
 * Given an array A[1..n] of distinct positive integers that is not (necessarily) sorted,
 * and a positive integer t, determine whether or not there are three distinct elements
 * x,y,z in A such that x + y + z = t. Solve the problem in O(n^2) time.
 */

public class ThreeSum {

    private int [] array;
    private int start;
    private int end;
    private int target;

    public boolean sumEqualTarget(int [] arrayIn, int startIn, int endIn, int targetIn){

        setArray(arrayIn);
        setStart(startIn);
        setEnd(endIn);
        setTarget(targetIn);
        return(threeSum(array, start, end, target));
    }

    private void setArray(int [] arrayIn){
        array = arrayIn;
    }

    private void setStart(int startIn){
        start = startIn;
    }

    private void setEnd(int endIn){
        end = endIn;
    }

    private void setTarget(int targetIn){
        target = targetIn;
    }

    private boolean threeSum(int[] array, int i, int j, int target) {
        MergeSort sorter = new MergeSort();
        sorter.sort(array);
        TwoSum decideIf = new TwoSum();
        for (i = 0; i < array.length; i++) {

            if (decideIf.sumEqualTarget(array, i+1 , array.length-1, (target-array[i])) == true) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ThreeSum decideIf = new ThreeSum();
        int[] array = {5,3,1,2,4};
        System.out.println(decideIf.sumEqualTarget(array, 0, array.length - 1, 12));
        System.out.println(decideIf.sumEqualTarget(array, 0, array.length - 1, 13));
    }
}
