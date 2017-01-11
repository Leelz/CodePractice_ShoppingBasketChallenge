package ShoppingBasket;

public class Customer {

public boolean loyalty_card;

  public Customer (boolean loyalty_card) {
    this.loyalty_card = loyalty_card;
  }

  public boolean checkLoyaltyCard() {
      return this.loyalty_card;
  }
  
}