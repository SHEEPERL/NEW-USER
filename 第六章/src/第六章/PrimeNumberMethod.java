package 第六章;

public class PrimeNumberMethod {

	public static void main(String[] args) {
		System.out.println("The frist 50  prime numbers are\n");
		printPrimeNumbers(50);

	}
	
	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIME_PRE_LINE = 10;
		int count = 0;//Count the number  of prime number
		int number = 2;//A number to be tested for primeness
		
		//Repeatedly find prime number
		while(count < numberOfPrimes) {
			//print the number and increase the count
			if(isPrime (number)) {
				count++;
				if(count % NUMBER_OF_PRIME_PRE_LINE == 0 ) {
					//print the number and advance to the new line
					System.out.printf("%-5s\n",number);//%-5s:保持变量长度为五位
				}                                      //：不足五位在后面用空格补齐
				else {
					System.out.printf("%-5s",number);
				}
			}
			
			//Check whether the next number is prime
			number++;
		}
	}
	
	//Check whether the number is prime 
	public static boolean isPrime(int number) {
		for(int divisor = 2;divisor <= number/2;divisor++) {
			if(number%divisor==0) {//If true,number is prime
				return false;
			}
		}
		
		return true;
	}
	
}
