import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int encryptNum;
		int userNumDigit[], encryptDigit[]; 
		userNumDigit = new int[5];
		encryptDigit = new int[5];
		
		System.out.println("Enter the four digit number to be decrypted: ");		
		
		encryptNum= in.nextInt();
		
		encryptDigit[4] = encryptNum % 10;
		encryptDigit[3] = (encryptNum / 10) % 10;
		encryptDigit[2] = (encryptNum / 100) % 10;
		encryptDigit[1] = (encryptNum / 1000) % 10;
		
		for (int i = 1; i < 5; i++) {
			encryptDigit[i]= (encryptDigit[i]+3) % 10;	   
		}
		
		userNumDigit[1] = encryptDigit[3];
		userNumDigit[4] = encryptDigit[2];
		userNumDigit[3] = encryptDigit[1];
		userNumDigit[2] = encryptDigit[4];

		System.out.print("Your decypted number is: " );
		
		for (int j = 1; j < 5; j++) {			
			System.out.print(userNumDigit[j]);
		
		}
		
		in.close();	
	}

}
