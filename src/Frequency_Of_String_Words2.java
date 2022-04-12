import java.util.ArrayList;
import java.util.List;

public class Frequency_Of_String_Words2 {

    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        String str = "Geeks For Geeks";
        String[] a1 = str.split(" ");

        for (String each : a1) {
            int count = 0;
            for (String element : a1) {
                if (each.equals(element)) {
                    count++;
                }

            }

            if (!arrList.contains(each)) {
                arrList.add(each);
                System.out.println(each + ":" + count);
            }


        }


    }
}

