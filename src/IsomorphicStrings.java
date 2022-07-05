import java.util.HashMap;

public class IsomorphicStrings {

    /*
    Given two strings s and t, determine if they are isomorphic.
    Two strings are isomorphic if the characters in s can be replaced to get t.
    For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
     */
    public static void main(String[] args) {

        String s1 = "egg";
        String s2 = "add";

        System.out.println("isIsomorphic(s1,s2) = " + isIsomorphic(s1, s2));

    }

    public static boolean isIsomorphic(String s, String t) {
        if (s == null || t == null)
            return false;
        if (s.length() != t.length())
            return false;
        if (s.length() == 0 && t.length() == 0)
            return true;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            Character c = map.get(c2);
            if (c != null && c != c1) {
                return false;
            } else if (map.containsKey(c1)) {
                if (c2 != map.get(c1))
                    return false;
            } else {
                map.put(c1, c2);
                   }
        }
        return true;


    }
}
