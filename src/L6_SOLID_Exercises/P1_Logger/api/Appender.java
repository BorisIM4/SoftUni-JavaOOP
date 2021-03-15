package L6_SOLID_Exercises.P1_Logger.api;

import L6_SOLID_Exercises.P1_Logger.enums.ReportLevel;

public interface Appender {
    void appendMessage(String dateTime, ReportLevel reportLevel, String message);


    void setReportLevel(ReportLevel reportLevel);
}
