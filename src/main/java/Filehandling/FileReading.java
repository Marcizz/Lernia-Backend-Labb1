package Filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileReading {
	private static final String RESOURCE_LOCATION = "src/main/resources";
	public static List<String> readFileIntoList(String pathToFile) {
		List<String> list = Collections.unmodifiableList(new ArrayList<String>());

		try (BufferedReader reader = new BufferedReader(new FileReader(RESOURCE_LOCATION + pathToFile))) {
			StringBuilder builder = new StringBuilder();
			String currentLine = reader.readLine();
			while (currentLine != null) {
				builder.append(currentLine);
				list.add(currentLine);
				currentLine = reader.readLine();
			}
		} catch (IOException e) {
			if(e == e.getCause())
			e.printStackTrace();
		}
		return list;
	}

	public static String readFileIntoString(String pathToFile)  {
		try (BufferedReader reader = new BufferedReader(new FileReader(RESOURCE_LOCATION + pathToFile))) {
			return reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
}
