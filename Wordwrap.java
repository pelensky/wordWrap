public class Wordwrap {
  public String splitLines(String phrase, int length){
    if (phrase.length() <= length) {
      return phrase;
    } else {
      return phrase.substring(0, length) + "\n" + splitLines(phrase.substring(length), length);
    }
  }
}
