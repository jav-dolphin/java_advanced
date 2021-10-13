package lesson1;

public class B  extends A {
    String name = " I am class lesson1.B";
    B(){
        //name="I am class b";
        System.out.println("lesson1.B construct");
        printName();
    }
    void printName(){
        System.out.println("lesson1.B method");
       System.out.println(name);
    }
}
