import java.util.ArrayList;

public class FizzBuzzGenerator {

    public static void main(String[] args) {
        int a =3;
        int b = 18;

        System.out.println(fizzBuzzGenerator(a,b));


    }

    public static ArrayList<String> fizzBuzzGenerator(int num1, int num2) {
        ArrayList<String> s = new ArrayList<>();
        for (int i = num1; i <= num2; i++) {
            String result = (i % 15 == 0) ? "FizzBuzz" : (i % 3 == 0 && i % 5 != 0) ? "Fizz" : (i % 3 != 0 && i % 5 == 0) ? "Buzz" : i + "";
            s.add(result);
        }
        return s;
    }


}


/*
 Q5:
       - Write a program that returns a list of strings between two numbers
       but
       for multiples of 3 insert "Fizz" instead of number
       for multiples of 5 insert "Buzz" instead of number
       for multiples of 3 and 5 insert "FizzBuzz" instead of number

       - You will also need to create a divisibleBy method that accepts two integer number and return a boolean.

       Input: fizzBuzzGenerator(1,15);
       Output: ["1","2","Fizz","4","Buzz",...,"FizzBuzz"]
 */