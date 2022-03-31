package hw123;
import java.util.Scanner; // program uses class Scanner
import java.lang.Math;
//6.11 choose at random just mean choose at random?
//(b) get real random number
//(c) because it only accept one parameter which is the upper bound of random number
//(d) to simulate a real condition and it's useful for data scientist



public class hw6 {
	public static void main(String[] args) {

		for(int i=2;i<=10000;i++) {
			if(prime(i) != 0) {
				System.out.printf("%d is not a prime%n", i);
			}
			else {
				System.out.printf("%d is a prime%n", i);
			}
		}
		
}
	// using the method , i only have to count up to 100 to determine a prime number 
	// and i already know this method , so i won't do the n/2 version

	public static int prime(int number_in){
		double number= (double) number_in;
		int sqrt_number =(int) Math.sqrt(number);
		for(int i=2; i<=sqrt_number ;i++) {
			if(number_in % i == 0) {
				return number_in;
			}
		}
		
		return 0;
		
	}
}
	
