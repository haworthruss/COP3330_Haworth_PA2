import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int userNum;
		int userNumDigit[], encryptDigit[]; 
		userNumDigit = new int[5];
		encryptDigit = new int[5];
		
		System.out.println("Enter the four digit number to be encrypted: ");
		
		userNum = in.nextInt();
		
		userNumDigit[4] = userNum % 10;
		userNumDigit[3] = (userNum / 10) % 10;
		userNumDigit[2] = (userNum / 100) % 10;
		userNumDigit[1] = (userNum / 1000) % 10;
				
		for (int i = 1; i < 5; i++) {
			userNumDigit[i]= (userNumDigit[i]+7) % 10;	   
		}
		
		encryptDigit[1]= userNumDigit[3];
		encryptDigit[2]= userNumDigit[4];
		encryptDigit[3]= userNumDigit[1];
		encryptDigit[4]= userNumDigit[2];

		System.out.print("Your encypted number is: " );
		
		for (int j = 1; j < 5; j++) {			
			System.out.print(encryptDigit[j]);
		}
		in.close();
	}
}
