
import java.util.Scanner;
public class guessNameGame {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
				int i=0;
				String realname = "Jenish";
				String userName;
				
				do {
					System.out.println("Guess my name (type stop to exit)");

					userName= in.nextLine();
					i++;
					
					if(userName.equals("stop")) {
				        i--;
						break;
						
					}
					if(userName.equals("Jenish")) {
						
					
						System.out.println("Congratulations!");
						break;
						
					}
									
					
				
	} 
					while(!userName.equals("stop"));
				System.out.println("You guessed "+ i + " times.");

}
}

