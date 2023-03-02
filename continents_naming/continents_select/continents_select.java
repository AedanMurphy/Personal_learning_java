package continents_select;


import java.util.Scanner;
import java.util.ArrayList; 

public class continents_select {

	public static void main(String[] args) {
		// Input a name of a continent. 
		Scanner Input = new Scanner(System.in);
		

		
		System.out.println("Name all the continents of the world");
		String Userinput = Input.nextLine();
		
		ArrayList<String> continentList = new ArrayList<String>();
		
		continentList.add("North America");
		continentList.add("South America");
		continentList.add("Europe");
		continentList.add("Africa");
		continentList.add("Asia");
		continentList.add("Australia");
		continentList.add("Antartica");
		
		// ! inverts the boolean value = while the list is not empty 
		while (!continentList.isEmpty()) {
			if (continentList.contains(Userinput)) {
				continentList.remove(Userinput);
				//.size() counts the number of values in a list
				System.out.println(Userinput + " is in the list. " + continentList.size() + " more to go!");
				if (continentList.isEmpty()) {
					System.out.println("Congratulations, You win!");
					break;
				} else {
					// System.out.println("Secret answers: " + continentList);
					Userinput = Input.nextLine();
				}
			} else {
				System.out.println("That is incorrect");
				System.out.println("Try again!");
				// If the list name does not makes the user answer then continue with another input.
				while (!continentList.contains(Userinput)) {
					Userinput = Input.nextLine();
				}
			}
		}
	}
}


