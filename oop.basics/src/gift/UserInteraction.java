package gift;

import java.io.PrintStream;
import java.util.Scanner;

public class UserInteraction {
    private final Scanner scanner;
    private final PrintStream output;

    public UserInteraction() {
        scanner = new Scanner(System.in);
        output = new PrintStream(System.out);
    }
    public String requestString(String prompt) {
        output.print(prompt);
        return scanner.nextLine();
    }

    public int requestInt(String prompt) {
        output.print(prompt);
        return scanner.nextInt();
    }

    public boolean requestContinue(String prompt){
        output.print(prompt);
        String answer = scanner.nextLine();
        if (answer.toLowerCase().equals("n")){
            return true;
        }
        else if(answer.toLowerCase().equals("y") || answer.equals("")){
            return false;
        }
        throw new IllegalArgumentException("smth wrong");
    }
}
