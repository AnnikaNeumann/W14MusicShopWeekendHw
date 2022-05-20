import org.junit.Before;
import org.junit.Test;

import javax.sound.midi.Instrument;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    ISell instrument;

    @Before
    public void before(){
        shop = new Shop("Women Rock E56", 0);
        guitar = new Guitar("Swish Swooosh", "Leather", 120, 60, 6, 21);
    }

    @Test
    public void tillStartsEmpty(){
        assertEquals(0, shop.getTill());
    }

    @Test
    public void canSellInstrument(){
        shop.addToStock(instrument);
        shop.removeFromStock(instrument);
        assertEquals(0, shop.getStock());
    }

    @Test
    public void canBuyInstrument(){
        shop.addToStock(instrument);
        shop.addToStock(instrument);
        shop.addToStock(instrument);
        assertEquals(3, shop.getStock());

    }


}
