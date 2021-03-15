package L6_SOLID_Exercises.P1_Logger.model.layouts;

import L6_SOLID_Exercises.P1_Logger.api.Layout;

public class XmlLayout implements Layout {
    @Override
    public String getlayout() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("<log>")
                .append(System.lineSeparator())
                .append("<date>3/31/2015 5:33:07 PM</date>")
                .append(System.lineSeparator())
                .append("<level>ERROR</level>")
                .append(System.lineSeparator())
                .append("<message>Error parsing request</message>")
                .append(System.lineSeparator())
                .append("</log>");

        return stringBuilder.toString();
    }
}
