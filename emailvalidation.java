package arjunsucks;
import java.util.*;
public class emailvalidation {

	static boolean isValid(String s) {
		String reg="^[a-zA-Z0-9_]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$";
		return s.matches(reg);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an email : ");
		String email=sc.next();
		if(isValid(email))
			System.out.println("Yes,it is valid");
		else
			System.out.println("No , not valid");
	}

}
