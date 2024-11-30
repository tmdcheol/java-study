package study.javastudy.log;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class MyLogger {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(
            "HH:mm:ss.SSS");

    public static void log(Object object) {
        String time = LocalDateTime.now().format(DATE_TIME_FORMATTER);

        System.out.printf("%s [%9s] $s\n", time, Thread.currentThread().getName(), object);
    }

}
