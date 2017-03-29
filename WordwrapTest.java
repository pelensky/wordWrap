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
public void TwoWordsShouldBeSplitWithNoSpace(){
Wordwrap wordwrap = new Wordwrap();
String result = wordwrap.splitLines("Dan Pelensky", 9);
assertEquals("Dan\nPelensky", result);
}
}
