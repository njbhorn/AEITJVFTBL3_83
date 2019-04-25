package examples;

public class Program {

	private String title;
	private boolean flag;
	private int value;

	public static void main(String[] args) {

		String text = " Hi there people ";
		System.out.println(text);

		String newText = text.trim();
		newText = newText.toUpperCase();
		newText = newText.concat(" - Welcome");
		newText = newText.substring(9);

		System.out.println(newText);

		System.out.println(text);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
