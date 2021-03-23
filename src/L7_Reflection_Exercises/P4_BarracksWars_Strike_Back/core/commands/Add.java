package L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.core.commands;

import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.interfaces.Repository;
import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.interfaces.Unit;
import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.interfaces.UnitFactory;

public class Add extends Command{

    public Add(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = getData()[1];
        Unit unitToAdd = getUnitFactory().createUnit(unitType);
        getRepository().addUnit(unitToAdd);

        return unitType + " added!";
    }
}
