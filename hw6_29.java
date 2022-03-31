package hw123;
import java.security.SecureRandom;
import java.util.Scanner;

public class hw6_29 {
	private enum status{
		HEAD , TAIL
	}
	private static SecureRandom random_num = new SecureRandom();
	static Scanner sucker = new Scanner(System.in);

	
	public static void main(String[] args) {
		int DoYouToss=1;
		status toss_status;
		int headtail;
		int head=0;
		int tail=0;
		while(DoYouToss!=0) {
			System.out.println("if you want to keep tossing , enter 1 , else 0");
			DoYouToss = sucker.nextInt();
			if(DoYouToss == 0) {
				break;
			}
			headtail = flip_coin();
			if(headtail == 0 ) {
				toss_status = status.HEAD;
			}
			else {
				toss_status = status.TAIL;
			}
			
			if(toss_status == status.HEAD) {
				head++;
			}
			else {
				tail++;
			}
			System.out.printf("times of head = %d \n",head);
			System.out.printf("times of tail = %d \n",tail);
			
			
		}	
}
	
	public static int flip_coin(){
		int owo = random_num.nextInt(2);
		return owo;
	}
	
	
	
	
}