public class Vegetarian extends Pizza{
    private boolean veganCheese;
    private int pickleCount;
    private int pepperCount;
    private int spinachCount;

    public Vegetarian (boolean isCustom, double size, float price, boolean veganCheese, int pickleCount, int pepperCount, int spinachCount) {
        super (isCustom, size, price);
        this.veganCheese = veganCheese;
        this.pickleCount = pickleCount;
        this.pepperCount = pepperCount;
        this.spinachCount = spinachCount;
    }
}
