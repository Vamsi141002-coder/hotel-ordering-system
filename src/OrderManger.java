import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderManger {
    Scanner scan=new Scanner(System.in);
    int tab_No;

     private static HashMap<Integer, ArrayList<String>> hashmap=new HashMap<>();

    public OrderManger(int tab_No){
        this.tab_No=tab_No;
    }

    public void takeOrder(){
        System.out.println("Please order here once you have done with order enter done");
        ArrayList<String> orderList=new ArrayList<>();
        String str="";
        while(!str.equalsIgnoreCase("done")){
            str=scan.nextLine();
            orderList.add(str);
        }
        hashmap.put(tab_No,orderList);

        for(Map.Entry<Integer,ArrayList<String>> entry: hashmap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public static ArrayList<String> getOrderForTable(int tab_No) {
        return hashmap.get(tab_No);
    }

}
