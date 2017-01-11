package ShoppingBasket;

public class Item {

public int price;
public boolean bogof;
private String name;

  public Item(int price, boolean bogof, String name) {
    this.price = price;
    this.bogof = bogof;
    this.name = name;
  }

  public int getPrice() {
      return this.price;
  }

  public boolean getBogof() {
      return this.bogof;
  }

  public String getName() {
      return this.name;
  }
  
}