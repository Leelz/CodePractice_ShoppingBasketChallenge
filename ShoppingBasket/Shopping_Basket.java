package ShoppingBasket;

import java.util.ArrayList;
import java.util.HashMap;

public class Shopping_Basket {

  private ArrayList<Item> basket;
  private HashMap<Item, Integer> hmap = new HashMap<Item, Integer>();

  public Shopping_Basket(){
    basket = new ArrayList<>();
  }

  public void addItem(Item item) {
      basket.add(item);
  }

  public int getSize(){
      return basket.size();
  }

  public void removeItem(Item item){
      basket.remove(item);
  }

  public void emptyBasket(){
      basket.clear();
  }

  public int getBasketTotal(){
    int total = 0;
    for (Item item : basket){
      total += item.getPrice();
    }
    return total;
  }

  // hashmap
  // item and quantity
  // hmap.get(key)
  // value = counter

  public int getBogofDiscount()   {
      HashMap<Item, Integer> hmap = new HashMap<Item, Integer>();

      int discount = 0;

      for (Item item : basket){
        if (item.getBogof() && hmap.containsKey(item)) {
              int number = hmap.get(item);
              hmap.put(item, number + 1);

              if ((number + 1) % 2 == 0){
                discount += item.getPrice();
              } 
      } else { 
        hmap.put(item, 1);
      }
    }
    return discount;
  }

  public int getTenPercentDiscount(int total){

        if(total >= 2000) {
          total = total *= 0.9;
        }
        return total;
      }

  public int applyLoyaltyDiscount(int total, Customer customer) {

    if (customer.checkLoyaltyCard()) {
      total *= 0.98;
    }
    return total;
  }


  
}