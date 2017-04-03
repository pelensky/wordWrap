public class Wordwrap {
  public String splitLines(String phrase, int length){
    if (phrase.length() <= length) {
      return phrase;
    } else {
        int space = phrase.substring(0, length+1).lastIndexOf(" ");
        if (space >= 0) {
          return phrase.substring(0, space) + "\n" + splitLines(phrase.substring(space+1), length);
        } else {
      return phrase.substring(0, length) + "\n" + splitLines(phrase.substring(length), length);
        }
    }
  }
}
