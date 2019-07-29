package arjunsucks;

public class alternateprime {

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
		int count=1;
		for(int i=2;i<100;i++) {
			if(isPrime(i)==1 && count%2!=0) {
				count++;
				System.out.print(i);
			}
			else if(isPrime(i)==1 && count%2==0) {
				count++;
				System.out.print(" ");
			}
			else
				continue;
		}
	}

}
