
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
	
	static Scanner sc = new Scanner(System.in);
	static int B = sc.nextInt();
	static int H = sc.nextInt();
	static boolean flag = true;
	static {
		if(H<0||B<0) {
			flag = false;
			System.out.println("False");
		}
	}
	
    public static void main(String[] args){
    		
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class





