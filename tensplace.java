package arjunsucks;

public class tensplace {

	static int noofdig(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		if(count==3)
			return 1;
		else
			return 0;
	}
	static int tensplace(int n) {
		int a=n/10;
		int b=a%10;
		if(b==2)
			return 1;
		else
			return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=300;i++) {
			if(noofdig(i)==1 && i%2==0 && tensplace(i)==1) {
				System.out.print(i+"  ");
			}
		}
	}

}
