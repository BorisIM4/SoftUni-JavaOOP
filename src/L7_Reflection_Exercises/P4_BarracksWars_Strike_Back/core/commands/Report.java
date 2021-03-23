package L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.core.commands;

import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.interfaces.Repository;
import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.interfaces.UnitFactory;

public class Report extends Command{
    public Report(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return getRepository().getStatistics();
    }
}
