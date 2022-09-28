package kata2;

import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        String[] data = {"Rosa","Pepe","María","Pepe","Pepe","Rosa"};
        
        Histogram histo = new Histogram(data);    
        
        Map<String, Integer> histogr = histo.getHistogram();
        
        
        Iterator<Map.Entry<String, Integer>> entries = histogr.entrySet().iterator();
        
        while (entries.hasNext()) {
            Map.Entry<String,Integer> entry = entries.next();
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }
        
        
    }  
}
