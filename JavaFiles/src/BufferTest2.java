
public class BufferTest2 {

	public static void main(String[] args) {
		System.out.println("Hashcode of String");
		String str = "Hello";
		System.out.println(str.hashCode());
		str = str + "World"; //Uses different memory location as it is derived from String Class
		System.out.println(str.hashCode());
		
		System.out.println("Hash Code of String Buffer");
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.hashCode()); //StringBuffer is thread safe 
		sb.append("World");
		System.out.println(sb.hashCode()); //Uses same memory location as it is a object of StringBuffer/StringBuilder
	}

}
