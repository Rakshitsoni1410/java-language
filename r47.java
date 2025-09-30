import java.util.*;

public class r47 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "work");
        map.put(2, "working");
        map.put(3, "worked");

        
        System.out.println(map.get(2));
        map.put(3, "submitted");
        System.out.println(map.get(3));
    }
}
