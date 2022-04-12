public class sumDigitsInString {
    public static void main(String[] args) {
     System.out.println(sumString("ASDw123wwww"));


    }

    public static int sumString(String str) {

        int sum = 0;

        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {

                sum += each - 48;  // because in Ascii table "1" equal to 49

                //  sum +=Integer.parseInt(each+"");  // "123"
//--------------------------------------------------------------------------------------------
                // Integer.parseInt(String) ---> return type int
//--------------------------------------------------------------------------------------------
                // Integer.valueOf(String)  ---> return type Integer
//--------------------------------------------------------------------------------------------


            }
        }

        return sum;
    }

}
