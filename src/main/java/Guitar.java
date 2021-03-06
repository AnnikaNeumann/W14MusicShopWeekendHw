public class Guitar extends Instruments{

    private int strings;
    private int frets;

    public Guitar(String sound, String material, int sellingPrice, int buyingPrice, int strings, int frets) {
        super(sound, material, sellingPrice, buyingPrice);
        this.strings = strings;
        this.frets = frets;
//        this.buyingPrice = buyingPrice;
//        this.sellingPrice = sellingPrice;
    }

    public int getStrings() {
        return this.strings;
    }

    public int getFrets() {
        return this.frets;
    }

    public String sound(Instruments sound) {
        return "Swish Swooosh";
    }

    public int markUpPrice() {
        return this.sellingPrice - this.buyingPrice;
    }


}
