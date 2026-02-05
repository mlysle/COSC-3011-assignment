import java.util.HashMap;
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
    HashMap<Character, Integer> wordMap = new HashMap<>();

    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      c = Character.toUpperCase(c);
      Integer letterCount = wordMap.get(c);

      if (letterCount != null) {
        wordMap.put(c, letterCount + 1);
      }
      else {
        wordMap.put(c, 1);
      }
    }

    System.out.println(wordMap);
    System.out.println(word);

    do {
      System.out.println("Guess word");
      input = inputReader.nextLine(); 
      numCorrectPosition = 0;
      numCorrect = 0;
      HashMap<Character, Integer> loopWordMap = wordMap;

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
        c2 = Character.toUpperCase(c2);
        Integer letterCount = wordMap.get(c2);
        if (letterCount != null) {
          if (letterCount >= 0) {
            numCorrect++;
            loopWordMap.put(c2, letterCount-1);
          }
        }
        
      }

      System.out.println("(" + numCorrect + ", " + numCorrectPosition + ")");
    } while (!word.equalsIgnoreCase(input));
    inputReader.close();
    System.out.println("Success");
  }
}
