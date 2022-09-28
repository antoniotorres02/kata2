package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        int[] data = {1,2,3,1,2,3,4,6,2,9,5,0,3,2,8,7,5,4,8,1,7,6,3};
        
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for (int i : data) {
            histogram.put(i, histogram.containsKey(i)? histogram.get(i)+1:1);
        }
            
        
        Iterator<Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
        
        while (entries.hasNext()) {
            Map.Entry<Integer,Integer> entry = entries.next();
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }
        
        
    }  
}
