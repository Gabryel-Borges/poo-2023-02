
import org.junit.Test;
import static org.example.Hanoi.movimentos;
import static org.junit.Assert.assertEquals;

public class HanoiTest {
    @Test
    public void testador(){
        assertEquals(15.0, movimentos(4),0);
        assertEquals(31.0, movimentos(5),0);
        assertEquals(12.0, movimentos(2),0);

    }
}
