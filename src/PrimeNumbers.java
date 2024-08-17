
public class PrimeNumbers {

	private static int INIT_NUMBER = 0;

	private int[] primeList;
	private int size;

	public PrimeNumbers() {
		primeList = new int[INIT_NUMBER];
	}

	public void createList(int start, int end) {

		for (int i = start; i <= end; i++) {

			if (i != 1 && hasOnlyTwoDivisors(i)) {
				addToList(i);
			}
		}

	}

	private void addToList(int i) {

		if (isFull())
			grow();

		primeList[size++] = i;

	}

	private boolean isFull() {

		boolean result = false;
		if (size == primeList.length) {
			result = true;
		}
		return result;
	}

	private void grow() {
		int[] tmp = new int[primeList.length + 1];

		for (int i = 0; i < primeList.length; i++) {
			tmp[i] = primeList[i];
		}
		primeList = tmp;
	}

	private boolean hasOnlyTwoDivisors(int number) {

		boolean result = false;
		int numberOfDivisions = 0;

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				numberOfDivisions++;
			}
		}

		if (numberOfDivisions == 2) {
			result = true;
		}

		return result;
	}

	public boolean hasAtLeastTwoPrimes() {

		boolean result = false;

		if (primeList.length >= 2) {
			result = true;
		}
		return result;
	}

	public int getBiggestDistance() {

		int biggestDistance = 0;

		for (int i = 0; i < primeList.length - 1; i++) {

			if (primeList[i + 1] - primeList[i] > biggestDistance) {
				biggestDistance = primeList[i + 1] - primeList[i];
			}
		}

		return biggestDistance;
	}

	public int getLowestDistance() {
		
		int lowestDistance = primeList[1] - primeList[0];

		for (int i = 0; i < primeList.length - 1; i++) {

			if (primeList[i + 1] - primeList[i] < lowestDistance) {
				lowestDistance = primeList[i + 1] - primeList[i];
			}
		}

		return lowestDistance;
	}

}
