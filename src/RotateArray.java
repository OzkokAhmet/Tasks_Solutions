import java.util.Arrays;

public class RotateArray {
    /*

        Problem: Rotate an array of n elements to the right by k steps. For example, with
        n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. How many different
        ways do you know to solve this problem?

     */

    public static void main(String[] args) {
        int [] a1 = {1,2,3,4,5,6,7};
        int k = 3;

        rotateArray(a1,k);
    }

    private static void rotateArray(int[] arr,  int steps) {

        int[] arr2 = new int[arr.length];

        for (int i = 0; i < steps; i++) {
            arr2[i]=arr[arr.length-steps+i];

        }

        for (int i = steps; i <arr.length ; i++) {
            arr2[i]= arr[i-steps];
        }

        System.out.println(Arrays.toString(arr2));

    }
}
