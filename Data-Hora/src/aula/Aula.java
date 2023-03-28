package aula;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aula {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-03-28");
        LocalDateTime d05 = LocalDateTime.parse("2023-03-28T16:46:00");
        Instant d06 = Instant.parse("2023-03-28T16:46:00Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
    }
}