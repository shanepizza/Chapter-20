/*
Author: Adam Carling
Date: Monday, oct 22, 12:36 PM.
This program is a edit of Exercise08_37. It shuffles the list of states and capitols to ask the questions in a random order. 
*/
import java.util.*;

class NewStateQuiz {
	public static void main(String[] args) {
	//Make two lists. One for states, one for capitols
		List<String> stateList = Arrays.asList( "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusettes", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New York", "New Mexico", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming");
		List<String> capitolsList = Arrays.asList("Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Denver", "Hartford", "Dover", "Tallahassee", "Atlanta", "Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines", "Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", "Saint Paul", "Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton", "Albany", "Santa Fe", "Raleigh", "Bismarck", "Columbus", "Oklahoma City", "Salem", "Harrisburg", "Providence", "Columbia", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier", "Richmond", "Olympia", "Charleston", "Madison", "Cheyenne");
	//shuffle list with seed.
		double x = Math.random() *10 + 0.5;
		int y = (int) x;
//take away back slash below to see seed for shuffle.
//System.out.println(y);
		Collections.shuffle(capitolsList, new Random(y));
		Collections.shuffle(stateList, new Random(y));	
//Start of copy and paste
		Scanner input = new Scanner(System.in);
	//Correct answer counter
			int correctCount = 0;
			for (int i = 0; i < capitolsList.size(); i++) {
		// Prompt the user with a question
				System.out.print("What is the capital of " + stateList.get(i) + "? ");
				String capital = input.nextLine().trim().toLowerCase();
			//check answer
				if (capital.toLowerCase().equals(capitolsList.get(i).toLowerCase())) {
					System.out.println("Your answer is correct");
					correctCount++;
				}//end if
				else
					System.out.println("The correct answer should be " + capitolsList.get(i));
			}//end for loop
			System.out.println("The correct count is " + correctCount);
		}//end main method
}//end NewStateQuiz class