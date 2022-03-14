import java.util.Arrays;

public class ReinsertionOrder {


    public static int[] something(int[]num, int number ){
        if(number>=0 && number<num.length){

            int[]arr=new int[num.length];

            int a=0;
            for (int i = number; i < num.length; i++) {
                arr[a++]=num[i];
            }

            for (int i = 0; i < number; i++) {
                arr[a++]=num[i];

            }
            return  arr;}else {
            System.err.println("Invalid index");
            return num;
        }

    }

    public static void main(String[] args) {

        int [] a = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(something(a,5)));


    }


}
/*
Create a method when given an array of numbers, rearrange the array and print it in the following manner:

Input: [1, 2, 3, 4, 5]
Output: [3, 4, 5, 1, 2]
 */