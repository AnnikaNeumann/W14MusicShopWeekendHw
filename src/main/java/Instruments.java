public abstract class Instruments implements IPlay, ISell{

    public String sound;
    public String material;

    public int sellingPrice;
    public int buyingPrice;

    public Instruments(String sound, String material, int sellingPrice, int buyingPrice) {
        this.sound = sound;
        this.material = material;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    public String getSound() {
        return sound;
    }

    public String getMaterial() {
        return material;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }



    public int getBuyingPrice() {
        return buyingPrice;
    }
}
