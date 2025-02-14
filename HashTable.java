import java.util.*;
public class Main {
    public static void main(String[] args) {
        Hashtable<String,String> table = new Hashtable<>();
        //insertion
        table.put("TN","TamilNadu");
        table.put("KL","Kerala");             //Keys are case Senstive
        table.put(null,null);                  // HashTable shouldnt allow null values
        
        
        for(String i : table.keySet())
        {
            System.out.println(i+" "+table.get(i));
        }
    }
}

