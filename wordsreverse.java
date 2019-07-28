package arjunsucks;
import java.util.*;
public class wordsreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s=sc.nextLine();
		String arr[]=s.split(" ");
		for(String str : arr) {
			StringBuilder strb=new StringBuilder(str);
			System.out.print(strb.reverse()+" ");
		}
	}

}
