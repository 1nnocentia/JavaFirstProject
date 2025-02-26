import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
        //Declare Variable
        String name;
        String[] javaFunFact = {"You Can Run Java Code Without a main() Method!",
                                "Java is not a coffee!!! -But coffee while coding is top notch!",
                                "Before it was called Java, this language was called Oak because its founder saw an Oak tree outside his office",
                                "The 'Write Once, Run Anywhere' (WORA) principle allows Java to run anywhere, including on smart refrigerators!",
                                "Java has a cute mascot named Duke, who looks more like a triangular alien than a coffee cup!",
                                "Java was born in 1995, if you're born after that, Java is older than you!",
                                "Most of the Android application build in Java, if you're using Android phone, you're already use Java everyday!",
                                "Minecraft, a world popular game build with Java",
                                "Many Java developers admit that they often get confused because of NullPointerException—more upset than a ghosting ex!",
                                "Java doesn't have pointers like C++, but still many programmers get their heads hanging while debugging!",
                                "The Java compiler is like a killer lecturer—if you make the slightest mistake, it will immediately give you a red error without mercy!",
                                "Want to make a Java program? Get ready to make friends with Exception. It's not your ex who blocked you, but it's still annoying!",
                                "If this is your first time learning Java, 99% of the time you will write this first: System.out.println(\"Hello, World!\");",
                                "You must have written Java code, but the program didn't work, and then realized you forgot to create a public static void main(String[] args)!",
                                "\"To Java\" means drinking coffee. But if a programmer says \"I'm Java-ing\", it means he's coding (while drinking coffee)!"
                                }; //funfact retrived from ChatGPT with a little modification
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
        System.out.println(javaFunFact);
    
        scanner.close();

        System.out.println("JRE : " + javaVer);

    }
}

/* Bibliography : 
Ansi - https://en.wikipedia.org/wiki/ANSI_escape_code */