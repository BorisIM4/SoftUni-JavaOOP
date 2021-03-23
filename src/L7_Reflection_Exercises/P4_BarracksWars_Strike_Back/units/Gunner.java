package L7_Reflection_Exercises.P4_BarracksWars_Strike_Back.units;

public class Gunner extends AbstractUnit {
    private static final int GUNNER_HEALTH = 20;
    private static final int GUNNER_DAMAGE = 20;


    public Gunner() {
        super(GUNNER_HEALTH, GUNNER_DAMAGE);
    }
}
