package L6_SOLID_Exercises.P1_Logger.model.loggers;

import L6_SOLID_Exercises.P1_Logger.api.Appender;
import L6_SOLID_Exercises.P1_Logger.api.Logger;
import L6_SOLID_Exercises.P1_Logger.enums.ReportLevel;

public class MessageLogger implements Logger {
    private Appender[] appenders;

    public MessageLogger(Appender... appenders) {
        this.appenders = new Appender[appenders.length];

        //ред 12 прави същото като цикъла на ред 14;
        //System.arraycopy(appenders, 0, this.appenders, 0, appenders.length);
        for (int i = 0; i < appenders.length; i++) {
            this.appenders[i] = appenders[i];
        }
    }

    @Override
    public void logInfo(String dateTime, String message) {
        this.logMessage(dateTime, ReportLevel.INFO, message);
    }

    @Override
    public void logWarning(String dateTime, String message) {
        this.logMessage(dateTime, ReportLevel.WARNING, message);
    }

    @Override
    public void logError(String dateTime, String message) {
        this.logMessage(dateTime, ReportLevel.ERROR, message);
    }

    @Override
    public void logCritical(String dateTime, String message) {
        this.logMessage(dateTime, ReportLevel.CRITICAL, message);
    }

    @Override
    public void logFatal(String dateTime, String message) {
        this.logMessage(dateTime, ReportLevel.FATAL, message);
    }

    private void logMessage(String dateTime, ReportLevel reportlevel, String message) {
        for (Appender appender : this.appenders) {
            appender.appendMessage(dateTime, reportlevel, message);
        }
    }

    @Override
    public String getLogInfo(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Logger info")
                .append(System.lineSeparator());
        for (Appender appender : this.appenders) {
            stringBuilder.append(appender).append(System.lineSeparator());
        }

        return stringBuilder.toString().trim();
    }
}
