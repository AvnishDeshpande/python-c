import java.util.Scanner;

public class combos {

    Scanner sc = new Scanner(System.in);

    public void combo() {
        int select, quantity;
        float price = 0;
        String productname = "";

        for (;;) {
            System.out.println("\n----- PACKAGED FOOD & BEVERAGES -----");
            System.out.println("1. Bread/Butter (₹70)");
            System.out.println("2. Maggie/Sauce (₹90)");
            System.out.println("3. Wafers/Biscuits (₹50)");
            System.out.println("4. Pasta/Noodles (₹80)");
            System.out.println("5. Chiwda/Bakarwadi (₹150)");
            System.out.println("6. ColdDrinks/Fruit Juice (₹100)");

            System.out.println("\n----- GRAINS & PULSES -----");
            System.out.println("7. Wheat/Rice (₹400)");
            System.out.println("8. ToorDal/Rice (₹350)");
            System.out.println("9. Basmati Rice/Soya Chunks (₹300)");
            System.out.println("10. Moong Dal/Rice (₹200)");

            System.out.println("\n----- STATIONARY -----");
            System.out.println("11. Notebook/Pen (₹60)");
            System.out.println("12. Pencil/Eraser (₹20)");
            System.out.println("13. Geometry Box/Long Scale (₹165)");
            System.out.println("14. Sketch Pens/Drawing Book (₹105)");
            System.out.println("15. Stapler/White Paper (₹75)");

            System.out.println("\n16. Exit Combos");
            System.out.print("Select combo: ");

            select = sc.nextInt();

            if (select == 16) {
                break;
            }

            switch (select) {
                case 1 -> {
                    productname = "Bread/Butter";
                    price = 70;
                }
                case 2 -> {
                    productname = "Maggie/Sauce";
                    price = 90;
                }
                case 3 -> {
                    productname = "Wafers/Biscuits";
                    price = 50;
                }
                case 4 -> {
                    productname = "Pasta/Noodles";
                    price = 80;
                }
                case 5 -> {
                    productname = "Chiwda/Bakarwadi";
                    price = 150;
                }
                case 6 -> {
                    productname = "ColdDrinks/Fruit Juice";
                    price = 100;
                }
                case 7 -> {
                    productname = "Wheat/Rice";
                    price = 400;
                }
                case 8 -> {
                    productname = "ToorDal/Rice";
                    price = 350;
                }
                case 9 -> {
                    productname = "Basmati Rice/Soya Chunks";
                    price = 300;
                }
                case 10 -> {
                    productname = "Moong Dal/Rice";
                    price = 200;
                }
                case 11 -> {
                    productname = "Notebook/Pen";
                    price = 60;
                }
                case 12 -> {
                    productname = "Pencil/Eraser";
                    price = 20;
                }
                case 13 -> {
                    productname = "Geometry Box/Long Scale";
                    price = 165;
                }
                case 14 -> {
                    productname = "Sketch Pens/Drawing Book";
                    price = 105;
                }
                case 15 -> {
                    productname = "Stapler/White Paper";
                    price = 75;
                }
                default -> {
                    System.out.println("Invalid combo selected");
                    continue;
                }
            }

            System.out.print("Enter the quantity: ");
            quantity = sc.nextInt();

            float totalPrice = price * quantity;

            System.out.println("\nAdded Combo:");
            System.out.println("Combo: " + productname);
            System.out.println("Quantity: " + quantity);
            System.out.println("Price per unit: ₹" + price);
            System.out.println("Total Price: ₹" + totalPrice);
        }
    }
}
