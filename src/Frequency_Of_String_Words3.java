import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency_Of_String_Words3 {

    public static void main(String[] args) {

        String s = "Geeks For Geeks";
        String[] sArr = s.split(" ");

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : sArr) {

            if (map.keySet().contains(each)) {
                map.put(each, map.get(each) + 1);

            } else { map.put(each,1);
            }


        }
        System.out.println(map);

    }
}
