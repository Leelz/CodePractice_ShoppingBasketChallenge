import ShoppingBasket.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ItemTest {

  private Shopping_Basket basket;
  private Item chicken_jalfrezi;
  private Item toilet_paper;


  @Before
  public void Before()  {
    basket = new Shopping_Basket();
    chicken_jalfrezi = new Item(199, true, "chicken_jalfrezi");
    toilet_paper = new Item(99, false, "loo_roll");
  }

  @Test
  public void testCanGetBogof() {
    assertEquals(true, chicken_jalfrezi.getBogof());
  }

}