import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
	public static void main(String[] args) {
		String[] items = {"eggs", "milk", "butter", "bread"};

		List<String> list = List.of(items);
		// list.add("yoghurt");
		System.out.println(list);
		System.out.println(list.getClass().getName());

		ArrayList<String> groceries = new ArrayList<>(list);
		groceries.add("yoghurt");
		System.out.println(groceries);

		ArrayList<String> nextList = new ArrayList<>(
			List.of("pickles", "cheese", "mustard"));
		System.out.println(nextList);
		groceries.addAll(nextList);
		System.out.println(groceries);

		if (groceries.contains("milk")) {
			System.out.println("List contains milk");
		}

		groceries.add("yoghurt");
		System.out.println("First: "+ groceries.indexOf("yoghurt"));
		System.out.println("Last: "+ groceries.lastIndexOf("yoghurt"));

		groceries.removeAll(List.of("yoghurt", "pickles"));
		System.out.println(groceries);

		groceries.retainAll(List.of("cheese", "bread", "butter"));
		System.out.println(groceries);

		groceries.clear();
		System.out.println(groceries);
		System.out.println("isEmpty: " + groceries.isEmpty());

		groceries.addAll(Arrays.asList("ham", "eggs", "milk", "bread"));
		groceries.addAll(List.of("mustard", "cheese", "butter", "apples"));
		System.out.println(groceries);

		groceries.sort(Comparator.naturalOrder());
		System.out.println(groceries);
		groceries.sort(Comparator.reverseOrder());
		System.out.println(groceries);

		var groceryArray = groceries.toArray(new String[groceries.size()]);
		System.out.println(Arrays.toString(groceryArray));
	}
}