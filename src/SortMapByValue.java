import java.util.*;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(1, 3);
        map1.put(5, 7);
        map1.put(-2, 4);
        map1.put(-8, 7);
        map1.put(18, -17);
        map1.put(-8, 7);
        System.out.println(map1);
        System.out.println(sortValueMap(map1));
    }

    private static LinkedHashMap<Integer, Integer> sortValueMap(Map<Integer, Integer> map1) {


        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map1.entrySet());
        list.sort(Map.Entry.comparingByValue());


        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        list.forEach(e -> sortedMap.put(e.getKey(), e.getValue()));
        return sortedMap;

    }


}
