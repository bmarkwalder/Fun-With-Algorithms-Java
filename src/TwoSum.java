/**
 * Created by Brandon Markwalder on 4/4/2017.
 * Assuming an array is sorted, show that in O(n) time it can be decided if the array
 * contains two distinct elements x and y such that x + y = target
 */

public class TwoSum {

    private int [] array;
    private int start;
    private int end;
    private int target;

    public boolean sumEqualTarget(int [] arrayIn, int startIn, int endIn, int targetIn){

        setArray(arrayIn);
        setStart(startIn);
        setEnd(endIn);
        setTarget(targetIn);
        return(twoSumRec(array, start, end, target));
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

    private boolean twoSumRec (int[] array, int i, int j, int target) {

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

        TwoSum decideIf = new TwoSum();
        int[] array = {1,2,3,4,5};
        System.out.println(decideIf.sumEqualTarget(array, 0, array.length-1, 7)); //True test case
        System.out.println(decideIf.sumEqualTarget(array, 0, array.length-1, 10)); //False test case

    }
}
