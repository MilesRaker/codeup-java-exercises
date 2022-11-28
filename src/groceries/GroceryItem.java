package groceries;

public class GroceryItem {
    private String name;
    private double price;
    private int quantity;

    public String getCategory() {
        return category;
    }

    private String category;
    private static String[] categories = {"PRODUCE", "DAIRY", "DELI", "MEAT", "BAKING", "ALCOHOL"};

    public GroceryItem(String name, double price, int quantity, String category){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String listEntry(){
        StringBuilder groceryEntry = new StringBuilder();
        groceryEntry.append(name).append(" | ").append(category).append(" | ").append(quantity).append(" | ").append(price);
        return groceryEntry.toString();
    }

    public int compareTo(GroceryItem g){
        return this.name.compareTo(g.name);
    }
}
