package L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.core.factories;

import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.interfaces.Unit;
import L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.interfaces.UnitFactory;

import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.units.";

	@Override
	public Unit createUnit(String unitType) {
		Unit unit = null;

		try {
			Class<?> clazz = Class.forName(UNITS_PACKAGE_NAME + unitType);
			unit = (Unit) clazz.getDeclaredConstructor().newInstance();
		} catch (ClassNotFoundException | NoSuchMethodException | InstantiationException
				| IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}

		return unit;
	}
}
