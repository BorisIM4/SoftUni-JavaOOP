package L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.core.commands;

import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.interfaces.Executable;
import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.interfaces.Repository;
import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.interfaces.UnitFactory;

public abstract class Command implements Executable{
    private String[] data;
    private Repository repository;
    private UnitFactory unitFactory;

    protected Command(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    protected String[] getData() {
        return data;
    }

    protected Repository getRepository() {
        return repository;
    }

    protected UnitFactory getUnitFactory() {
        return unitFactory;
    }
}
