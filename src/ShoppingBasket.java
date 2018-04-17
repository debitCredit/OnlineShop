import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        this.basket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if (this.basket.containsKey(product)) {
            this.basket.get(product).increaseAmount();
        } else {
            this.basket.put(product, new Purchase(product, 1, price));
        }
    }

    public int price() {
        int totalPrice = 0;
        for (String key : this.basket.keySet()) {
            totalPrice += this.basket.get(key).price();
        }
        return totalPrice;
    }

    public void print() {
        for (String key : basket.keySet()) {
            System.out.println(basket.get(key));
        }

    }
}
