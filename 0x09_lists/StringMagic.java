public class StringMagic {
	public static void main(String[] args) {
		Magic newMagic = new Magic();

		System.out.println(newMagic);
	}
}

class Magic {
	@Override
	public String toString() {
		return "you called...";
	}
}