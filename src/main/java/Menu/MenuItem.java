package Menu;

public class MenuItem {
	private String text;
	private int menuNumber;

	public MenuItem(String text, int menuNumber) {
		setText(text);
		setMenuNumber(menuNumber);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getMenuNumber() {
		return menuNumber;
	}

	public void setMenuNumber(int menuNumber) {
		this.menuNumber = menuNumber;
	}

	@Override
	public String toString() {
		return menuNumber + text;
	}
}
