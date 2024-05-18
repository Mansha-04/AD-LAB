import java.util.HashMap;
public class Hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("India", 140);
		map.put("USA", 30);
		map.put("China", 180);
		System.out.println(map);
		map.put("India", 150);
		System.out.println(map);
		System.out.println(map.get("India"));
		System.out.println(map.get("Indonesia"));
		for(Map.Entry<String, Integer> e:map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		Set<String> keys=map.keySet();
		for(String key:keys) {
			System.out.println(key+" "+map.get(key));
		}
		map.remove("China");
		System.out.println(map);
	}

}
