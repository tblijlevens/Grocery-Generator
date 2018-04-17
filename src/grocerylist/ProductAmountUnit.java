package grocerylist;

public class ProductAmountUnit<Product,Integer,String> {
	private Product product;
	private Integer amount;
	private String unit;

	public ProductAmountUnit(Product product, Integer amount, String unit){
		this.product=product;
		this.amount=amount;
		this.unit=unit;
	}
	public Product getProduct(){
		return product;
	}
	public Integer getAmount(){
		return amount;
	}
	public String getUnit(){
		return unit;
	}
	public java.lang.String toString(){
		return "" + ((grocerylist.Product) product).getName() + ": " + amount + " " + unit;
	}
}
