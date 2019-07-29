package arjunsucks;
import java.util.*;
public class decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem[]=new int[20],j=0;
		while(n!=0) {
			rem[j++]=n%2;
			n/=2;
		}
		for(int i=j-1;i>=0;i--) {
			System.out.print(rem[i]+" ");
		}
	}

}
