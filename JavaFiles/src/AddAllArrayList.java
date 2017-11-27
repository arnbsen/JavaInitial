import java.util.ArrayList;
import java.util.Iterator;

public class AddAllArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Jay");
		al.add("Sajal");
		al.add("Bijoy");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Bimal");
		al2.add("Ranjan");
		al.addAll(al2);
		al.addAll(al);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
