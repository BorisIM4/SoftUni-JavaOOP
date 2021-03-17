package L7_Reflection_Exercises.P1_Harvesting_Fields_2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Class<RichSoilLand> clazz = RichSoilLand.class;

		Field[] allDeclaredFields = clazz.getDeclaredFields();

		List<Field> fieldsAsList = new ArrayList<>(Arrays.asList(allDeclaredFields));

		String line = "";
		while (!"HARVEST".equals(line = scanner.nextLine())) {
			switch (line){
				case "private":
					printFiledByType(fieldsAsList, "private");
					break;
				case "protected":
					printFiledByType(fieldsAsList, "protected");
					break;
				case "public":
					printFiledByType(fieldsAsList, "public");
					break;
				case "all":
					printField(fieldsAsList);
					break;
			}
		}
	}

	public static void printFiledByType(List<Field> filds, String command) {
		StringBuilder stringBuilder = new StringBuilder();

		for (Field fild : filds) {
			String modifierAsString = Modifier.toString(fild.getModifiers());
			if (modifierAsString.equals(command)) {
				stringBuilder.append(modifierAsString)
						.append(" ").append(fild.getType().getSimpleName())
						.append(" ").append(fild.getName());
				System.out.println(stringBuilder.toString().trim());
			}
			stringBuilder = new StringBuilder();
		}
	}

	public static void printField(List<Field> filds) {
		StringBuilder stringBuilder = new StringBuilder();

		for (Field fild : filds) {
			String modifierAsString = Modifier.toString(fild.getModifiers());
			stringBuilder.append(modifierAsString)
					.append(" ").append(fild.getType().getSimpleName())
					.append(" ").append(fild.getName());
			System.out.println(stringBuilder.toString().trim());
			stringBuilder = new StringBuilder();
		}

	}
}
