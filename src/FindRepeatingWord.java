public class FindRepeatingWord {

    public static void main(String[] args) {
        String str = "I love Java. Java is fun JAVA JAVA";
        String findWord = "java";

        System.out.println("Java count in the word is " + findCountWord(str, findWord));
        System.out.println("Count repeating word without using loop = " + findWordNoLOOP(str, findWord));

    }

    private static int findWordNoLOOP(String str, String findWord) {
        str = str.toLowerCase();
        findWord = findWord.toLowerCase();
        return (str.length() - str.replace(findWord, "").length()) / findWord.length();
    }

    private static int findCountWord(String str, String findWord) {
        int count = 0;
        str = str.toLowerCase();

        while (str.contains(findWord)) {
            count++;

            str = str.replaceFirst(findWord, "");

        }

        return count;
    }

}
