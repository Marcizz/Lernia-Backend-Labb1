package Menu;

import API.APIHandling;

import java.util.Scanner;

public class InputHandler {
	private static final String DELIMITER = "\\\\n";
	private static int exitCode, backCode;
	private Scanner scanner;
	private static boolean finished, trawlJSON;
	private APIHandling api;
	private static String responseJSON;

	public InputHandler() {
		scanner = new Scanner(System.in);
		finished = false;
		exitCode = MenuCreator.getMainMenu().size() - 1;
		backCode = MenuCreator.getKeywordMenu().size() - 1;
		api = new APIHandling();
		trawlJSON = false;
		responseJSON = "";
		inputHandlerService();
	}

	private void inputHandlerService() {
		while (! finished) {
			int choice = scanner.nextInt();
			if (!trawlJSON) {
				handleInput(choice);
			} else {
				trawlJson(responseJSON, choice);
			}
		}
	}

	private String getSearchInput() {
		StringBuilder input = new StringBuilder();
		input.append(scanner.next());

		System.out.println("Search string is " + input.toString());
		return input.toString();
	}

	private void clearScreen() {
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}

	private void trawlJson(String json, int choice) {
		boolean exit = false;
		int exitCode = 0;
		while (!exit || exitCode == 5) {
			if(choice == 5) {
				exit = true;
				trawlJSON = false;
			}
			exitCode++;
		}
	}

	public void handleInput(int choice) {
		switch (ActiveMenu.getActiveMenu()) {
			case MAIN:
				switch (choice) {
					case 1:
						clearScreen();
						System.out.println("Entering keyword menu");
						MenuCreator.showMenu(MenuHandler.Menus.KEYWORDS);
						ActiveMenu.setActiveMenu(MenuHandler.Menus.KEYWORDS);
						break;
					case 2:
						MenuCreator.showHelp();
						break;
					case 3:
						finished = true;
						break;
					default:
						throw new IllegalStateException("Unexpected value: " + choice);
				}
				break;

			case KEYWORDS:
				switch (choice) {
					case 1:
						System.out.println("Entered keyword menu, choice 1");
						System.out.println(APIHandling.getHELP());
						responseJSON = APIHandling.callAPI(getSearchInput());
						trawlJSON = true;
						break;
					case 5:
						ActiveMenu.setActiveMenu(MenuHandler.Menus.MAIN);
						MenuCreator.showMenu(MenuHandler.Menus.MAIN);
						break;
				}
				break;
			default:
				throw new IllegalStateException("Unexpected value: " + choice);
		}
	}
}
