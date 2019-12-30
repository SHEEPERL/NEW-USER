package ตฺม๙ีย;

import java.util.Scanner;

public class GreatestConmonDivisorMethod {

	public static void main(String[] args) {
	    //Create a Scanner
		Scanner input =  new Scanner(System.in);
		
		//prompt the user to the enter two integers
		System.out.println("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.println("Enter second integer: ");
		int n2 = input.nextInt();

		System.out.println("The Greatest common divisor for "+n1+" and "+n2+" is "+gcd(n1,n2));
		
		input.close();
	}
	
	//Return the gcd of two integer
	public static int gcd(int n1,int n2) {
		int gcd = 1;//Initail gcd is 1
		int k = 2;//Possible gcd
		
		while(k <= n1 && k<=n2) {
			if(n1%k==0 && n2%k == 0) {
				gcd = k;
			}
			
			k++;
		}
		return gcd;
	}

}
