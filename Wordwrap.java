public class Wordwrap {
  public String splitLines(String phrase, int number){
    if (phrase.length() <= number) {
    return phrase;
    } else {
      int space = phrase.substring(0, number+1).lastIndexOf(" ");
      if (space >= 0) {
        return phrase.substring(0, space) + "\n" + splitLines(phrase.substring(space+1), number);
      } else {
    return phrase.substring(0, number) + "\n" + splitLines(phrase.substring(number), number);
    }
    }
  }
}

