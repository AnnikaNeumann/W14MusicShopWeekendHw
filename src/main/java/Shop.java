import java.util.ArrayList;

public class Shop implements ISell{

    private String name;
    private ArrayList<ISell> stock;
    private int till;


    public Shop(String name, int till) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
        this.till = till;
    }

    public String getName() {
        return this.name;
    }

    public int getTill() {
        return till;
    }
    public int getStock() {
        return this.stock.size();
    }

    public  void addToStock(ISell instrument){
        this.stock.add(instrument);
    }

    public void removeFromStock(ISell instrument){
        this.stock.remove(instrument);
    }

    @Override
    public int markupPrice(Instruments sellingPrice, int buyingPrice) {
        return 0;
    }
}
