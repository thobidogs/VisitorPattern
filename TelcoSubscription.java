public class TelcoSubscription{
    private int Gigabyte;
    private double price;
    private String telcoName;
    private boolean unliCallText;

    public TelcoSubscription(int Gigabyte, double price, String telcoName, boolean freePackage) {
        this.Gigabyte = Gigabyte;
        this.unliCallText = unliCallText;
        this.price = price;
        this.telcoName = telcoName;
    }

    public int getGigabyte() {
        return Gigabyte;
    }

    public void setGigabyte(int Gigabyte) {
        this.Gigabyte = Gigabyte;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }

    public void setUnliCallText(boolean unliCallText) {
        this.unliCallText = unliCallText;
    }

    




    
}