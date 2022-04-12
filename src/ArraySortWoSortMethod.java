import java.util.Arrays;

public class ArraySortWoSortMethod {
    public static void main(String[] args) {
        int[] arr = {9, 4, 23, 6, 78, 4};
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
    }
}