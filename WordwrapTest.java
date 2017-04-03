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

  @Test
    public void breaksWordsAtSpaces(){
      assertEquals("Word\nWord", wordwrap.splitLines("Word Word", 6));
    }

  @Test
    public void breaksOverMultipleLinesAtSpaces(){
      assertEquals("Word\nWord\nWord", wordwrap.splitLines("Word Word Word", 6));
    }

  @Test
    public void breaksAtLastSpaceInLine(){
      assertEquals("Word Word\nWord", wordwrap.splitLines("Word Word Word", 9));
    }
}
