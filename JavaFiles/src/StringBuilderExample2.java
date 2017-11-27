
public class StringBuilderExample2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("ARNAB ");
		sb.insert(5, "SEN");
		System.out.println(sb);
		sb.replace(0, 3,"SEN"); //Replacing the start index position replace the portion from start  to end - 1 
		System.out.println(sb);
		sb.delete(2, 5);			//Delete the start index position replace the portion from start  to end - 1 
		System.out.println(sb);
		sb.reverse();			//Reverse the String
		System.out.println(sb);
	}

}
