import java.io.IOException;

public class ExceptionTest {

    public static class Parent {

        /*public void method() {
            System.out.println("From parent");
        }*/

        /*public void method() {
            throw new NullPointerException();
        }*/

        /*public void method() throws  NullPointerException {
            System.out.println("From Parent");
        }*/

        public void method() throws NullPointerException {
            System.out.println("From Parent");
        }
    }

    public static class Child extends Parent {
        /*public void method() throws  NullPointerException {
            System.out.println("From child");
        }*/

        /*public void method()  {
            throw new NullPointerException();
        }*/

        public void method()  {
            System.out.println("From child");
        }

    }

    public static void main(String[] a) {
        Parent p = new Parent();
        try {
            p.method();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        Parent c = new Child();
        try {
            c.method();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }
}
