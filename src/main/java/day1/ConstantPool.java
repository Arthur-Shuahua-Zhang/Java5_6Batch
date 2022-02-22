package day1;

public class ConstantPool {
    public static void main(String[] args) {
//        String a = new String("abc");
//        String b = new String("abc");
//        String c = "abc";
//        String d = "abc";
//
//        System.out.println(a == b); // false
//        System.out.println(a == c); // false
//        System.out.println(c == d);  // true

        Integer a = 12;
        Integer b = 12;
        Integer c = new Integer(12);
        Integer d = Integer.valueOf(12);
        Integer e = 128;
        Integer f = 128;
        System.out.println(a == b);  // true
        System.out.println(a == c);  // false
        System.out.println(a == d);  // true
        System.out.println(e == f);  // false






    }
}
