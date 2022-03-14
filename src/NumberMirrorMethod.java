

    public class NumberMirrorMethod {

        public static void main(String[] args) {
            int n = 5;
            numberMirror(n);
        }

        private static void numberMirror(int n) {

            for (int i = 1; i <= n; i++) {
                System.out.println(i);

            }
            for (int i = n; i>=1; i--){
                System.out.println(i);
            }

        }

    }
/*
Create a method where the input and output are as follows:

Input: 5
Output:       1
              2
              3
              4
              5
              5
              4
              3
              2
              1
 */

