package collections;

import java.util.HashMap;
import java.util.Map;

public class String_occrance {

	public static void main(String[] args) {
		Map<Character,Integer> map = new HashMap<>();
		String str="hello";
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				int count = map.get(str.charAt(i))+1;
				map.put(str.charAt(i), count);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(map);
	}

}
