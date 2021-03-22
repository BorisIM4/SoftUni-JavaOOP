package L7_Reflection_Exercises.P3_BarracksWars;

import L7_Reflection_Exercises.P3_BarracksWars.interfaces.Repository;
import L7_Reflection_Exercises.P3_BarracksWars.interfaces.Runnable;
import L7_Reflection_Exercises.P3_BarracksWars.interfaces.UnitFactory;
import L7_Reflection_Exercises.P3_BarracksWars.core.Engine;
import L7_Reflection_Exercises.P3_BarracksWars.core.factories.UnitFactoryImpl;
import L7_Reflection_Exercises.P3_BarracksWars.data.UnitRepository;

public class Main {
    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
