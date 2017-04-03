import org.junit.*;
import static org.junit.Assert.*;

public class WordwrapTest {
  Wordwrap wordwrap;

  @Before
    public void setUp(){
      wordwrap = new Wordwrap();
    }

  @Test
    public void noWord(){
      assertEquals("", wordwrap.splitLines("",10));
    }
}
