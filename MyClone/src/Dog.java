import java.util.*;
public class Dog {
	//initializing instance variables 
	private String name = "Un-named";
	private String breed = "Not set";
    Scanner in = new Scanner(System.in);
    //Constructor of Dog object initializing variables
    public Dog()
    {
    name = "Scruffy";
    breed = "Golden Retreiver";			   
    }
    
 
 //Bark Method
  public void Bark(){
    System.out.println("Woof Woof!");
  }
  //Sit Method
  public void Sit(){
    System.out.println("Scruffy sits down.");
  }
  //Method to set the dogs name
  public void setName(){
	  String answer;
  
    System.out.println("The dogs name is " + name);
    System.out.print("Would you like to rename the dog?(Yes/No):  ");
    do{
    	answer = in.next();
    
    if (answer.equals("Yes") | answer.equals("yes")){
     System.out.print("What would you like the new name to be?:  ");
      name = in.next();
      System.out.println("The dogs name is now " + name);
      System.out.println("Would you like to enter a different name?");
      answer = in.next();
    }
    else if (answer.equalsIgnoreCase("no"))
    {
      System.out.println("The dogs name is " + name);

    }
    else
    {
    	System.out.println("This is not a valid answer. Please try again.");
    }
   
    }
    while (answer.equalsIgnoreCase("yes") | !answer.equalsIgnoreCase("no"));
  }
  //Method to get the dogs name
   public void getName(){
 
     System.out.println(" The dogs name is " + name);
 
   }
   //Method to get the dogs breed
   public void getBreed()
   {
	   System.out.println(name + " is of the " + breed + " breed.");
   }
   //Method to set the Dogs breed.
   public void setBreed()
   {
	   String answer;
	   System.out.print("Would you like to set the breed of the dog?(Yes/No):  ");
	    do {
	    	answer = in.next();
	    
	    if (answer.equals("Yes") | answer.equals("yes")){
	     System.out.print("What would you like the new breed to be?:  ");
	      breed = in.next();
	      System.out.println("The dogs breed is now " + breed);
	      System.out.println("Would you like to enter a new breed?:  ");
	      answer = in.next();
	    }
	    else if (answer.equalsIgnoreCase("no"))
	    {
	      System.out.println("The dogs breed is " + name);

	    }
	    else
	    {
	    	System.out.println("This is not a valid answer. Please try again.");
	    }
	   
	    }
	    while (answer.equalsIgnoreCase("yes") | !answer.equalsIgnoreCase("no"));
   }

  }

