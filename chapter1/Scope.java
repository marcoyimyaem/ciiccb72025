package chapter1;

public class Scope {
    int age;
    public static void main(String[] args) {
        String one, two;
        Scope scope1 = new Scope();
        System.out.println(scope1.age);
        one = new String("a");
        two = new String("b");
        one=two;
        String three = one;
        one = null;
        System.out.println();
        // var number = 10;
        // number = "11";
        // {
        //     int p = 1000;
        // }
        // System.out.println(p);
        
    }
}
