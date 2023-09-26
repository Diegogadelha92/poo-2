package br.com.fescfafic.poo.Model;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class Evento {
    public UUID id;
    public String nome;
    public LocalDate data;
    public LocalTime hora;
    public String local;
    public int capacidadeTotal;
    public int participantesCadastrados;

    public Evento(String nome, LocalDate data, LocalTime hora, String local, int capacidadeTotal) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.local = local;
        this.capacidadeTotal = capacidadeTotal;
        this.participantesCadastrados = 0;
    }
    public void exibirInfo() {
        System.out.println("---------------------------------------");
        System.out.println("INFORMAÇÕES DO EVENTO ");
        System.out.printf("Nome do evento: %s \n", this.nome);
        System.out.printf("Data: %s \n", this.data);
        System.out.printf("Hora: %02d:%02d \n", this.hora.getHour(), this.hora.getMinute());
        System.out.printf("Local do evento: %s  \n", this.local);
        System.out.printf("Capacidade de total de pessoas: %d \n", this.capacidadeTotal);
        System.out.printf("Participantes Cadastrados: %d \n \n", this.participantesCadastrados);
        System.out.println("--------------------------------------");
    }
}

