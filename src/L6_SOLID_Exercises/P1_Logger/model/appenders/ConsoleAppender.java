package L6_SOLID_Exercises.P1_Logger.model.appenders;

import L6_SOLID_Exercises.P1_Logger.api.Appender;
import L6_SOLID_Exercises.P1_Logger.api.Layout;

public class ConsoleAppender extends BaseAppender {

    public ConsoleAppender(Layout layput) {
        super(layput);
    }

    @Override
    public void append(String message) {
        System.out.println(message);
    }
}
