public class DNA {

    public static void main(String[] args) {
        String s = "ATGCTTCAGAAAGGTCTTACG";
        String dNA = "";


        for (int i = 0; i < s.length(); i++) {
            int frequency = 0;
            if(!dNA.contains(s.charAt(i)+"")){

                for (int j = 0; j < s.length() ; j++) {
                    if(s.charAt(j)==s.charAt(i)){
                        frequency++;

                    }

                }

                dNA+=s.charAt(i)+":"+frequency+" ";
            }

        }
        System.out.println(dNA);
    }



}
/*
 -An example of a length 21 DNA string(whose alphabet contains the symbols 'A','C','G','T')
       is "ATGCTTCAGAAAGGTCTTACG"
       Expected output:
       A:6 C:4 G:5 T:6
 */