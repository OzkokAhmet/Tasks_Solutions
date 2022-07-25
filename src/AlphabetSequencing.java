public class AlphabetSequencing {

    public static void main(String[] args) {
        String s1 = "Test how it works";
        String s2="Hello this is Bryce. Iam in an interview with rev and Nick.";

        alphaSeq2(s1);
        System.out.println();
        alphaSeq2(s2);



    }


    private static void alphaSeq2(String s){
        s=s.replaceAll("\\p{Punct}","").replaceAll(" ","");
        for (char each : s.toLowerCase().toCharArray()) {
            System.out.print((each-96)+" ");

        }
    }

}
