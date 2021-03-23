package L7_Reflection_Exercises.P4_BarracksWars_Strike_Back;

import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.interfaces.Repository;
import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.interfaces.Runnable;
import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.interfaces.UnitFactory;
import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.core.Engine;
import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.core.factories.UnitFactoryImpl;
import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
