package arjunsucks;

public class twistedprime {

	static int isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return 0;
			}
		}
		return 1;
	}
	static int reverse(int n) {
		int rem=0,rev=0;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<100;i++) {
			if(isPrime(i)==1 && isPrime((reverse(i)))==1) {
				System.out.print(i+"  ");
			}
		}
	}

}
