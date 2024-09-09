import java.util.ArrayList;

public class Menu{


    private int vegItems=3;
    public Menu(){
        menuItems();
    }
    public void menuCalling(){
       // menuItems();
        printMenu(menuList);
    }
    ArrayList<ItemName> menuList=new ArrayList<>();

    public void menuItems(){
        ItemName item1=new ItemName("Veg Cheese Pizza",149.00f,"\uD83C\uDF55");
        menuList.add(item1);

        ItemName item2=new ItemName("Veg Cheese Burger",99.00f,"\uD83C\uDF54");
        menuList.add(item2);

        ItemName item3=new ItemName("French Fries",129.00f,"\uD83C\uDF5F");
        menuList.add(item3);

        ItemName item4=new ItemName("Chicken Cheese Pizza",199.00f,"\uD83C\uDF55");
        menuList.add(item4);

        ItemName item5=new ItemName("Chicken Cheese Burger",149.00f,"\uD83C\uDF54");
        menuList.add(item5);

        ItemName item6=new ItemName("Soft Drink",20.00f,"\uD83E\uDDCB");
        menuList.add(item6);

    }

    public void printMenu(ArrayList<ItemName> menuList){
        int i=0;
        System.out.println("MONSTERS MENU");
        System.out.println("------------------------------------");
        System.out.println("VEG ITEMS");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        for(i=0;i<vegItems;i++){
            String str=menuList.get(i).getName()+" "+menuList.get(i).unicode;
            float f=menuList.get(i).getPrice();
            System.out.printf("%-26s:%.2f%n",str,f);
        }
        System.out.println();
        System.out.println("NON-VEG ITEMS");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        for(;i<menuList.size()-1;i++){
            String str=menuList.get(i).getName()+" "+menuList.get(i).unicode;
            float f=menuList.get(i).getPrice();
            System.out.printf("%-26s:%.2f%n",str,f);
        }
        System.out.println();
        System.out.println("BEVERAGES");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        String str=menuList.get(menuList.size()-1).getName()+" "+menuList.get(menuList.size()-1).unicode;
        float f=menuList.get(menuList.size()-1).getPrice();
        System.out.printf("%-26s:%.2f%n",str,f);

    }

}
