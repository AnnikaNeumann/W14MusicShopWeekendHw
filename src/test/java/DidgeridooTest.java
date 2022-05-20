import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DidgeridooTest {

    Didgeridoo didgeridoo;

    @Before
    public void before(){
        didgeridoo = new Didgeridoo("Ngarrriralkpwina", "Wood", 45, 30, "12mm");
    }

    @Test
    public void makesSound(){
        assertEquals("Ngarrriralkpwina", didgeridoo.getSound());
    }

}
