import java.util.ArrayList;
import java.util.Arrays;

public class CheckVowel_inString {

    public static void main(String[] args) {
        System.out.println("Java Program to check if a vowel is present in the string?");

        System.out.println("------------First Method-----------------------");

        String str = "JavaLOvers";
        str = str.toLowerCase();
        char[] vowSTr = str.toCharArray();
        char[] vowel = {'a', 'e', 'i', 'o', 'u' };
        boolean b = false;
        String st = "";

        for (char each : vowSTr) {
            for (char ch : vowel) {
                if (each == ch) {
                    st += each;
                    b = true;
                }
            }
        }
        System.out.println(b);
        System.out.println(st);

        System.out.println("------------Second Method-----------------------");

        String s = "123jujs456";
        boolean isContains = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u")) {
                isContains = true;
            }
        }

        System.out.println(isContains);

        System.out.println("------------Third Method-----------------------");
        String[] vovels = {"a", "e", "o", "u", "i"};
        String str2 = "jkfhdsfsA";
        boolean result = false;
        for (String each : vovels) {
            if (str2.toLowerCase().contains(each)) {
                result = true;
            }
        }
        System.out.println(result);

        System.out.println("------------Fourth Method-----------------------");

        String vovels2 = "aeiou";
        String word = "HellowORD";
        boolean result2 = false;
        word = word.toLowerCase();
        for (int i = 0; i < vovels2.length(); i++) {
            char ch = vovels2.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                char ch1 = word.charAt(j);
                if (ch == ch1) {
                    result2 = true;
                }
            }
        }
        System.out.println(result2);

        System.out.println("------------Fifth Method-----------------------");

        String[] vovels5 = {"a", "e", "o", "u", "i"};
        String word5 = "HellowORD";


        ArrayList<String> listVOW = new ArrayList<>(Arrays.asList(word5.split("")));

        listVOW.removeIf(p -> !(p.contains("a") || p.contains("e") || p.contains("i") || p.contains("o") || p.contains("u")));
        System.out.println(listVOW.size() != 0);

        System.out.println("------------Fifth Method /2-----------------------");

        String[] vovels6 = {"a", "e", "o", "u", "i"};
        String word6 = "2324234";


        ArrayList<String> listVOW2 = new ArrayList<>(Arrays.asList(word6.split("")));

        listVOW2.retainAll(Arrays.asList(vovels6));
        System.out.println(listVOW2.size() != 0);

        System.out.println("------------Sixth Method-----------------------");

        String str6="jkfhdsfs";
        boolean result6=false;
        ArrayList<String> lst = new ArrayList<>(Arrays.asList(str6.split("")));
        int i=lst.size();
        lst.removeIf(p->p.toLowerCase().contains("a") || p.contains("e") || p.contains("i") || p.contains("o") || p.contains("u"));

        if(i-lst.size()>0){result6=true;}
        System.out.println(result6);

        System.out.println("------------Seventh Method---ADV--------------------");

        System.out.println(stringContainsVowels("Hello")); // true
        System.out.println(stringContainsVowels("TV")); // false

    }

    public static boolean stringContainsVowels(String input) {

        return input.toLowerCase().matches(".*[aeiou].*");

    }
}
