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
        String favColour;


        //Loading Animation
        for (int i = 0; i < 20; i++) {
            System.out.print("\r \u001B[32mLoading \u001B[0m" + frames[i % frames.length]);
            Thread.sleep(200);
        }
        System.out.println("\r                 ");

        //Displaying welcome message
        //System.out.println("\n*********************************************");
        //System.out.println("\n \u001b[31m Hi! \u001b[35m Welcome to my first program in Java! \u001b[0m \n");
        //System.out.println("*********************************************\n");
        //Thread.sleep(700);
        WelcomeMessage.show();

        for (String line : art) {
            System.out.println(line);
            Thread.sleep(200);
        }

        Thread.sleep(500);


        //Set up scanner for user input
        Scanner scanner = new Scanner (System.in);

        //Get user input
        System.out.println("\n\n\u001B[34m       My name is Inno, could I know your name? \u001b[0m \n");
        System.out.print("Please type your name: ");
        name = scanner.nextLine();

        //Looping if someone claim to be me
        do {
            //If user input = "inno"
            if (name.equalsIgnoreCase("inno")) {
                System.out.print("\u001B[31m You're me?! Please type your name! \u001B[0m");
                //Get user input again
                name = scanner.nextLine();
                }
        //As long as the input remains "inno" then the loop will run
        } while (name.equalsIgnoreCase("inno"));

            
        //Personilized Greeting
        System.out.println("\n Hi \u001B[35m" + name + "\u001B[0m! I'm glad to meet you!\n");

        //Ask user their fav color
        System.out.println("What's ur fav color from RGB? (r/g/b)");
        System.out.print("Please type your color: ");
        favColour = scanner.nextLine().toLowerCase();
        
        switch (favColour) {
            case "r" -> System.out.println("\u001B[31m");
            case "g" -> System.out.println("\u001B[32m");
            default -> System.out.println("\u001B[34m");
        }

        //change output display into its colour
            
        //Displaying Funfact about Java
        FunFactReader funFactReader = new FunFactReader(filePath);
        System.out.println("\u001B[1m Here's a funJavaFact: \n");
        System.out.println(funFactReader.getRandomFact());
        System.out.println("\u001B[0m");
    
        scanner.close();

        System.out.println("\u001B[3m You're running on : " + javaVer + " Java version \u001B[0m");
        System.out.println("\n \u001B[1m \u001B[35mSee u Again!!!\u001B[0m");
        

    }
}

/* Bibliography : 
Ansi - https://en.wikipedia.org/wiki/ANSI_escape_code 
     - https://www.lihaoyi.com/post/BuildyourownCommandLinewithANSIescapecodes.html#colors
     
     */