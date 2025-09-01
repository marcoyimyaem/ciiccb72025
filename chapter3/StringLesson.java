package chapter3;

public class StringLesson {
    public static void main(String[] args) {
        String name = "Fluffy";
        name = "Floofy";
        short q = 'a';
        String name2 = "Fluffy"; 
        char xp = 256;
        System.out.println(xp);
         String a = "1";
        a = "0";
        a+="2";
        a+="3";
        String b = "1";
        name = null;
        name2 = null;
        String name3 = new String("fluffy");
        System.out.println(a);
        String word1 = "Stand alone";
        System.out.println(word1.toUpperCase());
        word1= word1.toUpperCase();
        System.out.println(word1.toLowerCase());
        System.out.println(word1);
        String trimSample = "       \t \n \t Marc Yim          \t \n";
        System.out.println(trimSample.trim());
        StringBuilder sb = new StringBuilder();
        for(char current ='a'; current <='z';current ++ )
            sb.append(current);
        System.out.println(sb);
    }
}
