public class Q17_ODD_EVEN {
    public static void main(String[] args) {
        int number = -15454563;
        identify(number);
    }

    private static void identify(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is EVEN");
        } else {
            System.out.println(number + " is ODD");
        }


    }
}
