public class Word {
  private String word;
  private String[] wordList = {"BROWN", "LOWER", "WATER", "TOWER", "AGILE"};
  public Word() {
    int index = (int) (Math.random() * wordList.length);
    word = wordList[index];
  }
}
