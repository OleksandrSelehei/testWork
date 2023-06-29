import Parser.ParserText;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println("Hello, please enter text: ");
            Scanner input = new Scanner(System.in);
            String userInput = input.nextLine();
            ParserText userInputText = new ParserText(userInput);
            System.out.println(userInputText.parserUniqueElement());
            System.out.println("To continue, type Yes/ to finish, type No.");
            String userInputFlag = input.nextLine();
            if (userInputFlag.equals("No")){
                break;
            }
        }

    }
}