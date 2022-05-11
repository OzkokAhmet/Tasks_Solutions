import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q26_RemoveWordInArrayList {
    public static void main(String[] args) {
        String name = "Ahmed";
        List<String> nameList = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        nameList.removeIf(p->p.equals("Ahmed"));
        System.out.println("nameList = " + nameList);

    }
}
