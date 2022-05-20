public class Didgeridoo extends Instruments{

    private String thickness;

    public Didgeridoo(String sound, String material, int sellingPrice, int buyingPrice, String thickness) {
        super(sound, material, sellingPrice, buyingPrice);
        this.thickness = thickness;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getThickness() {
        return this.thickness;
    }

    public String sound(Instruments sound) {
        return "Brooooooomrrrrrm";
    }

    public int markUpPrice() {
        return this.sellingPrice - this.buyingPrice;
    }

}
