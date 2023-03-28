package aula;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Aula {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-03-28");
        LocalDateTime d05 = LocalDateTime.parse("2023-03-28T16:46:10");
        Instant d06 = Instant.parse("2023-03-28T16:46:00Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastweek = " + pastWeekLocalDate);
        System.out.println("nextweek = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.minusDays(7);

        System.out.println("pastWeek = " + pastWeekLocalDateTime);
        System.out.println("pastWeek = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDateTime, d05);

        System.out.println("t1 dias = " + t1.toDays());

    }
}