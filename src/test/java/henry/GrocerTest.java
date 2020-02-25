package henry;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrocerTest {
    @Test
    public void priceABasketTest() {
        Grocer henry = new Grocer();
        long price = henry.priceABasket("1 tin of soup");
        assertEquals(price,65);
    }
}
