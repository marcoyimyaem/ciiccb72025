package chapter5;

public class InheritanceLesson{
    public static void main(String[] args) {
        FinalParent p1 = new FinalParent();
        Lion animal = new Lion("muning",4,13123421);
    }
}

final class FinalParent{
    int number;
    void getParent(){
        
    }
}

// class ChildClass extends FinalParent{
//     void getChildParent(){
//         getParent();
//         System.out.println(number);
//     }
// }

class Animal2 extends java.lang.Object {
    String name;
    int age;
    public Animal2(String name,int age){
        this.name = name;
        this.age = age;
    }
}
class Lion extends Animal2{
    int LionId;
    public Lion(String name, int age,int LionId){
        super( name, age);
        this.LionId = LionId;
        System.out.println(super.name);
    }


}
class MountainLion extends Lion{
    String locationString;
    public MountainLion(String name, int age,int LionId,String locationString){
        super(name, age, LionId);
        this.locationString = locationString;
        
    }
    public static void main(String[] args) {
        MountainLion ml = new MountainLion("anya", 0, 0, null);
        System.out.println(ml.name);
    }
}

