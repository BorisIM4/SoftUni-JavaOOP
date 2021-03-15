package L6_SOLID_Exercises.P1_Logger.engine;

import L6_SOLID_Exercises.P1_Logger.api.Appender;
import L6_SOLID_Exercises.P1_Logger.api.Layout;
import L6_SOLID_Exercises.P1_Logger.api.Logger;
import L6_SOLID_Exercises.P1_Logger.enums.ReportLevel;
import L6_SOLID_Exercises.P1_Logger.model.loggers.MessageLogger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Engine implements Runnable {

    @Override
    public void run() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int appendersCount = Integer.parseInt(bufferedReader.readLine());
            Appender[] appenders = new Appender[appendersCount];
            for (int i = 0; i < appendersCount; i++) {
                String[] tokens = bufferedReader.readLine().split("\\s+");
                String appenderType = tokens[0];
                String layoutType = tokens[1];
                ReportLevel reportLevel = tokens.length == 3 ? ReportLevel.valueOf(tokens[2]) : ReportLevel.INFO;
                Layout layout = this.getLayout(layoutType);
                Appender appender = this.getAppender(appenderType, layout);
                appender.setReportLevel(reportLevel);
                appenders[i] = appender;
            }
            Logger logger = new MessageLogger(appenders);
            String command = bufferedReader.readLine();
            while (!"END".equals(command)) {
                String[] tokens = command.split("\\|");
                ReportLevel reportLevel = ReportLevel.valueOf(tokens[0]);
                String dateTime = tokens[1];
                String message = tokens[2];

                this.logMessage(logger, reportLevel, dateTime, message);

                command = bufferedReader.readLine();
            }

            System.out.println(logger.getLogInfo());
        } catch (IOException | ClassNotFoundException
                | NoSuchMethodException
                | IllegalAccessException
                | InvocationTargetException
                | InstantiationException e) {
            e.printStackTrace();
        }
    }

    private void logMessage(Logger logger, ReportLevel reportLevel, String dateTime, String message) throws InvocationTargetException, IllegalAccessException {
        Class loggerClass = logger.getClass();
        Method method = Arrays.stream(loggerClass.getMethods())
                .filter(m -> m.getName().equalsIgnoreCase("log" + reportLevel))
                .findFirst()
                .orElseThrow();
        method.invoke(logger, dateTime, message);
    }

    private Appender getAppender(String appenderType, Layout layout) throws ClassNotFoundException
            , NoSuchMethodException
            , IllegalAccessException
            , InvocationTargetException
            , InstantiationException {

        Class<?> clazz = Class.forName("L6_SOLID_Exercises.P1_Logger.model.appenders." + appenderType);
        return (Appender) clazz.getConstructor(Layout.class).newInstance(layout);
    }

    private Layout getLayout(String layoutType) throws ClassNotFoundException
            , NoSuchMethodException
            , IllegalAccessException
            , InvocationTargetException
            , InstantiationException {

        Class<?> clazz = Class.forName("L6_SOLID_Exercises.P1_Logger.model.layouts." + layoutType);
        return (Layout) clazz.getConstructor().newInstance();

    }
}
