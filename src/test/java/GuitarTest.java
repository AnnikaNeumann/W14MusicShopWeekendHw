import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Swish Swooosh", "Leather", 120, 60, 6, 21);
    }

    @Test
    public void hasStrings() {
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void hasSound() {
        assertEquals("Swish Swooosh", guitar.getSound());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(60, guitar.markUpPrice());
    }
}