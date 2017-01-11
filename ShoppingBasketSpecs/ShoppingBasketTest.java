import ShoppingBasket.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

  private Shopping_Basket basket;
  private Item chicken_jalfrezi;
  private Item toilet_paper;
  private Item lotion;
  private Item diamond;
  private Customer barry;

  @Before
  public void Before()  {
    basket = new Shopping_Basket();
    chicken_jalfrezi = new Item(199, true, "chicken_jalfrezi");
    toilet_paper = new Item(99, false, "loo_roll");
    lotion = new Item(299, false, "lotion");
    diamond = new Item(2000, false, "diamond");
    barry = new Customer(true);
  }

  @Test
  public void testBasketStartsEmpty() {
    assertEquals(0, basket.getSize());
  }

  @Test
  public void testCanAddItemToBasket() {
    basket.addItem(chicken_jalfrezi);
    assertEquals(1, basket.getSize());
  }

  @Test
  public void testCanRemoveItemFromBasket() {
    basket.addItem(chicken_jalfrezi);
    basket.addItem(lotion);
    basket.removeItem(lotion);
    assertEquals(1, basket.getSize());
  }

  @Test
  public void testCanEmptyBasket() {
    basket.addItem(chicken_jalfrezi);
    basket.addItem(lotion);
    basket.emptyBasket();
    assertEquals(0, basket.getSize());
  }

  @Test
  public void testGetBasketTotal() {
    basket.addItem(chicken_jalfrezi);
    basket.addItem(lotion);
    assertEquals(498, basket.getBasketTotal());
  }

  @Test
  public void testBogofDiscount() {
    basket.addItem(chicken_jalfrezi);
    basket.addItem(chicken_jalfrezi);
    basket.addItem(diamond);
    assertEquals(199, basket.getBogofDiscount());
  }

  @Test
  public void testBogofDiscount2() {
    basket.addItem(chicken_jalfrezi);
    basket.addItem(chicken_jalfrezi);
    basket.addItem(diamond);
    assertEquals(199, basket.getBogofDiscount());
  }

  @Test
  public void testBogofDiscount3() {
    basket.addItem(chicken_jalfrezi);
    basket.addItem(chicken_jalfrezi);
    basket.addItem(chicken_jalfrezi);
    basket.addItem(chicken_jalfrezi);
    basket.addItem(diamond);
    basket.addItem(diamond);
    assertEquals(398, basket.getBogofDiscount());
  }

  @Test
  public void testTenPercentDiscount() {
  basket.addItem(diamond);
  int total = basket.getBasketTotal();
  assertEquals(1800, basket.getTenPercentDiscount(total));
  }

  @Test
  public void testCustomerLoyalty() {
  basket.addItem(diamond);
  int total = basket.getBasketTotal();
  assertEquals(1960, basket.applyLoyaltyDiscount(total, barry));
  }

}