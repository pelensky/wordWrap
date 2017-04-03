import org.junit.*;
import static org.junit.Assert.*;

public class WordwrapTest {
  Wordwrap wordwrap;

  @Before
    public void setUp(){
      wordwrap = new Wordwrap();
    }

  @Test
    public void returnEmptyStringWhenNoWord(){
      assertEquals("", wordwrap.splitLines("",10));
    }

  @Test
    public void returnWordWhenShorterThanLength(){
      assertEquals("Dan", wordwrap.splitLines("Dan", 10));
    }

  @Test
    public void returnWordOnTwoLinesIfNoSpace(){
      assertEquals("Word\nWrap", wordwrap.splitLines("WordWrap", 4));
    }

  @Test
    public void splitsWordsOntoThreeLines(){
      assertEquals("Word\nWord\nWord", wordwrap.splitLines("WordWordWord", 4));
    }
}
