import java.util.Arrays;

public class SortTypeOfGroupInString {
    public static void main(String[] args) {

        String str = "DC501GCCCA098911";
        String fixStr = "";
        String result = "";

        // First I tried to slip group of types

        for (int i = 0; i < str.length() - 1; i++) {
            if ((Character.isLetter(str.charAt(i)) && Character.isDigit(str.charAt(i + 1))) ||
                    (Character.isLetter(str.charAt(i + 1)) && Character.isDigit(str.charAt(i)))) {
                fixStr += str.charAt(i) + " ";
            } else {
                fixStr += str.charAt(i);
            }

        }
        // I added last char manually because I cannot add in loop without getting out of bounder error
        fixStr += str.charAt(str.length() - 1);

        // When I have slipped group, I used slip method to convert array
        String[] wordsList = fixStr.split(" ");

        // I created a loop to convert each element to char array then sorted each array individually
        // I assigned them to empty string after sort in the inner loop
        for (String each : wordsList) {
            char[] split = each.toCharArray();
            Arrays.sort(split);
            for (char ch : split) {
                result += ch;

            }
        }
        System.out.println("result = " + result);
    }


}
/*
String -- Sort Letters and Numbers from alphanumeric String:
Given alphanumeric String, we need to split the string into
substrings of consecutive letters or numbers, sort the individual
 string and append them back together

 Ex: Input: "DC501GCCCA098911" OutPut: "CD015ACCCG011899"

 */
