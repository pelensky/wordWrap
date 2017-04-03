import org.junit.*;
import static org.junit.Assert.*;

public class WordwrapTest {
  Wordwrap wordwrap;

  @Before
  public void setUp(){
    wordwrap = new Wordwrap();
  }

  @Test
  public void returnEmptyString(){
    assertEquals("", wordwrap.splitLine("", 10));
  }

  @Test
  public void returnWord(){
    assertEquals("Word", wordwrap.splitLine("Word", 10));
  }

  @Test
  public void splitWord(){
    assertEquals("Word\nWord", wordwrap.splitLine("WordWord", 4));
  }

  @Test
  public void splitWordAtAnotherPlace(){
    assertEquals("WordWo\nrd", wordwrap.splitLine("WordWord", 6));
  }

  @Test
  public void splitWordOntoThreeLines(){
    assertEquals("Word\nWord\nWord", wordwrap.splitLine("WordWordWord", 4));
  }

  @Test
  public void splitWordAtSpace(){
    assertEquals("Word\nWord", wordwrap.splitLine("Word Word", 6));
  }

  @Test
  public void splitOtherWordsAtSpace(){
    assertEquals("Hello\nHello", wordwrap.splitLine("Hello Hello", 6));
  }

  @Test
  public void splitWordsOntoThreeLines(){
    assertEquals("Word\nWord\nWord", wordwrap.splitLine("Word Word Word", 6));
  }

  @Test
  public void splitWordsAtAppropriateSpace(){
    assertEquals("Word Word\nWord", wordwrap.splitLine("Word Word Word", 10));
  }

  @Test
  public void splitWordsAtAppropriateSpaceOverThreeLines(){
    assertEquals("Word Word\nWord Word\nWord", wordwrap.splitLine("Word Word Word Word Word", 11));
  }
}
