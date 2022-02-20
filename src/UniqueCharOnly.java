

public class UniqueCharOnly {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        String empty = "";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            // the if block only used for to program force skip checked letters. Program works without it but longer process
            if (!empty.contains(str.charAt(i) + "")) {
                empty += str.charAt(i);

                // inner loop allow us to check each character with all characters
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }

                }

            }
            // count equal 1 means the character is unique
            if (count == 1) {
                unique += str.charAt(i);
            }

        }
        System.out.println("unique = " + unique);

    }
}
/*
4.Write a return  method that can find the unique characters from the String

Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */