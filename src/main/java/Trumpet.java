public class Trumpet extends Instruments {

    private int valves;

    public Trumpet(String sound, String material, int sellingPrice, int buyingPrice,int valves) {
        super(sound, material, sellingPrice, buyingPrice);
        this.valves = valves;
    }

    public int getValves() {
        return this.valves;
    }


    public String sound(Instruments sound) {
        return "Buuup";
    }

    public int markupPrice(Instruments sellingPrice, int buyingPrice) {
        return this.sellingPrice - this.buyingPrice;
    }
}
