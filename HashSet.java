import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);set.add(4);set.add(4);set.add(5);set.add(6);
        for(Integer i : set)
        {
            System.out.println(i);
        }
    }
}
