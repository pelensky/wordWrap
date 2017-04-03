public class Wordwrap {
  public String splitLine(String phrase, int number){
    if (phrase.length() <= number) {
      return phrase;
    } else {
        int space = phrase.substring(0, number).lastIndexOf(" ");
        if (space >= 0) {
          return phrase.substring(0, space) + "\n" + splitLine(phrase.substring(space + 1), number);
        } else {
          return phrase.substring(0, number) + "\n" + splitLine(phrase.substring(number), number);
      }
    }
  }
}

