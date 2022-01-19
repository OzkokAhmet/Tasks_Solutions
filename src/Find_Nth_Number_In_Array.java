public class Find_Nth_Number_In_Array {
    public static void main(String[] args) {



    System.out.println("--------------First Approach--------------------");

    int temp, size;
    int array[] = {10, 45, 82, 40, 90, 2, 20};
    size = array.length;

        for(int i = 0; i<size; i++ ){
        for(int j = i+1; j<size; j++){

            if(array[i]>array[j]){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
        System.out.println("Second largest number is: "+array[size-2]);



        System.out.println("--------------Second Approach--------------------");

    int[] a = {10, 45, 82, 40, 90, 2, 20};
    int n = 2;

        System.out.println(n + ". max number is " + findMax(a, n));
}


    public static int findMax(int[] arr, int num) {

        if (num > arr.length - 1 || num < 0) {
            System.err.println("invalid request " + num);
            System.exit(0);
        }

        int indexMax = 0;
        for (int k = 0; k < num; k++) {

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {      //  10,45,82,40,90,2,20
                if (arr[i] > max) {
                    max = arr[i];

                }

            }
            for (int m = 0; m < arr.length; m++) {
                if (arr[m] == max)
                    arr[m] = Integer.MIN_VALUE;
            }

            indexMax = max;
        }
        return indexMax;


    }
}


