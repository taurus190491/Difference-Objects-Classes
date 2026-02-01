import java.util.Scanner;

/**
 *The purpose of this program is to demonstrate
 *the use of classes and objects, the subject
 *being a character creator.
*/

public class Character
{
    /*
        Main method. Creating three characters.
    */
    
    public static void main(String[] args)
    {
        System.out.println("Hello, this is to demonstrate the use of classes and objects. The user will be prompted to provide attributes to three characters.");
        
        /*
            Create four new objects from the character class. Each character
            will be their own instance.
        */
        
        Character one = new Character();
        Character two = new Character();
        Character three = new Character();
        Character four = new Character();
        
        /*
            Open a scanner object for user input.
        */
        
        Scanner input = new Scanner(System.in);

        /*
            User prompts.
        */

        System.out.print("Enter character 1 name: ");
        String name = input.next();
        
        System.out.print("Enter character 1 level (a whole number only): ");
        int level = input.nextInt();
      
        System.out.print("Enter character 1 role: ");
        String role = input.next();
        one.storeStats(name, level, role);
        System.out.println();
        
        System.out.print("Enter character 2 name: ");
        name = input.next();
        
        System.out.print("Enter character 2 level (a whole number only): ");
        level = input.nextInt();
       
        System.out.print("Enter character 2 role: ");
        role = input.next();
        two.storeStats(name, level, role);
        System.out.println();

        
        System.out.print("Enter character 3 name: ");
        name = input.next();
        
        System.out.print("Enter character 3 level (a whole number only): ");
        level = input.nextInt();
        
        System.out.print("Enter character 3 role: ");
        role = input.next();
        three.storeStats(name, level, role);
        System.out.println();

        System.out.print("Enter character 4 name: ");
        name = input.next();
        
        System.out.print("Enter character 4 level (a whole number only): ");
        level = input.nextInt();
        
        System.out.print("Enter character 4 role: ");
        role = input.next();
        four.storeStats(name, level, role);
        System.out.println();

        /*
            Close the scanner.
        */
        input.close();

        /*
            Display all character stats.
        */
        
        System.out.println("The following are your four characters: \n");
        one.showStats();
        two.showStats();
        three.showStats();
        four.showStats();

    }

    /*
        The instance variables used for each object of the character class. 
        They can be manipulated by the methods.
    */
    
    String charName =" ";
    int charLevel = 0;
    String charRole = " ";

    /*
        Store the user inputs in the instance variables provided above. Each
        object of the character class has their own set of instance variables.
    */    
   
    public void storeStats(String inName, int inLevel, String inRole)
    {
        charName = inName;
        charLevel = inLevel;
        charRole = inRole;
    }

    /*
        Display the contents of the instance variables
    */
    
    public void showStats()
    {
        System.out.println ("Character name: " + charName);
        System.out.println ("Level: " + charLevel);
        System.out.println ("Role: " + charRole);
        System.out.println();
    }
    
}