import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class TestLambda3 {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("Jay");
		name.add("Bimal");
		name.add("Sujoy");
		Iterator itr = name.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//Printing Using Lambda expressions
		name.forEach(n1ame->System.out.println(n1ame));
		
		//Creating ArrayList of Employee and printing using Lambda Expression
		List<Employee1> emp = new ArrayList<Employee1>();
		emp.add(new Employee1(12,"Arnab", 23));
		emp.add(new Employee1(13,"Hello", 27));
		emp.add(new Employee1(45, "Sourav", 89));
		
		//Printing Class employee using ArrayList and Lambda Expression
		emp.forEach(n2ame->System.out.println(n2ame.id + " " +  n2ame.name + " " + n2ame.age));
	}

}
