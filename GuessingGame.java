import java.util.Scanner;
public class guessingGame {
    public static void main(String[] args) {
        int numCorrect = 0;
        int numCorrectPosition = 0;
        String[] wordList = {"BROWN", "LOWER", "WATER", "TOWER", "AGILE"};
        int index = (int) (Math.random() * wordList.length);
        String word = wordList[index];
        Scanner inputReader = new Scanner(System.in);
        String input;
        System.out.println(word);
        do {
          System.out.println("Guess word");
          input = inputReader.nextLine();  // Read user input
        } while (!word.equals(input));
        inputReader.close();
    }
}
