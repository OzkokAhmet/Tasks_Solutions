public class WildcardMatching {

    /*
    Implement wildcard pattern matching with support for ’?’ and ’*’
    To understand this solution, you can use s="aab" and p="*ab"
     */
    public static void main(String[] args) {
        String s1 = "eab**";
        String s2 = "*abcc";

        System.out.println(matcher(s1, s2));
    }

    private static String matcher(String s1, String s2) {

        if(s1.length()!=s2.length()){
            System.out.println("They are not matchable");
            System.exit(0);
        }
        for (int i = 0; i < s1.length(); i++) {
        if(s1.charAt(i) == s2.charAt(i)){
            continue;
        }else if (s1.charAt(i) == '*'){
            s1 = s1.replace(s1.charAt(i), s2.charAt(i));
        }else if (s2.charAt(i) == '*'){
            s2 = s2.replace(s2.charAt(i), s1.charAt(i));

        }else{
            System.out.println("They are not matchable");
            System.exit(0);
            }
        }
       return "s1 : " + s1 + " || s2 : " + s2;
    }
}
