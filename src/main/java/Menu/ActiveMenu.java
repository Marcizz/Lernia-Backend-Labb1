package Menu;

public class ActiveMenu {
	private static MenuHandler.Menus activeMenu;

	public static MenuHandler.Menus getActiveMenu() {
		return activeMenu;
	}

	public static void setActiveMenu(MenuHandler.Menus menu) {
		ActiveMenu.activeMenu = menu;
	}
}
