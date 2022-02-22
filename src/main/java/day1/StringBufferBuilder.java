package day1;

public class StringBufferBuilder {

    public static void main(String[] args) {
        String s1 = "A ";
        StringBuilder sb = new StringBuilder("B ");
        StringBuffer sf = new StringBuffer("C ");

        concat1(s1);
        concat2(sb);
        concat3(sf);

        System.out.println(s1);
        System.out.println(sb.toString());
        System.out.println(sf.toString());

    }

    public static void concat1(String s1) {
        s1 = s1 + "Charlie";
    }

    public static void concat2(StringBuilder sb) {
        sb.append("Charlie");
    }

    public static void concat3(StringBuffer sf) {
        sf.append("Charlie");
    }






}
