package arjunsucks;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				int sum=i+j;
				if(sum%2==0) {
					if((i==0 && j==0) || (i==0 && j==4) || (i==4 && j==0) || (i==4 && j==4)){
						System.out.print(" ");
						continue;
					}
					System.out.print(++count);
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
