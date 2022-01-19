import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapNumbers {

    public static void main(String[] args) {

        System.out.println("---------------First Method------------------");

        int num1 = 3;
        int num2 = 8;

        num2 = num1 + num2;  //  11
        num1 = num2 - num1;  //  8
        num2 = num2 - num1;  //  3
        ;

        System.out.println(num1);
        System.out.println(num2);

        System.out.println("---------------Second Method------------------");

        int num3 = 12;
        int num4 = 4;
        num4 = num3 * num4;  // 12*4=48
        num3 = num4 / num3;  // 48/12=4
        num4 = num4 / num3;  // 48/4=12

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        System.out.println("---------------Third Method------------------");


        int index1 = 0;
        int index2 = 4;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(100, 2, 4, 67, 8, 70, 4, 9));
        System.out.println("list before swap of index of "+index1+" and index of "+index2+" = "+list);

        list.add(index2 + 1, list.get(index1));  // [100, 2,4,67,8,100, 70,4,9 ]
        list.set(index1, list.get(index2));            // [8, 2,4,67,8,100, 70,4,9 ]
        list.remove(index2);                           // [8, 2,4,67,100, 70,4,9 ]

        System.out.println("list after swap of index of "+index1+" and index of "+index2+" = "+list);



        System.out.println("--------------------Fourth Method--Collections------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2,5,7,9));
        Collections.swap(list, 0, 3);

        System.out.println(list);



    }
}
