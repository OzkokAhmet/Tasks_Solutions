public class Triangle {
    public static void main(String[] args) {
        for (int row = 0; row <= 6; row++) {


            for (int column = 6; column >= row; column--) {
                System.out.print(" ");}
           /* for (int column = row; column <= 2*row; column++) {
                System.out.print("* ");

            }*/
            for (int column = row; column <= 2*row; column++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }


}


