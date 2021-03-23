package L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.interfaces;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
