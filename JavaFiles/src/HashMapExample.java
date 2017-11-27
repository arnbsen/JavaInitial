import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("name", "Arnab");
		hm.put("age", "21");
		hm.put("hobby", "Code");
		for(Map.Entry m: hm.entrySet() ) {
			System.out.println(m.getKey()  + " " + m.getValue());
		}
		hm.remove("name"); // .remove is case sensetive
		for(Map.Entry m: hm.entrySet() ) {
			System.out.println(m.getKey()  + " " + m.getValue());
		}
		
		
		
	}

}
