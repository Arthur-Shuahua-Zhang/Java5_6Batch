package day3;

public class StaticKeyWord {
    static int a = 1;
    static int b;

    static {
        System.out.println("inside static block");
        b = a + 1;
    }

    public static void main(String[] args) {
//        System.out.println("from main");
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);


        Student one = new Student(1, "A");
        Student two = new Student(2, "B");
        System.out.println(Student.getCollege());

        Student.college = "ABC";
        System.out.println(Student.getCollege());

//        method2();// compile error
        method3();
        StaticKeyWord.method3();
    }

    public void method2(){}
    public static void method3(){}

    public void method4() {
        method3();
        StaticKeyWord.method3();

        method2();
    }

    static class StaticNestedClass {

    }

    class InnerClass {

    }


}


class Student {
    int id;
    String name;
    static String college;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static String getCollege() {
        return college;
    }
}
