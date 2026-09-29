package collections;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> map1 = new HashMap<>();
		map1.put("apple",100);
		HashMap<Float,Integer> map2 = new HashMap<>();
		map2.put(1.22222f,1);
		HashMap<Character,Integer> map3 = new HashMap<>();
		map3.put('s',123);
		System.out.println(map1);
		System.out.println(map2);
		System.out.println(map3);
	}

}
