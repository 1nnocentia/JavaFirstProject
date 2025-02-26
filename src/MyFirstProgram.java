import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
        //Declare Variable
        String name;
        String javaVer = System.getProperty("java.version");

        //Displaying welcome message
        System.out.println("Hi! Welcome to my first program in Java");

        //Set up scanner for user input
        Scanner scanner = new Scanner (System.in);

        //Get user input
        System.out.println("My name is Inno, could I know your name?");
        System.out.print("Please type your name: ");
        name = scanner.nextLine();

        //Looping if someone claim to be me
        do {
            //If user input = "inno"
            if (name.equalsIgnoreCase("inno")) {
                System.out.print("You're me?! Please type your name! ");
                //Get user input again
                name = scanner.nextLine();
                }
        //As long as the input remains "inno" then the loop will run
        } while (name.equalsIgnoreCase("inno"));

            
        //Personilized Greeting
        System.out.println("Hi " + name + "! I'm glad to meet you");

        //Ask user their fav color

        //change output display into its color
            
        //Displaying Funfact about Java
        System.out.println("Here's a funJavaFact: ");  
    
        scanner.close();

        System.out.println("You're running on : " + javaVer + " JRE version");

    }
}

/* Bibliography : 
Ansi - https://en.wikipedia.org/wiki/ANSI_escape_code */