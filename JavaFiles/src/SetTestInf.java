import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SetTestInf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set seta = new HashSet();
		seta.add(2);
		seta.add(3);
		seta.add(1);
		
		seta.add(1);
		Iterator itr = seta.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
