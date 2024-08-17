import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		PrimeNumbers primeNumber = new PrimeNumbers();
		Scanner in = new Scanner(System.in);
		
		int start, end;
		
		start = in.nextInt();
		end = in.nextInt();
		in.nextLine();
		
		primeNumber.createList(start,end);
		if(primeNumber.hasAtLeastTwoPrimes()) {
			System.out.println(primeNumber.getBiggestDistance());
			System.out.println(primeNumber.getLowestDistance());
		}else {
			System.out.println("Interval contains fewer than two primes.");
		}
	}

}
