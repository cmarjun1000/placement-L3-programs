package arjunsucks;
import java.util.*;
public class secondlargestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int largest=0,second=0;
		String s=sc.nextLine();
		String arr[]=s.split(", ");
		int a[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			a[i]=Integer.parseInt(arr[i]);
		}
		largest=a[0];
		second=a[0];
		for(int i=1;i<arr.length;i++) {
			if(a[i]>largest) {
				second=largest;
				largest=a[i];
			}
			else if(a[i]>second) {
				second =a[i];
			}
		}
		System.out.println("Second largest number is : "+second);
	}

}
