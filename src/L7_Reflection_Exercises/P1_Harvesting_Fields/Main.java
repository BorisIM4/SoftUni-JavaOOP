package L7_Reflection_Exercises.P1_Harvesting_Fields;

import java.lang.reflect.Field;
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
					printFiledByType(fieldsAsList, 2);
					break;
				case "protected":
					printFiledByType(fieldsAsList, 4);
					break;
				case "public":
					printFiledByType(fieldsAsList, 1);
					break;
				case "all":
					printField(fieldsAsList);
					break;
			}
		}
	}

	public static void printFiledByType(List<Field> filds, int number){
		StringBuilder stringBuilder = new StringBuilder();

		for (Field fild : filds) {
			int modifiers = fild.getModifiers();
			if (number == modifiers) {
				stringBuilder.append(putModifierInFront(number))
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
			int modifies = fild.getModifiers();
			stringBuilder.append(putModifierInFront(modifies))
					.append(" ").append(fild.getType().getSimpleName())
					.append(" ").append(fild.getName());
			System.out.println(stringBuilder.toString().trim());
			stringBuilder = new StringBuilder();
		}

	}

	public static String putModifierInFront(int modifiersValue) {
		switch (modifiersValue){
			case 2:
				return "private";
			case 4:
				return "protected";
			case 1:
				return "public";
		}
		return null;
	}
}
