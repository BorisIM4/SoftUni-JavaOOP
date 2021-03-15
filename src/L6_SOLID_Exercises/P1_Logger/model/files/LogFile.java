package L6_SOLID_Exercises.P1_Logger.model.files;

import L6_SOLID_Exercises.P1_Logger.api.File;

public class LogFile implements File {
    private int size;
    private StringBuilder content;

    public LogFile() {
        this.content = new StringBuilder();
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void write(String message) {
        content.append(message);
        this.size += this.getMessageSize(message);
    }

    private int getMessageSize(String message) {
        return message.chars().filter(c -> Character.isAlphabetic(c)).sum();
    }
}
