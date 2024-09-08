package testDemo;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new HashMap<>();	
		map.put("Joy", 1);
		map.put("Jesuwa", 2);
		map.put("Jacob", 2);
		map.put("Joy", 4);
		
		for(Map.Entry<String, Integer> obj : map.entrySet()) {
			System.out.println(obj);
		}

	}

}
