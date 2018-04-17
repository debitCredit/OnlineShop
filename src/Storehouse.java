import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Storehouse(){
        this.prices = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock){

        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product){
        if (this.prices.get(product) == null){
            return -99;
        } else {
            return this.prices.get(product);
        }
    }

    public int stock(String product){
        if (this.stocks.get(product) == null){
            return 0;
        } else {
            return this.stocks.get(product);
        }
    }

    public boolean take(String product){

        if (this.stocks.get(product) == null || this.stocks.get(product) == 0){
            return false;
        } else {
            int currentStock = this.stocks.get(product);
            this.stocks.replace(product, currentStock, currentStock -1);
        }
        return true;
    }

    public Set<String> products(){
        return this.prices.keySet();
    }

}
