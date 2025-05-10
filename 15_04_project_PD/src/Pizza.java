import java.util.Scanner;

public class Pizza {
    private boolean isCustom;
    private double size;
    private float price;

    public Pizza (boolean isCustom,double size, float price) {
        this.isCustom = isCustom;
        this.size = size;
        this.price = price;
    }

    public boolean isCustom() {
        return isCustom;
    }

    public void setCustom(boolean custom) {
        isCustom = custom;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static void pizzeria() {
        System.out.println("Welcome to Los Pollos Hermanos pizzeria! Would you like to order? Type 1 ");
        Scanner scan = new Scanner(System.in);
        int one = scan.nextInt();
        if (one==1) {
            System.out.println("Our menu:\n1) Pizza Margarita\n2) Hawaiian pizza\n3) Pepperoni pizza\n4) Pizza California\n5) American pizza\n6) Vegetarian pizza\n7) Custom");
            int choice = scan.nextInt();
            if (choice==1) {
                System.out.println("You have chosen Pizza Margarita.");
                System.out.println("Choose the size of your pizza (XL - 40cm, L - 30cm, M - 25cm");
                String size = scan.nextLine();
                System.out.println("Would you like extra cheese? Type (true) or (false)");
                boolean extraCheese = scan.nextBoolean();
                System.out.println("Would you like basil leaves? Type (true) or (false)");
                boolean basilLeaves = scan.nextBoolean();
                System.out.println("What mozarella type? (Bufallo, Regular, Burrata)");
                String mozarellaType = scan.nextLine();
            }
            if (choice==2) {
                System.out.println("You have chosen Hawaiian pizza.");

            }
            if (choice==3) {
                System.out.println("You have chosen Pepperoni pizza.");
            }
            if (choice==4) {
                System.out.println("You have chosen Pizza California.");
            }
            if (choice==5) {
                System.out.println("You have chosen American pizza.");
            }
            if (choice==6) {
                System.out.println("You have chosen Vegetarian pizza.");
            }
            if (choice==7) {
                System.out.println("You have chosen a custom pizza.");
            }
        }
        else {
            System.out.println("Goodbye!");
        }
    }
}
