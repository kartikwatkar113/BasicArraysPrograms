package pack.loopingprograms;

import java.util.Scanner;

public class PrimeFindorNot {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.println("Enter number:- ");
		int n=k.nextInt();
		if(isPrime(n)) {
			System.out.println(n+" Number is Prime...");
		}
		else {
			System.out.println(n+" Number is not Prime...");
			System.out.println("Previos Prime number of "+n+" is "+previousPrime(n));
			System.out.println("After Prime number of "+n+" is "+afterPrime(n));
		}

	}
	//to check prime
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	//to check previous prime
	public static int previousPrime(int n) {
		
		int pprime=n-1;
		while(!isPrime(pprime)) {
			pprime--;
		}
		return pprime;
		
	}
	
	//to check after prime
	public static int afterPrime(int n) {
		
		int aprime=n+1;
		while(!isPrime(aprime)) {
			aprime++;
		}
		return aprime;
		
	}
}
