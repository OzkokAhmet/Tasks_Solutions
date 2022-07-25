public class AlphaNumericString {

    public static void main(String[] args) {
        String s = "12345";
        String s2 = "1v2rFG5";

        sumIfDigit(s);
        sumIfDigit(s2);

    }

    private static void sumIfDigit(String s) {
        int sum = 0;
        for(char each : s.toCharArray()){
            if(Character.isLetter(each)){
                System.out.println("AlphaNumeric String is the input");
                return;
            }else if(Character.isDigit(each)){
                sum += Integer.parseInt(each+"");

            }
        }
        System.out.println(sum);

    }
}
/*
        For the input - "12345", the output should be = 15
        For the input - "1v2rFG5", the output should be = "AlphaNumeric String is the input"
         */