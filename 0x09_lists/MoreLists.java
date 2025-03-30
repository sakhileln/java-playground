import java.util.ArrayList;
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
	}
}