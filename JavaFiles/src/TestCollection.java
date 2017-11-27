import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); //Creating ArrayList (Part of Collection Interface -> List - > ArrayList)
		list.add("abc");
		list.add("java");
		list.add("sdf");
		//Traversing through Iterator
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next()); //.next Points to next item and print the Current Item.
		}
		//For each loop for objects
		for(String obj:list) {
			System.out.println(obj);
		}

	}

}
