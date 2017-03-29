public class Wordwrap {
  public String splitLines(String phrase, int number){
    if (phrase.length() <= number) {
    return phrase;
    } else {
    return phrase.substring(0, number) + "\n" + phrase.substring(number);
    }
  }
}

