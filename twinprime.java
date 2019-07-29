package arjunsucks;

public class twinprime {

	static int isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<100;i++) {
			if(isPrime(i)==1 && isPrime(i+2)==1) {
				System.out.println(i+"  "+(i+2));
			}
		}
	}

}
