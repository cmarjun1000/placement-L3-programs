package arjunsucks;
import java.util.*;
public class palindromeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0,rev=0,org=n;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==org)
			System.out.println("Yes, it is a palindrome");
		else
			System.out.println("No, it is not a palindrome");
	}

}
