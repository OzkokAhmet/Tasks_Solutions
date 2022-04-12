import java.util.Arrays;

public class Q16_ArrayConcat2 {
    public static void main(String[] args) {

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {11, 21, 31, 41, 51};

        concat2(a1, a2);


    }

    public static void concat2(int[] a1, int[] a2) {

        int[] conArr2 = new int[a1.length + a2.length]; // a1.len = 4 ... a2.len = 5

        for (int i = 0; i < conArr2.length; i++) {

            if (i < a1.length) {
              //3  / 4
                conArr2[i] = a1[i];
            } else {
                conArr2[i]=a2[i-a1.length];
                     // 4 -->   4-4
                     // 5 -->   5-4
            }

        }
        System.out.println(Arrays.toString(conArr2));

    }
}
