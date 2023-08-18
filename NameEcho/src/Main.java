import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello there! What's your name? ");
        String userName = scanner.nextLine();

        System.out.println("Hello, " + userName + "!");
        System.out.println("Get ready for some name echoing:");

        echoNameJoyfully(userName);

        System.out.println("Hope you enjoyed the name echoing joy, " + userName + "!");

        scanner.close();
    }

    public static void echoNameJoyfully(String name) {
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < 200000; i++) {
            resultBuilder.append(" ").append(name);
        }
        System.out.println(resultBuilder);
    }
}