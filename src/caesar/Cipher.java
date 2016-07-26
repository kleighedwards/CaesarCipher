package caesar;
import java.util.Scanner;

public class Cipher {
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		char menu;
		String message = null;
		int mesglength = 0;
		int shift = 0;
		
		while(true){
			System.out.println("Would you like to [E]ncrypt");
			System.out.println("Would you like to [D]encrypt");
			System.out.println("Would you like to [Q]uit");
			menu = keyboard.next().toUpperCase().charAt(0);
			
			System.out.println("Please provide a messasge: ");
			message = keyboard.nextLine().toUpperCase();
			System.out.println("Please provide shift number: ");
			shift = keyboard.nextInt();
			mesglength = message.length();
			char[] messageC = new char [mesglength];
			System.out.println("messasge: " + message);
			for(int i =0; i < mesglength; i++){
				messageC[i] = message.charAt(i);
				System.out.println("i : " + i);
				System.out.println("messasgeC[i]: " + messageC[i]);}

			switch (menu){
			case 'E':
				encrypt(shift, messageC);
				break;
			case 'D':
				decrypt(shift, messageC)
				break;
			case 'Q':
				keyboard.close();
				System.exit(0);
		    }
		
	}
  }
   // decrypt {}
	
   // encrypt {}
	
  
}