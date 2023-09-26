package br.com.fescfafic.poo.Model;
import java.time.LocalDate;
public class Reservaespaco {
    public Organizador organizador;
    public Evento evento;
    public LocalDate dataReserva;
    public String localReservado;

    public Reservaespaco(Organizador organizador, Evento evento){
        this.organizador = organizador;
        this.evento = evento;
        this.dataReserva = LocalDate.now();
        this.localReservado = evento.local;
    }
    public void exibirInfo(){
        System.out.println("------------Dados da Reserva--------------");
        System.out.printf("Reserva feita por: %s \n", this.organizador.nome);
        System.out.printf("Nome do evento reservado: %s \n", this.evento.nome);
        System.out.printf("Data da reserva: %s \n", this.dataReserva);
        System.out.printf("Local resevado: %s \n", this.localReservado);
        System.out.println("------------------------------");
    }
}
