import java.util.ArrayList;
import java.util.Arrays;

public class MessySentenceCleaner {


    public static void main(String[] args) {
        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        //Write a method that returns : Welcome To Core Java

        System.out.println(mixSentence(str));

    }

    public static String mixSentence(String s) {
        String clearSentence = "";
        for (char each : s.toCharArray()) {
            if (Character.isLetter(each) || Character.isSpaceChar(each)) {
                clearSentence += each;
            }
        }
        return clearSentence;
    }


}

