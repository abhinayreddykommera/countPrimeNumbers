package countPrimeNumbers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countPrimeNumbers(20);

	}
	
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println("false");
				return false;
			}
		}
		System.out.println("true");
		return true;
	}
	
	public static void countPrimeNumbers(int n) {
		int count=0;
		for(int i=2;i<=n;i++) {
			isPrime(i);
			if(isPrime(i)) {	
			System.out.println("The prime number is " + i);
			count++; 
			System.out.println(count);
			}
			if(count==3) {
				break;
			}
		}
	}

}
