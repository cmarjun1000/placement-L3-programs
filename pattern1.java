package arjunsucks;
import java.util.*;
public class pattern1 {
	static int alphabet(char  c) {
		int ch=c;
		for(int i=97;i<=123;i++) {
			if(i==(int)ch) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int len=s.length();
		for(int i=0;i<len;i++) {
			int ch=alphabet(s.charAt(0));
			for(int j=0;j<=i;j++) {
				System.out.print((char)ch++);
			}
			System.out.println();
		}
		sc.close();
	}

}
