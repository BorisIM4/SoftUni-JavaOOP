package L6_SOLID_Exercises.P1_Logger.model.layouts;

import L6_SOLID_Exercises.P1_Logger.api.Layout;

public class SimpleLayout implements Layout {
    @Override
    public String getlayout() {
        return "%s - %s - %s";
    }
}
