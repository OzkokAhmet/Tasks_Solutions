public class ArmstrongNumbers {

    public static void main(String[] args) {


        System.out.println(armstrong(370));


    }

    private static boolean armstrong(int number) {
        int arms = number;
        int result = 0;

        while (number > 0) {
            result = result + ((number % 10) * (number % 10) * (number % 10));
            number = number / 10;
        }

        System.out.println("result = " + result);
        return result == arms;
    }


}
/*
An Armstrong number, also known as narcissistic number,
is a number that is equal to the sum of the cubes of its own digits.
 For example, 370 is an Armstrong number since 370 = 3*3*3 + 7*7*7 + 0*0*0 .
 */