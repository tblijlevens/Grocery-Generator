package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import grocerylist.GroceryList;
import grocerylist.Product;
import grocerylist.ProductAmountUnit;
import grocerylist.ProductCategory;

class TestGrocList {

	private Product broccoli;
	private Product paprika;
	private Product chips;
	private Product melk;
	private GroceryList myGroceryList;


	@BeforeEach
	void setUp(){

///////////////////////////////////////
////////// MAKE PRODUCTS  /////////////
///////////////////////////////////////

		ArrayList<String> tags1 = new ArrayList<>();
		tags1.add("vegetable");
		tags1.add("diner");
		ArrayList<String> units1 = new ArrayList<>();
		units1.add("piece(s)");
		broccoli = new Product("Broccoli", tags1, ProductCategory.VEGATABLES, units1);

		ArrayList<String> tags2 = new ArrayList<>();
		tags2.add("snacks");
		tags2.add("chips");
		tags2.add("salty");
		tags2.add("suggestable"); //products with this tag will be automatically added to the grocery list when the average by duration is near.
		ArrayList<String> units2 = new ArrayList<>();
		units2.add("pack(s)");
		units2.add("grams");
		chips = new Product("Paprika chips", tags2, ProductCategory.SNACKS, units2);
		paprika = new Product("Paprika", tags1, ProductCategory.VEGATABLES, units1);

		ArrayList<String> tags3 = new ArrayList<>();
		tags3.add("dairy");
		tags3.add("drink");
		ArrayList<String> units3 = new ArrayList<>();
		units3.add("pack(s)");
		units3.add("ml");
		units3.add("L");
		melk = new Product("Melk", tags3, ProductCategory.DAIRY, units3);

///////////////////////////////////////////
///////// MAKE GROCERY LIST ///////////////
///////////////////////////////////////////

		ProductAmountUnit broccoli2 = new ProductAmountUnit(broccoli, 2, "piece(s)");
		ProductAmountUnit pchips6 = new ProductAmountUnit(chips, 6, "pack(s)");
		ProductAmountUnit paprika3 = new ProductAmountUnit(paprika, 3, "piece(s)");
		ProductAmountUnit melk4 = new ProductAmountUnit(melk, 4, "pack(s)");

		ArrayList<ProductAmountUnit> productList = new ArrayList<>();
		productList.add(broccoli2);
		productList.add(pchips6);
		productList.add(paprika3);
		productList.add(melk4);


		myGroceryList = new GroceryList(productList);

	}

	@AfterEach
	void tearDown(){
		broccoli = null;
		chips = null;
		myGroceryList = null;
	}


	@Test
	void testMakeGrocList() {

		System.out.println("My grocerylist:");
		System.out.println(myGroceryList);
		assertEquals(4,myGroceryList.getTotalProductlist().size()); //expect total products: 4
		assertEquals(2,myGroceryList.getVegetablesList().size()); //expect vegetable products: 2
		assertEquals("Broccoli",((Product) myGroceryList.getVegetablesList().get(0).getProduct()).getName()); //expect name of vegetable product to be: Broccoli
		assertEquals(1,myGroceryList.getSnacksList().size()); //expect snack products: 1
		assertEquals("Paprika chips",((Product) myGroceryList.getSnacksList().get(0).getProduct()).getName()); //expect name of snack product to be: Paprika chips

	}
}
