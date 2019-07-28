package arjunsucks;
import java.util.*;
public class segregate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String arr[]=s.split(", ");
		System.out.print("Original Array : [");
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println(arr[arr.length-1]+"]");
		System.out.print("Array after segregation : [");
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].contains("0")) {
				count++;
			}
		}
		for(int i=0;i<count;i++) {
			System.out.print("0, ");
		}
		for(int i=count;i<arr.length-1;i++) {
			System.out.print("1, ");
		}
		System.out.println("1]");
	}

}
