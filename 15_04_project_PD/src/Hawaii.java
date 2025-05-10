public class Hawaii extends Pizza{
    private boolean extraCheese;
    private int pineappleCount;
    private String hamType;

    public Hawaii (boolean isCustom,double size, float price, boolean extraCheese, int pineappleCount, String hamType) {
        super (isCustom, size, price);
        this.extraCheese = extraCheese;
        this.pineappleCount = pineappleCount;
        this.hamType = hamType;
    }
}
