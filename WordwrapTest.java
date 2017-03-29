import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WordwrapTest {

@Test
public void ShortWordShowOnOneLine() {
Wordwrap wordwrap = new Wordwrap();
String result = wordwrap.splitLines("Dan",15);
assertEquals("Dan", result);
}

@Test
public void BreaksLongWordDownOverMultipleLines() {
Wordwrap wordwrap = new Wordwrap();
String result = wordwrap.splitLines("DanDan", 3);
assertEquals("Dan\nDan", result);
}

@Test
public void BreaksLongerWordDownToASecondLine() {
Wordwrap wordwrap = new Wordwrap();
String result = wordwrap.splitLines("DanPelensky",6);
assertEquals("DanPel\nensky", result);
}

@Test
public void BreaksLinesToThreeLines(){
Wordwrap wordwrap = new Wordwrap();
String result = wordwrap.splitLines("DanIsCool", 3);
assertEquals("Dan\nIsC\nool", result);
}

@Test
public void BreaksAtSpace(){
Wordwrap wordwrap = new Wordwrap();
String result = wordwrap.splitLines("Dan Pelensky", 10);
assertEquals("Dan\nPelensky", result);
}

@Test
public void BreaksAtSpaceAgain(){
Wordwrap wordwrap = new Wordwrap();
String result = wordwrap.splitLines("Dan Is Cool", 4);
assertEquals("Dan\nIs\nCool", result);
}

@Test
public void BreakAtLastSpace(){
Wordwrap wordwrap = new Wordwrap();
String result = wordwrap.splitLines("Dan Dan Dan", 9);
assertEquals("Dan Dan\nDan", result);
}
}
