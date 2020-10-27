package app;

/*
FIXIT 5

This programming should keep running as long as the user keeps entering yes.
*/

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String answer = "no";

        while(answer == "yes"){
            System.out.println("Do you want this to keep running? Type yes or no.");
            answer = input.nextInt();
        }
    }
}