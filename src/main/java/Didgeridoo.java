public class Didgeridoo extends Instruments{

    private int thickness;

    public Didgeridoo(String sound, String material, int sellingPrice, int buyingPrice,int thickness) {
        super(sound, material, sellingPrice, buyingPrice);
        this.thickness = thickness;
    }

    public int getThickness() {
        return this.thickness;
    }

    public String sound(Instruments sound) {
        return "Brooooooomrrrrrm";
    }

    public int markupPrice(Instruments sellingPrice, int buyingPrice) {
        return this.sellingPrice - this.buyingPrice;
    }
}
