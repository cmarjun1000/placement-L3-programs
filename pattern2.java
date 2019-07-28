package arjunsucks;

import java.util.Scanner;

public class pattern2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String res=new String();
		int len=s.length();
		for(int i=0;i<=len-1;i++) {
			for(int j=0;j<=i;j++) {
				//for(int k=0;k<=j;k++) {
					char ch=s.charAt(j);
					System.out.print(ch);
				//}
			}
				
			System.out.println();
		}
		sc.close();
	}

}
