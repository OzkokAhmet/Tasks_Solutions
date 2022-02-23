

public class DivisionWithout_Divider {
    public static void main(String[] args) {

        System.out.println( divWoDivision(5, 3));

    }

    private static double divWoDivision(int number1, int number2) {
        int c = 0;

        while(number1>=number2){
            number1-=number2;
            c++;
        }

        System.out.println("remainder : "+number1);
        return c;
    }
}
