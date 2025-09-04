package otherFolder.tasker;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("enter a word to check if Palin");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        StringBuilder sb = new StringBuilder(word);
        System.out.println(
            (word.equals(sb.reverse().toString())) ?
            "Palin" : "not Palin"
        );
    }
}
