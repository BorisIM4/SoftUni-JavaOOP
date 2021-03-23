package L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.core.commands;

import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.interfaces.Repository;
import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.interfaces.UnitFactory;

public class Fight extends Command{
    public Fight(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
