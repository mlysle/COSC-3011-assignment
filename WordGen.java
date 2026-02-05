public class WordGen {
 String[] words = {
    "APPLE", "BEACH", "CLOUD", "DREAM", "EAGLE", 
    "FLAME", "GHOST", "HEART", "INDEX", "JOKER", 
    "LIGHT", "MANGO", "NIGHT", "OCEAN", "PIANO", 
    "QUART", "RIVER", "SNAKE", "TIGER", "URBAN", 
    "VOICE", "WATER", "YACHT", "ZEBRA"
  };

  String getWord() {
    int index = (int) (Math.random() * words.length);
    return words[index];
  }
}
