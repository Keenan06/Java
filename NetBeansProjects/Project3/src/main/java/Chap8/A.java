package Chap8;

public interface A {
    void meth1();
    void meth2();


// B now includes meth1() and meth2() -- it adds meth3().
interface B extends A {
    void meth3();
}
}
