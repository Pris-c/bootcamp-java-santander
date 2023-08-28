package map.evento;

import java.time.LocalDate;
import java.time.Month;

public class Teste {

    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY,15), "Evento #1", "Atração #1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 8,28), "Evento #2", "Atração #2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY,10), "Evento #3", "Atração #3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.DECEMBER,10), "Evento #4", "Atração #4");

        //agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();


    }
}
