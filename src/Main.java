import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        System.out.println("***************Welcome to FOOD MONSTERS***************");
        while (true) {
            System.out.println("Enter Table No: ");
            int tab_No = scan.nextInt();
            scan.nextLine();

            if (!set.contains(tab_No)) {
                System.out.println("New order for Table No: " + tab_No);
                OrderManger orders = new OrderManger(tab_No);
                menu.menuCalling();
                orders.takeOrder();
                set.add(tab_No);
            } else {

                ArrayList<String> existingOrder = OrderManger.getOrderForTable(tab_No);
                if (existingOrder == null) {
                    System.out.println("No previous orders found for table " + tab_No);
                } else {
                    BillGenerator billGen = new BillGenerator(tab_No, menu.menuList, existingOrder);
                    billGen.callGenerator();
                    set.remove(tab_No);
                    System.out.println("Table " + tab_No + " checked out.");
                }
            }


        }

    }
}