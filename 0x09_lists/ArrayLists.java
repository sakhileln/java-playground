import java.util.Arrays;
import java.util.ArrayList;

record GroceryItem(String name, String type, int count) {
	public GroceryItem(String name) {
		this(name, "DAIRY", 1);
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
		// items.add("Youghurt");
		System.out.println(items);
	}
}