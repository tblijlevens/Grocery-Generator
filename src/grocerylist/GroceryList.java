// GroceryList moet veranderd worden in dat het wordt geconstruct met
// aan arraylist aan recepten. Daar haalt het de ProductAmountUnits van
// op en daarvan telt ie alle zelfde producten (met evt verschillende
// units) bij elkaar op.



package grocerylist;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<ProductAmountUnit> totalProductlist;

    private ArrayList<ProductAmountUnit> vegetablesList = new ArrayList<>();
    private ArrayList<ProductAmountUnit> meatsList = new ArrayList<>();
    private ArrayList<ProductAmountUnit> dairyList = new ArrayList<>();
    private ArrayList<ProductAmountUnit> snacksList = new ArrayList<>();
    private ArrayList<ProductAmountUnit> drinksList = new ArrayList<>();
    private ArrayList<ProductAmountUnit> breakfastList = new ArrayList<>();
    private ArrayList<ProductAmountUnit> frozenList = new ArrayList<>();
    private ArrayList<ProductAmountUnit> petsList = new ArrayList<>();
    private ArrayList<ProductAmountUnit> bathroomList = new ArrayList<>();
    private ArrayList<ProductAmountUnit> otherList = new ArrayList<>();

    /**
     *  Constructor creates a new grocery list with the given list of products
     *  @param  productlist  a list of ProductAmountUnit's (a product with an amount).
     */
    public GroceryList(ArrayList<ProductAmountUnit> productlist){
        this.totalProductlist = productlist;
        sortProductList();
    }


// method that sums same products amounts

    /**
     *  gives a list of all the nonEmpty category lists (e.g. vegetablesList)
     *  @return  an ArrayList in which the elements are category lists. The category
     *  lists consist of ProductAmountUnits.
     */
    public ArrayList<ArrayList<ProductAmountUnit>> giveListOfLists(){
        ArrayList<ArrayList<ProductAmountUnit>> listOfLists = new ArrayList<>();
        if (!vegetablesList.isEmpty()){
            listOfLists.add(vegetablesList);
        }
        if (!meatsList.isEmpty()){
            listOfLists.add(meatsList);
        }
        if (!dairyList.isEmpty()){
            listOfLists.add(dairyList);
        }
        if (!snacksList.isEmpty()){
            listOfLists.add(snacksList);
        }
        if (!drinksList.isEmpty()){
            listOfLists.add(drinksList);
        }
        if (!breakfastList.isEmpty()){
            listOfLists.add(breakfastList);
        }
        if (!frozenList.isEmpty()){
            listOfLists.add(frozenList);
        }
        if (!petsList.isEmpty()){
            listOfLists.add(petsList);
        }
        if (!bathroomList.isEmpty()){
            listOfLists.add(bathroomList);
        }
        if (!otherList.isEmpty()){
            listOfLists.add(otherList);
        }
        return listOfLists;
    }

    /**
     *  the string representation of this grocery list. The list is sorted
     *  for cetegories and each product names the amount.
     *  @return  [description]
     */
    public String toString(){
        String groceryListString = "";
        ArrayList<ArrayList<ProductAmountUnit>> listOfLists = giveListOfLists();
        for (ArrayList<ProductAmountUnit> listOfProductAmountUnits : listOfLists){
            groceryListString += ((Product) listOfProductAmountUnits.get(0).getProduct()).getCategory() + "\n";
            for (ProductAmountUnit productAmountUnit : listOfProductAmountUnits){
                groceryListString += productAmountUnit + "\n";
            }
            groceryListString += "\n";
        }
        return groceryListString;
    }

    public ArrayList<ProductAmountUnit> getTotalProductlist() {
        return totalProductlist;
    }

    public ArrayList<ProductAmountUnit> getVegetablesList() {
        return vegetablesList;
    }

    public ArrayList<ProductAmountUnit> getMeatsList() {
        return meatsList;
    }

    public ArrayList<ProductAmountUnit> getDairyList() {
        return dairyList;
    }

    public ArrayList<ProductAmountUnit> getSnacksList() {
        return snacksList;
    }

    public ArrayList<ProductAmountUnit> getDrinksList() {
        return drinksList;
    }

    public ArrayList<ProductAmountUnit> getBreakfastList() {
        return breakfastList;
    }

    public ArrayList<ProductAmountUnit> getFrozenList() {
        return frozenList;
    }

    public ArrayList<ProductAmountUnit> getPetsList() {
        return petsList;
    }

    public ArrayList<ProductAmountUnit> getBathroomList() {
        return bathroomList;
    }

    public ArrayList<ProductAmountUnit> getOtherList() {
        return otherList;
    }

////////////////////////////////////////////////////////////
/////////////// PRIVATE HELPER METHODS ////////////////// //
////////////////////////////////////////////////////////////

    /**
     *  a helper method that sorts all the products into their right category lists
     */
    private void sortProductList(){
        // get product category
        // add product productAmountUnit to right category

        for (ProductAmountUnit productAmountUnit : totalProductlist){
            ProductCategory pCategory = ((Product) productAmountUnit.getProduct()).getCategory();
            switch(pCategory){
                case VEGATABLES:
                    vegetablesList.add(productAmountUnit);
                    break;
                case MEATS:
                    meatsList.add(productAmountUnit);
                    break;
                case DAIRY:
                    dairyList.add(productAmountUnit);
                    break;
                case SNACKS:
                    snacksList.add(productAmountUnit);
                    break;
                case DRINKS:
                    drinksList.add(productAmountUnit);
                    break;
                case BREAKFAST:
                    breakfastList.add(productAmountUnit);
                    break;
                case FROZEN:
                    frozenList.add(productAmountUnit);
                    break;
                case PETS:
                    petsList.add(productAmountUnit);
                    break;
                case BATHROOM:
                    bathroomList.add(productAmountUnit);
                    break;
                case OTHER:
                    otherList.add(productAmountUnit);
                    break;
            }
        }
    }

}
