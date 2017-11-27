import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class compareInterface {


	private static final Object[] B = null;

	public static void main(String[] args) {
		ArrayList<Employee1> al = new ArrayList<Employee1>();
		
		al.add(new Employee1(101,"Arnab",20));
		al.add(new Employee1(102,"Rishabh",20));
		al.add(new Employee1(100,"Sourav",20));
		Collections.sort(al);
		for(Employee1 st:al) {
			System.out.println(st.name + " " + st.id + " " +st.age );
		}
		//Creating Tree set. Tree set inherits Set
		Set<Employee1> al2 = new TreeSet<Employee1>();
		al2.add(new Employee1(101,"Arnab",20));
		al2.add(new Employee1(102,"Rishabh",20));
		al2.add(new Employee1(100,"Sourav",20));
		
		//Traversal of tree 
		for(Employee1 et:al2) {
			System.out.println(et.name + " " + et.id + " " +et.age );
		}
		HashSet<Employee1> set = new HashSet<Employee1>();
		set.add(new Employee1(101,"Arnab",20));
		set.add(new Employee1(102,"Rishabh",20));
		set.add(new Employee1(100,"Sourav",20));
		set.toArray(B);
		
		//Traversing Hash Set	
		for(Employee1 et:set) {
			System.out.println(et.name + " " + et.id + " " +et.age );
		}
	}
	
	
}
class Employee1 implements Comparable<Employee1>{ //Creating Comparable interface
	int id;
	String name;
	int age;
	public Employee1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Employee1 o) {
		if(id==o.id) {
			return 0;
		}
		else if(id > o.id) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
}