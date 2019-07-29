package arjunsucks;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t1=0;int t2=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
			System.out.println(t1);
		else if(n==2){
			System.out.println(t1+" "+t2);
		}
		else {
			System.out.print(t1+" "+t2+" ");
			for(int i=2;i<n;i++) {
				int sum=t1+t2;
				System.out.print(sum+" ");
				t1=t2;
				t2=sum;		
			}
		}
	}

}
