import java.util.Arrays;

public class Q16_Array_ConcatTwoArray {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {11, 21, 31, 41, 51};

        concatArray(a1, a2);

    }
    public static void concatArray(int[] a1, int[] a2) {
        int[] con = new int[a1.length + a2.length];
        int c = 0;
        for (int each : a1) {
            con[c++] = each;
        }
        for (int each : a2) {
            con[c++] = each;
        }
        System.out.println(Arrays.toString(con));
    }

}
