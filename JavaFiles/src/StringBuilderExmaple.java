
public class StringBuilderExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("ARNAB"); //STringBuilder has three constructors
		sb.append(" SEN"); // The + operator fetches the string from two different Memory Locations. StringBuilder extends the same memory space
		System.out.println(sb);
	}

}
