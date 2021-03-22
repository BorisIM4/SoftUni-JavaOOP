package L7_Reflection_Exercises.P3_BarracksWars.models.interfaces;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
