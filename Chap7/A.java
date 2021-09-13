package Chap7;

public class A {
    int i, j;
    A(int a, int b) {
        i = a;
        j = b;
    }

    // display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // display k ñ this overrides show() in A
    void show() {
        System.out.println("k: " + k);
    }
    class Override {
        public static void main(String args[]) {
            B subOb = new B(1, 2, 3);

            subOb.show("This is k: "); // this calls show() in B
            subOb.show(); // this calls show() in A
        }
    }
}
class A {
    final void meth() {
        System.out.println("This is a final method.");
    }
}

class B extends A {
    void meth() { // ERROR! Can't override.
        System.out.println("Illegal!");
    }
}

