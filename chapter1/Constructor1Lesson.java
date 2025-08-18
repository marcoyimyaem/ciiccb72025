package chapter1;

public class Constructor1Lesson {
    public static void main(String[] args) {
        Chick chick1 = new Chick();
        Chick chick2 = new Chick();
        Chick chick3 = new Chick();
        Chicken chicken1 = new Chicken();
        Chicken chicken2= new Chicken();
        chicken1.name = "PM2";
        Chicken chicken3 = new Chicken();
        chicken3.name = "s1";
        chicken3.numEggs = 1;
        System.out.println();
    }  

}

class Chick{
    Chick(){
        System.out.println("in constructor");
    }

}
class Chicken{
    int numEggs = 0;
    String name;
    Chicken(){
        name = "Duke";
    }

}
class Name{
    String first = "Theodore";
    String last ="Moose";
    String full = first+last;
    public static void main(String[] args) {
        Name name = new Name();
        name.first = "Marc";
        name.last = "Yim";
        System.out.println(name.full);
    }
}