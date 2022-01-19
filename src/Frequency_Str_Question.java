public class Frequency_Str_Question {


    public static void main(String[] args) {
        String s = "AaaAABCccCCCCqEERrrRR";
        s = s.toUpperCase();

        // additional information find unique, find duplicates
        String uniqeChars = "";
        String duplicates = "";
        String countByChar = "";

        for (int i = 0; i < s.length(); i++) {
            int frequency = 0;
            if (!countByChar.contains(s.charAt(i) + "")) {  //countByChar = ""   ==> check each if not contains AAABBSS next step
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {      //
                        frequency++;
                    }

                }
                countByChar += s.charAt(i) + "" + frequency + " ";

                if (frequency == 1) {
                    uniqeChars += s.charAt(i);  // find unique chars
                }
                if (frequency > 1) {
                    duplicates += s.charAt(i);  // find duplicate characters only
                }
            }

        }
        System.out.println("Count each char next to : " + countByChar);
        System.out.println("uniqeChars = " + uniqeChars);
        System.out.println("duplicates = " + duplicates);


    }
}
