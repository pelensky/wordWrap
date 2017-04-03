import org.junit.*;
import static org.junit.Assert.*;

public class WordwrapTest {
  Wordwrap wordwrap;

  @Before
    public void setUp(){
      wordwrap = new Wordwrap();
    }

  @Test
    public void returnEmptyStringWhenGivenEmptyString(){
      assertEquals("", wordwrap.splitLines("", 10));
    }

  @Test
    public void returnWordWhenWordIsSmallerThanNumber(){
      assertEquals("Word", wordwrap.splitLines("Word", 10));
    }

  @Test
  public void returnsWordSplitWhenItIsLongerThanNumber(){
    assertEquals("Word\nWord", wordwrap.splitLines("WordWord", 4));
  }

  @Test
    public void returnsWordSplitWhenLongerThanNumberOtherExample(){
      assertEquals("WordWo\nrd", wordwrap.splitLines("WordWord", 6));
    }

  @Test
    public void returnsWordsOverThreeLines(){
      assertEquals("Word\nWord\nWord", wordwrap.splitLines("WordWordWord", 4));
    }

  @Test
    public void returnsWordSplitAtSpace(){
      assertEquals("Word\nWord", wordwrap.splitLines("Word Word", 6));
    }

  @Test
    public void returnsWordSplitAtSpaceOtherExample(){
      assertEquals("Hello\nHello", wordwrap.splitLines("Hello Hello", 6));
    }

  @Test
    public void returnsWordSplitOverThreeLines(){
      assertEquals("Word\nWord\nWord", wordwrap.splitLines("Word Word Word", 6));
    }

  @Test
    public void returnsWordSplitAtSecondSpaceIfAppropriate(){
      assertEquals("Word Word\nWord", wordwrap.splitLines("Word Word Word", 10));
    }

  @Test
    public void returnsMultipleWordsSplitAtSecondSpace(){
      assertEquals("Word Word\nWord Word\nWord", wordwrap.splitLines("Word Word Word Word Word", 11));
    }
}
