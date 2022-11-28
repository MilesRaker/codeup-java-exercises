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

    public String sortList(){
        // sorts by categories, then alphabetic within those categories
        ArrayList<GroceryItem> produceList = new ArrayList<>();
        ArrayList<GroceryItem> deliList = new ArrayList<>();
        ArrayList<GroceryItem> meatList = new ArrayList<>();
        ArrayList<GroceryItem> dairyList = new ArrayList<>();
        ArrayList<GroceryItem> bakingList = new ArrayList<>();
        ArrayList<GroceryItem> alcoholList = new ArrayList<>();

        for (GroceryItem groceryItem : shoppingList) {
            switch (groceryItem.getCategory()) {
                case "produce" -> produceList.add(groceryItem);
                case "deli" -> deliList.add(groceryItem);
                case "meat" -> meatList.add(groceryItem);
                case "dairy" -> dairyList.add(groceryItem);
                case "baking" -> bakingList.add(groceryItem);
                case "alcohol" -> alcoholList.add(groceryItem);
            }
        }

        // alphabetic sorting...
        produceList.sort(GroceryItem::compareTo);
        deliList.sort(GroceryItem::compareTo);
        meatList.sort(GroceryItem::compareTo);
        dairyList.sort(GroceryItem::compareTo);
        bakingList.sort(GroceryItem::compareTo);
        alcoholList.sort(GroceryItem::compareTo);

        // create sorted list
        StringBuilder sortedList = new StringBuilder();
        for (GroceryItem groceryItem : produceList) {
            sortedList.append(groceryItem.listEntry()).append("\n");
        }
        for (GroceryItem groceryItem : deliList) {
            sortedList.append(groceryItem.listEntry()).append("\n");
        }
        for (GroceryItem groceryItem : meatList) {
            sortedList.append(groceryItem.listEntry()).append("\n");
        }
        for (GroceryItem groceryItem : dairyList) {
            sortedList.append(groceryItem.listEntry()).append("\n");
        }
        for (GroceryItem groceryItem : bakingList) {
            sortedList.append(groceryItem.listEntry()).append("\n");
        }
        for (GroceryItem groceryItem : alcoholList) {
            sortedList.append(groceryItem.listEntry()).append("\n");
        }

        // Create output string

        return sortedList.toString();
    }
}
