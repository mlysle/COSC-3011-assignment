import java.util.HashMap;
import java.util.Scanner;

public class GameManager {
  int wordLength;
  String word;

  GameManager() {
    WordGen wordGenerator = new WordGen();
    word = wordGenerator.getWord();
    wordLength = word.length();
  }

  int numCorrectLetter(String guess, HashMap<Character, Integer> wMap) {
    int correct = 0;
      for (int i = 0; i < word.length(); i++) {
        char c = guess.charAt(i);
        c = Character.toUpperCase(c);
        Integer letterCount = wMap.get(c);
        if (letterCount != null) {
          if (letterCount >= 0) {
            correct++;
            wMap.put(c, letterCount-1);
          }
        }
      }
    return correct;
  }

  int numCorrectPosition(String word, String guess) {
    int correct = 0;
      for (int i = 0; i < word.length(); i++) {
        char c1 = word.charAt(i);
        char c2 = guess.charAt(i);
        if (Character.toLowerCase(c1) == Character.toLowerCase(c2)) {
        correct++;
        }
    }
    return correct;
  }

  HashMap<Character, Integer> wordMapGen(String word) {
    HashMap<Character, Integer> wMap = new HashMap<>();

    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      c = Character.toUpperCase(c);
      Integer letterCount = wMap.get(c);

      if (letterCount != null) {
        wMap.put(c, letterCount + 1);
      }
      else {
        wMap.put(c, 1);
      }
    }

    return wMap;
  }

  void start() {
    Scanner inputReader = new Scanner(System.in);
    String input;
    HashMap<Character, Integer> wordMap = wordMapGen(word);

    do {
      System.out.println("Guess word");
      input = inputReader.nextLine(); 

      if (input.length() != wordLength) {
        System.out.println("Wrong word length. Should be " + wordLength + " letters.");
        continue;
      }

      System.out.println("(" + numCorrectLetter(input, wordMap)+ ", " + numCorrectPosition(word, input)+ ")");
    } while (!word.equalsIgnoreCase(input));
    inputReader.close();
    System.out.println("Success");
  }
}
