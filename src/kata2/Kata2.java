package kata2;

import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        Integer[] data = {1,2,3,1,2,3,4,6,2,9,5,0,3,2,8,7,5,4,8,1,7,6,3};
        
        Histogram histo = new Histogram(data);    
        
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        
        Iterator<Map.Entry<Integer, Integer>> entries = histogr.entrySet().iterator();
        
        while (entries.hasNext()) {
            Map.Entry<Integer,Integer> entry = entries.next();
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }
        
        
    }  
}
