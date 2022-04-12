import java.util.Arrays;

public class SecondMaxInArray {
    public static void main(String[] args) {

        int[] arr = {15, 22, -33, 4, 51, 16, 90};
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length - 2]);

    }
}
