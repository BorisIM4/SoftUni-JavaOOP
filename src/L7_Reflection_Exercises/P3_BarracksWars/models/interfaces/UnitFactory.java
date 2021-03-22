package L7_Reflection_Exercises.P3_BarracksWars.models.interfaces;

import jdk.jshell.spi.ExecutionControl;

public interface UnitFactory {
    Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException;
}