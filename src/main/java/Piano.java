public class Piano extends Instruments{

    private String type;

    public Piano(String sound, String material, int sellingPrice, int buyingPrice, String type) {
        super(sound, material, sellingPrice, buyingPrice);
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getType() {
        return type;
    }

    public String sound(Instruments sound) {
        return "KlingKlang";
    }

    public int markUpPrice() {
        return this.sellingPrice - this.buyingPrice;
    }
}
