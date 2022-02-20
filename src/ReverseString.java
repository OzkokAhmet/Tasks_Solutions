

public class ReverseString {

    public static void main(String[] args) {
        reversedStr1("ABCD");
        reversedStr2("ABCD");
    }

    private static void reversedStr2(String Sentence) {
        String reversedStr2 = "";
        for (int i = Sentence.length()-1; i >=0 ; i--) {
            reversedStr2+=Sentence.charAt(i);

        }
        System.out.println("reversedStr2 = " + reversedStr2);
    }

    private static void reversedStr1(String Sentence) {
        String reversedStr = "";

        for(char each : Sentence.toCharArray()){
            reversedStr= each+reversedStr;
        }
        System.out.println("reversedStr = " + reversedStr);
    }


}
/*
5.Write a return method that can reverse  String

Ex: Reverse("ABCD"); ==> DCBA
 */