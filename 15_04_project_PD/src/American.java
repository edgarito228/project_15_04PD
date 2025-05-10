public class American extends Pizza{
    private boolean stuffedCrust;
    private boolean extraMeat;
    private boolean bbqSauce;
    private int cheddarSlices;

    public American (boolean isCustom,double size, float price, boolean stuffedCrust, boolean extraMeat, boolean bbqSauce, int cheddarSlices) {
        super (isCustom, size, price);
        this.stuffedCrust = stuffedCrust;
        this.extraMeat = extraMeat;
        this.bbqSauce = bbqSauce;
        this.cheddarSlices = cheddarSlices;
    }
}
