package otherFolder.tasker;

import java.util.StringJoiner;

public class Tester {
    public static void main(String[] args) {
        String a = "hi World",b="hi Worlds";

        System.out.println(a.equals("hi Worlds".intern()));
        System.out.println(b.equals("hi Worlds".intern()));
        StringJoiner sj = new StringJoiner(",","{","}"), sj2 = new StringJoiner(",");

        sj.add("apple").add("guava").add("orage").add("kiwi");
        sj2.add("papaya").add("1").add("grapes");
        sj.merge(sj2);
        System.out.println(sj);
    }
}
