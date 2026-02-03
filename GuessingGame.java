import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        int numCorrect = 0;
        int numCorrectPosition = 0;
        String[] wordList = {"BROWN", "LOWER", "WATER", "TOWER", "AGILE"};
        int index = (int) (Math.random() * wordList.length);
        String word = wordList[index];
        Scanner inputReader = new Scanner(System.in);
        String input;
        int wordLength = word.length();
        System.out.println(word);
        do {
          System.out.println("Guess word");
          input = inputReader.nextLine();  // Read user input
          if (input.length() != wordLength) {
            System.out.println("Wrong word length. Should be " + wordLength + " letters.");
            continue;
          }
          for (int i = 0; i < word.length(); i++){
            char c1 = word.charAt(i);
            char c2 = input.charAt(i);
          }
        } while (!word.equalsIgnoreCase(input));
        inputReader.close();

    }
}
