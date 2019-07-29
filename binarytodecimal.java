package arjunsucks;
import java.util.*;
public class binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String arr[]=s.split(" ");
		int ar[]=new int[arr.length];
		int i=0;
		//converting string array into integer array
		for(String str : arr) {
			ar[i]=Integer.parseInt(str);
			i++;
		}
		System.out.print("Integer form : ");
		for(i=0;i<ar.length;i++) {
			System.out.print(ar[i]);
		}
		System.out.println();
		int sum=0,j=0;
		for(i=ar.length-1;i>=0;i--) {
			sum+=Math.pow(2,i)*ar[j];
			j++;
		}
		System.out.println(sum);
	}

}
