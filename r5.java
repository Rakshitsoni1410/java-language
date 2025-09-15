import java.util.Scanner;

public class r5 {
    public static void main(String[] args) {
        System.out.println("eneter the charater");
        Scanner ac = new Scanner(System.in);
        char ch = ac.next().charAt(0);
        System.out.println(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o') {
            System.out.println("charateer is vowel");
        }

        else {
            System.out.println("charater ius not vowel");
        }
    }
}
