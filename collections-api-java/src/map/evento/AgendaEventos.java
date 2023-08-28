package map.evento;

import java.time.LocalDate;
import java.util.*;


public class AgendaEventos {

    Map<LocalDate, Evento> agendaEventos;

    public AgendaEventos() {
        this.agendaEventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        this.agendaEventos.put(data, new Evento(nome, atracao));
    }


    public void exibirAgenda(){
        Map<LocalDate, Evento> agendaTreeMap = new TreeMap<>(agendaEventos);
        System.out.println(agendaTreeMap);
    }


    public void obterProximoEvento(){
        /*Set<LocalDate> dateSet = agendaEventos.keySet();
        Collection<Evento> values = agendaEventos.values();*/
        LocalDate hoje = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> agendaTreeMap = new TreeMap<>(agendaEventos);
        //for (var entry : agendaEventos.entrySet()){
        for (Map.Entry<LocalDate, Evento> entry : agendaEventos.entrySet()){
            if (entry.getKey().isEqual(hoje) || entry.getKey().isAfter(hoje)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("Próximo evento: " + proximoEvento + "acontecerá em " + proximaData);
                break;
            }
        }
    }
}
