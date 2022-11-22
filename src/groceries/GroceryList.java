package groceries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GroceryList {
    private ArrayList<GroceryItem> shoppingList;

    public GroceryList(){
         shoppingList = new ArrayList<>();
    }

    public GroceryList(GroceryItem item){
        shoppingList = new ArrayList<>();
        shoppingList.add(item);
    }

    public void addItem(GroceryItem item){
        shoppingList.add(item);
    }

    public void sortList(){
        // sorts by categories, then alphabetic within those categories
        ArrayList<GroceryItem> produceList = new ArrayList<>();
        ArrayList<GroceryItem> deliList = new ArrayList<>();
        ArrayList<GroceryItem> meatList = new ArrayList<>();
        ArrayList<GroceryItem> dairyList = new ArrayList<>();
        ArrayList<GroceryItem> bakingList = new ArrayList<>();
        ArrayList<GroceryItem> alcoholList = new ArrayList<>();

        for (GroceryItem groceryItem : shoppingList) {
            switch(groceryItem.getCategory()){
                case "produce":
                    produceList.add(groceryItem);
                    break;
                case "deli":
                    deliList.add(groceryItem);
                    break;
                case "meat" :
                    meatList.add(groceryItem);
                    break;
                case "dairy":
                    dairyList.add(groceryItem);
                    break;
                case "baking":
                    bakingList.add(groceryItem);
                    break;
                case "alcohol":
                    alcoholList.add(groceryItem);
                    break;
            }
        }

        // alphabetic sorting...
        //produceList.sort();

    }
}
