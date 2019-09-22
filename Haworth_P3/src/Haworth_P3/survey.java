package Haworth_P3;

import java.util.Scanner;

public class survey {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int responseNum, option, highestScore = 0, lowestScore = 0, surveyCount = 0;
		String topics[] = new String [5];
		int[][] responses = new int [5][10];
		float [] average =  new float[5];
		float [] topicScore = new float [5];
		
		topics[0] = "Parking";
		topics[1] = "Class sizes";
		topics[2] = "Upgraded classrooms";
		topics[3] = "On-campus food options";
		topics[4] = "Financial assistance";
		
		do {	
			System.out.println("\n\n-------Survey Menu-------");
			System.out.println("1) Take survey");
			System.out.println("2) View results");
			System.out.println("3) Exit");
			
			option = in.nextInt();
			
			if  ((option < 1) || (option > 3)) System.out.printf("\nInvalid entry. Please enter 1, 2 or 3.");
			
			while (option == 1){
				System.out.println("Please rate the following topics regarding UCF from 1 (least important) to 10 (most important).");
			
				for (int i = 0; i < 5; i++) {
					System.out.printf("\n%s : ", topics[i]);
					responseNum = in.nextInt();
					
					while ((responseNum < 1) || (responseNum > 10)) {
						System.out.printf("Invalid entry. Please enter a number between 1 and 10.");
						responseNum = in.nextInt();
					}			
					responses [i][responseNum -1 ]++;	
				}
			surveyCount++;	
			option = 0;
			}// end of survey loop
			
			
			while (option == 2) {
			
				if (surveyCount == 0) {
					System.out.printf("\nThere are no results to display. Please take a survey first\n");
					break; 
				}
			
				System.out.printf("-------------------------------------------------------------------------------------------------\n");
				System.out.printf(" Topics                      1     2     3     4     5     6     7     8     9     10     Average\n");
				for (int i = 0; i < 5; i++) {
					System.out.printf("\n %-23s", topics[i]);
					
					for (int j = 0; j < 10; j++) {
						System.out.printf(" %5d", responses [i][j]);
						topicScore[i] = topicScore[i] +((j+1) * responses[i][j]);   // uses statistical equation Sum(fx) / Sum(f)  
					}
					
					average[i] = (topicScore[i] / surveyCount);
					System.out.printf("%10.2f", average[i]);	
				}
				
				for (int i = 1; i < 5; i++ ) {
					if (average[highestScore] < average[i]) highestScore = i;
					if (average[lowestScore] > average[i]) lowestScore = i;				
				}
				
				System.out.printf("\n\n%s is the highest ranked topic with a total of %.0f points.", topics[highestScore], topicScore[highestScore]);
				System.out.printf("\n%s is the lowest ranked topic with a total of %.0f points.", topics[lowestScore], topicScore[lowestScore]);
				
				option = 0;
			}//End of View results loop
			
		}while (option != 3); // end of menu loop

		System.out.printf("\n\n\nGoodbye!");
		in.close();
	}
}
