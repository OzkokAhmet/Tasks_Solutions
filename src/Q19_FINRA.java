import java.util.Arrays;
import java.util.Scanner;

public class Q19_FINRA {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        int number = new Scanner(System.in).nextInt();
        finraDetecive(number);


    }

    public static void finraDetecive(int number) {

        String [] finra = new String[number];
        for (int i = 1; i < number+1; i++) {

            finra[i-1]=(i%15==0)? "Finra" : (i%5==0)? "Fin" : (i%3==0)? "Ra" : i+"";

        }

        System.out.println(Arrays.toString(finra));

    }

}
