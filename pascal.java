package arjunsucks;
import java.util.*;
public class pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] ar=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0)
					ar[i][j]=1;
				else if(i==j)
					ar[i][j]=1;
				else
					ar[i][j]=ar[i-1][j-1]+ar[i-1][j];
			}
		}
		for(int i=0;i<n;i++) {
			int k=0;
			for(int j=0;j<n;j++) {
				if(j<n-1-i) {
					System.out.print(" ");
				}
				else
					System.out.print(ar[i][k++]+" ");
			}
			System.out.println();
		}
	}

}
