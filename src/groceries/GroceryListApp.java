package groceries;

import util.Input;

public class GroceryListApp {
    public static void main(String[] args) {
        Input in = new Input();
        GroceryList list = new GroceryList();
        System.out.println("**********GroceryListApp Start **********");
        while(true){
            boolean makeList = in.yesNo("Would you like to create a grocery list?");
            if(makeList){
                boolean addItem = true;
                System.out.println("Add a grocery item to your list...");
                while(addItem) {
                    String tempName = in.getString("What is the name of the grocery item?");
                    System.out.println("tempName = " + tempName);
                    int tempQuantity = in.getInt("How many " + tempName + " do you want to add?");
                    System.out.println("tempQuantity = " + tempQuantity);
                    double tempPrice = in.getDouble("How much does " + tempName + " cost?");
                    System.out.println("tempPrice = " + tempPrice);
                    String tempCat = in.getString("What category is the new item?");
                    System.out.println("tempCat = " + tempCat);
                    //String tempCate = in.getString("Testing with another String prompt input...");
                    System.out.println("Adding item to list...");
                    list.addItem(new GroceryItem(tempName, tempPrice, tempQuantity, tempCat));
                    addItem = in.yesNo("Do you want to add another item to the list?");
                    System.out.println("addItem = " + addItem);
                }
            }else{
                System.out.println("Program Ending");
                return;
            }
            System.out.println("\n\nYour list is complete ... Creating list output ...\n\n");
            System.out.println(list.sortList());
        }
    }
}
