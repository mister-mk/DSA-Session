import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        
        //insertion
        map.put("TN","TamilNadu");
        map.put("KL","Kerala");             //Keys are case Senstive
        map.put("KA","Karnataka");
        
        //Search
        System.out.println(map.get("TN"));
        System.out.println(map.get("KA"));
         
        //Exception Handling
        System.out.println(map.getOrDefault("AP","Not Found"));
        
        //remove
        // map.remove("KL");   //For clear the entire array use map.clear()
        
        for(String key : map.keySet())       //for values, for (String values : map.values())
        {
            System.out.println(key+" "+map.get(key));
        }
        System.out.println(map.containsKey("AP"));
        System.out.println(map.containsValue("TamilNadu"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        
    }
}       
