package presentation2;

/**
 *
 * @author longnh
 */
public abstract class Item {
    protected String code;
    protected String name;
    protected int price;

    public Item(String code, String name, int price) {
        this.name = name;
        this.price = price;
        this.code = code;
    }
    
    public Item(){
        this.code = "UNDEFINED";
        this.name = "UNDEFINED";
        this.price = -1;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
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
    
}
