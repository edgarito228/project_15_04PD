public class California extends Pizza{
    private int tomatoCount;
    private boolean ranchSauce;
    private boolean avocado;
    private String chickenType;

    public California (boolean isCustom,double size, float price, int tomatoCount, boolean ranchSauce, boolean avocado, String chickenType) {
        super (isCustom, size, price);
        this.tomatoCount = tomatoCount;
        this.ranchSauce = ranchSauce;
        this.avocado = avocado;
        this.chickenType = chickenType;
    }
}
