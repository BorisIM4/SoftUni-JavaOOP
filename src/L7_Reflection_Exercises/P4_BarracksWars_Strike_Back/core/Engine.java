package L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.core;

import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.interfaces.*;
import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.interfaces.Runnable;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Engine implements Runnable {

	private static final String COMMANDS_PATH = "L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.core.commands.";

	private Repository repository;
	private UnitFactory unitFactory;

	public Engine(Repository repository, UnitFactory unitFactory) {
		this.repository = repository;
		this.unitFactory = unitFactory;
	}


	private String interpretCommand(String[] data, String commandName) {
		Executable command = null;
		commandName = Character.toUpperCase(commandName.charAt(0)) + commandName.substring(1);

		try {
			Class<?> clazz = Class.forName(COMMANDS_PATH + commandName);
			Constructor<?> ctor = clazz.getDeclaredConstructor(String[].class, Repository.class, UnitFactory.class);
			command = (Executable) ctor.newInstance(data, repository, unitFactory);
		} catch (ClassNotFoundException | NoSuchMethodException | InstantiationException
				| IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}

		return command.execute();
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		while (true) {
			try {
				String input = reader.readLine();
				String[] data = input.split("\\s+");
				String commandName = data[0];
				String result = interpretCommand(data, commandName);
				if (result.equals("fight")) {
					break;
				}
				System.out.println(result);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
