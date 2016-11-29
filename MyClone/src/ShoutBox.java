/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author s.ribecca
 */
public class ShoutBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShoutBox ShoutBox = new ShoutBox();
        ShoutBox.shoutOutRandomMessage();
        ShoutBox.ArrayInitialize();
  
    }
    public void ArrayInitialize(){
        // TODO code application logic here
    
        //Initialization of the Scanner and ArrayList
        Scanner in = new Scanner(System.in);
        ArrayList<String> shoutBox = new ArrayList<>();

        //prompt the user to enter in 10 Commands.
        System.out.print("Please enter 10 Commands:  ");
        shoutBox.add(in.nextLine());

        //Variable showing how many commands still need to be entered. 
        //Set outside of loop so that variable is not reset to 9 every time.
        int commandsLeft = 9;

        //Loop counting down how many commands need to be entered.
        for (int i = 0; i < 8; i++) {
            System.out.print("Please enter " + commandsLeft + " more commands:  ");
            shoutBox.add(in.nextLine());
            commandsLeft--;
        }

        //Change sentence to take "s" off of "commands" for last command.
        System.out.print("Please enter " + commandsLeft + " more command:  ");
        shoutBox.add(in.nextLine());
        
        //implement new method
        shoutOutCannedMessage(shoutBox);
    }

    /**
     *
     * @param shoutBox
     */
    public void shoutOutCannedMessage(ArrayList<String> shoutBox)
    {
        //Initializing variables 
    	String RandomAnswer;
    	String answer;
    	int selectedMessage;
    	
        //initializing random number. selected 10 for 10 commands. 
    	int random = (int) (Math.random() * 10);
        Scanner in = new Scanner(System.in);
        //Loop to show array list.
        int i = 1;
        for (String list : shoutBox) 
        {
            //Additional println for good spacing between messages
            System.out.print(i + ") ");
            System.out.println(list);
            i++;
        }
        //Prompting to ask user if they want to enter a random message
        System.out.println("Would you like to shout a random message?:  ");
        RandomAnswer = in.next();
        if (RandomAnswer.equalsIgnoreCase("Yes"))
        {
        	System.out.println(shoutBox.get(random));
                //printing the random number + 1 as well to confirm that it is pulling from the correct spot
                System.out.println(random + 1);
        }
        else if (RandomAnswer.equalsIgnoreCase("No")) 
        {
            System.out.print("Please Select a Message:  ");  
 
            selectedMessage = in.nextInt();
            
            if (selectedMessage < (shoutBox.size() + 1))
            {
                System.out.println(shoutBox.get(selectedMessage - 1));
            }     
            else
            {
                System.out.println("This is not a valid message. Please select a number:  ");
            }
  
        }
        else
        {
        System.out.println("This is not a valid selection.");
        System.out.println("Please select a valid message:  ");
        shoutOutCannedMessage(shoutBox);
        }
         //prompting user to select if they want another message.   
            do
            {
                System.out.println("Would you like to select another message?:  ");
                answer = in.next();
                if (answer.equals("Yes") | answer.equals("yes"))
                {
                    shoutOutCannedMessage(shoutBox);
                }
                else if(answer.equals("No") | answer.equals("no"))
                {
                    System.out.println("Thank you! Have a great day!");
                    System.exit(0);
                }
                else
                {
                    System.out.println("This is not a valid selection.");
                }  
            }
            while ((answer.equalsIgnoreCase("Yes")));
    }
    
    	public void shoutOutRandomMessage(){
    		Scanner in = new Scanner(System.in);
    		//Initializing answer
    		String answer;
    		
    		//Initializing each ArrayList with 5 words from different parts of a sentence
    		ArrayList<String> Subject = new ArrayList<String>();
    		Subject.add("Stephen");
    		Subject.add("Dr. Sethi");
    		Subject.add("Devin");
    		Subject.add("The Dog");
    		Subject.add("Michael");
    		ArrayList<String> Object = new ArrayList<String>();
    		Object.add("ball");
    		Object.add("fish");
    		Object.add("coffee");
    		Object.add("slinky");
    		Object.add("stapler");
    		ArrayList<String> Verb = new ArrayList<String>();
    		Verb.add("jolt");
    		Verb.add("jump");
    		Verb.add("throw");
    		Verb.add("push");
    		Verb.add("call");
    		ArrayList<String> Adjective = new ArrayList<String>();
    		Adjective.add("juicy");
    		Adjective.add("hot");
    		Adjective.add("cold");
    		Adjective.add("slim");
    		Adjective.add("fat");
    		ArrayList<String> Adverb = new ArrayList<String>();
    		Adverb.add("quickly");
    		Adverb.add("intelligently");
    	    Adverb.add("shyly");
    	    Adverb.add("tenaciously");
    	    Adverb.add("swiftly");
    	    do
    	    {
    	    System.out.println("Would you like to shout a random message?:   ");
    	    answer = in.next();
    	    if (answer.equalsIgnoreCase("Yes"))
    	    {
    	    	//Initializing each random word every time the user selects "yes"
    	    int randomSubject = (int) (Math.random() * 5);
    		int randomObject = (int) (Math.random() * 5);
    		int randomVerb= (int) (Math.random() * 5);
    		int randomAdjective = (int) (Math.random() * 5);
    		int randomAdverb = (int) (Math.random() * 5);
    	    System.out.println(Subject.get(randomSubject) + " will " + Verb.get(randomVerb) + " the " + Adjective.get(randomAdjective) 
    	    + " " + Object.get(randomObject) + " " + Adverb.get(randomAdverb) + ".");
    	    }
    	    else if (answer.equalsIgnoreCase("no"))
    	    {
    	    	System.out.println("Thank you have a great day!");
    	    }
    	    else
    	    {
    	    	System.out.println("That is not a valid answer.");
    	    }
    	    }
    	    while (answer.equalsIgnoreCase("Yes") | !answer.equalsIgnoreCase("no"));
    	    
    	    
    	    

    		
    	} 
}




