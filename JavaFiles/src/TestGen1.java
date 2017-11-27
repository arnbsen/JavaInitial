class MyClass<T>{
	T obj;
	void sum(T obj) {
		this.obj = obj;
	}
	T fetch() {
		return obj;
	}
}
public class TestGen1 {

	public static void main(String[] args) {
		
		//Creating Class of String Type
		MyClass<String> myclass = new MyClass<String>();
		myclass.sum("This is Java Generics");
		System.out.println(myclass.fetch());
		
		//Creating Class of Double Type
		MyClass<Double> mc = new MyClass<Double>();
		mc.sum(2.4554);
		System.out.println(mc.fetch());
		
		//Creating class of Employee Type
		MyClass<Employee1> me = new MyClass<Employee1>();
		me.sum(new Employee1(12,"Arnab Sen", 45));
	
		System.out.println(me.obj.id + " " + me.obj.name + " " + me.obj.age);
		
	}

}
