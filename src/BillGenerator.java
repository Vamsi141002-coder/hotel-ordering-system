import java.util.ArrayList;

public class BillGenerator {
    ArrayList<ItemName> menuList;
    ArrayList<String> orders;
    int tab_No;

   public BillGenerator(int tab_No, ArrayList<ItemName> menuList, ArrayList<String> orders){
       this.tab_No=tab_No;
       this.menuList=menuList;
       this.orders=orders;
   }
    public void callGenerator() {
        if (orders == null) {
            System.out.println("No orders found for table " + tab_No);
        } else {
            billGenerator(menuList, orders);
        }
    }

    public void billGenerator(ArrayList<ItemName> menuList, ArrayList<String> orders) {
        float totalCash = 0.0f;
        System.out.println("Generating bill for Table No: " + tab_No);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("%-20s %-10s\n", "Item", "Price (INR)");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        for (String order : orders) {
            for (ItemName item : menuList) {
                if (item.getName().equalsIgnoreCase(order)) {
                    System.out.printf("%-23s : %.2f\n", item.getName(), item.getPrice());
                    totalCash += item.getPrice();
                }
            }
        }

        billPrint(totalCash);
    }


    public void billPrint(float totalCash) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        float discount = 0.0f;
        if (totalCash >= 500) {
            discount = (totalCash * 10) / 100;
            System.out.printf("Discount (10%%)    : -%.2f\n", discount);
        }
        totalCash -= discount;
        System.out.printf("TOTAL BILL        : %.2f\n", totalCash);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Thank you for dining with us! Visit Again!");
    }
}