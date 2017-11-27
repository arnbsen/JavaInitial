
import java.util.Scanner;
public class assignment2 {

	public static void main(String[] args) {
		employee emp1 = new employee();
		emp1.get_name();
		emp1.get_Des();
		emp1.get_email();
		emp1.get_sal();
		emp1.get_ph_no();
		emp1.disp_all();
		emp1.inc_sal();
		
		// TODO Auto-generated method stub

	}

}
class employee{
	float sal;
	int ph_no;
	String email, name, Des;
	Scanner sc = new Scanner(System.in);
	
	void get_name() {
	
		System.out.println("Enter the name");
		name = sc.nextLine();
		}
	void get_sal() {
		
		System.out.println("Enter the Salary");
		sal = sc.nextFloat();
		}
	void get_ph_no() {
		
		System.out.println("Enter the phone no");
		ph_no = sc.nextInt();
		}
	void get_email() {
	
		System.out.println("Enter the email");
		email = sc.nextLine();
		
	
		}
	void get_Des() {
		
		System.out.println("Enter the Designation");
		Des = sc.nextLine();
		}
	void disp_all() {
		System.out.println("The information\n" + "Name:" + " " + name); 
		System.out.println("Salary:" + " " + sal);
		System.out.println("Email:" + " " + email);
		System.out.println("Phone:" + " " + ph_no);
		System.out.println("Designation:" + " " + Des);
	}
	void inc_sal() {
	  if(Des.equals("Manager")) {
		  sal = (float) (sal + sal*0.2);
		  System.out.println( "New Salary:" + " " + sal);
	  }else if(Des.equals("Supervisior")) {
		  sal = (float) (sal + sal*0.1);
		  System.out.println( "New Salary:" + " " + sal);
	  }
	  else {
		  System.out.println("Your Salary Can't be Increased");
	  }
	}
}
