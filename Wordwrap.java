public class Wordwrap {
  public String splitLine(String phrase, int number){
    int startOfLine = 0;
    int offsetByOne = 1;
    if (phrase.length() <= number) {
      return phrase;
    } else {
        int space = phrase.substring(startOfLine, number).lastIndexOf(" ");
        if (space >= 0) {
          return phrase.substring(startOfLine, space) + "\n" + splitLine(phrase.substring(space + offsetByOne), number);
        } else {
          return phrase.substring(startOfLine, number) + "\n" + splitLine(phrase.substring(number), number);
      }
    }
  }
}

