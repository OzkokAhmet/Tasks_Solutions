import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordLengthCounterInString {
    public static void main(String[] args) {
        String str = "Yesterday I drove to San Diego and went surfing";
        String str3 = "Yesterday I drove to San Diego and went surfing";

        System.out.println(count(str));


    }

    static String count(String s){
        String[] words = s.replaceAll("\\p{Punct}", "").split("\\s+");
        int wordsCount = words.length;
        List<Integer> charsInWord = new ArrayList<>();
        for (String word : words) {
            charsInWord.add(word.length());
        }
        Collections.sort(charsInWord);
        return "wordcount: "+wordsCount+", wordsizes: "+charsInWord;
    }
}

        /*
        Given an input string containing a sentence, please write a function that returns
        I the following:
        1 1. The number of words in the sentence.
        2.
        An array containing the number of characters in each word,
        sorted in increasing order.
        I Feel free to look up anything you require, as well as to ask any questions.
        1 Here's a sample input string:
        "Yesterday I drove to San Diego and went surfing"
        1 For this string, the function should return:
        {wordcount: 9, wordsizes: (1, 2, 3, 3, 4, 5, 5, 7, 9]}
         */