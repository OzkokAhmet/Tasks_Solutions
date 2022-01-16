public class findIndex_Wo_IndexOF {
    public static void main(String[] args) {
        String s = "Find the index of the given word in sentence.";

        String word = "index";
        int wordIndex = 0;

        for (int i = 0; i < s.length(); i++) {

            if (word.equals(s.substring(i, i + word.length()))) {
                wordIndex = i;
                break;
            }

        }
        System.out.println("word index is " + wordIndex);
    }


}
/*
Q2:
       - Find the index of the given word in sentence
       * do not use indexOf() method
 */