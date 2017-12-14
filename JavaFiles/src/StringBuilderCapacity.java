
public class StringBuilderCapacity {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity()); //Default is 16 bits.
		sb.append("Arnab Sen");
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.append(" : =This is the Java String");
		int sb2 = sb.capacity();
		System.out.println(sb.capacity()); //new capacity = old capacity*2 + 2
		System.out.println(sb);
		System.out.println(sb2);
		sb.append(" : =This is the Java Stribg Builder class");
		int sb3 = sb.capacity();
		System.out.println(sb.capacity()); //new capacity = old capacity*2 + 2
		System.out.println(sb);
		System.out.println(sb.capacity());
	}

}
