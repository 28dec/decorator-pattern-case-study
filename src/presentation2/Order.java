package presentation2;

import java.util.ArrayList;
import java.util.List;
public class Order {
    private List<Item> itemList;
	private int id;
    
    public Order(){
        this.itemList = new ArrayList<>();
    }
    
    public void add(Item i){ this.itemList.add(i); }
    public void remove(Item i){ this.itemList.remove(i); }

    public void printBill(){
        for(Item i : itemList){
            System.out.println(i.getName() + "-" + i.getPrice());
        }
    }
}
