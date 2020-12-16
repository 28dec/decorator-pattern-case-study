package presentation2;

public class Topping {

	protected int id;
	protected String code;
	protected String name;
	protected int price;

	public Topping(){}

	public Topping(int id, String code, String name, int price) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
}