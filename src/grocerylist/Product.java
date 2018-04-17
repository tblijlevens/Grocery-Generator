package grocerylist;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Product {
    private java.lang.String name;
    private LocalDateTime lastBought;
    private int totalAmountBought;
    private ArrayList<String> tags;
    private ProductCategory category;
    private ArrayList<String> units;

    public Product(String name, ArrayList<String> tags, ProductCategory category, ArrayList<String> units){
        this.name = name;
        this.tags = tags;
        this.category = category;
        this.units = units;
    }

    public java.lang.String getName() {
    	return name;
    }
    public LocalDateTime getLastBought() {
    	return lastBought;
    }
    public int getTotalAmountBought() {
    	return totalAmountBought;
    }
    public ArrayList<String> getTags() {
    	return tags;
    }
    public ProductCategory getCategory() {
    	return category;
    }
    public ArrayList<String> getUnits() {
    	return units;
    }

}
