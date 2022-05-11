import java.util.ArrayList;
import java.util.List;

public class Q27_MoveSomeValueInArrayList {
    public static void main(String[] args) {
        Integer[] ar = {12, 43, 411, 2356, 21, -24};
        List<Integer> list = new ArrayList<>();

        for (Integer ea : ar) {
            list.add(ea);
        }
        int limitNumber = 100;
        System.out.println(removeValueAbove(limitNumber, list));


    }

    private static List<Integer> removeValueAbove(int limitNum, List<Integer> list) {
        list.removeIf(p->p>limitNum);
        return list ;


    }
}
/*
27. ArrayList -- Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */