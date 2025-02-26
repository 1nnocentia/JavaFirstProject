import java.util.Scanner;
import com.google.gson.Gson; //https://mvnrepository.com/artifact/com.google.code.gson/gson/2.12.1

public class MyFirstProgram {
    public static void main(String[] args) {
        //Declare Variable
        String name;
        String filePath = "D:\\Universitas Ciputra\\Semester 2\\OOP\\Lab1\\Assignment1\\First\\src\\funfact.json";
        String javaVer = System.getProperty("java.version");

        //Displaying welcome message
        System.out.println("\u001b[31m Hi! \u001b[35m Welcome to my first program in Java \u001b[0m");

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
        FunFactReader funFactReader = new FunFactReader(filePath);
        System.out.println("Here's a funJavaFact: ");
        System.out.println(funFactReader.getRandomFact());
    
        scanner.close();

        System.out.println("You're running on : " + javaVer + " JRE version");

    }
}

/* Bibliography : 
Ansi - https://en.wikipedia.org/wiki/ANSI_escape_code 
     - https://www.lihaoyi.com/post/BuildyourownCommandLinewithANSIescapecodes.html#colors
     
     */