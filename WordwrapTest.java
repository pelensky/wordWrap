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
}
