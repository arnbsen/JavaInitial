import java.util.ArrayList;
import java.util.Collection;
import org.omg.Messaging.SyncScopeHelper;

public class testCollection3 {
	public static void main(String[] args) {
		Collection<String> col = new ArrayList<String>();
		col.add("Hello");
		col.forEach(temp->System.out.println(temp));
		
	}
}
