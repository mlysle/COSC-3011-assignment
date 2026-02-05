import java.util.Scanner;

public class GameManager {
  int wordLength;
  String word;

  GameManager() {
    WordGen words = new WordGen();
    word = words.getWord();
    wordLength = word.length();
  }

  void start() {
    int numCorrect = 0;
    int numCorrectPosition = 0;
    Scanner inputReader = new Scanner(System.in);
    String input;

    System.out.println(word);

    do {
      System.out.println("Guess word");
      input = inputReader.nextLine(); 
      numCorrectPosition = 0;
      numCorrect = 0;

      if (input.length() != wordLength) {
        System.out.println("Wrong word length. Should be " + wordLength + " letters.");
        continue;
      }
      for (int i = 0; i < word.length(); i++) {
        char c1 = word.charAt(i);
        char c2 = input.charAt(i);
        if (Character.toLowerCase(c1) == Character.toLowerCase(c2)) {
          numCorrectPosition++;
        }
      }

      System.out.println(numCorrectPosition);
    } while (!word.equalsIgnoreCase(input));
    inputReader.close();
  }
}
