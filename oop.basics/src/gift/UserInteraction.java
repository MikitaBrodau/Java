package gift;

import gift.sweets.GetSweetType;

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
        while (true) {
            String check = scanner.nextLine();
            if (check.isEmpty() || check.matches("\\d+")) {
                System.out.println("Write words only ");
                continue;
            }
            return check;
        }
    }

    public int requestInt(String prompt) {
        output.print(prompt);
        while (true) {
            Integer check = tryRequestInt();
            if (check == null || check <= 0) {
                System.out.println("Your input can't be empty" +
                        "\nOr less then zero or equal");
                continue;
            }
            return check;
        }
    }

    private Integer tryRequestInt() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Wrong input");
    }

    public boolean requestContinue(String prompt) {
        output.print(prompt);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("n")) {
            return true;
        } else if (answer.equalsIgnoreCase("y") || answer.equals("")) {
            return false;
        }
        throw new IllegalArgumentException("smth wrong");
    }
}
