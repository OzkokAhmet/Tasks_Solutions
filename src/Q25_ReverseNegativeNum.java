public class Q25_ReverseNegativeNum {
    public static void main(String[] args) {
        int num = -1234;
        System.out.println("reverseNegativeNumber(num) = " + reverseNegativeNumber(num));
    }

    private static int reverseNegativeNumber(int num) {

        int rev = 0;

        while (Math.abs(num)>0){

            rev = rev*10 + num%10;
            num = num/10;

        }
        return rev;

    }
}
