import java.util.ArrayList;
import java.util.Iterator;

public class RemoveAllColl {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Jay");
		al.add("Sajal");
		al.add("Bijoy");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Sajal");
		al2.add("Bijoy");
		al.removeAll(al2);
		//After removing and printing the elements
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
