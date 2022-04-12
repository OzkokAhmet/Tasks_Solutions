import java.util.Arrays;

public class ZeroToEnd {

    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 3, 5, 5, 5, 32, 1, 7};
        int num = 5;
        System.out.println("GivenNumberToEnd(nums, num) = " + Arrays.toString(GivenNumberToEnd(nums, num)));

    }

    private static int[] GivenNumberToEnd(int[] nums, int num) {
        int[] modify = new int[nums.length];
        int i = 0;
        for (int each : nums) {
            if (each != num) {

                modify[i++] = each;
            }
        }
        for (int each : nums) {
            if (each == num) {

                modify[i++] = each;

            }
        }
        return modify;
    }
}
/*
Q15:Array -- Move Zeros to the End
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)

Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
 */