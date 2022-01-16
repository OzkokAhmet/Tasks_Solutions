
public class FindDomain {
    public static void main(String[] args) {

        System.out.println("-------------First Method Array--------------------");

        String email = "DoNotReply@gmail.com";

        String[] eArr = email.split("\\.");
        String[] domain = eArr[0].split("@");
        System.out.println(domain[1]);

        System.out.println("-------------Second Method Array--------------------");

        String s = "DoNotReply@gmail.com";
        String domain2 = findDomain(s);
        System.out.println(domain2);

    }

    public static String findDomain(String s) {
        String s1 = s.substring(s.indexOf("@") + 1, s.lastIndexOf("."));
        return s1;
    }


}


