package presentation2;

import java.util.*;

/**
 *
 * @author longnh
 */
public abstract class Item {
	protected int id;
    protected String code;
    protected String name;
    protected int price;
	protected List<Topping> toppingList;

    public Item(String code, String name, int price) {
        this.name = name;
        this.price = price;
        this.code = code;
    }
    
    public Item(){
        this.code = "UNDEFINED";
        this.name = "UNDEFINED";
        this.price = -1;
        this.toppingList = new ArrayList<>();
    }

    public void addTopping(Topping topping){
        this.toppingList.add(topping);
    }

    public void removeTopping(Topping topping){
        this.toppingList.remove(topping);
    }

    public String getName() {
        String nameWithToppings = this.name;
        for(Topping t : toppingList) nameWithToppings += " " + t.getName();
        return nameWithToppings;
    }

    public int getPrice() {
        int totalPrice = this.price;
        for(Topping t : toppingList) totalPrice += t.getPrice();
        return totalPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Topping> getToppingList(){
        return this.toppingList;
    }
}
