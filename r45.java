import java.util.*;

public class r45 {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        s.add("hello");
        s.add("world");
        s.add("work is done");
        System.out.println(s);
        s.set(2, "god");
        System.out.println(s);
        s.add("jy");
        System.out.println(s);
        for (int i = 0; i < s.size(); i++) {
            s.get(i);
        }
    }
}
