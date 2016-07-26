package caesar;

import java.util.Scanner;

public class Cipher {
  public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		char menu;
		String message = null;
		int mesglength = 0;
		int shift = 0;
		
		while(true){

			System.out.println("\nWould you like to [E]ncrypt");
			System.out.println("Would you like to [D]encrypt");
			System.out.println("Would you like to [Q]uit");
			menu = keyboard.next().toUpperCase().charAt(0);
			keyboard.nextLine();

			if(menu == 'Q'){
				keyboard.close();
				System.exit(0);
			}

			System.out.println("Please provide a messasge: ");

			message = keyboard.nextLine().toUpperCase();
			System.out.println("Please provide shift number: ");
			shift = keyboard.nextInt();
			mesglength = message.length();
			char[] messageC = new char [mesglength];
			for(int i =0; i < mesglength; i++){
				messageC[i] = message.charAt(i);
			}


			System.out.println("Original Messasge: " + message);

			switch (menu){
			case 'E':
				encrypt(shift, messageC);
				break;
			case 'D':
				decrypt(shift, messageC);
				break;
			default:
		    }
	    }
  }
  
  public static void encrypt(int shift, char messageC[]) {
		for (int i = 0; i < messageC.length; i++) {
			if ((messageC[i] + shift) < ('A')) {
				messageC[i] = '\u0020';} // if punctuation, convert to space		
			else if ((messageC[i] + shift) > ('Z')) {				
				messageC[i] = (char)((int)(messageC[i])-90+64+shift);} // to wrap ascii: char[i] - 'Z' + ('A'-1) + shift			
			else {
				messageC[i] = (char) (messageC[i] + shift);}
		}
		System.out.print("Encrypted Message: ");
		for (int i = 0; i < messageC.length; i++) {
			System.out.print(messageC[i]);
		}
		System.out.println("");
  }

  public static void decrypt(int shift, char messageC[]) {
	  for (int i = 0; i < messageC.length; i++) {
		  if (messageC[i] == '\u0020'){
			  messageC[i] = '\u0020';} // if punctuation is space, keep as a space		
		  else if ((messageC[i] - shift) < ('A')) {				
			  messageC[i] = (char)((int)(messageC[i])+90-64-shift);} // to reverse wrap ascii: char[i] + 'Z' - ('A'-1) - shift			
		  else {
			  messageC[i] = (char) (messageC[i] - shift);}
	  }
	  System.out.print("Encrypted Message: ");
	  for (int i = 0; i < messageC.length; i++) {
		  System.out.print(messageC[i]);
	  }
	  System.out.println("");
  }
}


