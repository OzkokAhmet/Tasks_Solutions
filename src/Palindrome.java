import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("---------------Number Palindrome Solution with String Array---------------------");

        int num = 545;

        String[] list = (num + "").split("");
        String []palindrome = new String[list.length];


        System.out.println("list " + Arrays.toString(list));
        for (int i = list.length-1; i >=0 ; i--) {
            palindrome[list.length-1-i]=list[i];

        }
        if(Arrays.equals(list,palindrome)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }





        System.out.println("---------------Number Palindrome Solution with int---------------------");
        int n = 151;
        System.out.println("number is = "+n);
        System.out.println(isPalindrome(n));
    }


    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reminder;
        int rev = 0;

        while (num > 0) {
            reminder = num % 10;
            rev = (rev * 10) + reminder;
            num = num / 10;

        }

        return originalNum == rev;

    }
}
