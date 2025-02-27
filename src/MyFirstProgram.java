import java.util.Scanner;
import com.google.gson.Gson; //https://mvnrepository.com/artifact/com.google.code.gson/gson/2.12.1

public class MyFirstProgram {
    public static void main(String[] args) throws InterruptedException {
        //Declare Variable
        String name;
        String filePath = "D:\\Universitas Ciputra\\Semester 2\\OOP\\Lab1\\Assignment1\\First\\src\\funfact.json";
        String javaVer = System.getProperty("java.version");
        String[] frames = {"-", "\\", "|", "/"};
        String[] art = {
            "\u001b[100m                                     )                    \u001b[0m",
            "\u001b[100m                            )      ((     (               \u001b[0m",
            "\u001b[100m                           (        ))     )              \u001b[0m",
            "\u001b[100m                    )       )      //     (               \u001b[0m",
            "\u001b[100m               _   (        __    (     ~->>              \u001b[0m",
            "\u001b[100m        ,-----' |__,_~~___<'__`)-~__--__-~->> <           \u001b[0m",
            "\u001b[100m        | //  : | -__   ~__ o)____)),__ - '> >-  >        \u001b[0m",
            "\u001b[100m        | //  : |- \\_ \\ -\\_\\ -\\ \\ \\ ~\\_  \\ ->> - ,  >>    \u001b[0m",
            "\u001b[100m        | //  : |_~_\\ -\\__\\ \\~'\\ \\ \\, \\__ . -<-  >>       \u001b[0m",
            "\u001b[100m        `-----._| `  -__`-- - ~~ -- ` --~> >              \u001b[0m",
            "\u001b[100m         _/___\\_    //)_`//  | ||]                        \u001b[0m",
            "\u001b[100m   _____[_______]_[~~-_ (.L_/  ||                         \u001b[0m",
            "\u001b[100m  [____________________]' `\\_,/'/                         \u001b[0m",
            "\u001b[100m    ||| /          |||  ,___,'./                          \u001b[0m",
            "\u001b[100m    ||| \\          |||,'______|                           \u001b[0m",
            "\u001b[100m    ||| /          /|| I==||                              \u001b[0m",
            "\u001b[100m    ||| \\       __/_||  __||__                            \u001b[0m",
            "\u001b[100m-----||-/------`-._/||-o--o---o---                        \u001b[0m"
        }; //https://www.asciiart.eu/computers/computers


        //Loading Animation
        for (int i = 0; i < 20; i++) {
            System.out.print("\rLoading " + frames[i % frames.length]);
            Thread.sleep(200);
        }
        System.out.println("\r                 ");

        //Displaying welcome message
        System.out.println("\n*********************************************");
        System.out.println("\n \u001b[31m Hi! \u001b[35m Welcome to my first program in Java! \u001b[0m \n");
        System.out.println("*********************************************\n");
        Thread.sleep(700);

        for (String line : art) {
            System.out.println(line);
            Thread.sleep(200);
        }


        //Set up scanner for user input
        Scanner scanner = new Scanner (System.in);

        //Get user input
        System.out.println("\nMy name is Inno, could I know your name?");
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