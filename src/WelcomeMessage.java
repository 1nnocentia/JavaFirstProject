public class WelcomeMessage {
    public static void show() throws InterruptedException {
    //Array of colours
        String[] colors = {
            "\u001B[31m", //Red
            "\u001B[32m", //Green
            "\u001B[33m", //Yellow
            "\u001B[34m", //Blue
            "\u001B[35m", //Purple
            "\u001B[36m"  //Cyan
        };
        
        //Reset Colour
        String reset = "\u001B[0m";
        
        //Looping for blinking and change colours
        for (int i = 0; i < 10; i++) {
            String color = colors[i % colors.length]; //Change colours
            
            // Cetak banner dengan warna berubah-ubah
            System.out.println("\n" + color + "*********************************************" + reset);
            System.out.println("\n \u001b[31m Hi! \u001b[35m Welcome to my first program in Java! \u001b[0m \n");
            System.out.println(color + "*********************************************\n" + reset);
            
            Thread.sleep(500); //0.5s hold before colour changes
            clearScreen(); //clear screen
        }
    }

    //Method to clear screen
    private static void clearScreen() {
        System.out.print("\033[H\033[2J"); // \033 terminal control \[H cursor to home position \[2J clear screen
        System.out.flush(); //ensure the clearscreen code is executed
    }
}
