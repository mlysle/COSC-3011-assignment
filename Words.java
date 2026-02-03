  public static class Words {
    String[] wordList = {"BROWN", "LOWER", "WATER", "TOWER", "AGILE"};

    static String getWord() {
      int index = (int) (Math.random() * wordList.length);
      return wordList[index];
    }
  }
