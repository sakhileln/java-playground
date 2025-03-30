import java.util.Arrays;
import java.util.ArrayList;

record GroceryItem(String name, String type, int count) {
	public GroceryItem(String name) {
		this(name, "DAIRY", 1);
	}

	@Override
	public String toString() {
		return String.format("%d %s in %s", count, name.toUpperCase(), type);
	}
}

public class ArrayLists {
	public static void main(String[] args) {
		
		Object[] groceryList = new Object[3];
		groceryList[0] = new GroceryItem("Milk");
		groceryList[1] = new GroceryItem("Oranges", "PRODUCE", 4);
		groceryList[2] = "7 Apples";
		System.out.println(Arrays.toString(groceryList));

		ArrayList arrayLst = new ArrayList();
		arrayLst.add(new GroceryItem("Butter"));
		arrayLst.add("Youghurt");
		System.out.println(arrayLst);

		ArrayList<GroceryItem> items = new ArrayList<GroceryItem>();
		items.add(new GroceryItem("Butter"));
		items.add(new GroceryItem("Bananas", "PRODUCE", 9));
		items.add(new GroceryItem("Bread", "BAKERY", 1));
		items.add(0, new GroceryItem("Eggs", "PRODUCE", 30));
		items.set(1, new GroceryItem("Milk"));
		items.remove(3);
		// items.add("Youghurt");
		System.out.println(items);
	}
}