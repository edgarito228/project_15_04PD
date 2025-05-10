public class Margarita extends Pizza{
    private boolean extraCheese;
    private boolean basilLeaves;
    private String mozarellaType;

    public Margarita (boolean isCustom,double size, float price, boolean extraCheese, boolean basilLeaves, String mozarellaType) {
        super (isCustom, size, price);
        this.extraCheese = extraCheese;
        this.basilLeaves = basilLeaves;
        this.mozarellaType = mozarellaType;
    }
}
