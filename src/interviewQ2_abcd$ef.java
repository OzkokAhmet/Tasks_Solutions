import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class interviewQ2_abcd$ef {

    public static void main(String[] args) {

        String str = "abcd!ef";

        System.out.println("\n-------1st approach----------------");

        char[] ar = str.toCharArray();
        ArrayList<String> rev = new ArrayList<>();


        for (int i = ar.length - 1; i >= 0; i--) {
            if (Character.isLetterOrDigit(ar[i])) {
                rev.add(ar[i] + "");

            }
        }
        for (int i = 0; i < ar.length; i++) {
            if (!Character.isLetterOrDigit(ar[i])) {
                rev.add(i, ar[i] + "");
            }
            System.out.print(rev.get(i));
        }

        System.out.println("\n-------2nd approach----------------");


//        output: fedc!ba
        int index = str.indexOf("!");
        char c = str.charAt(index);
        String reversed="";
        for (int i = str.length()-1; i >=0 ; i--) {
            if(str.charAt(i)==c){continue;}
            reversed+=str.charAt(i);}
        List<String> lst = new ArrayList<>(Arrays.asList(reversed.split("")));

        lst.add(index,c+"");

        String lastResult= "";
        for (int i = 0; i < lst.size(); i++) {
            lastResult+=lst.get(i);
        }
        System.out.println("lastResult = " + lastResult);



        System.out.println("\n-------3rd approach----------------");

        String result="";
        int ind=str.indexOf("!");
        str=str.replaceAll("!","");

        for (int i = 0; i < str.length(); i++) {
            result=str.charAt(i)+result;
        }
        result=result.substring(0,ind)+"!"+result.substring(ind);
        System.out.println(result);
    }
}
