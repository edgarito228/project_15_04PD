public class Custom extends Pizza {
    private boolean isVegetarian;
    private int cheeseLayers;
    private int pepperoniCount;
    private int chickenCount;
    private int oliveCount;
    private int onionCount;
    private String sauce;

    public Custom (boolean isCustom,double size, float price, boolean isVegetarian, int cheeseLayers, int pepperoniCount, int chickenCount, int oliveCount, int onionCount, String sauce) {
        super (isCustom, size, price);
        this.isVegetarian = isVegetarian;
        this.cheeseLayers = cheeseLayers;
        this.pepperoniCount = pepperoniCount;
        this.chickenCount = chickenCount;
        this.oliveCount = oliveCount;
        this.onionCount = onionCount;
        this.sauce = sauce;
    }
}
