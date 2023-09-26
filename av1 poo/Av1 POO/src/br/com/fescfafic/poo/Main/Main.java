package br.com.fescfafic.poo.Main;
import br.com.fescfafic.poo.Model.Evento;
import br.com.fescfafic.poo.Model.Organizador;
import br.com.fescfafic.poo.Model.Reservaespaco;
import br.com.fescfafic.poo.Model.Calendario;
import java.time.LocalDate;
import java.time.LocalTime;
public class Main {
    public static void main(String[] args) {

        Evento evento1 = new Evento(
                "Festa fora de Época",
                LocalDate.of(2023,9,29),
                LocalTime.of(23, 30),
                "Casa de Show Estação 10",
                250);

        Evento evento2 = new Evento(
                "The Fevers",
                LocalDate.of(2023,10,1),
                LocalTime.of(22,30),
                "Riachão Campestre Clube de Sousa",
                250);

        Evento evento3 = new Evento(
                "Zezo O principe dos Teclados",
                LocalDate.of(2023,10,2),
                LocalTime.of(22,30),
                "Planeta Bola",
                150);

        Evento evento3data = new Evento(
                "Jonas Esticado ",
                LocalDate.of(2023, 6, 20),
                LocalTime.of(19, 0),
                "Rua Centro de Sousa",
                156);

        Evento evento3local = new Evento(
                "Wesley Safadão",
                LocalDate.of(2023, 9, 29),
                LocalTime.of(17, 50),
                "Rua Gato Preto",
                289);

        Organizador organizador1 = new Organizador(
                "Organização Festejo",
                "festejo1@gmail.com");

        Organizador organizador2 = new Organizador(
                "Organização Celere",
                "celere@gmail.com");

        Organizador organizador3 = new Organizador(
                "Bagunças Bar",
                "Barbaguncinhadanada@gmail.com");

        Calendario calendario = new Calendario();
        System.out.println("-----------------------------------");
        calendario.inserirEvento(organizador1,evento1);
        System.out.println("-----------------------------------");
        calendario.inserirEvento(organizador1,evento2);
        System.out.println("-----------------------------------");
        calendario.inserirEvento(organizador1,evento3);
        System.out.println("-----------------------------------");
        calendario.cancelarEvento(organizador1, evento2);
        System.out.println("-----------------------------------");
        calendario.inserirEvento(organizador1,evento3);
        System.out.println("-----------------------------------");
        calendario.inserirEvento(organizador2, evento2);
        System.out.println("-----------------------------------");
        calendario.cancelarEvento(organizador1, evento2);
        System.out.println("-----------------------------------");
        calendario.inserirEvento(organizador3, evento3data);
        System.out.println("-----------------------------------");
        calendario.inserirEvento(organizador3, evento3local);
        System.out.println("-----------------------------------");
        evento1.exibirInfo();
        evento2.exibirInfo();
        evento3.exibirInfo();
        organizador1.exibirInfo();
        organizador2.exibirInfo();


        calendario.exibirInfo();
        
    }
}