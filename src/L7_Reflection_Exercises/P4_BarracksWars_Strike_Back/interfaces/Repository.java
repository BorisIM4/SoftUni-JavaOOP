package L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.interfaces;

public interface Repository {

	void addUnit(Unit unit);

	String getStatistics();

	void removeUnit(String unitType);
}
