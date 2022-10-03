
import java.util.Scanner;

public class guessNameGame {
	public static void main(String[] args) {
		//variable initialization
		Scanner in = new Scanner (System.in);
		int i=0;
		String realname = "Mohammadamin";
		String userName;
		// loop of guessing names
		do {
			System.out.println("Guess my name (type stop to exit)");

			userName= in.nextLine();
	
			// if user stops guessing		
			if(userName.equals("stop")) 
				break;
			
			i++;
			
			// if user guessed right
			if(userName.equals(realname)) {
				System.out.println("Congratulations!");
				break;
			}
		} while(!userName.equals("stop"));
		System.out.println("You guessed "+ i + " times.");
	}
}

