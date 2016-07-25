package caesar;
import java.util.Scanner;

public class Cipher {
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String message = null;
		int mesglength = 0;
		int shift = 0;
		
		System.out.println("Hello World!");
		System.out.println("Please provide a messasge to encrypt: ");
		message = keyboard.nextLine().toUpperCase();
		System.out.println("Please provide shift number: ");
		shift = keyboard.nextInt();
		mesglength = message.length();
		char[] messageC = new char [mesglength];
		
		
		System.out.println("messasge: " + message);
		for(int i =0; i < mesglength; i++){
			messageC[i] = message.charAt(i);
			System.out.println("i : " + i);
			System.out.println("messasgeC[i]: " + messageC[i]);
		}
		
		for(int i =0; i < mesglength; i++){
			if ((messageC[i] + shift) > ('Z')){
				messageC[i] = (char)(shift - 25);
				System.out.println("New_messasgeC[i]: " + messageC[i]);
				
			}
			else{
				messageC[i] = (char)(messageC[i] + shift);
			    System.out.println("New_messasgeC[i]: " + messageC[i]);
		        }
	}
  }
}