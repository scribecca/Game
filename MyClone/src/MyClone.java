import java.util.*;

public class MyClone {
	private  String firstName;
	private  String lastName;
	private Scanner in = new Scanner(System.in);
	
	
	//Method that inputs first and last name into introduction sentence
public void introduction(){
	System.out.println("Hello! My name is " + firstName + " " + lastName + ".");
}

//Getter method in order to retrieve name
public void getName(){
	System.out.println(firstName + " " + lastName);
}

//Setter Method to set name
public void setName(){
	// Prompt User for first and last name
			System.out.print("Please enter your first name:  ");
			firstName = in.next();
			System.out.print(" Please enter your last name:  ");
			lastName = in.next();
			System.out.println("Your name is now " + firstName + " " + lastName);
}




}

