package L7_Reflection_Exercises.P3_BarracksWars.models;

import L7_Reflection_Exercises.P3_BarracksWars.models.interfaces.Repository;
import L7_Reflection_Exercises.P3_BarracksWars.models.interfaces.Runnable;
import L7_Reflection_Exercises.P3_BarracksWars.models.interfaces.UnitFactory;
import L7_Reflection_Exercises.P3_BarracksWars.models.core.Engine;
import L7_Reflection_Exercises.P3_BarracksWars.models.core.factories.UnitFactoryImpl;
import L7_Reflection_Exercises.P3_BarracksWars.models.data.UnitRepository;

public class Main {
    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
