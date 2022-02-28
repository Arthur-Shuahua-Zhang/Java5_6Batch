package day3;

public class OOP {

}

class POL {
    public void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception ex) {
            // rollback();
            // shutdonwn
        }
    }
}

class IKH extends POL {
    @Override
    public void method1() {

    }

    public void method1(int i) {

    }

}

class UserNotFoundException extends Exception {
    public UserNotFoundException() {
        super();
    }

    public UserNotFoundException(String msg) {
        System.out.println(msg);
    }
}
