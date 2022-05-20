import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

        @Before
        public void before(){
            trumpet = new Trumpet("Buuup", "Copper", 60, 50, 3);
        }

        @Test
        public void makesSound(){
            assertEquals("Buuup", trumpet.getSound());
        }



    }


