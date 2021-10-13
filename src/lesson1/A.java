package lesson1;

public class A {
    String name = " I am class lesson1.A";
    A(){
        System.out.println("lesson1.A construct");
        printName();
    }
    void printName(){
        System.out.println("lesson1.A method");
        System.out.println(name);
    }
}
