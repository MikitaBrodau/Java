package classes;

public class CompositionExample {

    static class A {
        void m(A a){
            System.out.println("god");
        }
    }

    static class B extends A {

    }

    static class J extends B {}

    static class C {
        void m(A a) {
            System.out.println("a");
        }

        void m(B b) {
            System.out.println("b");
        }
    }

    static class D extends C {
        void m(A a) {
            System.out.println("da");
        }

        void m(B a) {
            System.out.println("db");
        }
    }

    public static void main(String[] args) {
        J b = new J();
        if (b instanceof A){
            b.m(b);
        }

    }
}
