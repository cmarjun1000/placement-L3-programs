package arjunsucks;
import java.util.*;
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a year : ");
		int y=sc.nextInt();
		if(y%400==0)
			System.out.println("Century leap year");
		else if(y%100==0)
			System.out.println("Not a leap year");
		else
		{
			if(y%4==0)
				System.out.println("leap year");
		}
	}

}
