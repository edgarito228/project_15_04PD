public class Pepperoni extends Pizza{
    private boolean doublePepperoni;
    private boolean cheeseBlend;
    private String spiceLevel;

    public Pepperoni (boolean isCustom,double size, float price, boolean doublePepperoni, boolean cheeseBlend, String spiceLevel) {
        super (isCustom, size, price);
        this.doublePepperoni = doublePepperoni;
        this.cheeseBlend = cheeseBlend;
        this.spiceLevel = spiceLevel;
    }
}
