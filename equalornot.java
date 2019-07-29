package arjunsucks;
import java.util.*;
public class equalornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if((a^b)==0) {
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
	}

}
