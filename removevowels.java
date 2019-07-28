package arjunsucks;
import java.util.*;
public class removevowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s=sc.next();
		int l=s.length();
		s=s.replaceAll("[AaEeIiOoUu]", "");
		System.out.println(s);
	}

}
