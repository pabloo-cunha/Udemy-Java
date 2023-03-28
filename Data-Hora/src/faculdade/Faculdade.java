package faculdade;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Faculdade {

    private LocalDate data;
    private LocalTime hora;

    public Faculdade() {
    }

    public Faculdade(LocalDate data, LocalTime hora) {
        this.data = data;
        this.hora = hora;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Duration calcularDuracao(String hora1, String hora2) {
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime time1 = LocalTime.parse(hora1, formatterHora);
        LocalTime time2 = LocalTime.parse(hora2, formatterHora);

        if (time2.isBefore(time1)) {
            time2 = time2.plusHours(24);
        }

        return Duration.between(time1, time2);
    }
}
