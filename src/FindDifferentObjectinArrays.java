import java.util.Arrays;

public class FindDifferentObjectinArrays {

/* * Given 2 arrays. They are consist of non empty strings. Write a function to find out all elements appear in first array but not in second array.
  Sample input:
    Array A: ["one", "two", "four", "ten"]
    Array B: ["one", "four", "seven", "six"]
  Sample output:
    In A not in B: ["two", "ten"]
    In B not in A: ["seven", "six"]*/


    public static void main(String[] args) {
        String[] A = {"one", "two", "four", "ten"};
       // String[] A1 = {"one", "two", "four", "ten"};
        String[] B = {"one", "four", "seven", "six"};

        differences(A, B);

    }

    private static void differences(String[] a, String[] b) {
        String s = "";
        for (String each : a) {
            int ct = 0;
            for (String element : b) {
                if (each.equals(element))
                    ct++;

            }
            if (ct == 0) {
                s += each + " ";

            }
        }
        System.out.println(Arrays.toString(s.split(" ")));
    }

}
