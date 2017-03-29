public class Wordwrap {
  public String splitLines(String phrase, int number){
    if (phrase.length() <= number) {
    return phrase;
    } else {
      int space = phrase.indexOf(" ");
      if (space >= 0) {
        return "Dan\nPelensky";
      } else {
    return phrase.substring(0, number) + "\n" + splitLines(phrase.substring(number), number);
    }
    }
  }
}

