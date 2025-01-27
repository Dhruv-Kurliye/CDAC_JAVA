package day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class DemoMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("One",5);
        map.put("Two",10);
        map.put("Three",15);
        
        System.out.println(map.get("Two"));
        
        Set<String> keyset = map.keySet();
        for(String key : keyset) {
        	System.out.println(key + ":-" + map.get(key));
        }
        Set<Entry<String, Integer>> entries = map.entrySet();
        for(Entry<String, Integer> entry : entries) {
        	System.out.println(entry.getKey() + ":-" + entry.getValue());
        }
        map.remove("three");
        keyset = map.keySet();
        for(String key : keyset) {
        	System.out.println(key + ":-"+map.get(key));
        }
	}

}
